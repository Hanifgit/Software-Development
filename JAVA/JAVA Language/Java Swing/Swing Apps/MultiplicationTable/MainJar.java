package MultiplicationTable;

import javax.swing.JFrame;

public class MainJar {
	public static void main(String[] args) {
		Test icon = new Test();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 20, 360, 710);
		icon.setTitle("Multiplication Table");
	}
}
