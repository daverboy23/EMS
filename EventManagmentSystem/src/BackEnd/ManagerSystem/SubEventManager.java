package BackEnd.ManagerSystem;

import BackEnd.EventSystem.Event;
import BackEnd.EventSystem.SubEvent;
import BackEnd.EventSystem.TimeSchedule;
import BackEnd.UserSystem.Location;
import BackEnd.UserSystem.User;
import EMS_Database.DoesNotExistException;
import EMS_Database.impl.SubEvent_Table;

/**
 * This class serves as a liaison between the GUI and the back end and the data.
 * It checks to see whether a user has the proper privileges to change
 * something, and if the user does, then edits the database accordingly. It also
 * provides ready-to-use methods for the GUI to call.
 *
 * @author Julian Kuk
 */
public class SubEventManager {

    private SubEvent_Table subEventsTable;
    private SubEvent selectedSubEvent;

    public SubEventManager() {
        subEventsTable = new SubEvent_Table();
    }
    
    public SubEvent_Table getSubEventsTable(){
        return subEventsTable;
    }

    public void setSelectedSubEvent(SubEvent selectedSubEvent) {
        this.selectedSubEvent = selectedSubEvent;
    }

    public SubEvent getSelectedSubEvent() {
        return selectedSubEvent;
    }
    
      public void editTitle(String title, User loggedInUser, Event selectedEvent)
            throws PrivilegeInsufficientException, DoesNotExistException {
        
        if (PrivilegeManager.hasEventPrivilege(loggedInUser, selectedEvent)) {
            selectedSubEvent.setTitle(title);
            subEventsTable.setTitle(selectedSubEvent.getSUB_EVENT_ID(), title);
        }
    }

    public void editDescription(String description, User loggedInUser, Event selectedEvent)
            throws PrivilegeInsufficientException, DoesNotExistException {
        
        if (PrivilegeManager.hasEventPrivilege(loggedInUser, selectedEvent)) {
            selectedSubEvent.setDescription(description);  
            subEventsTable.setDescription(selectedSubEvent.getSUB_EVENT_ID(), description);    
        }
    }

    public void editLocation(Location location, User loggedInUser, Event selectedEvent)
            throws PrivilegeInsufficientException, DoesNotExistException {
        
        if (PrivilegeManager.hasEventPrivilege(loggedInUser, selectedEvent)) {
            selectedSubEvent.setLocation(location);
            subEventsTable.setDetails(selectedSubEvent.getSUB_EVENT_ID(), location.getDetails());
            subEventsTable.setStreet(selectedSubEvent.getSUB_EVENT_ID(), location.getStreet());
            subEventsTable.setCity(selectedSubEvent.getSUB_EVENT_ID(), location.getCity());
            subEventsTable.setState(selectedSubEvent.getSUB_EVENT_ID(), location.getState());
            subEventsTable.setZipcode(selectedSubEvent.getSUB_EVENT_ID(), location.getZipCode());
            subEventsTable.setCountry(selectedSubEvent.getSUB_EVENT_ID(), location.getCountry());
        }
    }
    
    public void editTimeSchedule(TimeSchedule timeSchedule, User loggedInUser, Event selectedEvent)
            throws PrivilegeInsufficientException, DoesNotExistException {

        if (PrivilegeManager.hasEventPrivilege(loggedInUser, selectedEvent)) {
            selectedSubEvent.getTimeSchedule().setStartDateTime(timeSchedule.getStartDateTimeTimestamp());
            subEventsTable.setStartDate(selectedSubEvent.getSUB_EVENT_ID(), selectedSubEvent.getTimeSchedule().getStartDateTimeTimestamp());
            selectedSubEvent.getTimeSchedule().setEndDateTime(timeSchedule.getStartDateTimeTimestamp());
            subEventsTable.setEndDate(selectedSubEvent.getSUB_EVENT_ID(), selectedSubEvent.getTimeSchedule().getStartDateTimeTimestamp());
        }
    }

    public void editStartDateTime(int year, int month, int day, int hour, int minute, User loggedInUser, Event selectedEvent)
            throws PrivilegeInsufficientException, DoesNotExistException {
        
        if (PrivilegeManager.hasEventPrivilege(loggedInUser, selectedEvent)) {
            selectedSubEvent.getTimeSchedule().setStartDateTime(year, month, day, hour, minute);
            subEventsTable.setStartDate(selectedSubEvent.getSUB_EVENT_ID(), selectedSubEvent.getTimeSchedule().getStartDateTimeTimestamp()); 
        }
    }

    public void editEndDateTime(int year, int month, int day, int hour, int minute, User loggedInUser, Event selectedEvent)
            throws PrivilegeInsufficientException, DoesNotExistException {
        
        if (PrivilegeManager.hasEventPrivilege(loggedInUser, selectedEvent)) {
            selectedSubEvent.getTimeSchedule().setEndDateTime(year, month, day, hour, minute);
            subEventsTable.setEndDate(selectedSubEvent.getSUB_EVENT_ID(), selectedSubEvent.getTimeSchedule().getEndDateTimeTimestamp()); 
        }
    }
}