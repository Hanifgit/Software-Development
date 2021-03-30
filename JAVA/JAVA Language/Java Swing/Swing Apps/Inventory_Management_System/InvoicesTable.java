package Inventory_Management_System;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class InvoicesTable {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvoicesTable window = new InvoicesTable();
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
	public InvoicesTable() {
		initialize();
		connect();
		load();
	}
	
	Connection connection;
	PreparedStatement preparedStatement;
	DefaultTableModel defaultTableModel;
	
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/inventorymanagement","root","");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void load() {
		int a;
		try {
			preparedStatement = connection.prepareStatement("select * from vendor");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			a = resultSetMetaData.getColumnCount();
			defaultTableModel = (DefaultTableModel)table.getModel();
			defaultTableModel.setRowCount(0);
			
			while(resultSet.next()) {
				Vector<Object> v2 = new Vector<>();
				for(int i=1;i<=a;i++) {
					v2.add(resultSet.getString("id"));
					v2.add(resultSet.getString("name"));
					v2.add(resultSet.getString("phone"));
					v2.add(resultSet.getString("email"));
					v2.add(resultSet.getString("address"));
				}
				defaultTableModel.addRow(v2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 527, 260);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
	}
}
