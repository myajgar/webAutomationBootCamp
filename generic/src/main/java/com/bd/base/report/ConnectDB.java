package com.bd.base.report;

import org.testng.annotations.AfterSuite;

import java.sql.*;
import java.util.ArrayList;

public class ConnectDB {

    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = getConnection("root", "root1234", "peoplentch");
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Connection getConnection(String username, String password, String databaseName) throws SQLException {
        String url = Utilities.getPropertyFromConfig("dbUrl") + databaseName + "?serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static ArrayList getDatafromdatabase(String quer, String colo) throws SQLException {
        ArrayList<String> data = new ArrayList<>();
        ResultSet res = statement.executeQuery(quer);
        while (res.next()) {
            data.add(res.getString(colo));

        }
        return data;
    }


    @AfterSuite
    public static void cleanUpDatabase(Statement statement, Connection connection) {
        try {
            statement.close();
            connection.close();
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
}

