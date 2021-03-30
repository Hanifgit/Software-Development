package JFrame;

import javax.swing.JFrame;

public class CreatingAndSsetting {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);//JFrame Visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame Close
		//frame.setSize(500, 400); /*JFrame Size*/
		//frame.setLocationRelativeTo(null);/*default JFrame position middle*/
		//frame.setLocation(200, 100);/*JFrame position middle set(independent)*/
		
		/*setLocation And setSize  combination*/
		frame.setBounds(200, 100, 500, 400);
		frame.setTitle("Frame Demo");/*JFrame Title Set*/
		//frame.setResizable(false); /*JFrame Re-Sizable(Maximize) off or on*/
	}
}
