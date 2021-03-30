package focusListener;

import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

 @SuppressWarnings("serial")
public class focusListenerDemo extends JFrame {
	private Container container;
	private JButton button;
	private JTextArea textArea;

	public focusListenerDemo() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		// create Button
		button = new JButton("Click");
		button.setBounds(100, 30, 100, 30);
		container.add(button);

		// create TextArea
		textArea = new JTextArea();
		textArea.setBounds(50, 100, 200, 100);
		container.add(textArea);

		Handler handle = new Handler();
		button.addFocusListener(handle);
	}

	class Handler implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			textArea.setText("Focus Gained");
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			textArea.setText("Focus Lost");
			
		}
	}
	
	public static void main(String[] args) {
		focusListenerDemo icon = new focusListenerDemo();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("Focus Listener Demo");
	}
}
