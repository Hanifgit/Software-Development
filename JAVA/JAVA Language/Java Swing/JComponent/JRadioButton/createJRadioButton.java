package JRadioButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class createJRadioButton extends JFrame {
	private Container container;
	private JRadioButton Male,Female;
	private ButtonGroup buttonGroup;
	private Font font;

	public createJRadioButton() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		// create RadioButton
		Male = new JRadioButton("Male");
		Male.setBounds(50, 50, 100, 50);
		Male.setBackground(Color.orange);
		container.add(Male);
		
		Female = new JRadioButton("Female");
		Female.setBounds(160, 50, 100, 50);
		Female.setBackground(Color.orange);
		container.add(Female);
		
		// create ButtonGroup
		buttonGroup = new ButtonGroup();
		buttonGroup.add(Male);
		buttonGroup.add(Female);
		
		// create Font
		font = new Font("Arial",Font.BOLD,18);
		Male.setFont(font);
		Female.setFont(font);
		
		// select a RadioButton internally
		 Male.setSelected(true);
		
		//disable a RadioButton
		 Female.setEnabled(false);
	}

	public static void main(String[] args) {
		createJRadioButton icon = new createJRadioButton();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 20, 360, 300);
		icon.setTitle("Radio Button Demo");
	}
}
