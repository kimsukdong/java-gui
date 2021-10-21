package week07;
import java.awt.*;
import javax.swing.*;

public class CalculatorFrame2 extends JFrame {
	public CalculatorFrame2() {
		super("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new SP2(), BorderLayout.SOUTH);
		add(new Cp2(), BorderLayout.CENTER);
		add(new Np2(), BorderLayout.NORTH);
		add(new Ep2(), BorderLayout.EAST);

		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CalculatorFrame2();
	}

}

class SP2 extends JPanel {
	public SP2() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout()); 
		add(new JLabel("계산 결과"));
		add(new JTextField(15));
	}
}
class Cp2 extends JPanel {
	JButton b [] = { new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/") };
	public Cp2() {
		setBackground(Color.orange);
		
		setLayout(new GridLayout(4,4,5,5)); // GridLayout 배치관리자
		for(int i=0; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			add(b);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));

	}
}

class Ep2 extends JPanel {
	
	JButton b [] = { new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/") };
	public Ep2() {
		setLayout(new GridLayout(4,1));
		for(int i=0; i<b.length; i++) {
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}
	}
}
class Np2 extends JPanel {
	public Np2() {
		setBackground(Color.GRAY);
		setLayout(new FlowLayout()); 
		add(new JLabel("수식입력"));
		add(new JTextField(16));
	}
}
