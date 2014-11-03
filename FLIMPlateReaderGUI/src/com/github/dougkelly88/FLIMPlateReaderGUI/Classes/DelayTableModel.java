/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.dougkelly88.FLIMPlateReaderGUI.Classes;

import static java.lang.Math.round;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author dk1109
 */

public class DelayTableModel extends AbstractTableModel {
    private ArrayList<Integer> data_ = new ArrayList<Integer>();
    private String[] colNames_ = { "Delays (ps)" };
    private int max_ = 16666;
    private int min_ = 0;
    private int incr_ = 25;
//    private SeqAcqProps sap_;
    
    public DelayTableModel(){}
    
    public DelayTableModel(String[] columnNames) {
         this.colNames_ = columnNames;
    }
    
    public DelayTableModel(String[] columnNames, ArrayList<Integer> delays){
        this.colNames_ = columnNames;
        for (int i = 0; i < delays.size(); i++){
            delays.set(i, validateData(delays.get(i)));
        }
        this.data_ = delays;
        fireTableDataChanged();
//        sap_ = SeqAcqProps.getInstance().setDelaysArray(0, delays);
    }
    
    public DelayTableModel(String[] columnNames, ArrayList<Integer> delays, int min, int max, int incr){
        this.colNames_ = columnNames;
        this.min_ = min;
        this.max_ = max;
        this.incr_ = incr;
        for (int i = 0; i < delays.size(); i++){
            delays.set(i, validateData(delays.get(i)));
        }
        this.data_ = delays;
        fireTableDataChanged();
//        sap_ = SeqAcqProps.getInstance().setDelaysArray(0, delays);
    }
 
    @Override
    public String getColumnName(int col) {
      return colNames_[col];
    }
    
    @Override
    public Object getValueAt(int row, int col) {
        return ((Integer) data_.get(row));
    }
    @Override
    public int getColumnCount() {
        return 1;
    }
    @Override
    public int getRowCount() {
        return data_.size();
    }
    
    public ArrayList<Integer> getData(){
        return data_;
    }
 
    public void addRow(Integer rowData) {
        int row = data_.size();
        data_.add(rowData);
        fireTableRowsInserted(row, row);
//        sap_.setDelaysArray(0, data_);
    }
    
    public void insertRow(int index, Integer rowData){
        data_.add(index, rowData);
        fireTableRowsInserted(data_.size() - 1, data_.size() - 1);
//        sap_.setDelaysArray(0, data_);
    }
    
    public void removeRow(int row) {
        data_.remove(row);
        fireTableRowsDeleted(row, row);
//        sap_.setDelaysArray(0, data_);
    }
    
    public void addWholeData(ArrayList<Integer> data){
        data_.clear();
        data_.addAll(data);
        fireTableDataChanged();
//        sap_.setDelaysArray(0, data_);
//        this.addEmptyRow();
    }
    
    public void clearAllData(){
        data_.clear();
        fireTableDataChanged();
//        sap_.setDelaysArray(0, data_);
    }
    
   
    @Override
    public boolean isCellEditable(int row, int col){
        return true;
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        
        int val;
        
        if (value.getClass() == String.class){
            
            if (!(value.toString().isEmpty())){
            val = Integer.parseInt(value.toString());
            val = validateData(val);
            data_.set(row, val);
            }
            else {
//                data_.set(row, null);
                data_.remove(row);
            }
            
        }
        
        fireTableCellUpdated(row, col);
        
//        sap_.setDelaysArray(0, data_);
//        if (!this.hasEmptyRow())
//        {
//            this.addEmptyRow();
//        }
    }
    
    public void setMinVal(int min){
        min_ = min;
    }
    
    public void setMaxVal(int max){
        max_ = max;
    }
    
    public void setIncrVal(int incr){
        incr_ = incr;
    }
    
    private int validateData(int val){
//        int out;
        
        if (val > max_)
                val = max_;
            else if (val < min_)
                val = min_;
            val = round(val/incr_)*incr_;
        
        return val;
    }


}

