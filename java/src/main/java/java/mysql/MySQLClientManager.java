package java.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLClientManager {

    static {
        //调用Class.forName()方法加载驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection connection;

    public static Connection getConnection(DBConfig dbConfig) throws SQLException {
        if (connection == null) {
            synchronized (MySQLClientManager.class) {
                connection = DriverManager.getConnection(dbConfig.getUrl(), dbConfig.getUser(), dbConfig.getPwd());
            }
        }
        return connection;
    }

}