package base;

import javax.swing.*;
import java.util.ArrayList;

public class Alumno {
    private int numAlumno;
    private String nomAlumno;
    private String grupAlumno;
    private ArrayList<Examen> lista_examenes;





    public Alumno(int numAlumno, String nomAlumno, String grupAlumno) {


        this.nomAlumno = nomAlumno;
        this.numAlumno = numAlumno;
        this.grupAlumno = grupAlumno;

        lista_examenes = new ArrayList<>();




    }





    public void  anadirExamen (Examen examen){

        lista_examenes.add(examen);


    }

    public ArrayList<Examen> getLista_examenes() {
        return lista_examenes;
    }

    public void setLista_examenes(ArrayList<Examen> lista_examenes) {
        this.lista_examenes = lista_examenes;
    }

    public String getGrupAlumno() {
        return grupAlumno;
    }

    public void setGrupAlumno(String grupAlumno) {
        this.grupAlumno = grupAlumno;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public int getNumAlumno() {
        return numAlumno;
    }

    public void setNumAlumno(int numAlumno) {
        this.numAlumno = numAlumno;
    }



}
