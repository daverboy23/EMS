/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd.ManagerSystem;

import EMS_Database.DoesNotExistException;

/**
 * This class holds all the other Manager classes, to facilitate passing the
 * managers around the GUI.
 *
 * @author Julian Kuk
 */
public class MainManager {

    private BudgetItemManager budgetItemManager;
    private BudgetManager budgetManager;
    private CommitteeManager committeeManager;
    private EventManager eventManager;
    private SubEventManager subEventManager;
    private TaskManager taskManager;
    private UserManager userManager;
    private LoginManager logInManager;

    public MainManager() {
        try {
            userManager = new UserManager();
            logInManager = new LoginManager(userManager.getUserList());
            taskManager = new TaskManager();
            subEventManager = new SubEventManager();
            committeeManager = new CommitteeManager(taskManager.getTasksTable());
            budgetItemManager = new BudgetItemManager();
            budgetManager = new BudgetManager(committeeManager.getCommitteesTable(), budgetItemManager.getIncomeTable(), budgetItemManager.getExpenseTable());
            
            eventManager = new EventManager(userManager.getUserList(),
                    userManager.getUsersTable(), taskManager.getTasksTable(),
                    subEventManager.getSubEventsTable(), committeeManager.getCommitteesTable(),
                    budgetItemManager.getIncomeTable(), budgetItemManager.getExpenseTable());
            
            
            
        } catch (DoesNotExistException e) {
            System.out.println("HERE! main manager");
            e.printStackTrace();
        }
    }

    private static class Main {

        public static MainManager instance = new MainManager();
    }

    public static MainManager getInstance() {
        return Main.instance;
    }

    public BudgetItemManager getBudgetItemManager() {
        return budgetItemManager;
    }

    public BudgetManager getBudgetManager() {
        return budgetManager;
    }

    public CommitteeManager getCommitteeManager() {
        return committeeManager;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public SubEventManager getSubEventManager() {
        return subEventManager;
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }

    public UserManager getUserManager() {
        return userManager;
    }
    /*
     public LoginManager getLogInManager(){
     return logInManager;
     }
     * */
}