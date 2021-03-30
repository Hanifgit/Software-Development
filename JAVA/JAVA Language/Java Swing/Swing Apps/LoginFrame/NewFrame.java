package LoginFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class NewFrame extends JFrame {
	private Container container;
	private JLabel Label;
	private Font font;

	public NewFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 50, 420, 350);
		this.setTitle("Login Field Demo");
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.orange);

		// Font create
		font = new Font("Arial", Font.BOLD, 14);

		Label = new JLabel("Welcome Papon Ahasan");
		Label.setBounds(100, 50, 300, 50);
		Label.setFont(font);
		container.add(Label);

	}

	public static void main(String[] args) {
		NewFrame icon = new NewFrame();
		icon.setVisible(true);
//		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		icon.setBounds(100, 50, 420, 350);
//		icon.setTitle("Login Field Demo");
	}
}
