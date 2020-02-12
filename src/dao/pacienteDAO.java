
package dao;

import modelo.Paciente;

public interface pacienteDAO {


    
    public boolean registrarPaciente(String id_paciente, String nombre, String apellidoPat, String apellidoMat, String edad, String sexo,
                                     String fechaNacimiento, String lugarNacimiento, String domicilioCalle, String domicilioNumero, String domicilioColonia,
                                     String domicilioCiudad, String telefono, String nombreTutor, String maximoEstudio, String ocupacion, String estadoCivil,
                                     String derechoHabiencia, String motivoConsulta);
    /*{
        conexionBD con = new conexionBD();//se crea el objeto de la conexión
        int q;
        try {
            ResultSet rs = con.CONSULTAR("SELECT * FROM pacientes WHERE id_usr='"+id_paciente+"' AND Nombre='"+nombre+"'");
            if(rs.next()){
             return false;
            }else{
               q = con.ACTUALIZAR(
             "INSERT INTO pacientes (id_paciente,nombre,apellidoPat,apellidoMat,edad,sexo,fechaNacimiento,lugarNacimiento,domicilioCalle,domicilioNumero,domicilioColonia,domicilioCiudad,telefono,nombreTutor,maximoEstudio,ocupacion," +
                     "estadoCivil,derechoHabiencia,motivoConsulta) " +
                     "VALUES ('"+id_paciente+"','"+nombre+"','"+apellidoPat+"','"+apellidoMat+"','"+edad+"','"+sexo+"','"+fechaNacimiento+"','"+lugarNacimiento+"','"+domicilioCalle+"','"+domicilioNumero+"','"+domicilioColonia+"','"+domicilioCiudad
                     +"','"+telefono+"','"+nombreTutor+"','"+maximoEstudio+"','"+ocupacion+"','"+estadoCivil+"','"+derechoHabiencia+"','"+motivoConsulta+"')");
               if(q==0) 
                 return false;
            }
            
        } catch (SQLException ex) {
            Alert a=new Alert(Alert.AlertType.ERROR, "Mensaje");
            a.showAndWait();
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }*/
    
     public Paciente buscarPacienteID(String id_paciente);/*{
        conexionBD con = new conexionBD();
         modelo.alumno usr = null;
        int q;
        try {
            ResultSet rs = con.CONSULTAR("SELECT * FROM alumnos WHERE id_usr='"+Id_User+"'");
            if(rs.next()){
               usr = new modelo.alumno(
                        rs.getString("id_usr"),
                        rs.getString("nombre"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno"),
                        rs.getString("programa_estudios"),
                        rs.getString("correo") );
                
             return usr;
            }else{
             return null;
            }
            
        } catch (SQLException ex) {
            Alert a=new Alert(Alert.AlertType.ERROR, "Mensaje");
            a.showAndWait();
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return usr;
    }*/
     
     public boolean actualizarPaciente(String Id_User, String Nombre,String ApellidoPat,String ApellidoMat,String CorreoAlum,String CarreraAlum);/*{
        conexionBD con = new conexionBD();
        int q;
        try {
            ResultSet rs = con.CONSULTAR("SELECT * FROM alumnos WHERE id_usr='"+Id_User+"' AND Nombre='"+Nombre+"' AND correo='"+CorreoAlum+"'");
            if(rs.next()){
             return false;
            }else{
               q = con.ACTUALIZAR("UPDATE alumnos SET id_usr='"+Id_User+"',nombre='"+Nombre+"', apellido_paterno='"+ApellidoPat+"', apellido_materno='"+ApellidoMat+"',correo='"+CorreoAlum+"',programa_estudios='"+CarreraAlum+"' WHERE id_usr='"+Id_User+"'");
               if(q==0) 
                 return false;
            }
            
        } catch (SQLException ex) {
            Alert a=new Alert(Alert.AlertType.ERROR, "Mensaje");
            a.showAndWait();
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }*/
    
}
