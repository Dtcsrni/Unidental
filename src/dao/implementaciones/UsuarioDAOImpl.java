package dao.implementaciones;
import dao.usuarioDAO;
import javafx.scene.control.Alert;
import modelo.Usuario;
import modelo.conexionBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAOImpl implements usuarioDAO{

    @Override
    public Usuario login(String correo, String contrasena){

        conexionBD con = new conexionBD();

        try {
            ResultSet rs = con.CONSULTAR("SELECT * FROM admon WHERE correo='"+correo+"' AND contrasena='"+contrasena+"'");
            if(rs.next()){
                modelo.Usuario usr = modelo.Usuario.getInstanceUser(
                        rs.getLong("id_usuario"),
                        rs.getString("nombre"),
                        rs.getString("correo"),
                        rs.getString("contrasena") );

                return true;
            }

        } catch (SQLException ex) {
            Alert a=new Alert(Alert.AlertType.ERROR, "Mensaje");
            a.showAndWait();
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usr;



}
