/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import GUI.Dialog.NewCommitteeDialog;
import javax.swing.*;
import BackEnd.EventSystem.Committee;
import BackEnd.EventSystem.Event;
import BackEnd.UserSystem.User;
import BackEnd.ManagerSystem.MainManager;
import java.awt.CardLayout;
import java.awt.Color;
/**
 *
 * @author Sid
 */
public class CommitteeListPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommitteeListPanel
     */
    private MainManager manager;
    private CommitteePanel committeePanel;
    private NoPrivilegePanel npp;
    private DesignDefault dd;
    public CommitteeListPanel() {
        dd = DesignDefault.getInstance();
        initComponents();
        manager = MainManager.getInstance();
        committeePanel = new CommitteePanel();
        committeePanel.setSize(500,600);
        npp = new NoPrivilegePanel();
        
        committeePanelHolder.add(committeePanel, "committee");
        committeePanelHolder.add(noPanel, "no");
        committeePanelHolder.add(npp, "noPriv");
        updateInfo();
        /*if(committeeList.getModel().getSize() == 0)
        {
            CardLayout cl = (CardLayout)committeePanelHolder.getLayout();
            cl.show(committeePanelHolder, "no");
        }
        else
        {
            CardLayout cl = (CardLayout)committeePanelHolder.getLayout();
            cl.show(committeePanelHolder, "committee");
            committeeList.setSelectedIndex(0);
        }*/
        this.setBackground(dd.getPanelBGColor());
        this.setSize(dd.getPanelDimension());
    }
    
    public void updateInfo()
    {
        DefaultListModel model = new DefaultListModel();
        for(Committee c : manager.getEventManager().getSelectedEvent().getCommitteeList()){
            model.addElement(c);
        }
        committeeList.setModel(model);
        if(model.isEmpty())
        {
            noPanel.setVisible(true);  
            committeePanel.setVisible(false);
            npp.setVisible(false);
            
            CardLayout cl = (CardLayout)committeePanelHolder.getLayout();
            cl.show(committeePanelHolder, "no");
        }
        else
        {
            committeePanel.setVisible(true);
            noPanel.setVisible(false);
            npp.setVisible(false);
            
            CardLayout cl = (CardLayout)committeePanelHolder.getLayout();
            cl.show(committeePanelHolder, "committee");
            committeeList.setSelectedIndex(0);
        }
    }
    
    public void setNonAdminOrganizerView() {
        addCommitteeButton.setVisible(false);
        removeCommitteeButton.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        committeeListScrollPane = new javax.swing.JScrollPane();
        committeeList = new javax.swing.JList();
        committeeListLabel = new javax.swing.JLabel();
        addCommitteeButton = new javax.swing.JButton();
        removeCommitteeButton = new javax.swing.JButton();
        committeePanelHolder = new javax.swing.JPanel();
        noPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(750, 600));

        committeeListScrollPane.setBackground(new java.awt.Color(153, 153, 153));
        committeeListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        committeeList.setFont(new java.awt.Font("Candara", 0, 12));
        committeeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        committeeList.setMaximumSize(new java.awt.Dimension(100, 370));
        committeeList.setPreferredSize(new java.awt.Dimension(100, 370));
        committeeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                committeeListValueChanged(evt);
            }
        });
        committeeListScrollPane.setViewportView(committeeList);

        committeeListLabel.setFont(dd.getHeaderText());
        committeeListLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        committeeListLabel.setText("Committee List");

        addCommitteeButton.setFont(dd.getSmallText());
        addCommitteeButton.setSize(dd.getSmallButtonDimension());
        addCommitteeButton.setText("+");
        addCommitteeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCommitteeButtonActionPerformed(evt);
            }
        });

        removeCommitteeButton.setFont(dd.getSmallText());
        removeCommitteeButton.setSize(dd.getSmallButtonDimension());
        removeCommitteeButton.setText("-");
        removeCommitteeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCommitteeButtonActionPerformed(evt);
            }
        });

        committeePanelHolder.setBackground(java.awt.SystemColor.activeCaption);
        committeePanelHolder.setLayout(new java.awt.CardLayout());

        noPanel.setBackground(new java.awt.Color(128, 128, 128));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No committees Created Yet");
        noPanel.add(jLabel1);

        committeePanelHolder.add(noPanel, "no");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(committeeListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(addCommitteeButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeCommitteeButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(committeeListLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(committeePanelHolder, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(committeeListLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(committeeListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(committeePanelHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCommitteeButton)
                    .addComponent(removeCommitteeButton))
                .addGap(0, 170, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void committeeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_committeeListValueChanged
        // TODO add your handling code here:
        Event selectedEvent = manager.getEventManager().getSelectedEvent();
        User loggedInUser = manager.getLogInManager().getLoggedInUser();
        
        if(committeeList.getSelectedIndex() >= 0){
            Committee c = selectedEvent.getCommitteeList().get(committeeList.getSelectedIndex());
            manager.getCommitteeManager().setSelectedCommittee(c);
            
            committeePanel.updateInfo();
            
            if (!loggedInUser.getAdminPrivilege() && !selectedEvent.getOrganizerList().contains(loggedInUser)) {
                if (c.getChair().equals(loggedInUser)) {
                    committeePanel.setChairView();
                } else if (c.getBudgetAccessList().contains(loggedInUser)) {
                    committeePanel.setBudgetAccessMemberView();
                } else if (c.getMemberList().contains(loggedInUser)) {
                    committeePanel.setCommitteeMemberView();
                } else {
                    noPanel.setVisible(false);  
                    committeePanel.setVisible(false);
                    npp.setVisible(true);   
                }
            }
            
            //committeePanel.updateInfo();
        }
    }//GEN-LAST:event_committeeListValueChanged

    private void addCommitteeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCommitteeButtonActionPerformed
        // TODO add your handling code here:
        NewCommitteeDialog cd = new NewCommitteeDialog((JFrame)SwingUtilities.windowForComponent(this), true);
        cd.setVisible(true);
        if(cd.getConfirm()){
            try
            {
                manager.getCommitteeManager().setSelectedCommittee(
                        manager.getEventManager().createCommittee(
                        cd.createCommittee(),manager.getLogInManager().getLoggedInUser()));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            updateInfo();
            committeeList.setSelectedIndex(
                    manager.getEventManager().getSelectedEvent().getCommitteeList().size()-1);
            
        }
    }//GEN-LAST:event_addCommitteeButtonActionPerformed

    private void removeCommitteeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCommitteeButtonActionPerformed
        // TODO add your handling code here:
        if(committeeList.getSelectedIndex() >=0)
        {
            Committee c = (Committee)committeeList.getModel().getElementAt(committeeList.getSelectedIndex());
            //System.out.println(c);
            try
            {
                manager.getEventManager().deleteCommittee(c, manager.getUserManager().getSelectedUser());
            }
            catch (Exception e)
            {
                    System.out.println(e);
                    e.printStackTrace();
            }
            int lastSelect = committeeList.getSelectedIndex();
            updateInfo();
            if(committeeList.getModel().getSize() > 0)
            {
                if(lastSelect > 1)
                committeeList.setSelectedIndex(lastSelect-1);
                else
                {
                     committeeList.setSelectedIndex(0);
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a committee first.", "No Committee Selected.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeCommitteeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCommitteeButton;
    private javax.swing.JList committeeList;
    private javax.swing.JLabel committeeListLabel;
    private javax.swing.JScrollPane committeeListScrollPane;
    private javax.swing.JPanel committeePanelHolder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel noPanel;
    private javax.swing.JButton removeCommitteeButton;
    // End of variables declaration//GEN-END:variables
}
