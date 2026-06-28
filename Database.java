import java.sql.*;
import java.util.*;
class Database{
public static void main(String[] args)throws Exception
{
Class.forName("org.sqlite.JDBC");
Connection con  = DriverManager.getConnection("jdbc:sqlite:univ.db");
PreparedStatement stm = con.prepareStatement("SELECT * FROM student WHERE deptno = ?");
Scanner sc = new Scanner(System.in);
System.out.println("Enter Dept Number ");
int deptno  = sc.nextInt();

stm.setInt(1, deptno);
ResultSet rs = stm.executeQuery();
//int dno;
//String dname;
while(rs.next())
{
System.out.print(rs.getInt("roll")+ " ");
System.out.print(rs.getString("name")+ " ");
System.out.print(rs.getString("city")+ " ");
System.out.print(rs.getInt(4)+ " ");
}
stm.close();
}
}
