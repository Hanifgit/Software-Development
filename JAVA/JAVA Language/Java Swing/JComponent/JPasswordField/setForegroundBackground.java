package JPasswordField;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class  setForegroundBackground extends JFrame {
	private Container container;
	private JPasswordField password;

	public  setForegroundBackground() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		//PasswordField Create
		password = new JPasswordField();
		password.setEchoChar('#');
		password.setBounds(50, 20, 150, 30);
		
		//PasswordField Fore And Background
		password.setForeground(Color.blue);
		password.setBackground(Color.green);
		
		container.add(password);
		
	}

	public static void main(String[] args) {
		setForegroundBackground icon = new  setForegroundBackground();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Password Field Demo");
	}
}
