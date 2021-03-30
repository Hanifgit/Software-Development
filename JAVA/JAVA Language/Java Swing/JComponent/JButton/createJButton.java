package JButton;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class  createJButton extends JFrame {
	private Container container;
	private JButton btn1,btn2;
    private Font font;

	public  createJButton() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		//create button
		btn1 = new JButton("Submit");
		btn1.setBounds(100, 50, 100, 50);
		
		//create Font 
		font = new Font("Arial",Font.BOLD,14);
		btn1.setFont(font);
		
		//Fore color create
		btn1.setForeground(Color.green);
		
		//Background color create
		btn1.setBackground(Color.yellow);
		container.add(btn1);
		
		btn2 = new JButton("Clear");
		btn2.setBounds(220, 50, 100, 50);
		container.add(btn2);
	}

	public static void main(String[] args) {
		createJButton icon = new  createJButton();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Password Field Demo");
	}
}
