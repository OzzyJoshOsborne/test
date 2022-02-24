/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewStudentDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField nameField;
	public JTextField markField;



	/**
	 * Create the dialog.
	 */
	public NewStudentDialog() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(4, 2, 0, 0));
		{
			JLabel lblNewLabel_2 = new JLabel("New Student Mark");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("");
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel = new JLabel("Student Name");
			contentPanel.add(lblNewLabel);
		}
		{
			nameField = new JTextField();
			contentPanel.add(nameField);
			nameField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Mark");
			contentPanel.add(lblNewLabel_1);
		}
		{
			markField = new JTextField();
			contentPanel.add(markField);
			markField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 setModal(false);
				         dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						nameField.setText("");
						 setModal(false);
				         dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
