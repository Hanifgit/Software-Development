package JTabbedPane;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class CreateJTabbedPane extends JFrame {
	private Container container;
	private JTabbedPane tabbedPane;
	private JPanel panel1,panel2,panel3;
	private JLabel label1,label2,label3;
	private ImageIcon homeIcon,helpIcon,editIcon;

	public CreateJTabbedPane() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		tabbedPane = new JTabbedPane();
		//tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		//tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
		tabbedPane.setBounds(50, 50, 500, 500);
		container.add(tabbedPane);
		
		homeIcon = new ImageIcon("JComponent/JTabbedPane/Home.png");
		helpIcon = new ImageIcon("JComponent/JTabbedPane/Help.png");
		editIcon = new ImageIcon("JComponent/JTabbedPane/Edit.png");
		
		label1 = new JLabel("This is label Blue");
		label1.setForeground(Color.white);
		container.add(label1);
		label2 = new JLabel("This is label Green");
		label2.setForeground(Color.white);
		label3 = new JLabel("This is label Orange");
		label3.setForeground(Color.white);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		panel1.add(label1);
		panel2 = new JPanel();
		panel2.setBackground(Color.green);
		panel2.add(label2);
		panel3 = new JPanel();
		panel3.setBackground(Color.orange);
		panel3.add(label3);
		
		tabbedPane.addTab("Home",homeIcon, panel1,"This is Home Panel");
		tabbedPane.addTab("Help",helpIcon, panel2,"This is Help Panel");
		tabbedPane.addTab("Edit",editIcon, panel3,"This is Edit Panel");
	}

	public static void main(String[] args) {
		CreateJTabbedPane icon = new CreateJTabbedPane();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 600, 600);
		icon.setTitle("Text Field Demo");
	}
}
