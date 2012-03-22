/*
 * ArgumentView.java
 *
 * Created on 22 de Dezembro de 2008, 12:00
 */

package br.ucam.kuabaSubsystem.gui;

import br.ucam.kuabaSubsystem.controller.ArgumentController;
import br.ucam.kuabaSubsystem.controller.ArgumentViewController;
import br.ucam.kuabaSubsystem.controller.InFavorArgumentController;
import br.ucam.kuabaSubsystem.controller.ObjectsToArgumentController;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author  Thiago
 */
public class ArgumentView extends JDialog {
    private ArgumentViewController controller;
    /** Creates new form ArgumentView */
    public ArgumentView(ArgumentViewController controller) {
        initComponents();
        this.controller = controller;
        this.refresh();
        
    }
    public void setIdeaText(String text){
        this.ideaTextLabel.setText(text);
    }

    public JPanel getArgumentViewPanel() {
        return argumentViewPanel;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        argumentViewPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inFavorTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ObjectsToTable = new javax.swing.JTable();
        newObjectsToButton = new javax.swing.JButton();
        newInFavorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ideaTextLabel = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        argumentTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        argumentViewPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        inFavorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "In Favor Arguments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inFavorTable.setColumnSelectionAllowed(true);
        inFavorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inFavorTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(inFavorTable);
        inFavorTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        ObjectsToTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Against Arguments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ObjectsToTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObjectsToTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ObjectsToTable);

        newObjectsToButton.setText("New ");
        newObjectsToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newObjectsToButtonActionPerformed(evt);
            }
        });

        newInFavorButton.setText("New ");
        newInFavorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newInFavorButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Argument Text");

        ideaTextLabel.setText("Idea Text:");

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        argumentTextArea.setColumns(20);
        argumentTextArea.setEditable(false);
        argumentTextArea.setRows(5);
        jScrollPane1.setViewportView(argumentTextArea);

        javax.swing.GroupLayout argumentViewPanelLayout = new javax.swing.GroupLayout(argumentViewPanel);
        argumentViewPanel.setLayout(argumentViewPanelLayout);
        argumentViewPanelLayout.setHorizontalGroup(
            argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(argumentViewPanelLayout.createSequentialGroup()
                .addGroup(argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(argumentViewPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ideaTextLabel))
                        .addGap(79, 79, 79)
                        .addGroup(argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(refreshButton)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newObjectsToButton, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(argumentViewPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newInFavorButton))
                    .addGroup(argumentViewPanelLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1))
                    .addGroup(argumentViewPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)))
                .addContainerGap())
        );
        argumentViewPanelLayout.setVerticalGroup(
            argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(argumentViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(ideaTextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(argumentViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInFavorButton)
                    .addComponent(newObjectsToButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(argumentViewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(argumentViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inFavorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inFavorTableMouseClicked
        int row = this.inFavorTable.getSelectedRow();
        String item = this.controller.getInFavorElement(row, 0);
        this.argumentTextArea.setText("");
        this.argumentTextArea.setText(item);
    }//GEN-LAST:event_inFavorTableMouseClicked

    private void ObjectsToTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObjectsToTableMouseClicked
        int row = this.ObjectsToTable.getSelectedRow();
        String item = this.controller.getObjectsToElement(row, 0);
        this.argumentTextArea.setText("");
        this.argumentTextArea.setText(item);
    }//GEN-LAST:event_ObjectsToTableMouseClicked

    private void newInFavorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInFavorButtonActionPerformed
        ArgumentController infavorController = new InFavorArgumentController(
                this.controller.getInFavoridea(), null, null, this.controller.getConsideredQuestion());
        infavorController.render();
}//GEN-LAST:event_newInFavorButtonActionPerformed

    private void newObjectsToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newObjectsToButtonActionPerformed
        ArgumentController objectsToController = 
  		new ObjectsToArgumentController(null, this.controller.getInFavoridea(),
  		 this.controller.getConsideredQuestion());
        objectsToController.render();
}//GEN-LAST:event_newObjectsToButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        this.refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed
    
    private void refresh(){
        this.controller.clearTableModels();
        this.inFavorTable.setModel(this.controller.getInFavorTableModel());
        this.ObjectsToTable.setModel(this.controller.getObjectsToTableModel());
        this.controller.insertInFavorArguments();
        this.controller.insertObjectsToArguments();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ObjectsToTable;
    private javax.swing.JTextArea argumentTextArea;
    private javax.swing.JPanel argumentViewPanel;
    private javax.swing.JLabel ideaTextLabel;
    private javax.swing.JTable inFavorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton newInFavorButton;
    private javax.swing.JButton newObjectsToButton;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
    
}