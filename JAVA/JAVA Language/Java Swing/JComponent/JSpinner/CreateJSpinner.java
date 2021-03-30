package JSpinner;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class CreateJSpinner extends JFrame implements ChangeListener {
	private Container container;
	private JSpinner spinner;
	private JLabel label;

	public CreateJSpinner() {
		Componant();
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setLayout(null);
		
		//initial value,minimum value,maximum value,difference
		SpinnerNumberModel sModel = new SpinnerNumberModel(10,0,30,1);
		spinner = new JSpinner(sModel);
		spinner.setBounds(100, 100, 70, 50);
		container.add(spinner);
		
		label = new JLabel();
		label.setBounds(30, 100,100, 100);
		container.add(label);
		// Listener create
		spinner.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String getValue = spinner.getValue().toString();
		int value = Integer.parseInt(getValue);
		label.setText("The value: "+value);
	}
	
	public static void main(String[] args) {
		CreateJSpinner icon = new CreateJSpinner();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(200, 100, 300, 350);
		icon.setTitle("Text Field Demo");
	}
}
