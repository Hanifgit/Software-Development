package JPanel;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class createJPanel extends JFrame {
	private Container container;
	private JPanel panel1, panel2;
	private JLabel label1, label2, label3;
	private ImageIcon imgIcon;

	public createJPanel() {
		Componant();
	}

	public void Componant() {
		container = this.getContentPane();
		container.setLayout(null);

		// Add image
		imgIcon = new ImageIcon(getClass().getResource("icons8_man_office_worker_48px_2.png"));

		// Create Panel
		panel1 = new JPanel();
		panel1.setBounds(15, 70, 300, 350);
		panel1.setBackground(Color.orange);
		container.add(panel1);

		panel2 = new JPanel();
		panel2.setBounds(325, 70, 300, 350);
		panel2.setBackground(Color.red);
		container.add(panel2);

		// Create Label
		label1 = new JLabel("This is Yellow man", imgIcon, JLabel.CENTER);
		panel1.add(label1);

		label2 = new JLabel("This is Red man", imgIcon, JLabel.LEFT);
		panel2.add(label2);

		label3 = new JLabel("This is Panel");
		label3.setBounds(290, 0, 200, 80);
		container.add(label3);
	}

	public static void main(String[] args) {
		createJPanel icon = new createJPanel();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(100, 100, 670, 500);
	}
}
