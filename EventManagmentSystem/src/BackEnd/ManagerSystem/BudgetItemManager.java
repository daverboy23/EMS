package BackEnd.ManagerSystem;

import BackEnd.EventSystem.BudgetItem;
import BackEnd.EventSystem.Committee;
import BackEnd.EventSystem.Event;
import BackEnd.EventSystem.Income;
import BackEnd.UserSystem.User;
import EMS_Database.DoesNotExistException;
import EMS_Database.impl.Expense_Table;
import EMS_Database.impl.Income_Table;

/**
 * This class serves as a liaison between the GUI and the back end and the data.
 * It checks to see whether a user has the proper privileges to change
 * something, and if the user does, then edits the database accordingly. It also
 * provides ready-to-use methods for the GUI to call.
 *
 * @author Julian Kuk
 */
public class BudgetItemManager {

    private Income_Table incomeTable;
    private Expense_Table expenseTable;
    private BudgetItem selectedBudgetItem;

    /**
     * No arg constructor
     */
    public BudgetItemManager() {
        incomeTable = new Income_Table();
        expenseTable = new Expense_Table();
    }

    /**
     * returns the income table
     *
     * @return the income table
     */
    public Income_Table getIncomeTable() {
        return incomeTable;
    }

    /**
     * returns the expense table
     *
     * @return the expense table
     */
    public Expense_Table getExpenseTable() {
        return expenseTable;
    }

    /**
     * stores the budget item selected by the user
     *
     * @param selectedBudgetItem the selected budget item
     */
    public void setSelectedBudgetItem(BudgetItem selectedBudgetItem) {
        this.selectedBudgetItem = selectedBudgetItem;
    }

    /**
     * returns the selected budget item
     *
     * @return the selected budget item
     */
    public BudgetItem getSelectedBudgetItem() {
        return selectedBudgetItem;
    }

    /**
     * edits the value of the selected budget item
     *
     * @param value the value to change it to
     * @param loggedInUser the currently logged in user
     * @param selectedEvent the currently selected event
     * @param selectedCommittee the currently selected committee
     * @throws PrivilegeInsufficientException
     * @throws DoesNotExistException
     */
    public void editValue(int value, User loggedInUser, Event selectedEvent, Committee selectedCommittee)
            throws PrivilegeInsufficientException, DoesNotExistException {

        if (PrivilegeManager.hasBudgetPrivilege(loggedInUser, selectedEvent, selectedCommittee)) {
            selectedBudgetItem.setValue(value);
            if (selectedBudgetItem instanceof Income) {
                incomeTable.setValue(selectedBudgetItem.getBUDGET_ITEM_ID(), value);
            } else {
                expenseTable.setValue(selectedBudgetItem.getBUDGET_ITEM_ID(), value);
            }
        }
    }

    /**
     * edits the description of the selected budget item
     *
     * @param description the description to change it to
     * @param loggedInUser the currently logged in user
     * @param selectedEvent the currently selected event
     * @param selectedCommittee the currently selected commitee
     * @throws PrivilegeInsufficientException
     * @throws DoesNotExistException
     */
    public void editDescription(String description, User loggedInUser, Event selectedEvent, Committee selectedCommittee)
            throws PrivilegeInsufficientException, DoesNotExistException {

        if (PrivilegeManager.hasBudgetPrivilege(loggedInUser, selectedEvent, selectedCommittee)) {
            selectedBudgetItem.setDescription(description);
            if (selectedBudgetItem instanceof Income) {
                incomeTable.setDescription(selectedBudgetItem.getBUDGET_ITEM_ID(), description);
            } else {
                expenseTable.setDescription(selectedBudgetItem.getBUDGET_ITEM_ID(), description);
            }
        }
    }

    /**
     * edit the date of the selected budget item
     *
     * @param year the year to change to
     * @param month the month to change to
     * @param day the day to change to
     * @param hour the hour to change to
     * @param minute the minute to change to
     * @param loggedInUser the currently logged in user
     * @param selectedEvent the currently selected event
     * @param selectedCommittee the currently selected committee
     * @throws PrivilegeInsufficientException
     * @throws DoesNotExistException
     */
    public void editDate(int year, int month, int day, int hour, int minute, User loggedInUser, Event selectedEvent, Committee selectedCommittee)
            throws PrivilegeInsufficientException, DoesNotExistException {

        if (PrivilegeManager.hasBudgetPrivilege(loggedInUser, selectedEvent, selectedCommittee)) {
            selectedBudgetItem.setDate(year, month, day, hour, minute);
            if (selectedBudgetItem instanceof Income) {
                incomeTable.setDate(selectedBudgetItem.getBUDGET_ITEM_ID(), selectedBudgetItem.getDate());
            } else {
                incomeTable.setDate(selectedBudgetItem.getBUDGET_ITEM_ID(), selectedBudgetItem.getDate());
            }
        }
    }
}