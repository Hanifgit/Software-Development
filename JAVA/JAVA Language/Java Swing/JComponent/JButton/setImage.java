package JButton;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class  setImage extends JFrame {
	private Container container;
	private JButton btn1,btn2;
	private ImageIcon imgIcon1,imgIcon2;

	public  setImage() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		imgIcon1 = new ImageIcon(getClass().getResource("download.jpg"));
		imgIcon2 = new ImageIcon(getClass().getResource("submit-button.png"));
		
		//create button
		btn1 = new JButton(imgIcon1);
		btn1.setBounds(100, 50, 100, 50);
		container.add(btn1);
		
		btn2 = new JButton(imgIcon2);
		btn2.setBounds(220, 50, 100, 50);
		container.add(btn2);
	}

	public static void main(String[] args) {
		setImage icon = new  setImage();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Password Field Demo");
	}
}
