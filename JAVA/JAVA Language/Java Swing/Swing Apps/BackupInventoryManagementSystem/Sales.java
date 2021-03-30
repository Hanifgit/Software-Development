package BackupInventoryManagementSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

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
		lblSales.setBounds(85, 27, 107, 41);
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
		btnRevenues.setBounds(98, 190, 101, 41);
		frame.getContentPane().add(btnRevenues);
		
		JButton btnCuestomers = new JButton("Customers");
		btnCuestomers.setForeground(new Color(0, 139, 139));
		btnCuestomers.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCuestomers.setBackground(new Color(64, 224, 208));
		btnCuestomers.setBounds(98, 267, 101, 41);
		frame.getContentPane().add(btnCuestomers);
	}
}
