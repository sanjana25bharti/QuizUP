import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Change_1 {
	
	

	static Connection con =null;
	static PreparedStatement pst = null;
	static ResultSet rs = null;

	static Container c;
	static JLabel l1;
	static JRadioButton b1;
	static JRadioButton b2;
	static JRadioButton b3;
	static JRadioButton b4;
	static JButton btn1,btn2;
	static int marks;
	static JTextArea text;
	
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
		 b1.setBounds(150,400,200,100);    //made width from 100 to 150 and length from 350 to 400 pixels     
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
		 btn1.setBounds(200,800,100,30);
		 btn2.setBounds(400,800,100,30);
		 
		 text = new JTextArea();
		 text.setBounds(600,800,100,100);
		 group.add(b1);
		 group.add(b2);
		 group.add(b3);
		 group.add(b4);
		 c.add(l1);
		 c.add(b1);
		 c.add(b2);
		 c.add(b3);
		 c.add(b4);
		 c.add(btn1);
		 c.add(btn2);
		 c.add(text);
		 b1.addActionListener(new ActionListener()
				 {
			 public void actionPerformed(ActionEvent e)
			 {
				 if(b1.isSelected())
				 {
					marks = +4; 
				 }
			 }
				 }
				 );
		 
		 b2.addActionListener(new ActionListener()
		 {
	 public void actionPerformed(ActionEvent e)
	 {
		 if(b2.isSelected())
		 {
			marks = -1; 
		 }
	 }
		 }
		 );
		 
		 b3.addActionListener(new ActionListener()
		 {
	 public void actionPerformed(ActionEvent e)
	 {
		 if(b3.isSelected())
		 {
			marks = -1; 
		 }
	 }
		 }
		 );
		 
		 b4.addActionListener(new ActionListener()
		 {
	 public void actionPerformed(ActionEvent e)
	 {
		 if(b4.isSelected())
		 {
			marks = -1; 
		 }
	 }
		 }
		 );
		 
		 
		 btn2.addActionListener(new ActionListener()
		 {
	 public void actionPerformed(ActionEvent e)
	 {
		 text.setText("");
		 if(e.getSource()==btn2)
		 {
			 
		text.append(String.valueOf(marks));
		 }
		/*try
		{
		 String submitQuery = "INSERT INTO `submittedanswer` (`ID`, `sa`) VALUES (NULL, '')";
		 con = DriverManager.getConnection("jdbc:mysql://localhost/quiz","root","");
		 pst = con.prepareStatement(submitQuery);
		 pst.setString(1,value);
		 pst.executeUpdate();
		 JOptionPane.showMessageDialog(f, this,"Your answer is sbmitted successfully!!", 0);
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(f, this,ex.getMessage(), 0);
		}
	 }
		 }**/
	 }
		 }
		 );
		 
	}
}


