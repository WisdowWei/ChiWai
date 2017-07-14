import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2017/6/29.
 */
public class testMain {
    public static void main(String[] args){
       /* try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("测试通过");
            java.sql.Connection conn;
            conn= DriverManager.getConnection("jdbc:mysql://localhost/seckill", "root", "root");
            System.out.println("conn-------------"+conn);
            Statement stmt=(Statement) conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from seckill");
            while(rs.next()){
                String sno=rs.getString("seckill_id");
                String sname=rs.getString("name");
                System.out.println("name------"+sno+"--------sname-"+sname);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
