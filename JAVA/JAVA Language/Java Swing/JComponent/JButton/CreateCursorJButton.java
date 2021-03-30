package JButton;

import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class  CreateCursorJButton extends JFrame {
	private Container container;
	private JButton btn1,btn2;
    private Cursor cursor;

	public  CreateCursorJButton() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		//create button
		btn1 = new JButton("Submit");
		btn1.setBounds(100, 50, 100, 50);
		
		//create cursor in button
		cursor = new Cursor(Cursor.HAND_CURSOR);
		btn1.setCursor(cursor);
		
		container.add(btn1);
		
		btn2 = new JButton("Clear");
		btn2.setBounds(220, 50, 100, 50);
		container.add(btn2);
	}

	public static void main(String[] args) {
		CreateCursorJButton icon = new  CreateCursorJButton();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Password Field Demo");
	}
}
