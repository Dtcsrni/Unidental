package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexionBD {
    //Se declaran variables de conexión y declaración
    private Connection conexion;
    private Statement st;
    //Se define la forma de conexión a la base de datos
    private final String server = "jdbc:postgresql://localhost:5432/PostgreSQL 12";
    private final String usr = "postgres";
    private final String psw = "123456";


    public conexionBD(){
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(server,usr,psw);      //Se intenta conectar al servidor usando las credenciales
            st = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); //Se crea el manejador de declaraciones sensible a scroll y en concurrencia
        } catch (Exception ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet CONSULTAR(String sql) throws SQLException{//función para hacer consultas
        return st.executeQuery(sql);
    }

    public int ACTUALIZAR(String sql) throws SQLException{//función para hacer actualizaciones
        return st.executeUpdate(sql);
    }
    public void DESCONECTAR(){//función de desconexión
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}