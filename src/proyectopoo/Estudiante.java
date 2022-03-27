package proyectopoo;

import java.util.ArrayList;

public class Estudiante {


    public Estudiante() {
        this.CursosMatriculados = new ArrayList<String>();
    }
    
    //Atributos
    private String Nombre;
    private String Apellido;
    private String Rut;
    private String Mail;
    private ArrayList<String> CursosMatriculados;
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getCursosMatriculados(int i){
        return CursosMatriculados.get(i);
    }

    public void setCursosMatriculados(String Cursos1){
        CursosMatriculados.add(Cursos1);
    }
    
    public int getSizeCursosMatriculados(){
        return CursosMatriculados.size();
    }
}