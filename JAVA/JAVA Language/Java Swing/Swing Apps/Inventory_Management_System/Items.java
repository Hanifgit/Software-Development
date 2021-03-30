package Inventory_Management_System;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Items {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtDes;
	private JTextField txtSales;
	private JTextField txtTax;
	private JTextField txtPrice;
	private JTextField txtQuentity;
	private JTextField txtExDate;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnCancle;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Items window = new Items();
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
	public Items() {
		initialize();
		connect();
		load();
	}
	
	Connection connection;
	PreparedStatement preparedStatement;
	DefaultTableModel defaultTableModel;
	private JTable table;
	private JScrollPane scrollPane;
	
	
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
			preparedStatement = connection.prepareStatement("select * from product");
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
					v2.add(resultSet.getString("description"));
					v2.add(resultSet.getString("salesprice"));
					v2.add(resultSet.getString("tax"));
					v2.add(resultSet.getString("retailprice"));
					v2.add(resultSet.getString("quentity"));
					v2.add(resultSet.getString("expiredate"));
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
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 875, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 47, 359, 298);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblItemsname = new JLabel("Product Name :");
		lblItemsname.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItemsname.setBounds(10, 17, 95, 14);
		panel.add(lblItemsname);
		
		JLabel lblItemsname_1 = new JLabel("Description :");
		lblItemsname_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItemsname_1.setBounds(10, 60, 95, 14);
		panel.add(lblItemsname_1);
		
		JLabel lblItemsname_2 = new JLabel("Sales Price :");
		lblItemsname_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItemsname_2.setBounds(10, 101, 95, 14);
		panel.add(lblItemsname_2);
		
		JLabel lblItemsname_3 = new JLabel("Tax :");
		lblItemsname_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItemsname_3.setBounds(10, 142, 95, 14);
		panel.add(lblItemsname_3);
		
		JLabel lblRetailPrice = new JLabel("Retail Price :");
		lblRetailPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRetailPrice.setBounds(10, 184, 95, 14);
		panel.add(lblRetailPrice);
		
		JLabel lblQuentity = new JLabel("Quentity :");
		lblQuentity.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuentity.setBounds(10, 224, 95, 14);
		panel.add(lblQuentity);
		
		JLabel lblItemsname_2_1 = new JLabel("Expire Date :");
		lblItemsname_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblItemsname_2_1.setBounds(10, 264, 95, 14);
		panel.add(lblItemsname_2_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setColumns(10);
		txtName.setBounds(115, 11, 237, 29);
		panel.add(txtName);
		
		txtDes = new JTextField();
		txtDes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDes.setColumns(10);
		txtDes.setBounds(115, 51, 237, 29);
		panel.add(txtDes);
		
		txtSales = new JTextField();
		txtSales.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSales.setColumns(10);
		txtSales.setBounds(115, 91, 237, 29);
		panel.add(txtSales);
		
		txtTax = new JTextField();
		txtTax.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTax.setColumns(10);
		txtTax.setBounds(115, 136, 237, 29);
		panel.add(txtTax);
		
		txtPrice = new JTextField();
		txtPrice.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrice.setColumns(10);
		txtPrice.setBounds(115, 178, 237, 29);
		panel.add(txtPrice);
		
		txtQuentity = new JTextField();
		txtQuentity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtQuentity.setColumns(10);
		txtQuentity.setBounds(115, 218, 237, 29);
		panel.add(txtQuentity);
		
		txtExDate = new JTextField();
		txtExDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtExDate.setColumns(10);
		txtExDate.setBounds(115, 258, 237, 29);
		panel.add(txtExDate);
		
		JLabel lblNewLabel_4 = new JLabel("Items");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(321, 11, 64, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String Name = txtName.getText();
					String Description = txtDes.getText();
					String Sales = txtSales.getText();
					String Tax = txtTax.getText();
					String Price = txtPrice.getText();
					String Quentity = txtQuentity.getText();
					String ExDate = txtExDate.getText();
					
					if(!Name.equals("") && ! Description.equals("") && !Sales.equals("") && !Tax.equals("") && ! Price.equals("") && !Quentity.equals("") && !ExDate.equals("")) {
						int choice = JOptionPane.showConfirmDialog(null, "Are you sure to Add?","Update",JOptionPane.YES_NO_OPTION);
						if(choice==JOptionPane.YES_NO_OPTION) {
							preparedStatement = connection.prepareStatement("insert into product(name,description,salesprice,tax,retailprice,quentity,expiredate)values(?,?,?,?,?,?,?)");
							preparedStatement.setString(1, Name);
							preparedStatement.setString(2, Description);
							preparedStatement.setString(3, Sales);
							preparedStatement.setString(4, Tax);
							preparedStatement.setString(5, Price);
							preparedStatement.setString(6, Quentity);
							preparedStatement.setString(7, ExDate);
							preparedStatement.executeUpdate();
							JOptionPane.showMessageDialog(null, "Product Added Successfully","Warning",3);
							
							txtName.setText("");
							txtDes.setText("");
							txtSales.setText("");
							txtTax.setText("");
							txtPrice.setText("");
							txtTax.setText("");
							txtQuentity.setText("");
							txtExDate.setText("");
							txtName.requestFocus();
							load();
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBounds(10, 356, 89, 37);
		frame.getContentPane().add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defaultTableModel = (DefaultTableModel)table.getModel();
				int selected = table.getSelectedRow();
				int id = Integer.parseInt(defaultTableModel.getValueAt(selected, 0).toString());
				String Name = txtName.getText();
				String Description = txtDes.getText();
				String Sales = txtSales.getText();
				String Tax = txtTax.getText();
				String Price = txtPrice.getText();
				String Quentity = txtQuentity.getText();
				String ExDate = txtExDate.getText();
				try {
					int choice = JOptionPane.showConfirmDialog(null, "Are you sure to Edit?","Update",JOptionPane.YES_NO_OPTION);
					if(choice==JOptionPane.YES_OPTION ) {
						preparedStatement = connection.prepareStatement("update product set name=?,description=?,salesprice=?,tax=?,retailprice=?,quentity=?,expiredate=? where id=?");
						preparedStatement.setString(1, Name);
						preparedStatement.setString(2, Description);
						preparedStatement.setString(3, Sales);
						preparedStatement.setString(4, Tax);
						preparedStatement.setString(5, Price);
						preparedStatement.setString(6, Quentity);
						preparedStatement.setString(7, ExDate);
						preparedStatement.setInt(8, id);
						preparedStatement.executeUpdate();
						JOptionPane.showMessageDialog(null, "Product Update Successfully","Warning",3);
						
						txtName.setText("");
						txtDes.setText("");
						txtSales.setText("");
						txtTax.setText("");
						txtPrice.setText("");
						txtExDate.setText("");
						txtQuentity.setText("");
						txtName.requestFocus();
						btnAdd.setEnabled(true);
						btnEdit.setEnabled(false);
				        btnDelete.setEnabled(false);
				        btnCancle.setEnabled(false);
						load();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEdit.setEnabled(false);
		btnEdit.setBounds(112, 356, 89, 37);
		frame.getContentPane().add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure to delete?","Delete",JOptionPane.YES_NO_OPTION);
				defaultTableModel = (DefaultTableModel)table.getModel();
				int selected = table.getSelectedRow();
				int id = Integer.parseInt(defaultTableModel.getValueAt(selected, 0).toString());
				try {
					if(choice==JOptionPane.YES_NO_OPTION) {
						preparedStatement = connection.prepareStatement("delete from product where id=?");
						preparedStatement.setInt(1, id);
						preparedStatement.executeUpdate();
						JOptionPane.showMessageDialog(null, "Vendor Delete Successfully","Warning",3);
						
						txtName.setText("");
						txtDes.setText("");
						txtSales.setText("");
						txtTax.setText("");
						txtPrice.setText("");
						txtExDate.setText("");
						txtQuentity.setText("");
						txtName.requestFocus();
						btnAdd.setEnabled(true);
						btnEdit.setEnabled(false);
				        btnDelete.setEnabled(false);
				        btnCancle.setEnabled(false);
						load();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDelete.setEnabled(false);
		btnDelete.setBounds(211, 356, 89, 37);
		frame.getContentPane().add(btnDelete);
		
		btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtDes.setText("");
				txtSales.setText("");
				txtTax.setText("");
				txtPrice.setText("");
				txtExDate.setText("");
				txtQuentity.setText("");
				txtName.requestFocus();
				btnAdd.setEnabled(true);
				btnEdit.setEnabled(false);
		        btnDelete.setEnabled(false);
		        btnCancle.setEnabled(false);
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancle.setEnabled(false);
		btnCancle.setBounds(309, 355, 89, 39);
		frame.getContentPane().add(btnCancle);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(381, 47, 468, 298);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				defaultTableModel = (DefaultTableModel)table.getModel();
				int selected = table.getSelectedRow();
				//int id = Integer.parseInt(defaultTableModel.getValueAt(selected, 0).toString());
				txtName.setText(defaultTableModel.getValueAt(selected, 1).toString());
				txtDes.setText(defaultTableModel.getValueAt(selected, 2).toString());
				txtSales.setText(defaultTableModel.getValueAt(selected, 3).toString());
				txtTax.setText(defaultTableModel.getValueAt(selected, 4).toString());
				txtPrice.setText(defaultTableModel.getValueAt(selected, 5).toString());
				txtQuentity.setText(defaultTableModel.getValueAt(selected, 6).toString());
				txtExDate.setText(defaultTableModel.getValueAt(selected, 7).toString());
				btnAdd.setEnabled(false);
				btnEdit.setEnabled(true);
		        btnDelete.setEnabled(true);
		        btnCancle.setEnabled(true);

			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Name", "Description", "Sale Price", "Tax", "Retail Price", "Quentity", "Expire Date"
			}
		));
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.NewScreen();
				frame.dispose();
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClose.setBounds(10, 11, 64, 27);
		frame.getContentPane().add(btnClose);
	}
}
