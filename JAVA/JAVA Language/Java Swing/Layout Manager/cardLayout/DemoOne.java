package cardLayout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DemoOne extends JFrame implements ActionListener {
	private Container container;
	private JButton btn1, btn2, btn3, btn4,btn5;
	private CardLayout cardLayout;

	public DemoOne() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		cardLayout = new CardLayout();
		//cardLayout = new CardLayout(10,10);
		container.setLayout(cardLayout);

		// create button
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		container.add(btn1,"first");

		btn2 = new JButton("2");
		btn2.addActionListener(this);
		container.add(btn2,"second");
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		container.add(btn3,"third");
		
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		container.add(btn4,"four");
		
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		container.add(btn5,"five");
		
		cardLayout.show(container, "second"); //starting
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cardLayout.next(container);
		//cardLayout.previous(container);
		//cardLayout.show(container, "second");
		//cardLayout.first(container);
		//cardLayout.last(container);
	}
	
	public static void main(String[] args) {
		DemoOne icon = new DemoOne();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Border Layout Demo");
	}
}
