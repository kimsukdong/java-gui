package week07;
import javax.swing.*;
import java.awt.*;
public class MyAppEx extends JFrame {
	MyAppEx() {
		setTitle("Frame에 component붙이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane(); //
		contentPane.setBackground(Color.ORANGE); // 배경색
		setLayout(new FlowLayout());
		JButton b1 = new JButton("OK");
		JButton b2 = new JButton("Cancel");
		JButton b3 = new JButton("Ignore");
		add(b1);
		add(b2);
		add(b3);		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyAppEx();
	}
}
