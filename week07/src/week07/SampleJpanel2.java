package week07;
import java.awt.*;

import javax.swing.*;

class JPanel1 extends JPanel {

	public JPanel1() {
		setLayout(new GridLayout(3,1,3,3));
		JButton b1 = new JButton("Open");
		JButton b2 = new JButton("Read");
		JButton b3 = new JButton("Close");
		
		add(b1); 
		add(b2); 
		add(b3);  
		b1.setBackground(Color.pink);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
	}
}

class JPanel2 extends JPanel {

	public JPanel2() {	
		Font  f = new Font("Arial",Font.BOLD,50);
		JLabel a = new JLabel("Java", JLabel.CENTER); 	
		a.setFont(f);
		setLayout(new BorderLayout());
		add(a, BorderLayout.CENTER); 
		setBackground(Color.cyan);
	}		
}

public class SampleJpanel2 extends JFrame {
	public SampleJpanel2() {
		super("¿¹Á¦"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2,5,5));
		add(new JPanel1()); 
		add(new JPanel2()); 
		setSize(400,300);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SampleJpanel2();
	}
}
