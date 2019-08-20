package QuizUp;
import javax.swing.*;

import com.mysql.cj.xdevapi.Statement;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Sign_Up implements ActionListener
{
	static JFrame f;
	static Container c;
	static JLabel l,l1,l2,l3,l4,l5;
	static JPasswordField tf3;
	static JTextField tf,tf1,tf2,tf4,tf5;
	static String url ="jdbc:mysql://localhost/quiz",u_name,Password,email,add,username,password,c_no;
	static JButton b;
	static PreparedStatement pst;
	static String query,query2;
	static Connection con;
	static Statement st;
	static ResultSet rs;
 Sign_Up()
 {
	
	 try
		{
		url ="jdbc:mysql://localhost/quiz";
		 username ="root";
		 password= "";
		f = new JFrame();
		f.setTitle("SignUp");
		f.setVisible(true);
		f.setBounds(100,100,1000,1000);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		 c=f.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.orange);
		
		l =new JLabel("SIGNUP");
		Font fo = new Font("Arial",Font.BOLD,80);
		l.setBounds(200,100,500,100);
		l.setFont(fo);
		
		Font f1 = new Font("Arial",Font.BOLD,40);
		
		l1 =new JLabel("Username");
		l1.setBounds(200,250,300,100);
		l1.setFont(f1);
		tf1= new JTextField();
		tf1.setBounds(420,270,300,50);
		
		l2 =new JLabel("Email");
		l2.setBounds(200,400,300,100);
		l2.setFont(f1);
		tf2= new JTextField();
		tf2.setBounds(420,420,300,50);
		
		
		l3 =new JLabel("Password");
		l3.setBounds(200,550,300,100);
		l3.setFont(f1);
		tf3 = new JPasswordField();
		tf3.setBounds(420,570,300,50);
		
		l4 =new JLabel("Contact");
		l4.setBounds(200,700,300,50);
		l4.setFont(f1);
		tf4= new JTextField();
		tf4.setBounds(420,720,300,50);
		
		l5 =new JLabel("Address");
		l5.setBounds(200,850,300,50);
		l5.setFont(f1);
		tf5= new JTextField();
		tf5.setBounds(420,870,300,50);
		
		b= new JButton("submit");
		b.setBounds(420,950,100,30);
		
		c.add(l);
		c.add(l1);
		c.add(tf1);
		c.add(l2);
		c.add(tf2);
		c.add(l3);
		c.add(tf3);
		c.add(l4);
		c.add(tf4);
		c.add(l5);
		c.add(tf5);
		c.add(b);
		b.addActionListener(this);
		
		}
	 catch(Exception ex)
	 {
		 System.out.println(ex);
	 }
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String email= tf2.getText();
		String Password = tf3.getText();
		String u_name = tf1.getText();
		String c_no = tf4.getText();
		String add = tf5.getText();
		if(e.getSource()==b)
		{
			
			
			try {
				query="INSERT INTO `new_user` (`user_name`, `email`, `password`, `contact`, `address`) VALUES ('"+u_name+"', '"+email+"', '"+Password+"', '"+c_no+"', '"+add+"')";
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			 query2 = "select * from 'new user'";
			 con = DriverManager.getConnection(url,username,password);
			 pst =con.prepareStatement(query);
			 //st = con.createStatement();
			 //rs =st.executeQuery(query);
			 int count = pst.executeUpdate();//DDL DML TCL
			 System.out.println(count+"Rows affected");
			 Login x = new Login();
			 
				
			}
			catch(Exception exp)
			{
				System.out.println(exp);
			}
		}
	}
	public static void main(String args[])
	{
		Sign_Up ob = new Sign_Up();
	}

}
