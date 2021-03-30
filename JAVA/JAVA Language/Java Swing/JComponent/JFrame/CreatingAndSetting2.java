package JFrame;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CreatingAndSetting2 extends JFrame {
	public CreatingAndSetting2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(200, 100, 500, 400);
		setTitle("Frame Demo");
	}
	public static void main(String[] args) {
		CreatingAndSetting2 frame = new CreatingAndSetting2();
		frame.setVisible(true);
	}
}
