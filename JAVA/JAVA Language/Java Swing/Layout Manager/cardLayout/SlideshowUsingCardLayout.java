package cardLayout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SlideshowUsingCardLayout extends JFrame implements ActionListener {
	private Container container;
	private JButton nextButton, prevButton;
	private JPanel panel;
	private ImageIcon icon;
	private JLabel label;
	private CardLayout cardLayout;

	public SlideshowUsingCardLayout() {
		Componant();
		ShowImage();
	}

	public void ShowImage() {
		String[] img = { "A.jpg", "ABC.jpg", "B.jpg", "C.jpg", "D.jpg", "E.jpg", "F.jpg" };
		for (String c : img) {
			icon = new ImageIcon("Layout Manager/cardLayout/SlideBox/"+c);
			//image resize
			Image image = icon.getImage();
			Image newImg = image.getScaledInstance(panel.getWidth(), panel.getHeight(),Image.SCALE_SMOOTH);
			icon = new ImageIcon(newImg);
			
			label = new JLabel(icon);
			panel.add(label);
		}
	}

	public void Componant() {
		// container create
		container = this.getContentPane();
		container.setBackground(Color.orange);
		container.setLayout(null);
		
		cardLayout = new CardLayout();
		
		// create panel
		panel = new JPanel(cardLayout);
		panel.setBounds(10, 10, 560, 380);
		panel.setBackground(Color.orange);
		container.add(panel);

		// create button
		nextButton = new JButton("Previous");
		nextButton.setBounds(10, 400, 100, 50);
		container.add(nextButton);

		prevButton = new JButton("Next");
		prevButton.setBounds(470, 400, 100, 50);
		container.add(prevButton);
		
		nextButton.addActionListener(this);
		prevButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==nextButton)
		    cardLayout.next(panel);
		else cardLayout.previous(panel);
	}
	
	public static void main(String[] args) {
		SlideshowUsingCardLayout icon = new SlideshowUsingCardLayout();
		icon.setVisible(true);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setBounds(100, 100, 600, 500);
		icon.setTitle("SlideShow Demo");
	}
}
