/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BackEnd.EventSystem.Committee;
import BackEnd.ManagerSystem.MainManager;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author sara
 */


public class BudgetPanel extends javax.swing.JPanel {

    /**
     * Creates new form BudgetPanel
     */
    private MainManager manager;
    public BudgetPanel() {
        initComponents();
        manager = MainManager.getInstance();
    }
    
    public void updateInfo()
    {
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        budgetLabel = new javax.swing.JLabel();
        BudgetSwitchingPanel = new javax.swing.JPanel();
        viewBudgetButton = new javax.swing.JButton();
        expenseButton = new javax.swing.JButton();
        incomeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));

        budgetLabel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        budgetLabel.setText("Budget");

        BudgetSwitchingPanel.setLayout(new java.awt.CardLayout());

        viewBudgetButton.setText("View All Budget Items");
        viewBudgetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBudgetButtonActionPerformed(evt);
            }
        });

        expenseButton.setText("View Expenses");
        expenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenseButtonActionPerformed(evt);
            }
        });

        incomeButton.setText("View Income");
        incomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(BudgetSwitchingPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                        .add(136, 136, 136))
                    .add(layout.createSequentialGroup()
                        .add(budgetLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(viewBudgetButton)
                        .add(18, 18, 18)
                        .add(expenseButton)
                        .add(18, 18, 18)
                        .add(incomeButton)
                        .addContainerGap(256, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(budgetLabel)
                    .add(viewBudgetButton)
                    .add(expenseButton)
                    .add(incomeButton))
                .add(11, 11, 11)
                .add(BudgetSwitchingPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .add(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBudgetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBudgetButtonActionPerformed

        CardLayout cl = (CardLayout)(BudgetSwitchingPanel.getLayout());
        cl.show(BudgetSwitchingPanel, "total");
    }//GEN-LAST:event_viewBudgetButtonActionPerformed

    private void expenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenseButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(BudgetSwitchingPanel.getLayout());
        cl.show(BudgetSwitchingPanel, "expense");
    }//GEN-LAST:event_expenseButtonActionPerformed

    private void incomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeButtonActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(BudgetSwitchingPanel.getLayout());
        cl.show(BudgetSwitchingPanel, "income");
    }//GEN-LAST:event_incomeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BudgetSwitchingPanel;
    private javax.swing.JLabel budgetLabel;
    private javax.swing.JButton expenseButton;
    private javax.swing.JButton incomeButton;
    private javax.swing.JButton viewBudgetButton;
    // End of variables declaration//GEN-END:variables
}
