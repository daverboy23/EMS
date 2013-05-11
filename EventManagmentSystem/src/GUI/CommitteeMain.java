/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CommitteeMain.java
 *
 * Created on May 10, 2013, 4:34:47 PM
 */
package GUI;

import BackEnd.EventSystem.Committee;
import BackEnd.ManagerSystem.EventManager;
import BackEnd.ManagerSystem.MainManager;
import BackEnd.ManagerSystem.PrivilegeInsufficientException;
import java.awt.BorderLayout;
import java.awt.CardLayout;
//import javax.swing.DefaultComboBoxModel;
//import javax.swing.DefaultListModel;

/**
 *
 * @author Ketty Lezama
 */
public class CommitteeMain extends javax.swing.JPanel {
    private MainManager manager;
    private CommitteePanel c;
    
    /** Creates new form CommitteeMain */
    public CommitteeMain() throws PrivilegeInsufficientException {
        initComponents();
        CalendarPanel cp = new CalendarPanel();
        cp.hideSubEventButtons();
        MainPanel.setLayout(new BorderLayout());
        MainPanel.add(cp, BorderLayout.NORTH);
        
        c = new CommitteePanel();
        UserManagementPanel ump = new UserManagementPanel();
        ump.setNonAdminView();
        EmailPanel ep = new EmailPanel();
        
        SwitchingPanelHolder.add(c, "committees");
        SwitchingPanelHolder.add(ump, "userManagement");
        SwitchingPanelHolder.add(ep, "email");
        
        manager = MainManager.getInstance();
        setSize(950,750);
    }

    public CommitteePanel getCommitteePanel() {
        return c;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tasksPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        committeesPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        changeCommitteesButton = new javax.swing.JButton();
        participantsPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        changeUserManagementButton = new javax.swing.JButton();
        reportsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        emailPanel = new javax.swing.JPanel();
        changeEmailButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SwitchingPanelHolder = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        ChangeHomeButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 750));

        tasksPanel.setPreferredSize(new java.awt.Dimension(171, 89));
        tasksPanel.setRequestFocusEnabled(false);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel5.setText("Tasks Progress");

        javax.swing.GroupLayout tasksPanelLayout = new javax.swing.GroupLayout(tasksPanel);
        tasksPanel.setLayout(tasksPanelLayout);
        tasksPanelLayout.setHorizontalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        tasksPanelLayout.setVerticalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        committeesPanel.setPreferredSize(new java.awt.Dimension(171, 81));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel6.setText("Committee Details");

        changeCommitteesButton.setText("Manage");
        changeCommitteesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCommitteesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout committeesPanelLayout = new javax.swing.GroupLayout(committeesPanel);
        committeesPanel.setLayout(committeesPanelLayout);
        committeesPanelLayout.setHorizontalGroup(
            committeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, committeesPanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(changeCommitteesButton)
                .addContainerGap())
            .addGroup(committeesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        committeesPanelLayout.setVerticalGroup(
            committeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(committeesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(changeCommitteesButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        participantsPanel.setPreferredSize(new java.awt.Dimension(171, 81));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel7.setText("Personal Account");

        changeUserManagementButton.setText("Manage");
        changeUserManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUserManagementButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout participantsPanelLayout = new javax.swing.GroupLayout(participantsPanel);
        participantsPanel.setLayout(participantsPanelLayout);
        participantsPanelLayout.setHorizontalGroup(
            participantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(participantsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, participantsPanelLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(changeUserManagementButton)
                .addContainerGap())
        );
        participantsPanelLayout.setVerticalGroup(
            participantsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(participantsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(changeUserManagementButton)
                .addContainerGap())
        );

        reportsPanel.setPreferredSize(new java.awt.Dimension(171, 95));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel4.setText("Reports");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton6.setText("View");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportsPanelLayout = new javax.swing.GroupLayout(reportsPanel);
        reportsPanel.setLayout(reportsPanelLayout);
        reportsPanelLayout.setHorizontalGroup(
            reportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addComponent(jComboBox4, 0, 166, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        reportsPanelLayout.setVerticalGroup(
            reportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        emailPanel.setPreferredSize(new java.awt.Dimension(171, 95));

        changeEmailButton.setText("Email");
        changeEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14));
        jLabel8.setText("Contact");

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailPanelLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(changeEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(changeEmailButton)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Candara", 1, 16));
        jLabel11.setText("Manage Event");

        SwitchingPanelHolder.setMaximumSize(new java.awt.Dimension(2147483647, 500));
        SwitchingPanelHolder.setMinimumSize(new java.awt.Dimension(640, 720));
        SwitchingPanelHolder.setPreferredSize(new java.awt.Dimension(640, 700));
        SwitchingPanelHolder.setLayout(new java.awt.CardLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        SwitchingPanelHolder.add(MainPanel, "home");

        ChangeHomeButton.setText("Home");
        ChangeHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeHomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                        .addComponent(ChangeHomeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SwitchingPanelHolder, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(reportsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(participantsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(committeesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(tasksPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tasksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(committeesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(participantsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reportsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangeHomeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SwitchingPanelHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        setSize(171,95);
        setSize(171,95);
        setSize(171,95);
        setSize(171,95);
        setSize(171,95);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

private void changeCommitteesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCommitteesButtonActionPerformed
        CardLayout cl = (CardLayout)(SwitchingPanelHolder.getLayout());
        cl.show(SwitchingPanelHolder, "committees");
}//GEN-LAST:event_changeCommitteesButtonActionPerformed

private void changeUserManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUserManagementButtonActionPerformed
        CardLayout cl = (CardLayout)(SwitchingPanelHolder.getLayout());
        cl.show(SwitchingPanelHolder, "userManagement");
}//GEN-LAST:event_changeUserManagementButtonActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

private void changeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailButtonActionPerformed
        CardLayout cl = (CardLayout)(SwitchingPanelHolder.getLayout());
        cl.show(SwitchingPanelHolder, "email");
}//GEN-LAST:event_changeEmailButtonActionPerformed

private void ChangeHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeHomeButtonActionPerformed
        CardLayout cl = (CardLayout)(SwitchingPanelHolder.getLayout());
        cl.show(SwitchingPanelHolder, "home");
}//GEN-LAST:event_ChangeHomeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeHomeButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SwitchingPanelHolder;
    private javax.swing.JButton changeCommitteesButton;
    private javax.swing.JButton changeEmailButton;
    private javax.swing.JButton changeUserManagementButton;
    private javax.swing.JPanel committeesPanel;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel participantsPanel;
    private javax.swing.JPanel reportsPanel;
    private javax.swing.JPanel tasksPanel;
    // End of variables declaration//GEN-END:variables
}
