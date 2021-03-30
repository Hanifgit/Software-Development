package actionListener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class actionListener extends JFrame {
	private Container container;
	private JCheckBox Male,Female;
	private ButtonGroup buttonGroup;
	private JLabel label;
	private Font font;
	
	public actionListener() {
		Componant();
	}
	
	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		// create CheckBox
		Male = new JCheckBox("Male");
		Male.setBounds(50, 100, 80, 30);
		Male.setBackground(Color.orange);
		container.add(Male);
		
		Female = new JCheckBox("Female");
		Female.setBounds(50, 150, 80, 30);
		Female.setBackground(Color.orange);
		container.add(Female);
		
		// create ButtonGroup
		buttonGroup = new ButtonGroup();
		buttonGroup.add(Male);
		buttonGroup.add(Female);
		
		// create Label
		label = new JLabel();
		label.setBounds(60, 130, 300, 235);
		container.add(label);
		
		font = new Font("Arial",Font.BOLD,14);
		label.setFont(font);
		
		Handler handle = new Handler();
		Male.addActionListener(handle);
		Female.addActionListener(handle);
	}
	
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//if(Male.isSelected())
			if(e.getSource()==Male) {
				label.setText("You have selected male\n");
			}
			else if(e.getSource()==Female) {
				label.setText("You have selected Female");
			}
			else {
				label.setText("You have selected Other");
			}
		}
	}
	public static void main(String[] args) {
		actionListener icon = new actionListener();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("ActionListener Table");
	}
}
