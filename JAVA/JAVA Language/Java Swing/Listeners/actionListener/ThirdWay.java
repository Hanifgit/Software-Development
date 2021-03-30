package actionListener;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ThirdWay extends JFrame implements ActionListener {
	private Container container;
	private JTextField textField;

	public ThirdWay() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		// create TextField
		textField = new JTextField();
		textField.setBounds(100, 30, 200, 30);
		container.add(textField);
		
		textField.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		textField.setText("I Am Rakibul");
	}
	
	public static void main(String[] args) {
		ThirdWay icon = new ThirdWay();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Password Field Demo");
	}
}
