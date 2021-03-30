package JTextField;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CreateJTextField extends JFrame {
	private Container container;
	private JTextField TF1, TF2;

	public CreateJTextField() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		TF1 = new JTextField();
		TF1.setBounds(50, 50, 100, 30);
		container.add(TF1);
		
		TF2 = new JTextField("Papon Ahasan");
		TF2.setBounds(50, 100, 100, 30);
		container.add(TF2);
	}

	public static void main(String[] args) {
		CreateJTextField icon = new CreateJTextField();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Text Field Demo");
	}
}
