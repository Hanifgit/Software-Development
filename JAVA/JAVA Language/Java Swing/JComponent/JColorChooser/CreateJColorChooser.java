package JColorChooser;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CreateJColorChooser extends JFrame implements ActionListener {
	private Container container;
	private JButton button;

	public CreateJColorChooser() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		button = new JButton("Choose a color");
		button.setBounds(100, 50, 150, 50);
		container.add(button);
		
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Color color = JColorChooser.showDialog(null, "Select a color", Color.yellow);
		container.setBackground(color);
	}
	
	public static void main(String[] args) {
		CreateJColorChooser icon = new CreateJColorChooser();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 600, 600);
		icon.setTitle("Color Chooser Demo");
	}
}
