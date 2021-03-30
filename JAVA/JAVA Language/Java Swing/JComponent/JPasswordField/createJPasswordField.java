package JPasswordField;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class createJPasswordField extends JFrame {
	private Container container;
	private JPasswordField password;

	public createJPasswordField() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		password = new JPasswordField();
		password.setEchoChar('#');
		password.setBounds(50, 20, 150, 30);
		container.add(password);
	}

	public static void main(String[] args) {
		createJPasswordField icon = new createJPasswordField();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Text Field Demo");
	}
}
