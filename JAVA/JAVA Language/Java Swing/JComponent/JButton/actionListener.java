package JButton;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class actionListener extends JFrame {
	private Container container;
	private JButton btn;
	private JTextField textField;

	public actionListener () {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		//create TextField
		textField = new JTextField();
		textField.setBounds(100, 30, 200, 30);
		container.add(textField);
		
		//create button
		btn = new JButton("Click");
		btn.setBounds(100, 70, 80, 30);
		container.add(btn);
		
//		textField.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			textField.setText("");
//		}
//	});
//		
		Handler handle = new Handler();
		btn.addActionListener(handle);
	}
	
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				textField.setText("");
		}
	}
	
	public static void main(String[] args) {
		actionListener  icon = new actionListener();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Password Field Demo");
	}
}
