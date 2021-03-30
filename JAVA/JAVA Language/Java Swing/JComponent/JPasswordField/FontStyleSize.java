 package JPasswordField;

 import java.awt.Container;
 import java.awt.Font;

 import javax.swing.JFrame;
 import javax.swing.JPasswordField;

 @SuppressWarnings("serial")
 public class  FontStyleSize extends JFrame {
 	private Container container;
 	private JPasswordField password;
 	private Font font;

 	public  FontStyleSize() {
 		Componant();
 	}

 	public void Componant() {
 		// container create
 		container = this.getContentPane();
 		container.setLayout(null);
 		
 		//PasswordField Create
 		password = new JPasswordField();
 		password.setEchoChar('#');
 		password.setBounds(50, 20, 150, 30);
 		
 		//PasswordField font Create
 		font = new Font("Arial", Font.BOLD+Font.ITALIC, 14);
 		password.setFont(font);
 		
 		container.add(password);
 		
 	}

 	public static void main(String[] args) {
 		 FontStyleSize icon = new  FontStyleSize();
 		icon.setVisible(true);
 		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		icon.setBounds(200, 100, 500, 400);
 		icon.setTitle("Password Field Demo");
 	}
 }
