/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.dougkelly88.FLIMPlateReaderGUI.GUIComponents;

import com.github.dougkelly88.FLIMPlateReaderGUI.Classes.FindMaxpoint;
import com.github.dougkelly88.FLIMPlateReaderGUI.Classes.SeqAcqProps;
import com.google.common.eventbus.Subscribe;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.beans.PropertyChangeEvent;
import javax.swing.JButton;
import javax.swing.JLabel; 
import javax.swing.JTable; 
import mmcorej.CMMCore; 
import org.jfree.chart.ChartPanel; 
import org.micromanager.MMStudio; 
import org.micromanager.api.events.PropertyChangedEvent; 

/**
 *
 * @author dk1109
 */
public class FLIMPanel extends javax.swing.JPanel {

    MMStudio gui_;
    CMMCore core_;
    PropertyChangedEvent event_;
    SliderControl mcpSlider_;
    SliderControl gatewidthSlider_;
    JTable delayTable_;
    private SeqAcqProps sap_;
    
    @Subscribe
    public PropertyChangedEvent onPropertyChanged(PropertyChangedEvent event)
    {
        FLIMTestText.setText("google eventbus triggered in device " + event.getDevice() + "\n with property " + event.getProperty() + "\n changed to value " + event.getValue());
        event_ = event;
        return event;
    }
    
    /**
     * Creates new form FLIMPanel
     */
    public FLIMPanel() {
        initComponents();
        
        gui_ = MMStudio.getInstance();
        sap_ = SeqAcqProps.getInstance().setUseScanFLIM(false);
        try{
        gui_.registerForEvents(this);
        core_ = gui_.getCore();
        }
        catch (Exception e) 
        {
            //gui_.showMessage("Error in FLIMPanel constructor: " + e.getMessage());
        }
        
        setControlDefaults();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HRIControlsPanel = new javax.swing.JPanel();
        mcpVoltagePanel = new javax.swing.JPanel();
        gatewidthPanel = new javax.swing.JPanel();
        inhibitCheck = new javax.swing.JCheckBox();
        FLIMToolsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FLIMTestText = new javax.swing.JTextArea();
        getDichroic = new javax.swing.JButton();
        maxpointGraphPanel = new javax.swing.JPanel();
        autogateButton = new javax.swing.JButton();
        maxpointPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        maxpointButton = new javax.swing.JButton();
        maxpointResolutionField = new javax.swing.JTextField();
        delayBoxTabbedPane = new javax.swing.JTabbedPane();
        slowDelayBoxPanel = new javax.swing.JPanel();
        slowBoxCalibrated = new javax.swing.JCheckBox();
        slowCurrentDelayPanel = new javax.swing.JPanel();
        fastDelayBoxPanel = new javax.swing.JPanel();
        fastBoxCalibratedCheck = new javax.swing.JCheckBox();
        scanDelCheck = new javax.swing.JCheckBox();
        fastCurrentDelayPanel = new javax.swing.JPanel();
        delaySeqPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clearDelayButton = new javax.swing.JButton();
        startField = new javax.swing.JTextField();
        endField = new javax.swing.JTextField();
        incrementField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        HRIControlsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("HRI controls"));

        mcpVoltagePanel.setToolTipText("Sets the microchannel plate gain voltage on the Kentech HRI. ");

        javax.swing.GroupLayout mcpVoltagePanelLayout = new javax.swing.GroupLayout(mcpVoltagePanel);
        mcpVoltagePanel.setLayout(mcpVoltagePanelLayout);
        mcpVoltagePanelLayout.setHorizontalGroup(
            mcpVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        mcpVoltagePanelLayout.setVerticalGroup(
            mcpVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        gatewidthPanel.setToolTipText("Sets the gate ON time on the Kentech HRI. ");

        javax.swing.GroupLayout gatewidthPanelLayout = new javax.swing.GroupLayout(gatewidthPanel);
        gatewidthPanel.setLayout(gatewidthPanelLayout);
        gatewidthPanelLayout.setHorizontalGroup(
            gatewidthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        gatewidthPanelLayout.setVerticalGroup(
            gatewidthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        inhibitCheck.setSelected(true);
        inhibitCheck.setText("Inhibit?");
        inhibitCheck.setToolTipText("Inhibits the HRI; uncheck to use the HRI for FLIM imaging");
        inhibitCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inhibitCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HRIControlsPanelLayout = new javax.swing.GroupLayout(HRIControlsPanel);
        HRIControlsPanel.setLayout(HRIControlsPanelLayout);
        HRIControlsPanelLayout.setHorizontalGroup(
            HRIControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRIControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HRIControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HRIControlsPanelLayout.createSequentialGroup()
                        .addComponent(inhibitCheck)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(HRIControlsPanelLayout.createSequentialGroup()
                        .addComponent(gatewidthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mcpVoltagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        HRIControlsPanelLayout.setVerticalGroup(
            HRIControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRIControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inhibitCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HRIControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mcpVoltagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gatewidthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FLIMToolsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("FLIM tools"));

        FLIMTestText.setColumns(20);
        FLIMTestText.setRows(5);
        jScrollPane1.setViewportView(FLIMTestText);

        getDichroic.setText("getDichroic");
        getDichroic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDichroicActionPerformed(evt);
            }
        });

        maxpointGraphPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        maxpointGraphPanel.setMaximumSize(new java.awt.Dimension(630, 204));

        javax.swing.GroupLayout maxpointGraphPanelLayout = new javax.swing.GroupLayout(maxpointGraphPanel);
        maxpointGraphPanel.setLayout(maxpointGraphPanelLayout);
        maxpointGraphPanelLayout.setHorizontalGroup(
            maxpointGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        maxpointGraphPanelLayout.setVerticalGroup(
            maxpointGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        autogateButton.setText("Autogating...");

        maxpointPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("\"Find maxpoint\" resolution (ps)");

        maxpointButton.setText("Find maxpoint");
        maxpointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxpointButtonActionPerformed(evt);
            }
        });

        maxpointResolutionField.setText("200");
        maxpointResolutionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxpointResolutionFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout maxpointPanelLayout = new javax.swing.GroupLayout(maxpointPanel);
        maxpointPanel.setLayout(maxpointPanelLayout);
        maxpointPanelLayout.setHorizontalGroup(
            maxpointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maxpointPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(maxpointResolutionField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maxpointButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        maxpointPanelLayout.setVerticalGroup(
            maxpointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maxpointPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(maxpointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maxpointButton)
                    .addComponent(maxpointResolutionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FLIMToolsPanelLayout = new javax.swing.GroupLayout(FLIMToolsPanel);
        FLIMToolsPanel.setLayout(FLIMToolsPanelLayout);
        FLIMToolsPanelLayout.setHorizontalGroup(
            FLIMToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FLIMToolsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FLIMToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maxpointGraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FLIMToolsPanelLayout.createSequentialGroup()
                        .addComponent(maxpointPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FLIMToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FLIMToolsPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(getDichroic)
                                .addGap(10, 10, 10))
                            .addGroup(FLIMToolsPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(autogateButton)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        FLIMToolsPanelLayout.setVerticalGroup(
            FLIMToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FLIMToolsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maxpointGraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FLIMToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FLIMToolsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FLIMToolsPanelLayout.createSequentialGroup()
                            .addComponent(autogateButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(getDichroic)))
                    .addComponent(maxpointPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        slowBoxCalibrated.setText("Calibrated?");

        javax.swing.GroupLayout slowCurrentDelayPanelLayout = new javax.swing.GroupLayout(slowCurrentDelayPanel);
        slowCurrentDelayPanel.setLayout(slowCurrentDelayPanelLayout);
        slowCurrentDelayPanelLayout.setHorizontalGroup(
            slowCurrentDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        slowCurrentDelayPanelLayout.setVerticalGroup(
            slowCurrentDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout slowDelayBoxPanelLayout = new javax.swing.GroupLayout(slowDelayBoxPanel);
        slowDelayBoxPanel.setLayout(slowDelayBoxPanelLayout);
        slowDelayBoxPanelLayout.setHorizontalGroup(
            slowDelayBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slowDelayBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slowDelayBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slowBoxCalibrated)
                    .addComponent(slowCurrentDelayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        slowDelayBoxPanelLayout.setVerticalGroup(
            slowDelayBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slowDelayBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slowBoxCalibrated)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slowCurrentDelayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        delayBoxTabbedPane.addTab("Slow delay box", slowDelayBoxPanel);

        fastBoxCalibratedCheck.setText("Calibrated?");

        scanDelCheck.setText("Enable fast delay sequences?");
        scanDelCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanDelCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fastCurrentDelayPanelLayout = new javax.swing.GroupLayout(fastCurrentDelayPanel);
        fastCurrentDelayPanel.setLayout(fastCurrentDelayPanelLayout);
        fastCurrentDelayPanelLayout.setHorizontalGroup(
            fastCurrentDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );
        fastCurrentDelayPanelLayout.setVerticalGroup(
            fastCurrentDelayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        delaySeqPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Delay sequence"));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0"},
                {"1000"},
                {"2000"},
                {"3000"},
                {"4000"},
                {null}
            },
            new String [] {
                "Delay"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane3);

        clearDelayButton.setText("Clear delays");
        clearDelayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDelayButtonActionPerformed(evt);
            }
        });

        startField.setText("0");

        endField.setText("16000");

        incrementField.setText("25");

        jButton1.setText("Populate delays");

        jLabel2.setText("Start (ps):");

        jLabel3.setText("End (ps):");

        jLabel4.setText("Increment:");

        javax.swing.GroupLayout delaySeqPanelLayout = new javax.swing.GroupLayout(delaySeqPanel);
        delaySeqPanel.setLayout(delaySeqPanelLayout);
        delaySeqPanelLayout.setHorizontalGroup(
            delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delaySeqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delaySeqPanelLayout.createSequentialGroup()
                        .addGroup(delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startField)
                            .addComponent(endField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(incrementField)))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearDelayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        delaySeqPanelLayout.setVerticalGroup(
            delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delaySeqPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(delaySeqPanelLayout.createSequentialGroup()
                .addComponent(clearDelayButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(delaySeqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(incrementField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fastDelayBoxPanelLayout = new javax.swing.GroupLayout(fastDelayBoxPanel);
        fastDelayBoxPanel.setLayout(fastDelayBoxPanelLayout);
        fastDelayBoxPanelLayout.setHorizontalGroup(
            fastDelayBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fastDelayBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fastDelayBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fastBoxCalibratedCheck)
                    .addComponent(fastCurrentDelayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scanDelCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delaySeqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        fastDelayBoxPanelLayout.setVerticalGroup(
            fastDelayBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fastDelayBoxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fastDelayBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fastDelayBoxPanelLayout.createSequentialGroup()
                        .addComponent(fastBoxCalibratedCheck)
                        .addGap(18, 18, 18)
                        .addComponent(fastCurrentDelayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scanDelCheck))
                    .addComponent(delaySeqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        delayBoxTabbedPane.addTab("Fast delay box", fastDelayBoxPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(FLIMToolsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HRIControlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delayBoxTabbedPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delayBoxTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(FLIMToolsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HRIControlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getDichroicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDichroicActionPerformed
        
        FLIMTestText.setText("Getting acq params scan, results = " + ( sap_.getUseScanFLIM()? "true":"false" ) );
        
    }//GEN-LAST:event_getDichroicActionPerformed

    private void inhibitCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inhibitCheckActionPerformed
        FLIMTestText.setText("Inhibit state = " + inhibitCheck.isSelected());
    }//GEN-LAST:event_inhibitCheckActionPerformed

    private void maxpointResolutionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxpointResolutionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxpointResolutionFieldActionPerformed

    private void maxpointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxpointButtonActionPerformed
        FindMaxpoint fm = new FindMaxpoint();
        final ChartPanel chartpanel = new ChartPanel(fm.getChart());
        chartpanel.setLayout(new BorderLayout());
        maxpointGraphPanel.setLayout(new BorderLayout());
        maxpointGraphPanel.add(chartpanel, BorderLayout.CENTER);
        chartpanel.setMaximumDrawWidth(maxpointGraphPanel.getWidth());  
        chartpanel.setPreferredSize(new Dimension(maxpointGraphPanel.getWidth(),maxpointGraphPanel.getHeight()));
        maxpointGraphPanel.validate();
        maxpointGraphPanel.repaint();
        
    }//GEN-LAST:event_maxpointButtonActionPerformed

    private void clearDelayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearDelayButtonActionPerformed
        //        delayTable.removeColumn(1);
    }//GEN-LAST:event_clearDelayButtonActionPerformed

    private void scanDelCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanDelCheckActionPerformed
        sap_ = sap_.setUseScanFLIM(scanDelCheck.isSelected());
    }//GEN-LAST:event_scanDelCheckActionPerformed

    private String test(String dev, String prop)
    {
        String out;
        try{out = core_.getProperty(dev, prop);}
        catch (Exception e){out = "Error:" + e.getMessage();}
        return out;
    }
    
    private void setControlDefaults(){
        
        // Set up slider controls
        mcpSlider_ = new SliderControl("MCP voltage (V)",300,850,750);
        mcpVoltagePanel.setLayout(new BorderLayout());
        mcpVoltagePanel.add(mcpSlider_, BorderLayout.SOUTH);
        mcpSlider_.addPropertyChangeListener(new java.beans.PropertyChangeListener() {

            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                mcpSliderPropertyChange(evt);
            }
        });
        
        gatewidthSlider_ = new SliderControl("Gate width (ps)", 200, 7000, 3000);
        gatewidthPanel.setLayout(new BorderLayout());
        gatewidthPanel.add(gatewidthSlider_, BorderLayout.SOUTH);
        gatewidthSlider_.addPropertyChangeListener(new java.beans.PropertyChangeListener() {

            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                gatewidthSliderPropertyChange(evt);
            }
        });
        
        HRIControlsPanel.revalidate();
        HRIControlsPanel.repaint();
        
//        delayTable_ = new JTable(1);
        
        // Set values for other controls based on underlying data to ensure
        // that all controls are in a consistent state. 
        scanDelCheck.setSelected(sap_.getUseScanFLIM());
        
    }
    
    private void mcpSliderPropertyChange(java.beans.PropertyChangeEvent evt) {

        FLIMTestText.setText("MCP slider value = " + mcpSlider_.getValue());
        
    }                                        
    
    private void gatewidthSliderPropertyChange(java.beans.PropertyChangeEvent evt) {

        FLIMTestText.setText("Gatewidth value = " + gatewidthSlider_.getValue());
        
    }                                        

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea FLIMTestText;
    private javax.swing.JPanel FLIMToolsPanel;
    private javax.swing.JPanel HRIControlsPanel;
    private javax.swing.JButton autogateButton;
    private javax.swing.JButton clearDelayButton;
    private javax.swing.JTabbedPane delayBoxTabbedPane;
    private javax.swing.JPanel delaySeqPanel;
    private javax.swing.JTextField endField;
    private javax.swing.JCheckBox fastBoxCalibratedCheck;
    private javax.swing.JPanel fastCurrentDelayPanel;
    private javax.swing.JPanel fastDelayBoxPanel;
    private javax.swing.JPanel gatewidthPanel;
    private javax.swing.JButton getDichroic;
    private javax.swing.JTextField incrementField;
    private javax.swing.JCheckBox inhibitCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton maxpointButton;
    private javax.swing.JPanel maxpointGraphPanel;
    private javax.swing.JPanel maxpointPanel;
    private javax.swing.JTextField maxpointResolutionField;
    private javax.swing.JPanel mcpVoltagePanel;
    private javax.swing.JCheckBox scanDelCheck;
    private javax.swing.JCheckBox slowBoxCalibrated;
    private javax.swing.JPanel slowCurrentDelayPanel;
    private javax.swing.JPanel slowDelayBoxPanel;
    private javax.swing.JTextField startField;
    // End of variables declaration//GEN-END:variables
}
