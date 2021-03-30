package JCheckBox;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class createJCheckBox extends JFrame {
	private Container container;
	private JCheckBox checkBox1,checkBox2,checkBox3;
	private ButtonGroup buttonGroup;

	public createJCheckBox() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		// create CheckBox
		checkBox1 = new JCheckBox("Male");
		checkBox1.setBounds(50, 100, 80, 30);
		container.add(checkBox1);

		checkBox2 = new JCheckBox("Female");
		checkBox2.setBounds(50, 150, 80, 30);
		container.add(checkBox2);

		checkBox3 = new JCheckBox("Other",true);
		checkBox3.setBounds(50, 200, 80, 30);
		container.add(checkBox3);

		// create ButtonGroup
		buttonGroup = new ButtonGroup();
		buttonGroup.add(checkBox1);
		buttonGroup.add(checkBox2);
		buttonGroup.add(checkBox3);
		
		// select a RadioButton internally
		 //checkBox1.setSelected(true);
	}

	public static void main(String[] args) {
		createJCheckBox icon = new createJCheckBox();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 20, 360, 400);
		icon.setTitle("CheckBox Demo");
	}
}
