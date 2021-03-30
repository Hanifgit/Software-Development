package Inventory_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Payment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment window = new Payment();
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
	public Payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 44, 391, 229);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblItemsname = new JLabel("Date :");
		lblItemsname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItemsname.setBounds(10, 11, 95, 14);
		panel.add(lblItemsname);
		
		JLabel lblVendor = new JLabel("Vendor :");
		lblVendor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVendor.setBounds(10, 47, 95, 14);
		panel.add(lblVendor);
		
		JLabel lblAmmount = new JLabel("Ammount :");
		lblAmmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAmmount.setBounds(10, 87, 95, 14);
		panel.add(lblAmmount);
		
		JLabel lblReceivable = new JLabel("Payable :");
		lblReceivable.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblReceivable.setBounds(10, 133, 95, 14);
		panel.add(lblReceivable);
		
		JLabel lblItemsname_4 = new JLabel("Product Name :");
		lblItemsname_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItemsname_4.setBounds(10, 174, 95, 14);
		panel.add(lblItemsname_4);
	}
}
