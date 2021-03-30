package mouseMotionListener;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

 @SuppressWarnings("serial")
public class mouseMotionListenerDemo extends JFrame {
	private Container container;
	private JTextField textField;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	public mouseMotionListenerDemo() {
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
		textArea.addMouseMotionListener(handle);
	}

	class Handler implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			textField.setText("Mouse Dragged: "+e.getX()+" "+e.getY());
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			textField.setText("Mouse Moved: "+e.getX()+" "+e.getY());
			
		}

	}
	
	public static void main(String[] args) {
		mouseMotionListenerDemo icon = new mouseMotionListenerDemo();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("MouseListener Demo");
	}
}
