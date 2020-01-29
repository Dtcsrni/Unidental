
package modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Date;


public class paciente {
    //Se definen las variables del singleton
    private StringProperty id_paciente;
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
    private StringProperty nombreTutor;
    private StringProperty maximoEstudio;
    private StringProperty ocupacion;
    private StringProperty estadoCivil;
    private StringProperty derechoHabiencia;
    private StringProperty motivoConsulta;
    private static paciente usr;
        //función que asigna las variables provenientes de BD a las variables locales para el objeto de tipo paciente
    public paciente(String id_paciente1, String nombre1, String apellidoPat1, String apellidoMat1, String edad1, String sexo1,
                    String fechaNacimiento1, String lugarNacimiento1, String domicilioCalle1, String domicilioNumero1, String domicilioColonia1,
                    String domicilioCiudad1, String telefono1, String nombreTutor1, String maximoEstudio1, String ocupacion1, String estadoCivil1,
                    String derechoHabiencia1, String motivoConsulta1) {

        this.id_paciente = new SimpleStringProperty(id_paciente1);
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
        this.nombreTutor = new SimpleStringProperty(nombreTutor1);
        this.maximoEstudio = new SimpleStringProperty(maximoEstudio1);
        this.ocupacion = new SimpleStringProperty(ocupacion1);
        this.estadoCivil = new SimpleStringProperty(estadoCivil1);
        this.derechoHabiencia= new SimpleStringProperty(derechoHabiencia1);
        this.motivoConsulta = new SimpleStringProperty(motivoConsulta1);

    }



    public static paciente getInstanceUser(String id_paciente1, String nombre1, String apellidoPat1, String apellidoMat1, String edad1, String sexo1,
                                           String fechaNacimiento1, String lugarNacimiento1, String domicilioCalle1, String domicilioNumero1, String domicilioColonia1,
                                           String domicilioCiudad1, String telefono1, String nombreTutor1, String maximoEstudio1, String ocupacion1, String estadoCivil1,
                                           String derechoHabiencia1, String motivoConsulta1){

        if(usr == null){//Si no se ha instanciado aún el objeto tipo paciente
                //Se instancia un objeto de tipo paciente (implementación de singleton)
            usr = new paciente(id_paciente1, nombre1, apellidoPat1, apellidoMat1, edad1, sexo1,
                    fechaNacimiento1, lugarNacimiento1, domicilioCalle1, domicilioNumero1, domicilioColonia1,
                    domicilioCiudad1, telefono1, nombreTutor1, maximoEstudio1, ocupacion1, estadoCivil1,
                    derechoHabiencia1, motivoConsulta1);
        }

        return usr;//se devuelve el objeto de tipo paciente
    }
        //Implementación de get y set para cada valor (encapsulamiento)
    public String getId_paciente() {
        return id_paciente.get();
    }

    public void setId_paciente(String id_paciente1) {
        this.id_paciente = new SimpleStringProperty(id_paciente1);
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
    public String getlugarNacimiento(){
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


=======
>>>>>>> origin/master

    public void setProgramaEstudios(String programaEstudios) {
        this.programaEstudios = new SimpleStringProperty(programaEstudios);
    }

    public String getCorreo() {
        return correo.get();
    }

    public void setCorreo(String correo) {
        this.correo = new SimpleStringProperty(correo);
    }




}
