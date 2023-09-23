/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connect_sql;

/**
 *
 * @author ADMIN
 */
import java.sql.*;

public class Connect_sql {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
        try{
            String username ="sa";
            String password="123456789";
            String url="jdbc:sqlserver://localhost:1433;databaseName=QLSV;encrypt=false;";
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      con=java.sql.DriverManager.getConnection(url,username,password);
      System.out.println("Da ket noi");
      // tạo 1 đối tượng Statement
      java.sql.Statement st= con.createStatement();
      //Khai báo 1 chuỗi SQL
      String sqlString="";
      sqlString ="update Lop set Tenlop = 'toan hoc' where Malop = '123'";
      st.executeUpdate(sqlString);
        sqlString ="Delete From Lop Where Tenlop = 'toan hoc 2' and Malop = '124'";
      st.executeUpdate(sqlString);

      // Thêm lệnh insert
     // sqlString = "insert into Lop(Malop,Tenlop) values('124','toan hoc 2')";
     // st.executeUpdate(sqlString);
      sqlString="Select *From Lop";
      ResultSet rs= st.executeQuery(sqlString);
      while(rs.next()){
          System.out.println("Ma lop:"+rs.getString("Malop")+"   ");
             System.out.println("Ten lop:"+rs.getString("Tenlop")+"   ");
             //System.out.println(rs.getString("Malop") + " " + rs.getString("Tenlop"));
      }
      // Đóng các đối tượng Statement và Connection
    
      con.close();
        }
        catch(Exception e){
            System.out.print("khong ket noi");
        }
    }
    
}
