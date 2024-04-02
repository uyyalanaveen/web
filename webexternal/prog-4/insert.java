import java.sql.*;
import java.util.Scanner;


class insert{
    public static void main(String a[]) throws ClassNotFoundException,SQLException{
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver loaded");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/COLLEGE","naveen","naveen");
        System.out.println("connection established");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String rno = sc.next();
        String pno = sc.next();
        PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES(?,?,?);");
        ps.setString(1, name);
        ps.setString(2, rno);
        ps.setString(3, pno);
        int n = ps.executeUpdate();
        if(n>0)
        {
            System.out.println("1 row updated");
        }


    }
}