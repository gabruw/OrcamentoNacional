package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection SQLConnect() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://localhost/controle", "root", "");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}