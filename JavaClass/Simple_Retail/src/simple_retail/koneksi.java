package simple_retail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private static Connection mysqlkoneksi;

    public static Connection koneksidb() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/simpleretail";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlkoneksi = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.err.println(" Koneksi Gagal " + e);
        }
        return mysqlkoneksi;
    }

}
