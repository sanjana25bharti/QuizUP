package QuizUp;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Change_4 {
	
	static Container c;
	static JLabel l1;
	static JLabel l2;
	static JRadioButton b1;
	static JRadioButton b2;
	static JRadioButton b3;
	static JRadioButton b4;
	static JButton btn1,btn2;
	static int marks;
	static ResultSet rs;
	static PreparedStatement st;
	static Connection con;
	static int Q_no;
	static String Question;
	static String op_1;
	static String op_2;
	static String op_3;
	static String op_4;
	static String ans;
	static String url;
	
	public static void main(String[] args)
	{
		
		
		 url ="jdbc:mysql://localhost/quiz";
		String username ="root";
		String pass= "";
		
	
		
			try
			{
			String query="select * from javaquiz";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
		Statement st = con.createStatement();
		//PreparedStatement st = con.prepareStatement(query);
		ResultSet rs =st.executeQuery(query);
		
		rs.next(); 
		String Q_no = rs.getString(2);
		String Question  = rs.getString(2);
		String op_1 = rs.getString(3);
		String op_2 = rs.getString(4);
		String op_3 = rs.getString(5);
		String op_4 = rs.getString(6);
		String ans = rs.getString(7);
		//System.out.println(ans+"\thi");
		rs.next();
		
		JFrame f = new JFrame();
		f.setTitle("QUIZUP");
		f.setVisible(true);
		f.setBounds(100,100,1000,1000);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		c= f.getContentPane();
		c.setLayout(null);
		 l1 = new JLabel(Question);
		 l1.setBounds(120,50,500,300);
		 l2 = new JLabel(String.valueOf(Q_no));
		 l2.setBounds(20,50,20,300);
		 Font fo = new Font("Arial",Font.BOLD,30);
		 l1.setFont(fo);
		 b1 = new JRadioButton(op_1);
		 b1.setBounds(100,350,200,100);
		 b2 = new JRadioButton(op_2);
		 b2.setBounds(100,450,200,100);
		 b3 = new JRadioButton(op_3);
		 b3.setBounds(100,550,200,100);
		 b4 = new JRadioButton(op_4);
		 b4.setBounds(100,650,200,100);
		 c.setBackground(Color.orange);
		 ButtonGroup group = new ButtonGroup();
		 btn1 = new JButton("Next");
		 btn2 = new JButton("Finish");
		 btn1.setBounds(200,800,100,30);
		 btn2.setBounds(400,800,100,30);
		 
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
		 
		 b1.addActionListener(new ActionListener()//object of the class is made which implements actionlistere 
					{
				public void actionPerformed(ActionEvent e)//the method actionperformed must be overriden
				{
					b1ButtonAction(e);
				}

				 void b1ButtonAction(ActionEvent e) {
					// TODO Auto-generated method stub
					 
					if(b1.isSelected())
					{
						if(b1.getText()==ans)
						{
							System.out.println("right\n");
							System.out.println("your score is +4");
						}
						else
						{
							System.out.println("wrong\n");
							System.out.println("your score is -1");
						}
					}
						
					
				}
					}
			);
		 b2.addActionListener(new ActionListener()//object of the class is made which implements actionlistere 
					{
				public void actionPerformed(ActionEvent e)//the method actionperformed must be overriden
				{
					b2ButtonAction(e);
				}

				 void b2ButtonAction(ActionEvent e) {
					// TODO Auto-generated method stub
					 
					 
					if(b2.isSelected())
					{
						if(b2.getText()==ans)
						{
							System.out.println("right\n");
							System.out.println("your score is +4");
						}
						else
						{
							System.out.println("wrong\n");
							System.out.println("your score is -1");
						}
					}
						}
					
				}
					
			);
		 
		 b3.addActionListener(new ActionListener()//object of the class is made which implements actionlistere 
					{
				public void actionPerformed(ActionEvent e)//the method actionperformed must be overriden
				{
					b3ButtonAction(e);
				}

				 void b3ButtonAction(ActionEvent e) {
					// TODO Auto-generated method stub
					 
					 
					if(b3.isSelected())
					{
						if(b3.getText()==ans)
						{
							System.out.println("right\n");
							System.out.println("your score is +4");
						}
						else
						{
							System.out.println("wrong\n");
							System.out.println("your score is -1");
						}
					}
						
					
				}
					}
			);
		 
		 b4.addActionListener(new ActionListener()//object of the class is made which implements actionlistere 
					{
				public void actionPerformed(ActionEvent e)//the method actionperformed must be overriden
				{
					b4ButtonAction(e);
				}

				 void b4ButtonAction(ActionEvent e) {
					// TODO Auto-generated method stub
					 
					 
					if(b4.isSelected())
					{
						if(b4.getText()==ans)
						{
							System.out.println("right\n");
							System.out.println("your score is +4");
						}
						else
						{
							System.out.println("wrong\n");
							System.out.println("your score is -1");
						}
					}
						
					
				}
					}
			);
		 
		 btn2.addActionListener(new ActionListener()//object of the class is made which implements actionlistere 
					{
				public void actionPerformed(ActionEvent e)//the method actionperformed must be overriden
				{
					btn2ButtonAction(e);
				}

				 void btn2ButtonAction(ActionEvent e) {
					 
				 
				
					// TODO Auto-generated method stub
					
					//if(e.getSource()==btn2)
					//{
				if(b1.isSelected())
				{
					if(b1.getText()==ans)
					{
						System.out.println("right\n");
						System.out.println("your score is +4");
					}
					else
					{
						System.out.println("wrong\n");
						System.out.println("your score is -1");
					}
				}
				if(b2.isSelected())
				{
					if(b2.getText()==ans)
					{
						System.out.println("right\n");
						System.out.println("your score is +4");
					}
					else
					{
						System.out.println("wrong\n");
						System.out.println("your score is -1");
					}
				}
				
				if(b3.isSelected())
				{
					if(b3.getText()==ans)
					{
						System.out.println("right\n");
						System.out.println("your score is +4");
					}
					else
					{
						System.out.println("wrong\n");
						System.out.println("your score is -1");
					}
				}
				
				if(b4.isSelected())
				{
					if(b4.getText()==ans)
					{
						System.out.println("right\n");
						System.out.println("your score is +4");
					}
					else
					{
						System.out.println("wrong\n");
						System.out.println("your score is -1");
					}
				}
				 //}
				  }
					}
					
			);
				
					
		 btn1.addActionListener(new ActionListener()//object of the class is made which implements actionlistere 
					{
				public void actionPerformed(ActionEvent e)//the method actionperformed must be overriden
				{
					btn2ButtonAction(e);
				}

				 void btn2ButtonAction(ActionEvent e) {
				
					
				}
					}
			);
		 
		 
		
		 
		
					
			

}
			
			catch(Exception ex)
			{
				System.out.println("EXCEPTION");
				
			}
			}
}

