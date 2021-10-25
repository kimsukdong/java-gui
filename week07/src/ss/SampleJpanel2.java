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
		JOptionPane.showMessageDialog(null, ss+" ¿Ã(∞°) º±≈√µ ");
	}
		
}

class JPanel2 extends JPanel {
	int k=50;
	JSlider slider;
	JSlider [] sl = new JSlider [3];

	Font  f;
	JLabel a;
	public JPanel2() {	
		setLayout(new BorderLayout());
		f = new Font("Arial",Font.BOLD,k);
		a = new JLabel("Java", JLabel.CENTER); 	
		slider = new JSlider(JSlider.HORIZONTAL, 10, 150, 50);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				k=slider.getValue();
				f = new Font("Arial",Font.BOLD,k);
				a.setFont(f);
			}
		});
		
		a.setFont(f);
		setLayout(new BorderLayout());
		add(a, BorderLayout.CENTER); 
		add(slider, BorderLayout.NORTH);
		add(new Cp(), BorderLayout.SOUTH);
		setBackground(Color.cyan);
	}		

	class Cp extends JPanel {
		public Cp() {
			setLayout(new GridLayout(3,1)); 
			for(int i=0; i<sl.length; i++) {
				sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 10);
				sl[i].setPaintLabels(true);
				sl[i].setPaintTicks(true);
				sl[i].setPaintTrack(true);
				sl[i].setMajorTickSpacing(50);
				sl[i].setMinorTickSpacing(10);
				sl[i].addChangeListener(new MyChangeListener());
				add(sl[i]);
			}
			sl[0].setForeground(Color.RED);
			sl[1].setForeground(Color.GREEN);
			sl[2].setForeground(Color.BLUE);
			a.setOpaque(true);
			a.setForeground(new Color(sl[0].getValue(),sl[1].getValue(), sl[2].getValue()));

		}
	}
	class MyChangeListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			a.setForeground(new Color(sl[0].getValue(),sl[1].getValue(), sl[2].getValue()));
		}
	}

}



public class SampleJpanel2 extends JFrame {
	public SampleJpanel2() {
		super("GUI Example"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2,5,5));
		add(new JPanel1()); 
		add(new JPanel2()); 
		setSize(800,600);
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		setVisible(true);
	}
		
	static public void main(String[] arg) {
		new SampleJpanel2();
	}
}
