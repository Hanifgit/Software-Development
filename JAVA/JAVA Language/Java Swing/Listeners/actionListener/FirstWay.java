package actionListener;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FirstWay extends JFrame {
	private Container container;
	private JTextField textField;

	public FirstWay() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		// create TextField
		textField = new JTextField();
		textField.setBounds(100, 30, 200, 30);
		container.add(textField);
		
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("I Am Rakibul");	
			}
		});
	}

	public static void main(String[] args) {
		FirstWay icon = new FirstWay();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Listeners Field Demo");
	}
}
