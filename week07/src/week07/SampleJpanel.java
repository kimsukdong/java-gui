package week07;
import java.awt.*;

import javax.swing.*;

class Panel1 extends JPanel {

	public Panel1() {
		setLayout(new GridLayout(3,1));
		add(new JButton("Open")); 
		add(new JButton("Read")); 
		add(new JButton("Close")); 	 
	}
}

class Panel2 extends JPanel {

	public Panel2() {
				
		JLabel a = new JLabel("Java", JLabel.CENTER); 
		setLayout(new BorderLayout());
		add(a, BorderLayout.CENTER); 
	}		
}

public class SampleJpanel extends JFrame {

	public SampleJpanel() {
		super("실습 예제"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
		add(new Panel1()); 
		add(new Panel2()); 
		setSize(300,200);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SampleJpanel();
	}
}
