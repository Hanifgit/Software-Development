package JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class showMessageDialog {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Wrong Password");
		JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Wrong Password","Warning",3);
		
		ImageIcon imgIcon = new ImageIcon("E:\\JAVA Language\\Java Swing\\JComponent\\JOptionPane\\Icons\\icons8.png");
		JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.PLAIN_MESSAGE,imgIcon);
	}
}
