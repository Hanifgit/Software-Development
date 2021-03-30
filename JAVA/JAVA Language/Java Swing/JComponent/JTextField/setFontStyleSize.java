package JTextField;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class setFontStyleSize extends JFrame {
	private Container container;
	private JTextField TF1;
	private Font font;

	public setFontStyleSize() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		font = new Font("Arial",Font.BOLD+Font.ITALIC,14);//*
		TF1 = new JTextField();
		TF1.setBounds(50, 50, 100, 30);
		TF1.setFont(font);//*
		container.add(TF1);
	}

	public static void main(String[] args) {
		setFontStyleSize icon = new setFontStyleSize();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Text Field Demo");
	}
}

