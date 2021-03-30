package JOptionPane;

import javax.swing.JOptionPane;

public class showInputDialog {
	public static void main(String[] args) {
		String name1 = JOptionPane.showInputDialog("Enter Your Name: ");
		String name2 = JOptionPane.showInputDialog("Enter First Name: ", "Papon");
		String name3 = JOptionPane.showInputDialog(null,"Enter Last Name: ","This is Title",JOptionPane.QUESTION_MESSAGE);
		
		String name = name2+" "+name3;
		JOptionPane.showMessageDialog(null, name1+" welcome to swing");
		JOptionPane.showMessageDialog(null,"Your Full Name: "+name);
	}
}
