package week07;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	private static final long serialVersionUID = 1L;
	FlowLayoutEx() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		setLayout(new FlowLayout());
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
			
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);

		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
