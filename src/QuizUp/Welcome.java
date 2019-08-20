package QuizUp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Welcome implements ActionListener 
{

	Welcome() 
	{
	JFrame f = new JFrame();
	f.setTitle("QUIZ UP");
	f.setVisible(true);
	f.setBounds(100,100,1000,1000);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	Container c=f.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.pink);
	JLabel l =new JLabel("QUIZ UP");
	Font fo = new Font("Arial",Font.BOLD,80);
	
	l.setBounds(300,200,500,200);
	l.setFont(fo);
	JButton b1= new JButton("Login");
	JButton b2= new JButton("Sign Up");
	b1.setBounds(390,500,200,50);
	b2.setBounds(390,600,200,50);
	c.add(l);
	c.add(b1);
	c.add(b2);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[])
	{
		Welcome w =new Welcome();
	}
	
}
