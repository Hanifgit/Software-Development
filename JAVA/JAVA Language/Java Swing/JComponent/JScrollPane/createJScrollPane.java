package JScrollPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class createJScrollPane extends JFrame {
	private Container container;
	private JTextArea textArea;
	private Font font;
	private JScrollPane scrollPane;

	public createJScrollPane() {
		Componant();
	}
	
	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		// JtextArea Create
		font = new Font("Arial",Font.BOLD,14);
		textArea = new JTextArea();
		//textArea.setBounds(45, 50, 400, 250);
		textArea.setFont(font);
		textArea.setForeground(Color.blue);
		textArea.setBackground(Color.WHITE);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		//container.add(textArea);
		
		//scrollPane = new JScrollPane(textArea);
		scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(45, 50, 400, 250);
		container.add(scrollPane);
	}
	
	public static void main(String[] args) {
		createJScrollPane icon = new createJScrollPane();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Text Field Demo");
	}
}
