package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection SQLConnect() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://localhost:51680;databaseName=controle", "sa", "");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}