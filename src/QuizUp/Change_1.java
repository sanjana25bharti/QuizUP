package QuizUp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Change_1 {

	static Container c;
	static JLabel l1;
	static JRadioButton b1;
	static JRadioButton b2;
	static JRadioButton b3;
	static JRadioButton b4;
	static JButton btn1,btn2;
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("QUIZUP");
		f.setVisible(true);
		f.setBounds(100,100,1000,1000);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		c= f.getContentPane();
		c.setLayout(null);
		 l1 = new JLabel("Q1.	Who is father of ORACLE");
		 l1.setBounds(100,50,500,300);
		 Font fo = new Font("Arial",Font.BOLD,30);
		 l1.setFont(fo);
		 b1 = new JRadioButton("a. Larry Ellison");
		 b1.setBounds(100,350,200,100);
		 b2 = new JRadioButton("b. Ed Oats");
		 b2.setBounds(100,450,200,100);
		 b3 = new JRadioButton("c. Bob Miner");
		 b3.setBounds(100,550,200,100);
		 b4 = new JRadioButton("d. Rikky Bansal");
		 b4.setBounds(100,650,200,100);
		 c.setBackground(Color.orange);
		 ButtonGroup group = new ButtonGroup();
		 btn1 = new JButton("Next");
		 btn2 = new JButton("Finish");
		 group.add(b1);
		 group.add(b2);
		 group.add(b3);
		 group.add(b4);
		 c.add(l1);
		 c.add(b1);
		 c.add(b2);
		 c.add(b3);
		 c.add(b4);
	}
}
