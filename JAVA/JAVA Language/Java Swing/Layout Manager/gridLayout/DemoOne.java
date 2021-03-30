package gridLayout;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DemoOne extends JFrame {
	private Container container;
	private JButton btn1, btn2, btn3, btn4,btn5;
	private GridLayout gridLayout;

	public DemoOne() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		gridLayout = new GridLayout(3,3);
		container.setLayout(gridLayout);

		// create button
		btn1 = new JButton("1");
		container.add(btn1);

		btn2 = new JButton("2");
		container.add(btn2);
		
		btn3 = new JButton("3");
		container.add(btn3);
		
		btn4 = new JButton("4");
		container.add(btn4);
		
		btn5 = new JButton("5");
		container.add(btn5);
	}

	public static void main(String[] args) {
		DemoOne icon = new DemoOne();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Border Layout Demo");
	}
}
