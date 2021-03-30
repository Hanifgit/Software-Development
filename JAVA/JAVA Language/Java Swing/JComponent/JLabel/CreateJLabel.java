package JLabel;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CreateJLabel extends JFrame {
		private Container container;
		private JLabel label1,Label2;
		
		public CreateJLabel(){
			Componant();
		}
		
		public void Componant() {
			//container create
			container = this.getContentPane();
			container.setLayout(null);
			
			//Create Label1
			label1 = new JLabel();
			label1.setText("Enter Your Name : ");
			label1.setBounds(15, 5, 150, 50);
			container.add(label1);
			
			//Create Label2
			Label2 = new JLabel("Enter Your Password : ");
			Label2.setBounds(15, 40, 150, 50);
			container.add(Label2);
		}
		
	public static void main(String[] args) {
		CreateJLabel icon = new CreateJLabel();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Label Demo");
	}
}
