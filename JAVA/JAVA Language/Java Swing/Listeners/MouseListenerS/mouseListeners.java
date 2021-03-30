package MouseListenerS;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

 @SuppressWarnings("serial")
public class mouseListeners extends JFrame {
	private Container container;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	public mouseListeners() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		// create TextField
		textField = new JTextField();
		textField.setBounds(100, 30, 200, 30);
		container.add(textField);

		// create TextArea
		textArea = new JTextArea();
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(50, 100, 200, 100);
		container.add(scrollPane);

		Handler handle = new Handler();
		textField.addMouseListener(handle);
	}

	class Handler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			textArea.append("Click Mouse\n");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			textArea.append("Pressed Mouse\n");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			textArea.append("Released Mouse\n");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			textArea.append("Entered Mouse\n");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			textArea.append("Exited Mouse\n");
			
		}

	}
	
	public static void main(String[] args) {
		mouseListeners icon = new mouseListeners();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("MouseListener Demo");
	}
}
