package LoginFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LOGIN extends JFrame {
	private Container container;
	private JButton submitButton, clearButton;
	private JTextField userTextField;
	private JPasswordField passwordField;
	private JLabel userLabel, passwordLabel;
	private Font font;

	public LOGIN() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.orange);

		// Font create
		font = new Font("Arial", Font.BOLD, 14);

		// create Label
		userLabel = new JLabel("User Name :");
		userLabel.setBounds(35, 50, 200, 30);
		userLabel.setFont(font);
		container.add(userLabel);

		passwordLabel = new JLabel("User Password :");
		passwordLabel.setBounds(35, 85, 200, 30);
		passwordLabel.setFont(font);
		container.add(passwordLabel);

		// create TextField
		userTextField = new JTextField();
		userTextField.setBounds(155, 50, 180, 30);
		userTextField.setFont(font);
		container.add(userTextField);

		passwordField = new JPasswordField();
		passwordField.setBounds(155, 85, 180, 30);
		passwordField.setFont(font);
		passwordField.setEchoChar('*');
		container.add(passwordField);

		// create button
		submitButton = new JButton("Login");
		submitButton.setBounds(155, 125, 80, 30);
		container.add(submitButton);

		clearButton = new JButton("Clear");
		clearButton.setBounds(255, 125, 80, 30);
		container.add(clearButton);

		Handler handle = new Handler();
		submitButton.addActionListener(handle);
		clearButton.addActionListener(handle);
	}

	class Handler implements ActionListener {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e) {
			String string1 = "Login Successful";
			String string2 = "Invalid Username or Password";

			if (e.getSource() == clearButton) {
				userTextField.setText("");
				passwordField.setText("");
			}

			else if (e.getSource() == submitButton) {
				String stringUser = userTextField.getText();
				String stringPasswordString = passwordField.getText();

				if (stringUser.isEmpty() || stringPasswordString.isEmpty())
					JOptionPane.showMessageDialog(null, "Please Enter User Name or Password");
				else if (stringUser.equals("Papon") && stringPasswordString.equals("123")) {
					JOptionPane.showMessageDialog(null, string1);
					NewFrame frame = new NewFrame();
					frame.setVisible(true);
					dispose();
				} else
					JOptionPane.showMessageDialog(null, string2);
			}
		}
	}

	public static void main(String[] args) {
		LOGIN icon = new LOGIN();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(100, 50, 420, 350);
		icon.setTitle("Login Field Demo");
	}
}
