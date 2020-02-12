
package modelo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Usuario {
    //Se definen las variables del singleton
    private StringProperty id_usuario;
    private StringProperty nombre;
    private StringProperty apellidoPat;
    private StringProperty apellidoMat;
    private StringProperty edad;
    private StringProperty sexo;
    private StringProperty fechaNacimiento;
    private StringProperty lugarNacimiento;
    private StringProperty domicilioCalle;
    private StringProperty domicilioNumero;
    private StringProperty domicilioColonia;
    private StringProperty domicilioCiudad;
    private StringProperty telefono;
    private StringProperty estudios;
    private StringProperty estadoCivil;
    private StringProperty tipoUsuario;
    private static Usuario usr;
    //función que asigna las variables provenientes de BD a las variables locales para el objeto de tipo paciente
    public Usuario(String id_usuario1, String nombre1, String apellidoPat1, String apellidoMat1, String edad1, String sexo1,
                    String fechaNacimiento1, String lugarNacimiento1, String domicilioCalle1, String domicilioNumero1, String domicilioColonia1,
                    String domicilioCiudad1, String telefono1, String estudios1, String estadoCivil1, String tipoUsuario1) {

        this.id_usuario = new SimpleStringProperty(id_usuario1);
        this.nombre = new SimpleStringProperty(nombre1);
        this.apellidoPat = new SimpleStringProperty(apellidoPat1);
        this.apellidoMat = new SimpleStringProperty(apellidoMat1);
        this.edad = new SimpleStringProperty(edad1);
        this.sexo = new SimpleStringProperty(sexo1);
        this.fechaNacimiento = new SimpleStringProperty(fechaNacimiento1);
        this.lugarNacimiento = new SimpleStringProperty(lugarNacimiento1);
        this.domicilioCalle = new SimpleStringProperty(domicilioCalle1);
        this.domicilioNumero = new SimpleStringProperty(domicilioNumero1);
        this.domicilioColonia = new SimpleStringProperty(domicilioColonia1);
        this.domicilioCiudad = new SimpleStringProperty(domicilioCiudad1);
        this.telefono = new SimpleStringProperty(telefono1);
        this.estudios = new SimpleStringProperty(estudios1);
        this.estadoCivil = new SimpleStringProperty(estadoCivil1);
        this.tipoUsuario = new SimpleStringProperty(tipoUsuario1)
    }



    public static Usuario getInstanceUser(String id_usuario1, String nombre1, String apellidoPat1, String apellidoMat1, String edad1, String sexo1,
                                          String fechaNacimiento1, String lugarNacimiento1, String domicilioCalle1, String domicilioNumero1, String domicilioColonia1,
                                          String domicilioCiudad1, String telefono1, String estudios1, String estadoCivil1, String tipoUsuario1){

        if(usr == null){//Si no se ha instanciado aún el objeto
            //Se instancia un objeto (implementación de singleton)
            usr = new Usuario(id_usuario1, nombre1, apellidoPat1, apellidoMat1, edad1, sexo1,
                    fechaNacimiento1, lugarNacimiento1, domicilioCalle1, domicilioNumero1, domicilioColonia1,
                    domicilioCiudad1, telefono1, estudios1, estadoCivil1, tipoUsuario1);
        }

        return usr;//se devuelve el objeto
    }
    //Implementación de get y set para cada valor (encapsulamiento)
    public String getId_Usuario() {
        return id_usuario.get();
    }

    public void setId_usuario(String id_usuario1) {
        this.id_usuario = new SimpleStringProperty(id_usuario1);
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre1) {
        this.nombre = new SimpleStringProperty(nombre1);
    }

    public String getApellidoPat() {
        return apellidoPat.get();
    }

    public void setApellidoPat(String apellidoPat1) {
        this.apellidoPat = new SimpleStringProperty(apellidoPat1);
    }

    public String getApellidoMat() {
        return apellidoMat.get();
    }

    public void setApellidoMat(String apellidoMat1) {
        this.apellidoMat = new SimpleStringProperty(apellidoMat1);
    }

    public String getEdad() {
        return edad.get();
    }

    public void setEdad(String edad1){
        this.edad = new SimpleStringProperty(edad1);
    }
    public String getSexo(){
        return sexo.get();
    }
    public void setSexo(String sexo1){
        this.sexo = new SimpleStringProperty(sexo1);
    }
    public String getFechaNacimiento(){
        return fechaNacimiento.get();
    }
    public String setFechaNacimiento(String fechaNacimiento1){
        this.fechaNacimiento = new SimpleStringProperty(fechaNacimiento1);
    }
    public String getLugarNacimiento(){
        return lugarNacimiento.get();
    }
    public void setLugarNacimiento(String lugarNacimiento1){
        this.lugarNacimiento = new SimpleStringProperty(lugarNacimiento1);
    }
    public String getDomicilioCalle(){
        return domicilioCalle.get();
    }
    public void setDomicilioCalle(String domicilioCalle1){
        this.domicilioCalle = new SimpleStringProperty(domicilioCalle1);
    }
    public String getDomicilioNumero(){
        return domicilioNumero.get();
    }
    public void setDomicilioNumero(String domicilioNumero1){
        this.domicilioNumero = new SimpleStringProperty(domicilioNumero1);
    }
    public String getDomicilioColonia(){
        return domicilioColonia.get();
    }
    public void setDomicilioColonia(String domicilioColonia1){
        this.domicilioColonia = new SimpleStringProperty(domicilioColonia1);
    }
    public String getDomicilioCiudad(){
        return domicilioCiudad.get();
    }
    public void setDomicilioCiudad(String domicilioCiudad1){
        this.domicilioCiudad = new SimpleStringProperty(domicilioCiudad1);
    }
    public String getTelefono(){
        return telefono.get();
    }
    public void setTelefono(String telefono1){
        this.telefono = new SimpleStringProperty(telefono1);
    }
    public String getEstudios(){
        return estudios.get();
    }
    public void setEstudios(String estudios1){
        this.estudios = new SimpleStringProperty(estudios1);
    }
    public String getEstadoCivil(){
        return estadoCivil.get();
    }
    public void setEstadoCivil(String estadoCivil1){
        this.estadoCivil = new SimpleStringProperty(estadoCivil1);
    }
    public String getTipoUsuario(){
        return tipoUsuario.get();
    }
    public void setTipoUsuario(String tipoUsuario1){
        this.tipoUsuario = new SimpleStringProperty(tipoUsuario1);
    }

}
