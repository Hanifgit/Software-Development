package JComboBox;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class CreateJComboBox extends JFrame {
	private Container container;
	private JComboBox<String> comboBox;
	private String[] Language = { "C", "C++", "Java", "Python", "kotlin", "PHP" };
	private JLabel label;
	private JButton btn;

	public CreateJComboBox() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);

		// create ComboBox
		comboBox = new JComboBox<String>(Language);
		comboBox.setBounds(50, 150, 100, 50);
		comboBox.setEditable(true);
		container.add(comboBox);
		
		// ComboBox some method
		System.out.println(comboBox.getItemCount()); // ComboBox total item count
		comboBox.setSelectedIndex(3); // initial Selected Index
		comboBox.setSelectedItem("Java"); // initial Selected object
		comboBox.addItem("HTML"); // Add items
		/* comboBox.removeItemAt(3); */
		/* comboBox.removeItem("HTML");*/
		/* comboBox.removeAllItems();*/

		// create Label
		label = new JLabel();
		label.setBounds(50, 130, 300, 235);
		container.add(label);

		// create button
		btn = new JButton("Submit");
		btn.setBounds(170, 150, 100, 50);
		container.add(btn);

		Handler handle = new Handler();
		/*comboBox.addActionListener(handle);*/
		btn.addActionListener(handle);
	}

	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String string = comboBox.getSelectedItem().toString();
			label.setText(string+" are selected");
		}
	}

	public static void main(String[] args) {
		CreateJComboBox icon = new CreateJComboBox();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Password Field Demo");
	}
}
