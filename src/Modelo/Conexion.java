package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    // Establece y devuelve una conexión a la base de datos
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost:3306/pizzeria"; // URL de la base de datos
            con = DriverManager.getConnection(myBD, "root", ""); // Crea la conexión
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString()); // Imprime el error en caso de excepción
        }
        return null; // Devuelve null si ocurre un error
    }
}