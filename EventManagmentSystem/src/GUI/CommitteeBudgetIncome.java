/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BackEnd.EventSystem.Budget;
import BackEnd.EventSystem.Committee;
import BackEnd.EventSystem.Income;
import BackEnd.ManagerSystem.BudgetManager;
import BackEnd.ManagerSystem.MainManager;
import GUI.Dialog.NewIncomeDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sara
 */
public class CommitteeBudgetIncome extends javax.swing.JPanel {

    Budget selectedBudget;
    /**
     * Creates new form IncomePanel
     */
    private MainManager manager;
    public CommitteeBudgetIncome() {
        manager = MainManager.getInstance();
        selectedBudget = manager.getBudgetManager().getSelectedBudget();
        initComponents();
        updateInfo();
        
    }
    
    public void updateInfo()
    {
        DefaultTableModel model = getTableModel();
        model.setRowCount(0);
        if(manager.getCommitteeManager().getSelectedCommittee() != null)
        {
            Committee c = manager.getCommitteeManager().getSelectedCommittee();
            for(Income i : c.getBudget().getIncomeList())
            {
                model.addRow(
                    new Object[]
                    {
                        i.getBUDGET_ITEM_ID(),i.getDescription(),i.getValue()
                    });
            }
        }
        incomeTotalLabel.setText("Total : $" + String.format("%,.2f", selectedBudget.getTotalIncome()));
    }
    
    public DefaultTableModel getTableModel()
    { return (DefaultTableModel)incomeTable.getModel(); }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incomeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        incomeTable = new javax.swing.JTable();
        addIncomeButton = new javax.swing.JButton();
        deleteIncomeButton = new javax.swing.JButton();
        incomeTotalLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(395, 500));

        incomeLabel.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        incomeLabel.setText("Income");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 500));

        incomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "no",  new Double(201.0)}
            },
            new String [] {
                "Item ID", "Description", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        incomeTable.setPreferredSize(new java.awt.Dimension(384, 407));
        incomeTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(incomeTable);
        incomeTable.getColumnModel().getColumn(0).setResizable(false);
        incomeTable.getColumnModel().getColumn(0).setPreferredWidth(15);
        incomeTable.getColumnModel().getColumn(1).setResizable(false);
        incomeTable.getColumnModel().getColumn(2).setResizable(false);
        incomeTable.getColumnModel().getColumn(2).setPreferredWidth(30);

        addIncomeButton.setText("Add Income");
        addIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIncomeButtonActionPerformed(evt);
            }
        });

        deleteIncomeButton.setText("Delete Income");
        deleteIncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIncomeButtonActionPerformed(evt);
            }
        });

        incomeTotalLabel.setText("Total : $" + selectedBudget.getTotalIncome());
        incomeTotalLabel.setMaximumSize(new java.awt.Dimension(275, 15));
        incomeTotalLabel.setMinimumSize(new java.awt.Dimension(275, 15));
        incomeTotalLabel.setPreferredSize(new java.awt.Dimension(275, 15));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(deleteIncomeButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(addIncomeButton))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .add(layout.createSequentialGroup()
                                .add(incomeLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(incomeTotalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(incomeLabel)
                    .add(incomeTotalLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(addIncomeButton)
                    .add(deleteIncomeButton)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIncomeButtonActionPerformed
        // TODO add your handling code here:
        NewIncomeDialog nid = new NewIncomeDialog(null, true);
        nid.setVisible(true);
        if(nid.getConfirm())
        {
            try
            {
                Income i = nid.createIncome();
                manager.getBudgetManager().createIncome(i, manager.getLogInManager().getLoggedInUser(), manager.getEventManager().getSelectedEvent(), manager.getCommitteeManager().getSelectedCommittee());
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        updateInfo();    
    }//GEN-LAST:event_addIncomeButtonActionPerformed

    private void deleteIncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIncomeButtonActionPerformed
        // TODO add your handling code here:
        int selection = incomeTable.getSelectedRow();
        Income income = manager.getCommitteeManager().getSelectedCommittee().getBudget().getIncomeList().get(selection);
        try
        {
            manager.getBudgetManager().deleteIncome(income, manager.getLogInManager().getLoggedInUser(), manager.getEventManager().getSelectedEvent(), manager.getCommitteeManager().getSelectedCommittee());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        updateInfo();
    }//GEN-LAST:event_deleteIncomeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIncomeButton;
    private javax.swing.JButton deleteIncomeButton;
    private javax.swing.JLabel incomeLabel;
    private javax.swing.JTable incomeTable;
    private javax.swing.JLabel incomeTotalLabel;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
