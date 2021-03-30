package JSlider;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JSlider;

@SuppressWarnings("serial")
public class CreateJSlider extends JFrame {
	private Container container;
	private JSlider slider;

	public CreateJSlider() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		//slider = new JSlider(JSlider.VERTICAL,-20,20,0);
		slider = new JSlider(-20,20,0);
		slider.setBounds(100, 10, 300, 200);
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		container.add(slider);
	}

	public static void main(String[] args) {
		CreateJSlider icon = new CreateJSlider();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 500, 400);
		icon.setTitle("Text Field Demo");
	}
}
