package JLabel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class setForegroundandBackgroundColor extends JFrame {
	private Container container;
	private JLabel label;
	
	public setForegroundandBackgroundColor(){
		Componant();
	}
	
	public void Componant() {
		//container create
		container = this.getContentPane();
		container.setLayout(null);
		
		//Create Label1
		label = new JLabel();
		label.setText("Enter Your Name : ");
		label.setBounds(15, 5, 200, 50);
		
		/*label text fore color*/
		label.setForeground(Color.red);//text color
		
		/*Background Color label*/
		label.setOpaque(true);
		label.setBackground(Color.blue);
		
		container.add(label);
	}
	
	public static void main(String[] args) {
		setForegroundandBackgroundColor icon = new setForegroundandBackgroundColor();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Label Background Demo");
	}
}
