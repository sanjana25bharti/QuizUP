package QuizUp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import java.sql.*;
public class Login implements ActionListener
{
	
	static JFrame f;
	static Container c;
	static JLabel l,l1,l2;
	static JPasswordField pass;
	static JTextField tf;
	static String url ="jdbc:mysql://localhost/quiz",username,password;
	static JButton b;
	static String query;
	static Connection con;
	static Statement st;
	static ResultSet rs;
	
	Login() throws SQLException
	{
		try
		{
		url ="jdbc:mysql://localhost/quiz";
		 username ="root";
		 password= "";
		f = new JFrame();
		f.setTitle("Login");
		f.setVisible(true);
		f.setBounds(100,100,1500,1000);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		 c=f.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.magenta);
		 l =new JLabel("LOGIN");
		Font fo = new Font("Arial",Font.BOLD,80);
		l.setBounds(300,200,500,200);
		l.setFont(fo);	
		Font f2 = new Font("Arial",Font.BOLD,30);
		 l1 =new JLabel("Email");
		l1.setBounds(300,450,450,100);
		 l2 =new JLabel("Password");
		l2.setBounds(300,600,450,100);
		l1.setFont(f2);
		l2.setFont(f2);
		
		
	  pass = new JPasswordField(20);
	  tf = new JTextField();
	 tf.setBounds(450,470,400,60);
	 pass.setBounds(450,620,400,60);
	 
	  b = new JButton("Submit");
	 b.setBounds(450,750,150,40);
	 
	
	 
		c.add(l);
		c.add(l1);
		c.add(l2);
		c.add(pass);
		c.add(tf);
		c.add(b);
		
		
		b.addActionListener(this);
		
		}
		catch(Exception ex)
		{
		System.out.println(ex);	
		}
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String email= tf.getText();
		String Password = pass.getText();
		if(e.getSource()==b)
		{
			
		    query="select * from new_user";
		    
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url,username,password);
			 st = con.createStatement();
			 ResultSet rs =st.executeQuery(query);
			 int count=0;
			 while(rs.next())
			 {
				 
				 String email_id = rs.getString(3);
				 String passwrd = rs.getString(4);
				 System.out.println(email_id);
				 System.out.println(passwrd);
				 if(tf.getText().equals(email_id) && pass.getText().equals(passwrd))
				 {
					 count=1;
					 System.out.println("a");
					 break;
					 
				 }
				 
			 }
			 
			 if(count==1)
			 {
				 Change_3 y = new Change_3();
			 }
				
			
			
			 else
			 {
				 JFrame s = new JFrame();
				 s.setTitle("Error");
				 s.setBounds(50,800,500,300);
				 s.setVisible(true);
				// s.setDefaultCloseOperation(s.EXIT_ON_CLOSE);
			     Container co=s.getContentPane();
				  co.setLayout(null);
				  JLabel lab = new JLabel("Invalid email id or password ");
				  lab.setBounds(100,50,300,50);
				  
				  JLabel lab1 = new JLabel("Are you a new user ? Then register ");
				  lab1.setBounds(100,120,400,50);
				  
				  JButton su = new JButton("Sign Up");
				  su.setBounds(100,185,100,40);
				  
				  su.addActionListener(new ActionListener()//object of the class is made which implements actionlistere 
							{
						public void actionPerformed(ActionEvent e)//the method actionperformed must be overriden
						{
							suButtonAction(e);
						}
							}
					);
				  
				 
				  
				  co.add(lab);
				  co.add(lab1);
				  co.add(su);
				  //Sign_Up ob = new Sign_Up();
			 
			 }
		}
			catch(Exception exp)
			{
				System.out.println(exp);
			}
		}
		
	}
	static void suButtonAction(ActionEvent e)
	{
		Sign_Up ob = new Sign_Up();
	}
	public static void main(String args[] )throws SQLException
	{
		Login obj = new Login();
		
	}

}
