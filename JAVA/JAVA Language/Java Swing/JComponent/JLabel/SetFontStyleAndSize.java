package JLabel;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SetFontStyleAndSize extends JFrame {
		private Container container;
		private JLabel label;
		private Font font;
		
		public SetFontStyleAndSize(){
			Componant();
		}
		
		public void Componant() {
			//container create
			container = this.getContentPane();
			container.setLayout(null);
			
			//Font Class object
			font = new Font("Arial",Font.BOLD,14);
			
			//Create Label
			label = new JLabel();
			label.setText("Enter Your Name : ");
			label.setBounds(15, 5, 200, 50);
			label.setFont(font);
			container.add(label);
		}
		
	public static void main(String[] args) {
		SetFontStyleAndSize icon = new SetFontStyleAndSize();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Frame Demo");
	}
}
