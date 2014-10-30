/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.dougkelly88.FLIMPlateReaderGUI.GUIComponents;

import com.github.dougkelly88.FLIMPlateReaderGUI.Classes.SeqAcqProps;
import com.google.common.eventbus.Subscribe;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.Toolkit; 
import java.awt.event.WindowAdapter; 
import java.awt.event.WindowEvent;
import java.net.URL; 
import javax.swing.ImageIcon; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import mmcorej.CMMCore; 
import org.micromanager.MMStudio; 
import org.micromanager.api.events.PropertyChangedEvent; 

/**
 *
 * @author dk1109
 */
public class HCAFLIMPluginFrame extends javax.swing.JFrame {
    CMMCore core_;
    static HCAFLIMPluginFrame frame_;
    private SeqAcqProps sap_;
//    SequencedAcquisitionProperties sap_;
    
    @Subscribe
    public void onPropertyChanged(PropertyChangedEvent event)
    {
        testText.setText("google eventbus triggered in device " + event.getDevice() + "\n with property " + event.getProperty() + "\n changed to value " + event.getValue());
    }

    /**
     * Creates new form HCAFLIMPluginFrame
     */
    public HCAFLIMPluginFrame(CMMCore core) {

        initComponents();
        ImageIcon icon = new ImageIcon(this.getClass().getResource("../Resources/GFPFishIcon.png"));
        this.setIconImage(icon.getImage());
        this.setTitle("HCA-FLIM Plugin");
        core_ = core;
        frame_ = this;
                
        MMStudio gui_ = MMStudio.getInstance();
        gui_.registerForEvents(this);
        
        // Add confirm dialog when window closed using x
        frame_.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame_.addWindowListener(new  WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                confirmQuit();
            }
        });
        
        sap_ = SeqAcqProps.getInstance();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        getDichroic = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        testText = new javax.swing.JTextArea();
        getObjective = new javax.swing.JButton();
        FLIMPanel = new javax.swing.JTabbedPane();
        fLIMPanel1 = new com.github.dougkelly88.FLIMPlateReaderGUI.GUIComponents.FLIMPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        quitMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        FLIMHCAHelpMenu = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("HCAFLIMPluginFrame");

        getDichroic.setText("getDichroic");
        getDichroic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDichroicActionPerformed(evt);
            }
        });

        testText.setColumns(20);
        testText.setRows(5);
        jScrollPane1.setViewportView(testText);

        getObjective.setText("getObjective");
        getObjective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getObjectiveActionPerformed(evt);
            }
        });

        FLIMPanel.addTab("FLIM panel", fLIMPanel1);

        fileMenu.setText("File");

        quitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        quitMenu.setText("Quit");
        quitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenu);

        jMenuBar2.add(fileMenu);

        helpMenu.setText("Help");

        FLIMHCAHelpMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        FLIMHCAHelpMenu.setText("Help");
        helpMenu.add(FLIMHCAHelpMenu);

        aboutMenu.setText("About");
        aboutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenu);

        jMenuBar2.add(helpMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FLIMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getDichroic)
                            .addComponent(getObjective))
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(296, 296, 296))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(getDichroic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getObjective)))
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FLIMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


            
    private void getDichroicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDichroicActionPerformed
        testText.setText("Getting acq params scan, results = " + ( sap_.getUseScanFLIM()? "true":"false" ) );
    }//GEN-LAST:event_getDichroicActionPerformed

    private void getObjectiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getObjectiveActionPerformed
        testText.setText(test("Objective", "Label"));
    }//GEN-LAST:event_getObjectiveActionPerformed

    private void aboutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuActionPerformed
        Splash s = new Splash();
        s.setVisible(true);
        s.setAlwaysOnTop(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aboutMenuActionPerformed

    private void quitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuActionPerformed
        confirmQuit();
    }//GEN-LAST:event_quitMenuActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) 
//    {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HCAFLIMPluginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HCAFLIMPluginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HCAFLIMPluginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HCAFLIMPluginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FLIMHCAHelpMenu;
    private javax.swing.JTabbedPane FLIMPanel;
    private javax.swing.JMenuItem aboutMenu;
    private com.github.dougkelly88.FLIMPlateReaderGUI.GUIComponents.FLIMPanel fLIMPanel1;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton getDichroic;
    private javax.swing.JButton getObjective;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem quitMenu;
    private javax.swing.JTextArea testText;
    // End of variables declaration//GEN-END:variables

    private void confirmQuit(){
        int n = JOptionPane.showConfirmDialog(frame_, 
                "Quit: are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
        if (n==JOptionPane.YES_OPTION){
            dispose();
        }

    }
    
     private String test(String dev, String prop)
    {
        String out;
        try{out = core_.getProperty(dev, prop);}
        catch (Exception e){out = "Error:" + e.getMessage();}
        return out;
    }
    
}
