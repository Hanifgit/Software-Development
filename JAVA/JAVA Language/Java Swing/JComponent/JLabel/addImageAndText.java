package JLabel;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class addImageAndText extends JFrame{
	private Container container;
	private JLabel label;
	private ImageIcon imgIcon;
	
	public addImageAndText(){
		Componant();
	}
	
	public void Componant() {
		container = this.getContentPane();
		container.setLayout(null);
		//Add image
		imgIcon = new ImageIcon(getClass().getResource("icons8_man_office_worker_48px_2.png"));
		//Create Label
		label = new JLabel("This is man",imgIcon,JLabel.LEFT);
		label.setBounds(50, 50, 250, 50);
		container.add(label);
	}
	
	public static void main(String[] args) {
		addImageAndText icon = new addImageAndText();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(100, 50, 300, 300);
	}
}
