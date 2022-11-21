package config;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DB {
    public static Connection execute() throws SQLException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        //dataSource.setPassword("");

        return dataSource.getConnection();
    }
}
