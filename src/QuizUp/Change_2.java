package QuizUp;
import java.sql.*;
import javax.swing.*;
public class Change_2 extends JFrame
{

	public static void main(String []args)throws Exception
	{

		String url ="jdbc:mysql://localhost/quiz";
		String username ="root";
		String pass= "";
		//String query="select * from students";
		String query = "INSERT INTO `javaquiz` (`Question No`, `Question`, `Option 1`, `Option 2`, `Option 3`, `Option 4`, `Answer`) VALUES (NULL, 'Tirana International Airport is named after which Indian Citizen ?', 'C V Raman', 'Mahatma Ghandhi', 'Mother Teresa', 'Rabindranath Tagore', 'Mother Teresa')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
		PreparedStatement st = con.prepareStatement(query);
		int count =st.executeUpdate();//DDL DML TCL
		System.out.println(count+"Rows affected so do the following changes");
		st.close();
		con.close();

		}


}
