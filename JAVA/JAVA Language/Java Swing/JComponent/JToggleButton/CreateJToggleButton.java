package JToggleButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

@SuppressWarnings("serial")
public class CreateJToggleButton extends JFrame {
	private Container container;
	private JLabel label;
	private JToggleButton toggleButton;
	private ImageIcon onImg,offImg;
	
	public CreateJToggleButton() {
		Componant();
	}
	
	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		onImg = new ImageIcon("E:\\JAVA Language\\Java Swing\\JComponent\\JToggleButton\\On.png");
		offImg = new ImageIcon("E:\\JAVA Language\\Java Swing\\JComponent\\JToggleButton\\Off.png");
		
		toggleButton = new JToggleButton(offImg);
		toggleButton.setBounds(50, 100, 90, 90);
		container.add(toggleButton);
		
		// create Label
		label = new JLabel("Ok.You are grate");
		label.setBounds(60, 130, 300, 235);
		label.setVisible(false);
		container.add(label);
		
		Handler handle = new Handler();
		toggleButton.addActionListener(handle);
	}
	
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(toggleButton.isSelected()) {
				label.setVisible(true);
				toggleButton.setIcon(onImg);
				//toggleButton.setText("ON");
			}
			else {
				label.setVisible(false);
				toggleButton.setIcon(offImg);
				//toggleButton.setText("OFF");
			}
		}
	}
	
	public static void main(String[] args) {
		CreateJToggleButton icon = new CreateJToggleButton();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("ToggleButton Demo");
	}
}
