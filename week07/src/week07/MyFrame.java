package week07;

import javax.swing.*;
public class MyFrame extends JFrame{
	public MyFrame(){
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame();
		System.out.println("sample");
	}
}
