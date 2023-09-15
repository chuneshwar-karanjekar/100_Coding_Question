import  java.sql.*;
import  java.sql.SQLException;
public class JDBCTest {

    public static  void f1() throws SQLException{
        Connection con = null;
        String url = "jdbc:Mysql://localhost:3306/javabatch23";
        String user = "root";
        String pass = "Root";
        con = DriverManager.getConnection(url,user,pass);
        if(con != null){
            System.out.println("Connection establisted ");
        }
        String query = "select * from student";
        PreparedStatement ps =con.prepareStatement(query);
        ResultSet r = ps.executeQuery();
        while(r.next()){
            System.out.println(r.getInt(1)+" "+r.getString(2));
        }
    }

    public static void main(String[] args) {
        try{
            JDBCTest.f1();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
