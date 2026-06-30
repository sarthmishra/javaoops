import java.sql.*;
import java.util.*;
class Database{
public static void main(String[] args)throws Exception
{
Class.forName("org.sqlite.JDBC");
Connection con  = DriverManager.getConnection("jdbc:sqlite:univ.db");
Statement stm = con.createStatement();
ResultSet rs = stm.executeQuery("Select * from student");
while(rs.next()){
int roll = rs.getInt("roll");
String name = rs.getString("name");
String city = rs.getString("city");
int deptno = rs.getInt("deptno");
System.out.println(roll + " " + name + " " + city + " " + deptno);
}

stm.close();
con.close();
}
}
