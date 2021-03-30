package JFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BackgroundColor extends JFrame{
	//BackGround Color Container
	private Container container;
	
	public BackgroundColor(){
		Componant();
	}
	
	public void Componant() {
		//BackGround Color
		container = this.getContentPane();
		container.setBackground(Color.blue);
	}
	
	public static void main(String[] args) {
		BackgroundColor icon = new BackgroundColor();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Frame Demo");
	}
}
