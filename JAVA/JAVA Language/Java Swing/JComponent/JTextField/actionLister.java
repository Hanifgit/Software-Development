package JTextField;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class actionLister extends JFrame {
	private Container container;
	private JTextField TF1,TF2;

	public actionLister() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		TF1 = new JTextField();
		TF1.setBounds(50, 50, 100, 30);
		container.add(TF1);
		
		TF2 = new JTextField();
		TF2.setBounds(50, 100, 100, 30);
		container.add(TF2);
		
//		TF1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String string = TF1.getText();
//				if(string.isEmpty()) 
//				   JOptionPane.showMessageDialog(null, "Please Enter String");
//				else JOptionPane.showMessageDialog(null, string);
//			}
//		});
		
		Handler handle = new Handler();
		TF1.addActionListener(handle);
		TF2.addActionListener(handle);
	}
	
	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == TF1) {
				String string = TF1.getText();
				if (string.isEmpty())
					JOptionPane.showMessageDialog(null, "Please Enter String");
				else
					JOptionPane.showMessageDialog(null, string);
			} 
			
			else {
				String string = TF2.getText();
				if (string.isEmpty())
					JOptionPane.showMessageDialog(null, "Please Enter String");
				else
					JOptionPane.showMessageDialog(null, string);
			}
		}
	}
	
	public static void main(String[] args) {
		actionLister icon = new actionLister();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Text Field Demo");
	}
}


