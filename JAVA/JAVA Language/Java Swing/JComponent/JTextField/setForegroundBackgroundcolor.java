package JTextField;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class setForegroundBackgroundcolor extends JFrame {
	private Container container;
	private JTextField TF1;

	public setForegroundBackgroundcolor() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		TF1 = new JTextField();
		TF1.setBounds(50, 50, 100, 30);
		TF1.setForeground(Color.blue);
		TF1.setBackground(Color.red);
		TF1.setHorizontalAlignment(JTextField.CENTER); //align JTextField
		container.add(TF1);
	}

	public static void main(String[] args) {
		setForegroundBackgroundcolor icon = new setForegroundBackgroundcolor();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Text Field Demo");
	}
}


