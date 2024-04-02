import java.sql.*;
import java.util.*;
public class update {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver loaded");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/COLLEGE", "naveen","naveen");
        System.out.println("conncetion established");
        Scanner sc = new Scanner(System.in);
        String rno = sc.next();
        String new_pno = sc.next();
        

        PreparedStatement ps = con.prepareStatement("UPDATE students SET phone_number = ? WHERE rollnumber=?");
        ps.setString(1, new_pno);
        ps.setString(2, rno);
        int n = ps.executeUpdate();
        if (n >= 0) {
            System.out.println("Successfully modified");
          }
    }
}
