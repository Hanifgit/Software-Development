package flowLayout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DemoOne extends JFrame {
	private Container container;
	private JButton buttons[];
	private FlowLayout flowLayout;

	public DemoOne() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		flowLayout = new FlowLayout();
		// flowLayout = new FlowLayout(FlowLayout.LEFT);
		//flowLayout = new FlowLayout(FlowLayout.LEFT,10,5);
		// flowLayout.setHgap(10);
		// flowLayout.setVgap(5);
		container.setLayout(flowLayout);

		buttons = new JButton[17];
		for (int i = 0; i < 17; i++) {
			buttons[i] = new JButton("" + i);
			container.add(buttons[i]);
		}
	}

	public static void main(String[] args) {
		DemoOne icon = new DemoOne();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Border Layout Demo");
	}
}
