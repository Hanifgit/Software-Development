package Calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Scientific {

	private JFrame frame;
	private JTextField txtDisplay;
	private JScrollPane scrollPane;
	private Container container;
	double firstNum,secondNum,Result;
	String Operations,Ans;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientific window = new Scientific();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientific() {
		initialize();
		txtDisplay.setText("0");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.getContentPane().setBackground(new Color(100, 149, 237));
		frame.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\JAVA Language\\Java Swing\\Swing Apps\\Calculator\\calculator.png"));
		frame.setBounds(100, 100, 305, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		container = frame.getContentPane();
		container.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		txtDisplay = new JTextField();
		txtDisplay.setForeground(new Color(255, 255, 255));
		txtDisplay.setBackground(new Color(102, 153, 255));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		//txtDisplay.setBounds(10, 11, 269, 58);
		//frame.getContentPane().add(txtDisplay);
		//txtDisplay.setColumns(10);
		
		scrollPane = new JScrollPane(txtDisplay);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 269, 58);
		frame.getContentPane().add(scrollPane);

		// ---------row1---------------------//
		JButton btnSquare = new JButton();
		btnSquare.setBackground(new Color(102, 204, 153));
		btnSquare.setForeground(new Color(255, 255, 255));
		btnSquare.setIcon(new ImageIcon("E:\\JAVA Language\\Java Swing\\Swing Apps\\Calculator\\square-numbe.png"));
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Sqr = Double.parseDouble(txtDisplay.getText());
				 Sqr = Sqr*Sqr;
				//String Ans = String.format("%.2f",Double.toString(Sqr));
				txtDisplay.setText(Double.toString(Sqr));
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSquare.setBounds(10, 80, 65, 60);
		frame.getContentPane().add(btnSquare);

		JButton btnRoot = new JButton();
		btnRoot.setIcon(new ImageIcon("E:\\JAVA Language\\Java Swing\\Swing Apps\\Calculator\\square_root.png"));
		btnRoot.setBackground(new Color(102, 204, 153));
		btnRoot.setForeground(new Color(0, 0, 0));
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Root = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(Double.toString(Math.sqrt(Root)));
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRoot.setBounds(78, 80, 65, 60);
		frame.getContentPane().add(btnRoot);

		JButton btnPow = new JButton();
		btnPow.setIcon(new ImageIcon("E:\\JAVA Language\\Java Swing\\Swing Apps\\Calculator\\_power_.png"));
		btnPow.setBackground(new Color(102, 204, 153));
		btnPow.setForeground(new Color(0, 0, 0));
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(txtDisplay.getText() + " ^ ");
				Operations = "^";
			}
		});
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPow.setBounds(146, 80, 65, 60);
		frame.getContentPane().add(btnPow);

		JButton btnPI = new JButton();
		btnPI.setIcon(new ImageIcon("E:\\JAVA Language\\Java Swing\\Swing Apps\\Calculator\\icons8-pi-16.png"));
		btnPI.setBackground(new Color(102, 204, 153));
		btnPI.setForeground(new Color(0, 0, 0));
		btnPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + Double.toString(Math.PI);
				txtDisplay.setText(EnterNumber);
			}
		});
		btnPI.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPI.setBounds(214, 80, 65, 60);
		frame.getContentPane().add(btnPI);

		// ---------row2---------------------//
		JButton btnRemove = new JButton();
		btnRemove.setBackground(new Color(0, 204, 255));
		btnRemove.setForeground(new Color(255, 255, 255));
		btnRemove.setIcon(new ImageIcon("E:\\JAVA Language\\Java Swing\\Swing Apps\\Calculator\\back-button.png"));
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String backSpace = "0";
				
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backSpace = strB.toString();
					txtDisplay.setText(backSpace);
				}
				if(txtDisplay.getText().isEmpty()) txtDisplay.setText("0");
			}
		});
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRemove.setBounds(10, 144, 65, 60);
		frame.getContentPane().add(btnRemove);
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(0, 204, 255));
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				txtDisplay.setText("0");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(78, 144, 65, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnMod = new JButton("%");
		btnMod.setBackground(new Color(51, 204, 255));
		btnMod.setForeground(new Color(0, 0, 0));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(txtDisplay.getText() + " % ");
				Operations = "%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMod.setBounds(146, 144, 65, 60);
		frame.getContentPane().add(btnMod);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(51, 204, 255));
		btnPlus.setForeground(new Color(0, 0, 0));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(txtDisplay.getText() + " + ");
				Operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPlus.setBounds(214, 144, 65, 60);
		frame.getContentPane().add(btnPlus);
		
		// ---------row3---------------------//
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(100, 149, 237));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(10, 208, 65, 60);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(100, 149, 237));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(78, 208, 65, 60);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(100, 149, 237));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(146, 208, 65, 60);
		frame.getContentPane().add(btn9);

		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(51, 204, 255));
		btnSub.setForeground(new Color(0, 0, 0));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(txtDisplay.getText() + " - ");
				Operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnSub.setBounds(214, 208, 65, 60);
		frame.getContentPane().add(btnSub);
		
		// ---------row4---------------------//
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(100, 149, 237));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(10, 272, 65, 60);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(100, 149, 237));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(78, 272, 65, 60);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(100, 149, 237));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(146, 272, 65, 60);
		frame.getContentPane().add(btn6);

		JButton btnMult = new JButton("x");
		btnMult.setBackground(new Color(51, 204, 255));
		btnMult.setForeground(new Color(0, 0, 0));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(txtDisplay.getText() + " x ");
				Operations = "x";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMult.setBounds(214, 272, 65, 60);
		frame.getContentPane().add(btnMult);
		
		// ---------row5---------------------//
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(100, 149, 237));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(10, 336, 65, 60);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(100, 149, 237));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(78, 336, 65, 60);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(100, 149, 237));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(146, 336, 65, 60);
		frame.getContentPane().add(btn3);

		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(new Color(51, 204, 255));
		btnDiv.setForeground(new Color(0, 0, 0));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(txtDisplay.getText() + " / ");
				Operations = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDiv.setBounds(214, 336, 65, 60);
		frame.getContentPane().add(btnDiv);
		
		// ---------row6---------------------//
		JButton btnZero = new JButton("0");
		btnZero.setBackground(new Color(100, 149, 237));
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
				String EnterNumber = txtDisplay.getText() + btnZero.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnZero.setBounds(10, 400, 65, 60);
		frame.getContentPane().add(btnZero);
		

		JButton btnPoint = new JButton(".");
		btnPoint.setBackground(new Color(100, 149, 237));
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				    //if(txtDisplay.getText().equals("0")) txtDisplay.setText("");
					String EnterNumber = txtDisplay.getText() + btnPoint.getText();
					txtDisplay.setText(EnterNumber);
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPoint.setBounds(78, 400, 65, 60);
		frame.getContentPane().add(btnPoint);
	
		JButton btnPM = new JButton();
		btnPM.setBackground(new Color(220, 20, 60));
		btnPM.setIcon(new ImageIcon("E:\\JAVA Language\\Java Swing\\Swing Apps\\Calculator\\plus-and-minus.png"));
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops*=(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPM.setBounds(146, 400, 65, 60);
		frame.getContentPane().add(btnPM);
		

		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(34, 139, 34));
		btnEqual.setForeground(new Color(0, 0, 0));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int pos=-1;
				 if(txtDisplay.getText().contains("%"))
				      pos = txtDisplay.getText().indexOf("%");
				 else if(txtDisplay.getText().contains("+"))
				      pos = txtDisplay.getText().indexOf("+");
				 else if(txtDisplay.getText().contains("/"))
				      pos = txtDisplay.getText().indexOf("/");
				 else if(txtDisplay.getText().contains("x"))
				      pos = txtDisplay.getText().indexOf("x");
				 else if(txtDisplay.getText().contains("-"))
				      pos = txtDisplay.getText().indexOf("-");
				 else if(txtDisplay.getText().contains("^"))
				      pos = txtDisplay.getText().indexOf("^");
				 
				String second = txtDisplay.getText().substring(pos+1, txtDisplay.getText().length());
				
				secondNum = Double.parseDouble(second);
				if(Operations == "+") {
					Result = firstNum + secondNum;
					Ans = String.format("%.2f", Result);
					txtDisplay.setText(Ans);
				}
				else if(Operations == "-") {
					Result = firstNum - secondNum;
					Ans = String.format("%.2f", Result);
					txtDisplay.setText(Ans);
				}
				else if(Operations == "x") {
					Result = firstNum * secondNum;
					Ans = String.format("%.2f", Result);
					txtDisplay.setText(Ans);
				}
				else if(Operations == "/") {
					Result = firstNum / secondNum;
					Ans = String.format("%.2f", Result);
					txtDisplay.setText(Ans);
				}
				else if(Operations == "%") {
					Result = firstNum % secondNum;
					Ans = String.format("%.2f", Result);
					txtDisplay.setText(Ans);
				}
				else if(Operations == "^") {
					Result = Math.pow(firstNum, secondNum);
					Ans = String.format("%.2f", Result);
					txtDisplay.setText(Ans);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEqual.setBounds(214, 400, 65, 60);
		frame.getContentPane().add(btnEqual);
	}
}
