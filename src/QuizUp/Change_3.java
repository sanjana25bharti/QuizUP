package QuizUp;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Change_3 implements ActionListener
{
	static Container c;
	static JLabel l1;
	static JLabel l2;
	static JRadioButton b1;
	static JRadioButton b2;
	static JRadioButton b3;
	static JRadioButton b4;
	static JButton next,finish;
	static int marks;
	static ResultSet rs;
	static Statement st;
	static Connection con;
	static int Q_no;
	static String Question;
	static String op_1;
	static String op_2;
	static String op_3;
	static String op_4;
	static String ans;
	static String url="jdbc:mysql://localhost/quiz";
	String user_name ="root";
	String passwrd= "";
	static int a[] = new int[2];
/*void fun()
{
	try
	{
	String query="select * from javaquiz";
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection(url,user_name,passwrd);
	 st = con.createStatement();
	//PreparedStatement st = con.prepareStatement(query);
	rs =st.executeQuery(query);
	
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}*/
	Change_3() //throws SQLException, ClassNotFoundException

	{
		try
			{
			if(a[0]==0)
			{
		String query="select * from javaquiz";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url,user_name,passwrd);
		st = con.createStatement();
		PreparedStatement st = con.prepareStatement(query);
		rs =st.executeQuery(query);
		int i =0;
			}
		rs.next(); 
		Q_no = rs.getInt(1);
		Question  = rs.getString(2);
		op_1 = rs.getString(3);
		op_2 = rs.getString(4);
		op_3 = rs.getString(5);
		op_4 = rs.getString(6);
		ans = rs.getString(7);
		//System.out.println(ans+"\thi");
		//rs.next();
		
		JFrame f = new JFrame();
		f.setTitle("QUIZUP");
		f.setVisible(true);
		f.setBounds(100,100,1000,1000);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		c= f.getContentPane();
		c.setLayout(null);
		c.setBounds(100,100,1000,1000);
		 l1 = new JLabel();
		 l1.setText(Question);
		 l1.setBounds(120,50,1000,300);
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
		 next = new JButton("Next");
		 finish = new JButton("Finish");
		 next.setBounds(200,800,100,30);
		 finish.setBounds(400,800,100,30);
		 
		 //b1.addActionListener(this);
		 //b2.addActionListener(this);
		 //b3.addActionListener(this);
		 //b4.addActionListener(this);
		 next.addActionListener(this);
		 finish.addActionListener(this);
		 
		 group.add(b1);
		 group.add(b2);
		 group.add(b3);
		 group.add(b4);
		 c.add(l1);
		 c.add(b1);
		 c.add(b2);
		 c.add(b3);
		 c.add(b4);
		 c.add(next);
		 c.add(finish);
		 
	
		 
		}
			
		
		
		catch(Exception ex)
		{
			System.out.println(ex);
			
		}
			
		
	
		
		
		
		
	
		 
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("hello");
		//System.out.println(ans);
		try
		{
		if(e.getSource()==finish)
		{
			if(b1.isSelected())
			{
				if(b1.getText().equals(ans))
				{
					a[0]++;
					a[1]=a[1]+4;
					System.out.println("right\n");
					System.out.println("your score is "+a[1]);
				}
		else
		{
			a[1]=a[1]-1;
			System.out.println("wrong\n");
			System.out.println("your score is "+a[1]);
		}
	}
	if(b2.isSelected())
	{
		if(b2.getText().equals(ans))
		{
			a[0]++;
			a[1]=a[1]+4;
			System.out.println("right\n");
			System.out.println("your score is "+a[1]);
		}
		else
		{
			a[1]=a[1]-1;
			System.out.println("wrong\n");
			System.out.println("your score is "+a[1]);
		}
		}
	}
	
	if(b3.isSelected())
	{
		System.out.println(b3.getText());
		if(b3.getText().equals(ans))
		{
			a[0]++;
			a[1]=a[1]+4;
			System.out.println("right\n");
			System.out.println("your score is "+a[1]);
		}
		else
		{
			a[1]=a[1]-1;
			System.out.println("wrong\n");
			System.out.println("your score is "+a[1]);
		
		}
	}
	
	if(b4.isSelected())
	{
		if(b4.getText().equals(ans))
		{
			a[0]++;
			a[1]=a[1]+4;
			System.out.println("right\n");
			System.out.println("your score is "+a[1]);
		}
		else
		{
			a[1]=a[1]-1;
			System.out.println("wrong\n");
			System.out.println("your score is "+a[1]);
		
		}
	}
		
	
	
		if(e.getSource()==next)
		{
			//rs.next();
			//System.out.println("next");
			Change_3 c1=new Change_3();
		
		}
	}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
			}

	
	
		
	
	public static void main(String []args)throws Exception
	{
		
		Change_3 ob = new Change_3();
		
	}
		
	}
	
	

