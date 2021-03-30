package DigitalClock;

import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Clock_ extends Frame implements Runnable {
	Label labelTime,labelDate;
	Container container;
	Font font;
	boolean running = false;
	
	public Clock_() {
					
		JFrame icon = new JFrame();
		icon.setVisible(true);
		icon.setResizable(false);
		icon.setLocationRelativeTo(null);
		icon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		icon.setSize(211,100);
		//icon.setTitle("Digital Clock");
		icon.setVisible(true);
		
		font = new Font("Arial", Font.BOLD, 30);
		labelTime = new Label();
		labelTime.setFont(font);
		icon.add(labelTime);
	
	}
	
	@Override
	public void run() {
		while(running) {
			DateTimeUpdate();
			
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void Start() {
		running = true;
		new Thread(this).start();
	}
	
	public void DateTimeUpdate() {
		Calendar calendar = Calendar.getInstance();
		
		int hour = calendar.get(Calendar.HOUR);
//		int minute = calendar.get(Calendar.MINUTE);
//		int second = calendar.get(Calendar.SECOND);
		if(hour>12) hour-=12;
		
		//label.setBounds(200, 300, 300, 300);
		//label.setText(hour+":"+minute+":"+second);
		
		SimpleDateFormat simpleDate = new SimpleDateFormat("hh:mm:ss a");
		//SimpleDateFormat simpleTime = new SimpleDateFormat("dd:MM:yyyy");
		
		Date date = calendar.getTime();
		
		String timeStr = simpleDate.format(date);
		//String dateStr = simpleTime.format(date);
		
		labelTime.setText(timeStr);
		//labelDate.setText(dateStr);
		
	}

	public static void main(String[] args) {
		new Clock_().Start();
	}

}
