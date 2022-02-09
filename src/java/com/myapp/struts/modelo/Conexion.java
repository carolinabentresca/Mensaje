package com.myapp.struts.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static String url = "jdbc:derby://localhost:1527/Mensaje";
    public static String user = "root";
    public static String password = "root";

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = (Connection) DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();
        }
        return con;
    }
}
