package KeyListeneR;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class keyListener extends JFrame {
	private Container container;
	private JTextField textField;
	private JTextArea textArea;

	public keyListener() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		// create TextField
		textField = new JTextField();
		textField.setBounds(100, 30, 200, 30);
		container.add(textField);

		// create TextArea
		textArea = new JTextArea();
		textArea.setBounds(50, 100, 200, 100);
		container.add(textArea);

		Handler handle = new Handler();
		textField.addKeyListener(handle);
	}

	class Handler implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
			//textArea.append(" " +textField.getKeymap());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			//textArea.append(" " +textField.getKeymap());
			textArea.append(textField.getText());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			//textArea.setText("I Am Rakibul");
		}

	}

	public static void main(String[] args) {
		keyListener icon = new keyListener();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("ActionListener Table");
	}
}
