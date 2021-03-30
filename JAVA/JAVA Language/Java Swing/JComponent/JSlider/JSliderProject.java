package JSlider;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.ColorUIResource;

@SuppressWarnings("serial")
public class JSliderProject extends JFrame implements ChangeListener {
	private Container container;
	private JSlider redSlider,greenSlider,blueSlider;
	private JLabel redLabel,greenLabel,blueLabel,previewLabel;
	private JTextField redTextField,greenTextField,blueTextField;
	private JPanel panel;
	private Font font;

	public JSliderProject() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		// Font create
		font = new Font("Arial",Font.BOLD,14);
		
		// Label create
		redLabel = new JLabel("Red");
		redLabel.setBounds(30, 40, 100, 50);
		container.add(redLabel);
		
		greenLabel = new JLabel("Green");
		greenLabel.setBounds(30, 100, 100, 80);
		container.add(greenLabel);
		
		blueLabel = new JLabel("Blue");
		blueLabel.setBounds(30, 160, 100, 125);
		container.add(blueLabel);
		
		previewLabel = new JLabel("Preview");
		previewLabel.setBounds(575, 210, 50,100);
		container.add(previewLabel);
		
		// Slider create
		redSlider = new JSlider(0,255,0);
		redSlider.setBounds(80, 40, 300, 80);
		container.add(redSlider);
		
		greenSlider = new JSlider(0,255,0);
		greenSlider.setBounds(80, 100, 300, 110);
		container.add(greenSlider);
		
		blueSlider = new JSlider(0,255,0);
		blueSlider.setBounds(80, 160, 300, 150);
		container.add(blueSlider);
		
		// Text Field create
		
		redTextField = new JTextField();
		redTextField.setBounds(390, 45, 80, 40);
		redTextField.setHorizontalAlignment(JTextField.CENTER);
		container.add(redTextField);
		
		greenTextField = new JTextField();
		greenTextField.setBounds(390, 120, 80, 40);
		greenTextField.setHorizontalAlignment(JTextField.CENTER);
		container.add(greenTextField);
		
		blueTextField = new JTextField();
		blueTextField.setBounds(390, 200, 80, 40);
		blueTextField.setHorizontalAlignment(JTextField.CENTER);
		container.add(blueTextField);
		
		// Panel create
		
		panel = new JPanel();
		panel.setBounds(500, 45, 200, 195);
		panel.setBackground(Color.orange);
		panel.setFont(font);
		container.add(panel);
		
		// Listener create
		redSlider.addChangeListener(this);
		greenSlider.addChangeListener(this);
		blueSlider.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int redValue = redSlider.getValue();
		int greenValue = greenSlider.getValue();
		int blueValue = blueSlider.getValue();
		
		redTextField.setText(""+redValue);
		greenTextField.setText(""+greenValue);
		blueTextField.setText(""+blueValue);

		Color color = new ColorUIResource(redValue, greenValue, blueValue);
		panel.setBackground(color);
	}
	
	public static void main(String[] args) {
		JSliderProject icon = new JSliderProject();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 800, 350);
		icon.setTitle("Text Field Demo");
	}
}
