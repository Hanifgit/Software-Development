package JCheckBox;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class itemListener extends JFrame {
	private Container container;
	private JCheckBox Male,Female,Other;
	private ButtonGroup buttonGroup;
	private JLabel label;
	private Font font;
	
	public itemListener() {
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
		
		Other = new JCheckBox("Other");
		Other.setBounds(50, 200, 80, 30);
		Other.setBackground(Color.orange);
		container.add(Other);
		
		// create ButtonGroup
		buttonGroup = new ButtonGroup();
		buttonGroup.add(Male);
		buttonGroup.add(Female);
		buttonGroup.add(Other);
		
		// create TextField
		label = new JLabel();
		label.setBounds(60, 130, 300, 235);
		container.add(label);
		
		font = new Font("Arial",Font.BOLD,14);
		label.setFont(font);
		
		Handler handle = new  Handler();
		Male.addItemListener(handle);
		Female.addItemListener(handle);
		Other.addItemListener(handle);
	}
	
	class Handler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
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
		itemListener icon = new itemListener();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("Item Listener Table");
	}
}
