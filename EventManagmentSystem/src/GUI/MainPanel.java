/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BackEnd.ManagerSystem.EventManager;
import BackEnd.ManagerSystem.MainManager;
import BackEnd.UserSystem.User;
import EMS_Database.DoesNotExistException;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Karina
 */
public class MainPanel extends javax.swing.JPanel {

    JPanel calendarSelectionPanel;
    JButton selectCalendarButton, selectEventDetailsButton, registerForEventButton;
    JPanel calendarSwitchingPanel;
    private CalendarPanel cp;

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        setLayout(new BorderLayout());
        calendarSelectionPanel = new JPanel();
        calendarSwitchingPanel = new JPanel();

        selectCalendarButton = new JButton("Calendar");
        selectEventDetailsButton = new JButton("Event Details");
        registerForEventButton = new JButton("Register for Event");

        selectCalendarButton.addActionListener(new CalendarButtonListener());
        selectEventDetailsButton.addActionListener(new CalendarButtonListener());
        registerForEventButton.addActionListener(new RegisterForEventButtonListener());

        calendarSwitchingPanel.setLayout(new CardLayout());

        calendarSelectionPanel.add(selectCalendarButton);
        calendarSelectionPanel.add(selectEventDetailsButton);
        calendarSelectionPanel.add(registerForEventButton);

        cp = new CalendarPanel();
        EventDetailsPanel edp = new EventDetailsPanel();
        calendarSwitchingPanel.add(cp, "calendar");
        calendarSwitchingPanel.add(edp, "eventDetails");
        add(calendarSwitchingPanel, BorderLayout.NORTH);
        add(calendarSelectionPanel, BorderLayout.SOUTH);
    }

    public void setNonAdminOrganizerView() {
        cp.hideEventButtons();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setMaximumSize(new java.awt.Dimension(640, 100));
        setMinimumSize(new java.awt.Dimension(640, 100));
        setPreferredSize(new java.awt.Dimension(640, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void selectCalendarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) (calendarSwitchingPanel.getLayout());
        System.out.println("HELLO");
        cl.show(calendarSwitchingPanel, "calendar");
    }

    private void selectEventDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CardLayout cl = (CardLayout) (calendarSwitchingPanel.getLayout());
        System.out.println("HELLOL");
        cl.show(calendarSwitchingPanel, "eventDetails");
    }

    private class CalendarButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == selectCalendarButton) {
                selectCalendarButtonActionPerformed(e);
            }
            if (e.getSource() == selectEventDetailsButton) {
                selectEventDetailsButtonActionPerformed(e);
            }
        }
    }

    private class RegisterForEventButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.out.println("Registering for event");
            EventManager eventManager = MainManager.getInstance().getEventManager();
            User loggedInUser = MainManager.getInstance().getLogInManager().getLoggedInUser();
            try{
            eventManager.createParticipant(loggedInUser, loggedInUser);
            }
            catch (DoesNotExistException e){
            }
        }
    }
}
