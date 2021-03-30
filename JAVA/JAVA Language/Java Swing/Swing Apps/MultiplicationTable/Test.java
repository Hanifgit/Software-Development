package MultiplicationTable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Test extends JFrame {
	private Container container;
	private ImageIcon imgIcon;
	private JLabel Label, numberLabel;
	private Font font;
	private JTextField numberField;
	private JButton clearButton;
	private JTextArea textArea;
	private Cursor clearCursor;
	private JScrollPane scrollPane;

	public Test() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);

		// image create
		imgIcon = new ImageIcon(getClass().getResource("multiplication-math-facts.jpg"));
		Label = new JLabel(imgIcon);
		Label.setBounds(0, 0, 344, imgIcon.getIconHeight());
		container.add(Label);

		// icon create
		imgIcon = new ImageIcon(getClass().getResource("icons8_math_40px.png"));
		this.setIconImage(imgIcon.getImage());

		// Font create
		font = new Font("Arial", Font.BOLD, 14);

		// Label create
		numberLabel = new JLabel("Enter any Number :");
		numberLabel.setBounds(10, 225, 200, 200);
		numberLabel.setForeground(Color.BLUE);
		numberLabel.setFont(font);
		container.add(numberLabel);

		// TextField create
		numberField = new JTextField();
		numberField.setBounds(155, 305, 150, 40);
		numberField.setForeground(Color.WHITE);
		numberField.setBackground(Color.MAGENTA);
		numberField.setHorizontalAlignment(JTextField.CENTER);
		numberField.setFont(font);
		container.add(numberField);

		// Button create
		clearButton = new JButton("Clear");
		clearButton.setBounds(155, 355, 150, 40);
		clearButton.setFont(font);
		clearButton.setForeground(Color.RED);
		clearButton.setBackground(Color.GREEN);
		container.add(clearButton);

		// create cursor in button
		clearCursor = new Cursor(Cursor.HAND_CURSOR);
		clearButton.setCursor(clearCursor);

		// TextArea create
		textArea = new JTextArea();
		/*textArea.setBounds(12, 405, 320, 250);*/
		textArea.setBackground(Color.MAGENTA);
		textArea.setForeground(Color.WHITE);
		textArea.setFont(font);
		container.add(textArea);

		// scrollPane = new JScrollPane(textArea);
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(12, 405, 320, 250);
		container.add(scrollPane);
		
		//ActionListener Create
		Handler handle = new Handler();
		numberField.addActionListener(handle);
		clearButton.addActionListener(handle);
	}

	class Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == clearButton) {
				textArea.setText("");
				numberField.setText("");
			} else {
				boolean check = false;
				String getNum = numberField.getText();
				for (char c : getNum.toCharArray()) {
		            if (!Character.isDigit(c)) {
		            	check = true;
		            }
		        }
				if (getNum.isEmpty()) {
					//JOptionPane.showMessageDialog(null, "You did not put any number!");
					textArea.setText("\n\n\n\n\n\n               You did not put any number!");
				}
				else if (check) {
					textArea.setText("\n\n\n\n\n\n               You did not put valid number!");
					
				}else if (getNum.length()>19) {
					textArea.setText("\n\n\n\n\n\n               Overflow of your result!\n"
							+ " Please enter your number maximum 19 digit");
					
				}else {
					textArea.setText("");
					long num = Long.parseLong(numberField.getText());
					//long num = Integer.parseInt(numberField.getText());
					long multi;
					String r, n, c;
					for (long i = 1L; i <= 10L; i++) {
						multi = num * i;
						r = String.valueOf(multi);
						n = String.valueOf(num);
						c = String.valueOf(i);
						textArea.append(n + " x " + c + " = " + r + "\n\n");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Test icon = new Test();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(300, 20, 360, 710);
		icon.setTitle("Multiplication Table");
	}
}
