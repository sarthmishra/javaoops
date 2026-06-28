import java.sql.*;
import java.util.*;
class Database{
public static void main(String[] args)throws Exception
{
Class.forName("org.sqlite.JDBC");
Connection con  = DriverManager.getConnection("jdbc:sqlite:univ.db");
PreparedStatement stm = con.prepareStatement("Insert into Student values (?,?,?,?)");
Scanner sc = new Scanner(System.in);
System.out.print("Enter Student data: ");
int r = sc.nextInt();
String name  = sc.next();
String city = sc.next();
int deptno = sc.nextInt();

stm.setInt(1,r);
stm.setString(2,name);
stm.setString(3,city);
stm.setInt(4,deptno);
stm.executeUpdate();

stm.close();
con.close();
}
}
