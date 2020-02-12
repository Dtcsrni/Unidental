
package dao;

import modelo.Usuario;

public interface usuarioDAO {


    public Usuario login(String correo, String contrasena);
    public Usuario registrarUsuario();
    public Usuario buscarUsuario();
    public Usuario actualizarUsuario();
    public Usuario eliminarUsuario();


}