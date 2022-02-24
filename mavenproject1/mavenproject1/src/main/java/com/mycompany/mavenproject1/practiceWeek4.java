/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;

/**
 *
 * @author oweng
 */
public class practiceWeek4 extends javax.swing.JFrame {
     MarksSystemApp app;
     
    /**
     * Creates new form practiceWeek4
     */
    public practiceWeek4(MarksSystemApp app) {
        initComponents();
        this.app = app;
    }
    
    void displayTableData(ArrayList<StudentMark> tableData){
		
	// Empty the existing data
       DefaultTableModel tableModel = (DefaultTableModel) markTable_table.getModel();
	tableModel.setRowCount(0);
		
        // Some safety code missing here
        for(StudentMark s: tableData) {
                tableModel.addRow(new Object[] {s.getName(), s.getMark()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottomButtons_panel = new javax.swing.JPanel();
        addStudent_button = new javax.swing.JButton();
        changeMark_button = new javax.swing.JButton();
        deleteStudent_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        title_label = new javax.swing.JLabel();
        table_scrollpane = new javax.swing.JScrollPane();
        markTable_table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        help_menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addStudent_button.setText("Add Student");
        addStudent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent_buttonActionPerformed(evt);
            }
        });

        changeMark_button.setText("Change Mark");
        changeMark_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMark_buttonActionPerformed(evt);
            }
        });

        deleteStudent_button.setText("Delete Student");
        deleteStudent_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudent_buttonActionPerformed(evt);
            }
        });

        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomButtons_panelLayout = new javax.swing.GroupLayout(bottomButtons_panel);
        bottomButtons_panel.setLayout(bottomButtons_panelLayout);
        bottomButtons_panelLayout.setHorizontalGroup(
            bottomButtons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomButtons_panelLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(login_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addStudent_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeMark_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteStudent_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottomButtons_panelLayout.setVerticalGroup(
            bottomButtons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomButtons_panelLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(bottomButtons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudent_button)
                    .addComponent(changeMark_button)
                    .addComponent(deleteStudent_button)
                    .addComponent(login_button)))
        );

        title_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_label.setText("List of Marks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(title_label)
                .addGap(312, 312, 312))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        markTable_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Student Name", "Mark"
            }
        ));
        markTable_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_scrollpane.setViewportView(markTable_table);

        file_menu.setText("File");
        jMenuBar1.add(file_menu);

        help_menu.setText("Help");
        jMenuBar1.add(help_menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottomButtons_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_scrollpane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomButtons_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeMark_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMark_buttonActionPerformed
        int column = 0;
        String studentName = "";
        NewStudentDialog dialog = new NewStudentDialog();
        if(!markTable_table.getSelectionModel().isSelectionEmpty())
        {
            int row = markTable_table.getSelectedRow();
            studentName = markTable_table.getModel().getValueAt(row, column).toString();
            dialog.nameField.setText(studentName);
        }
       
	dialog.setVisible(true);
        
	// Get the name from the dialog
	studentName = dialog.nameField.getText();
        if(!studentName.isEmpty()){
                // Get the mark from the mark field
                int mark = 0;
                try {
                        mark = Integer.parseInt(dialog.markField.getText());
                } catch (NumberFormatException ex) {
                        mark =0;
                }
                if(mark>100)
                {
                    mark=100;
                }
                if(mark<0)
                {
                    mark=0;
                }
                app.updateMark(studentName, mark);	
        }    
    }//GEN-LAST:event_changeMark_buttonActionPerformed

    private void addStudent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudent_buttonActionPerformed
        // Show the dialog
        NewStudentDialog dialog = new NewStudentDialog();
        dialog.setVisible(true);

        // Get the name from the dialog
        String newStudentName = dialog.nameField.getText();

        // If the name is empty, then Cancel was probably pressed
        if(!newStudentName.isEmpty()){
                // Get the mark from the mark field
                int mark = 0;
                try {
                        mark = Integer.parseInt(dialog.markField.getText());
                } catch (NumberFormatException ex) {
                        mark =0;
                }
                if(mark>100)
                {
                    mark=100;
                }
                if(mark<0)
                {
                    mark=0;
                }
                app.addStudent(newStudentName, mark);	
        }


    }//GEN-LAST:event_addStudent_buttonActionPerformed

    private void deleteStudent_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudent_buttonActionPerformed

        String studentName = "";
        NewStudentDialog dialog = new NewStudentDialog();
        if(!markTable_table.getSelectionModel().isSelectionEmpty())
        {
            int row = markTable_table.getSelectedRow();
            studentName = markTable_table.getModel().getValueAt(row, 0).toString();
            dialog.nameField.setText(studentName);
            String studentMark = markTable_table.getModel().getValueAt(row, 1).toString();
            dialog.markField.setText(studentMark);
        }

       dialog.setVisible(true);

        
        if(!studentName.isEmpty()){
                app.deleteStudent(studentName);	
        }    
    }//GEN-LAST:event_deleteStudent_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        app.createLoginPage();
         
    }//GEN-LAST:event_login_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
      EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					practiceWeek4 frame = new practiceWeek4(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent_button;
    private javax.swing.JPanel bottomButtons_panel;
    private javax.swing.JButton changeMark_button;
    private javax.swing.JButton deleteStudent_button;
    private javax.swing.JMenu file_menu;
    private javax.swing.JMenu help_menu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    private javax.swing.JTable markTable_table;
    private javax.swing.JScrollPane table_scrollpane;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
