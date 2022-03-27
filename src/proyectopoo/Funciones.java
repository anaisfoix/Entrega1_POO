
package proyectopoo;

import java.io.FileNotFoundException;
import proyectopoo.CSV;
import java.io.IOException;
import java.util.ArrayList;


public class Funciones {
    
    private ArrayList <Profesor> Profesores = new ArrayList <Profesor>();
    
    public void LeerProfesores() throws IOException {
        CSV acceso = new CSV("Profesor");

        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
            Profesor nuevoProfesor = new Profesor();
            for (int i = 0; i < 7; i++) {
                switch (i) {
                    case 0: {
                        nuevoProfesor.setIdProfesor(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                    case 1: {
                        nuevoProfesor.setNombre(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 2: {
                        nuevoProfesor.setApellido(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 3: {
                        nuevoProfesor.setRut(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 4: {
                        nuevoProfesor.setEdad(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                    case 5: {
                        nuevoProfesor.setMail(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 6: {
                        String [] CursosX=acceso.get_csvField(linea, i).split(" ");
                        for(int j=0; j<CursosX.length; j++){
                            nuevoProfesor.setCursos(CursosX[j]);
                        }                        
                        break;
                    }
                }
            }
            Profesores.add(nuevoProfesor);
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
        }
    }
    public void mostrarProfesores(){
        System.out.println("Profesores: ");
        for(int i=0; i<this.Profesores.size(); i++){
            System.out.print(this.Profesores.get(i).getIdProfesor());     // faltaba el idProfesor
            System.out.print(this.Profesores.get(i).getNombre());
            System.out.print(this.Profesores.get(i).getApellido());
            System.out.print(this.Profesores.get(i).getRut());
            System.out.print(this.Profesores.get(i).getEdad());
            System.out.print(this.Profesores.get(i).getMail());
            for(int j=0; j<Profesores.get(i).getSize(); j++){
                System.out.print(this.Profesores.get(i).getCursos(j)+" ");
            }
            System.out.println("");
        }
    }
    
    private ArrayList <Estudiante> Estudiantes = new ArrayList <Estudiante>();
    
    public void LeerEstudiantes() throws IOException {
        CSV acceso = new CSV("Estudiante");
        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
            Estudiante nuevoEstudiante = new Estudiante();
            for (int i = 0; i < 5; i++) {
                switch (i) {
                    case 0: {
                        nuevoEstudiante.setNombre(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 1: {
                        nuevoEstudiante.setApellido(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 2: {
                        nuevoEstudiante.setRut(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 3: {
                        nuevoEstudiante.setMail(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 4: {
                        String [] CursosX=acceso.get_csvField(linea, i).split(" ");
                        for(int j=0; j<CursosX.length; j++){
                            nuevoEstudiante.setCursosMatriculados(CursosX[j]);
                        }
                    }
                }
            }
            Estudiantes.add(nuevoEstudiante);
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
        }
    }
    public void mostrarEstudiantes(){
        System.out.println("Estudiantes: ");
        for(int i=0; i<this.Estudiantes.size(); i++){
            System.out.print(this.Estudiantes.get(i).getNombre());
            System.out.print(this.Estudiantes.get(i).getApellido());
            System.out.print(this.Estudiantes.get(i).getRut());
            System.out.print(this.Estudiantes.get(i).getMail());
            for(int j=0; j<Estudiantes.get(i).getSizeCursosMatriculados(); j++){
                System.out.print(this.Estudiantes.get(i).getCursosMatriculados(j)+" ");
            }
            System.out.println("");
        }
    }
    
    private ArrayList <Curso> Cursos = new ArrayList <Curso>();
    
    public void leerCursos() throws FileNotFoundException, IOException{
        CSV acceso = new CSV("Curso");
        String linea = acceso.firstLine();
        linea = acceso.nextLine();
        while (linea != null) {
            Curso nuevoCurso = new Curso();
            for (int i = 0; i < 7; i++) {
                switch (i) {
                    case 0: {
                        nuevoCurso.setNombre(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 1: {
                        nuevoCurso.setClaveCurso(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 2: {
                        nuevoCurso.setCantidadAlumnos(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                    case 3: {
                        nuevoCurso.setFechaInicio(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 4: {
                        nuevoCurso.setFechaTermino(acceso.get_csvField(linea, i));
                        break;   
                    }
                    case 5: {
                        nuevoCurso.setCategoria(acceso.get_csvField(linea, i));
                        break;
                    }
                    case 6: {
                        nuevoCurso.setIdProfesor(Integer.parseInt(acceso.get_csvField(linea, i)));
                        break;
                    }
                }
        }
            Cursos.add(nuevoCurso);
            linea = acceso.nextLine();
            if (linea == null) {
                break;
            }
    }
}
    public void mostrarCursos(){
        for(int i=0; i<this.Cursos.size(); i++){
            System.out.println(this.Cursos.get(i).getNombre());
            System.out.println(this.Cursos.get(i).getClaveCurso());
            System.out.println(this.Cursos.get(i).getCantidadAlumnos());
            System.out.println(this.Cursos.get(i).getFechaInicio());
            System.out.println(this.Cursos.get(i).getFechaTermino());
            System.out.println(this.Cursos.get(i).getCategoria());
            System.out.println(this.Cursos.get(i).getIdProfesor());
            System.out.println("");
        }
    }
}
