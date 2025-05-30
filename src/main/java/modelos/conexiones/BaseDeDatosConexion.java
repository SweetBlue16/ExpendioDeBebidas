package modelos.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDeDatosConexion {
    private static Connection connection;

    public static void inicializarConnecion() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String user = "root";
            String password = "MaNDel1605";
            String url = "jdbc:mysql://localhost:3306/expendio_bebidas";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connection established.");
        }
    }

    public static Connection obtenerConeccion() throws SQLException {
        if (connection == null || connection.isClosed()) {
            inicializarConnecion();
        }
        return connection;
    }

    public static void CerrarConneciones() throws SQLException {
        if (connection != null) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        }

    public static void tryConneccion() throws SQLException {
        BaseDeDatosConexion.inicializarConnecion();
    }
}
