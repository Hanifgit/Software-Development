package KeyListeneR;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VowelCounter extends JFrame {
	private Container container;
	private JTextField textField;
	private JLabel labels[];
	int a=0,E=0,i=0,o=0,u=0,vowel=0;
	
	public VowelCounter() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		// create TextField
		textField = new JTextField();
		textField.setBounds(120, 30, 180, 30);
		container.add(textField);
		
		labels = new JLabel[7];
		for(int i=0;i<7;i++) {
			labels[i] = new JLabel();
			container.add(labels[i]);
		}
		labels[0].setText("Enter the text: ");
		labels[0].setBounds(20, 30, 150, 30);
		labels[1].setBounds(120, 60, 150, 30);
		labels[2].setBounds(120, 80, 150, 30);
		labels[3].setBounds(120, 100, 150, 30);
		labels[4].setBounds(120, 120, 150, 30);
		labels[5].setBounds(120, 140, 150, 30);
		labels[6].setBounds(120, 160, 150, 30);

		

		Handler handle = new Handler();
		textField.addKeyListener(handle);
	}

	class Handler implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getSource()==textField) {
				if(KeyEvent.VK_A==e.getKeyCode()) {
					a++;
					vowel++;
				}
				else if(KeyEvent.VK_E==e.getKeyCode()) {
					E++;
					vowel++;
				}
				else if(KeyEvent.VK_I==e.getKeyCode()) {
					i++;
					vowel++;
				}
				else if(KeyEvent.VK_O==e.getKeyCode()) {
					o++;
					vowel++;
				}
				else if(KeyEvent.VK_U==e.getKeyCode()) {
					u++;
					vowel++;
				}
			}
			labels[1].setText("Total number of vowels: "+vowel);
			labels[2].setText("Total number of a : "+a);
			labels[3].setText("Total number of e : "+E);
			labels[4].setText("Total number of i : "+i);
			labels[5].setText("Total number of o : "+o);
			labels[6].setText("Total number of u : "+u);
		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

	}

	public static void main(String[] args) {
		VowelCounter icon = new VowelCounter();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 100, 360, 400);
		icon.setTitle("ActionListener Table");
	}
}
