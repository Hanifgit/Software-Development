package Inventory_Management_System;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JScrollPane;


@SuppressWarnings("serial")
public class Vendor extends JFrame {
	
	private JFrame frame;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTable table;
	private JButton btnAdd;
    private JButton btnCancle;
    private JButton btnDelete;
    private JButton btnEdit;
    private JScrollPane scrollPane;
    private JButton btnClose;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendor window = new Vendor();
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
	public Vendor() {
		initialize();
		connect();
		load();
		this.setBounds(100, 100, 528, 486);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnCancle.setEnabled(false);
        
        btnClose = new JButton("Close");
        btnClose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Purchases main = new Purchases();
				main.NewScreen();
				frame.dispose();
        	}
        });
        btnClose.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnClose.setBounds(23, 11, 64, 27);
        frame.getContentPane().add(btnClose);
        frame.setLocationRelativeTo(null);
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
	
	public static boolean isNumeric(final String str) {
        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
	 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setBackground(new Color(100, 149, 237));
		frame.setBounds(100, 100, 528, 486);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(23, 62, 348, 169);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vendor Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 22, 95, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 59, 57, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 94, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 132, 57, 14);
		panel.add(lblNewLabel_3);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtName.setBounds(115, 16, 208, 29);
		panel.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPhone.setColumns(10);
		txtPhone.setBounds(115, 53, 208, 29);
		panel.add(txtPhone);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setColumns(10);
		txtEmail.setBounds(115, 88, 208, 29);
		panel.add(txtEmail);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAddress.setColumns(10);
		txtAddress.setBounds(115, 127, 208, 27);
		panel.add(txtAddress);
		 
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String Name = txtName.getText();
					String Phone = txtPhone.getText();
					String email = txtEmail.getText();
					String address = txtAddress.getText();
					if(!isNumeric(Phone)) {
						JOptionPane.showMessageDialog(null, "Enter Valid Phone Number","Warning",3);
					}
					else if(!Name.equals("") && !Phone.equals("") && !email.equals("") && !address.equals("")) {
						int choice = JOptionPane.showConfirmDialog(null, "Are you sure to Add?","Update",JOptionPane.YES_NO_OPTION);
						if(choice==JOptionPane.YES_NO_OPTION) {
							preparedStatement = connection.prepareStatement("insert into vendor(name,phone,email,address)values(?,?,?,?)");
							preparedStatement.setString(1, Name);
							preparedStatement.setString(2, Phone);
							preparedStatement.setString(3, email);
							preparedStatement.setString(4, address);
							preparedStatement.executeUpdate();
							JOptionPane.showMessageDialog(null, "Vendor Added Successfully","Warning",3);
							
							txtName.setText("");
							txtPhone.setText("");
							txtEmail.setText("");
							txtAddress.setText("");
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
		btnAdd.setBounds(400, 62, 89, 37);
		frame.getContentPane().add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				defaultTableModel = (DefaultTableModel)table.getModel();
				int selected = table.getSelectedRow();
				int id = Integer.parseInt(defaultTableModel.getValueAt(selected, 0).toString());
				String Name = txtName.getText();
				String Phone = txtPhone.getText();
				String email = txtEmail.getText();
				String address = txtAddress.getText();
				try {
					int choice = JOptionPane.showConfirmDialog(null, "Are you sure to Edit?","Update",JOptionPane.YES_NO_OPTION);
					if(choice==JOptionPane.YES_OPTION ) {
						preparedStatement = connection.prepareStatement("update vendor set name=?,phone=?,email=?,address=? where id=?");
						preparedStatement.setString(1, Name);
						preparedStatement.setString(2, Phone);
						preparedStatement.setString(3, email);
						preparedStatement.setString(4, address);
						preparedStatement.setInt(5, id);
						preparedStatement.executeUpdate();
						JOptionPane.showMessageDialog(null, "Vendor Update Successfully","Warning",3);
						
						txtName.setText("");
						txtPhone.setText("");
						txtEmail.setText("");
						txtAddress.setText("");
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
		btnEdit.setBounds(400, 109, 89, 37);
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
						preparedStatement = connection.prepareStatement("delete from vendor where id=?");
						preparedStatement.setInt(1, id);
						preparedStatement.executeUpdate();
						JOptionPane.showMessageDialog(null, "Vendor Delete Successfully","Warning",3);
						
						txtName.setText("");
						txtPhone.setText("");
						txtEmail.setText("");
						txtAddress.setText("");
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
		btnDelete.setBounds(400, 151, 89, 37);
		frame.getContentPane().add(btnDelete);
		
		btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtPhone.setText("");
				txtEmail.setText("");
				txtAddress.setText("");
				txtName.requestFocus();
				btnAdd.setEnabled(true);
				btnEdit.setEnabled(false);
		        btnDelete.setEnabled(false);
		        btnCancle.setEnabled(false);
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancle.setBounds(400, 192, 89, 39);
		frame.getContentPane().add(btnCancle);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 242, 465, 194);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(new Color(255, 255, 255));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(table!=null && table.getModel() != null) {
					defaultTableModel = (DefaultTableModel)table.getModel();
					int selected = table.getSelectedRow();
					//int id = Integer.parseInt(defaultTableModel.getValueAt(selected, 0).toString());
					txtName.setText(defaultTableModel.getValueAt(selected, 1).toString());
					txtPhone.setText(defaultTableModel.getValueAt(selected, 2).toString());
					txtEmail.setText(defaultTableModel.getValueAt(selected, 3).toString());
					txtAddress.setText(defaultTableModel.getValueAt(selected, 4).toString());
					btnAdd.setEnabled(false);
					btnEdit.setEnabled(true);
			        btnDelete.setEnabled(true);
			        btnCancle.setEnabled(true);
				}

			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Vendor Name", "Phone", "Email", "Address"
			}
		));
		
		JLabel lblNewLabel_4 = new JLabel("Vendor");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(215, 24, 64, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
