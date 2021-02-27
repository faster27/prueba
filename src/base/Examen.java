package base;

import java.util.ArrayList;

public class Examen {


    private int num;
    private int numPreguntas;
    private String fecha;
    public ArrayList<Alumno> lista_alumnos;

    public Examen(int num, int numPreguntas, String fecha) {

        this.num = num;
        this.numPreguntas=numPreguntas;
        this.fecha=fecha;

        lista_alumnos = new ArrayList<>();


    }

    public void  anadirAlumno (Alumno alumno){

        lista_alumnos.add(alumno);


    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Alumno> getLista_alumnos() {
        return lista_alumnos;
    }

    public void setLista_alumnos(ArrayList<Alumno> lista_alumnos) {
        this.lista_alumnos = lista_alumnos;
    }
}
