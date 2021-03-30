package JLabel;
import java.awt.Container;

//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class addTips extends JFrame {
	private Container container;
	private JLabel label;
	
	public addTips(){
		Componant();
	}
	
	public void Componant() {
		//container create
		container = this.getContentPane();
		container.setLayout(null);
		
		//Create Label
		label = new JLabel();
		label.setText("Enter Your Name : ");
		label.setBounds(15, 5, 200, 50);
		label.setToolTipText("Enter Name");
		System.out.println(label.getText());
		System.out.println(label.getToolTipText());
		container.add(label);
	}
	public static void main(String[] args) {
		addTips icon = new addTips();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Tips Demo");
	}
}
