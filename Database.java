import java.sql.*;
import java.util.*;
class Database{
public static void main(String[] args)throws Exception
{
Class.forName("org.sqlite.JDBC");
Connection con  = DriverManager.getConnection("jdbc:sqlite:univ.db");
Statement stm = con.createStatement();
stm.executeUpdate("create table Temp(a int,b float)");

stm.close();
con.close();
}
}
