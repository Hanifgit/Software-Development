package Catcutator;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Standard extends JFrame implements ActionListener {
	private Container container;
	private JTextArea textArea;
	private Font font;
	private JButton buttons[];
	
	public Standard() {
		//container create
		container = this.getContentPane();
		container.setBackground(Color.white);
		container.setLayout(null);
		
		font = new Font("Arial",Font.BOLD,16);
		textArea = new JTextArea("0");
		textArea.setBounds(0, 0, 320, 100);
		textArea.setFont(font);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		container.add(textArea);
		
		buttons = new JButton[24];
		for (int i = 0; i < 24; i++) {
			buttons[i] = new JButton();
			container.add(buttons[i]);
		}
		buttons[0].setBounds(0, 100, 85, 60);
		buttons[0].setText("%");
		//buttons[0].setBackground(Color.WHITE);
		buttons[0].setFont(font);
		buttons[1].setBounds(85, 100, 85, 60);
		buttons[1].setText("CE");
		buttons[1].setFont(font);
		//buttons[1].setBackground(Color.WHITE);
		buttons[2].setBounds(170, 100, 85, 60);
		buttons[2].setText("C");
		buttons[2].setFont(font);
		buttons[3].setBounds(255, 100, 85, 60);
		buttons[3].setText("X");
		buttons[3].setFont(font);
		buttons[4].setBounds(0, 160, 85, 60);
		buttons[4].setText("1/x");
		buttons[4].setFont(font);
		buttons[5].setBounds(85, 160, 85, 60);
		buttons[5].setText("x^2");
		buttons[5].setFont(font);
		buttons[6].setBounds(170, 160, 85, 60);
		buttons[6].setText("Rt(x)");
		buttons[6].setFont(font);
		buttons[7].setBounds(255, 160, 85, 60);
		buttons[7].setText("%");
		buttons[7].setFont(font);
		buttons[8].setBounds(0, 220, 85, 60);
		buttons[8].setText("7");
		buttons[8].setFont(font);
		buttons[9].setBounds(85, 220, 85, 60);
		buttons[9].setText("8");
		buttons[9].setFont(font);
		buttons[10].setBounds(170, 220, 85, 60);
		buttons[10].setText("9");
		buttons[10].setFont(font);
		buttons[11].setBounds(255, 220, 85, 60);
		buttons[11].setText("*");
		buttons[11].setFont(font);
		buttons[12].setBounds(0, 280, 85, 60);
		buttons[12].setText("4");
		buttons[12].setFont(font);
		buttons[13].setBounds(85, 280, 85, 60);
		buttons[13].setText("5");
		buttons[13].setFont(font);
		buttons[14].setBounds(170, 280, 85, 60);
		buttons[14].setText("6");
		buttons[14].setFont(font);
		buttons[15].setBounds(255, 280, 85, 60);
		buttons[15].setText("-");
		buttons[15].setFont(font);
		buttons[16].setBounds(0, 340, 85, 60);
		buttons[16].setText("1");
		buttons[16].setFont(font);
		buttons[17].setBounds(85, 340, 85, 60);
		buttons[17].setText("2");
		buttons[17].setFont(font);
		buttons[18].setBounds(170, 340, 85, 60);
		buttons[18].setText("3");
		buttons[18].setFont(font);
		buttons[19].setBounds(255, 340, 85, 60);
		buttons[19].setText("+");
		buttons[19].setFont(font);
		buttons[20].setBounds(0, 400, 85, 60);
		buttons[20].setText("+/-");
		buttons[20].setFont(font);
		buttons[21].setBounds(85, 400, 85, 60);
		buttons[21].setText("0");
		buttons[21].setFont(font);
		buttons[22].setBounds(170, 400, 85, 60);
		buttons[22].setText(".");
		buttons[22].setFont(font);
		buttons[23].setBounds(255, 400, 85, 60);
		buttons[23].setText("=");
		buttons[23].setFont(font);
		
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		buttons[2].addActionListener(this);
		buttons[3].addActionListener(this);
		buttons[4].addActionListener(this);
		buttons[5].addActionListener(this);
		buttons[6].addActionListener(this);
		buttons[7].addActionListener(this);
		buttons[8].addActionListener(this);
		buttons[9].addActionListener(this);
		buttons[10].addActionListener(this);
		buttons[11].addActionListener(this);
		buttons[12].addActionListener(this);
		buttons[13].addActionListener(this);
		buttons[14].addActionListener(this);
		buttons[15].addActionListener(this);
		buttons[16].addActionListener(this);
		buttons[17].addActionListener(this);
		buttons[18].addActionListener(this);
		buttons[19].addActionListener(this);
		buttons[20].addActionListener(this);
		buttons[21].addActionListener(this);
		buttons[22].addActionListener(this);
		buttons[23].addActionListener(this);
		textArea.setText("");
		
	}
	
	public static void main(String[] args) {
		Standard icon = new Standard();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    icon.setBounds(200, 100, 356, 499);
		icon.setTitle("Notepad");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String plu;
		if(e.getSource()==buttons[0]) {
			//String a =textArea.getText();
		}
		else if(e.getSource()==buttons[1]) {
			textArea.setText("");
		}
		else if(e.getSource()==buttons[2]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[3]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[4]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[5]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[6]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[7]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[8]) {
			textArea.append("7");
		}
		else if(e.getSource()==buttons[9]) {
			textArea.append("8");
		}
		else if(e.getSource()==buttons[10]) {
			textArea.append("9");
		}
		else if(e.getSource()==buttons[11]) {
			textArea.append(" * ");
		}
		else if(e.getSource()==buttons[12]) {
			textArea.append("4");
		}
		else if(e.getSource()==buttons[13]) {
			textArea.append("5");
		}
		else if(e.getSource()==buttons[14]) {
			textArea.append("6");
		}
		else if(e.getSource()==buttons[15]) {
			textArea.append(" - ");
		}
		else if(e.getSource()==buttons[16]) {
			textArea.append("1");
		}
		else if(e.getSource()==buttons[17]) {
			textArea.append("2");
		}
		else if(e.getSource()==buttons[18]) {
			textArea.append("3");
		}
		else if(e.getSource()==buttons[19]) {
			textArea.append(" + ");
		}
		else if(e.getSource()==buttons[20]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[21]) {
			textArea.append("0");
		}
		else if(e.getSource()==buttons[22]) {
			textArea.append("");
		}
		else if(e.getSource()==buttons[23]) {
			plu = textArea.getText();
			int pos = 0,sum = 0;
			String plu1,plu2;
			boolean con1 = plu.contains("+");
			if(con1==true) {
				for (int i=0;i<plu.length();i++) {
					pos = plu.indexOf("+");
				}
				plu1 = plu.substring(0, pos);
				plu2 = plu.substring(pos+1, plu.length());
			    sum = Integer.valueOf(plu1) + Integer.valueOf(plu2);
			}
			boolean con2 = plu.contains("-");
			if(con2) {
				for (int i=0;i<plu.length();i++) {
					pos = plu.indexOf("-");
				}
				plu1 = plu.substring(0, pos);
				plu2 = plu.substring(pos+1, plu.length());
			    sum = Integer.valueOf(plu1) - Integer.valueOf(plu2);
			}
			
		   textArea.setText(String.valueOf(sum));
		}
		
	}
}
