package JRadioButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class actionListener extends JFrame {
	private Container container;
	private JRadioButton Male,Female;
	private ButtonGroup buttonGroup;
	private JTextArea textArea;
	private Font font;
	
	public actionListener() {
		Componant();
	}
	
	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		// create RadioButton
		Male = new JRadioButton("Male");
		Male.setBounds(50, 30, 100, 50);
		Male.setBackground(Color.orange);
		container.add(Male);
		
		Female = new JRadioButton("Female");
		Female.setBounds(160, 30, 100, 50);
		Female.setBackground(Color.orange);
		container.add(Female);
		
		// create ButtonGroup
		buttonGroup = new ButtonGroup();
		buttonGroup.add(Male);
		buttonGroup.add(Female);
		
		// create TextArea
		textArea = new JTextArea();
		textArea.setBounds(20, 110, 300, 235);
		container.add(textArea);
		
		font = new Font("Arial",Font.BOLD,14);
		textArea.setFont(font);
		
		Handler handle = new Handler();
		Male.addActionListener(handle);
		Female.addActionListener(handle);	
	}
	
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//if(Male.isSelected())
			if(e.getSource()==Male) {
				/*textField.setText("You have selected male\n");*/
				textArea.append("You have selected male\n");
			}
			else {
				//textField.setText("You have selected Female");
				textArea.append("You have selected Female\n");
			}
		}
	}
	
	public static void main(String[] args) {
		actionListener icon = new actionListener();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("Multiplication Table");
	}
}
