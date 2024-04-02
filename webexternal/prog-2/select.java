import java.net.ConnectException;
import java.sql.*;;

public class select {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("driver loaded");
        Connection con = DriverManager.getConnection("jdbc:mariadb://localhost/COLLEGE", "naveen", "naveen");
        System.out.println("established");

        PreparedStatement ps = con.prepareStatement("SELECT *FROM students");
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();

        int col_count = rsmd.getColumnCount();

        while (rs.next()) {
            for (int i = 0; i < col_count; i++)
                System.out.print(rs.getString(i + 1) + "\t");
            System.out.println("");
        }

    }
}
