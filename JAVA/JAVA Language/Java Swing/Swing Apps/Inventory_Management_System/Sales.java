package Inventory_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sales {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales window = new Sales();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sales() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 300, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblSales = new JLabel("      Sales");
		lblSales.setForeground(Color.WHITE);
		lblSales.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSales.setBackground(Color.WHITE);
		lblSales.setBounds(92, 43, 107, 41);
		frame.getContentPane().add(lblSales);
		
		JButton btnInvoice = new JButton("Invoices");
		btnInvoice.setForeground(new Color(0, 139, 139));
		btnInvoice.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInvoice.setBackground(new Color(64, 224, 208));
		btnInvoice.setBounds(98, 116, 101, 41);
		frame.getContentPane().add(btnInvoice);
		
		JButton btnRevenues = new JButton("Revenues");
		btnRevenues.setForeground(new Color(0, 139, 139));
		btnRevenues.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRevenues.setBackground(new Color(64, 224, 208));
		btnRevenues.setBounds(98, 183, 101, 41);
		frame.getContentPane().add(btnRevenues);
		
		JButton btnCuestomers = new JButton("Customers");
		btnCuestomers.setForeground(new Color(0, 139, 139));
		btnCuestomers.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCuestomers.setBackground(new Color(64, 224, 208));
		btnCuestomers.setBounds(98, 250, 101, 41);
		frame.getContentPane().add(btnCuestomers);
		
		JButton btnNewButton_2_1 = new JButton("Close");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.NewScreen();
				frame.dispose();
			}
		});
		btnNewButton_2_1.setForeground(new Color(0, 128, 128));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1.setBackground(new Color(64, 224, 208));
		btnNewButton_2_1.setBounds(98, 311, 101, 38);
		frame.getContentPane().add(btnNewButton_2_1);
	}
}
