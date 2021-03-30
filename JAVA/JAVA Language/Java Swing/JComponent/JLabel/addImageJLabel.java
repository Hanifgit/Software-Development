package JLabel;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class addImageJLabel extends JFrame {
	private Container container;
	private JLabel label;
	private ImageIcon imgIcon;
	
	public addImageJLabel(){
		Componant();
	}
	
	public void Componant() {
		container = this.getContentPane();
		container.setLayout(null);
		//Add image
		imgIcon = new ImageIcon(getClass().getResource("ABC.jpg"));
		//Create Label
		label = new JLabel(imgIcon);
		label.setBounds(15, 5, imgIcon.getIconWidth(), imgIcon.getIconHeight());
		container.add(label);
	}
	
	public static void main(String[] args) {
		addImageJLabel icon = new addImageJLabel();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 600, 600);
	}
}
