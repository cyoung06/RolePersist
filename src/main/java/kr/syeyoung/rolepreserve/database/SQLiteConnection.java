package kr.syeyoung.rolepreserve.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    private static Connection connection;

    private static final String url = "jdbc:sqlite:B:/powermovie.db";

    public static Connection getConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) return connection;
        connection = DriverManager.getConnection(url);
        return connection;
    }
}
