package windowListener;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

 @SuppressWarnings("serial")
public class windowListenerDemo extends JFrame {
	private Container container;

	public windowListenerDemo() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		Handler handle = new Handler();
		this.addWindowListener(handle);
	}

	class Handler implements WindowListener {

		@Override
		public void windowOpened(WindowEvent e) {
			System.out.println("windowOpened");
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("windowClosing");
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			System.out.println("windowClosing");
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("windowIconified");
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			System.out.println("windowDeiconified");
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			System.out.println("windowActivated");
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			System.out.println("windowDeactivated");
			
		}
	}
	
	public static void main(String[] args) {
		windowListenerDemo icon = new windowListenerDemo();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("Focus Listener Demo");
	}
}

