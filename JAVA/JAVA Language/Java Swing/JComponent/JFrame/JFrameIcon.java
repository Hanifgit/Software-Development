package JFrame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JFrameIcon extends JFrame {
	//JFrameIcon object
	private ImageIcon icon;
	
	public JFrameIcon(){
		Componant();
	}
	
	public void Componant() {
		//JFrameIcon Set
		icon = new ImageIcon(getClass().getResource("Home.png"));
		this.setIconImage(icon.getImage());
	}
	
	public static void main(String[] args) {
		JFrameIcon icon = new JFrameIcon();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Frame Demo");
	}
}
