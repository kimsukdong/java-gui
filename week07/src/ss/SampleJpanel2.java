package ss;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class JPanel1 extends JPanel implements ActionListener  {

	public JPanel1() {
		setLayout(new GridLayout(3,1,3,3));
		JButton b1 = new JButton("Open");
		JButton b2 = new JButton("Read");
		JButton b3 = new JButton("Close");
		
		add(b1); 
		add(b2); 
		add(b3);  
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.pink);
		b3.setBackground(Color.pink);
		
	}
	public void actionPerformed(ActionEvent e) {
		String ss = e.getActionCommand();
		JOptionPane.showMessageDialog(null, ss+" 이(가) 선택됨");
	}
		
}

class JPanel2 extends JPanel {
	int k=50;
	JSlider sl;
	Font  f;
	JLabel a;
	public JPanel2() {	
		setLayout(new BorderLayout());
		f = new Font("Arial",Font.BOLD,k);
		a = new JLabel("Java", JLabel.CENTER); 	
		sl = new JSlider(JSlider.HORIZONTAL, 10, 100, 50);
		sl.setPaintLabels(true);
		sl.setPaintTicks(true);
		sl.setPaintTrack(true);
		sl.setMajorTickSpacing(10);
		sl.setMinorTickSpacing(5);
		sl.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				k=sl.getValue();
				f = new Font("Arial",Font.BOLD,k);
				a.setFont(f);
			}
		});
		
		a.setFont(f);
		a.setForeground(Color.red);
		setLayout(new BorderLayout());
		add(a, BorderLayout.CENTER); 
		add(sl, BorderLayout.SOUTH);
		setBackground(Color.cyan);
	}		

}


public class SampleJpanel2 extends JFrame {
	public SampleJpanel2() {
		super("예제"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2,5,5));
		add(new JPanel1()); 
		add(new JPanel2()); 
		setSize(600,400);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SampleJpanel2();
	}
}
