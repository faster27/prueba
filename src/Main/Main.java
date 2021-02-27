package Main;

import base.Alumno;
import base.Examen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Main {


    public static void main(String args[]) {

        JFrame frame = new JFrame("Notas");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FrameNotas(frame);
        frame.setVisible(true);


        Alumno daniel = new Alumno(3,"daniel","3b");
        Alumno carlos= new Alumno(5,"carlos","5g");
        Alumno andres = new Alumno(6,"andres","2k");
        Alumno jose = new Alumno(7,"jose","4r");


        Examen examen1 =new Examen (3,5,"27/03/1999");
        Examen examen2 =new Examen (5,10,"5/07/1999");
        Examen examen3 =new Examen(6,23,"9/10/1999");

        examen1.anadirAlumno(daniel);
        examen1.anadirAlumno(andres);
        examen1.anadirAlumno(jose);

        examen2.anadirAlumno(daniel);
        examen2.anadirAlumno(andres);

        examen3.anadirAlumno(daniel);
        examen3.anadirAlumno(carlos);
        examen3.anadirAlumno(jose);


        daniel.anadirExamen(examen1);
        daniel.anadirExamen(examen2);
        daniel.anadirExamen(examen3);

        carlos.anadirExamen(examen3);

        andres.anadirExamen(examen1);
        andres.anadirExamen(examen2);

        jose.anadirExamen(examen3);
        jose.anadirExamen(examen1);

        ArrayList lista_alumnos= new ArrayList<>();

        lista_alumnos.add(jose);
        lista_alumnos.add(andres);
        lista_alumnos.add(carlos);
        lista_alumnos.add(daniel);



    }




    public static void FrameNotas(JFrame FrameNotas) {


        FrameNotas.setLayout(null);

        //PRUEBA CON EL PANEL

        JPanel menuPrincipal = new JPanel();
        menuPrincipal.setBackground(Color.red);
        menuPrincipal.setSize(FrameNotas.getWidth(),FrameNotas.getHeight());
        menuPrincipal.setLayout(null);
        FrameNotas.add(menuPrincipal);

        JPanel menuProfesor = new JPanel();
        menuProfesor.setBackground(Color.cyan);
        menuProfesor.setSize(FrameNotas.getWidth(),FrameNotas.getHeight());
        menuProfesor.setLayout(null);
        FrameNotas.add(menuProfesor);
        menuProfesor.setVisible(false);

        JPanel menuEstudiante = new JPanel();
        menuEstudiante.setBackground(Color.yellow);
        menuEstudiante.setSize(FrameNotas.getWidth(),FrameNotas.getHeight());
        menuEstudiante.setLayout(null);
        FrameNotas.add(menuEstudiante);
        menuEstudiante.setVisible(false);



        //boton profesor

        JButton botonProf = new JButton("Profesor");
        botonProf.setBounds(50,20,100,20);
        menuPrincipal.add(botonProf);

        //boton estudiante

        JButton botonEst = new JButton("Estudiante");
        botonEst.setBounds(250,20,100,20);
        menuPrincipal.add(botonEst);



        //este es el menu del prfesor

        //hoton regresar

        JButton botonRegresar =new JButton("Regresar");
        botonRegresar.setBounds(280,330,100,20);
        menuProfesor.add(botonRegresar);

        //boton consultar alumno
        JButton consultarAlumno = new JButton("consultar Alumno");
        consultarAlumno.setBounds(50,50,150,20);
        menuProfesor.add(consultarAlumno);

        
        


        //boton consultar examen

        JButton consultarExamen = new JButton("consultar Examen");
        consultarExamen.setBounds(50,80,150,20);
        menuProfesor.add(consultarExamen);


        //ESTE ES EL MENU DEL ESTUDIANTE

        //hoton regresar

        JButton botonRegresar2 =new JButton("Regresar");
        botonRegresar2.setBounds(280,330,100,20);
        menuEstudiante.add(botonRegresar2);

        //boton consultar

        JButton consultarExamen2 = new JButton("consultar Examen");
        consultarExamen2.setBounds(50,50,150,20);
        menuEstudiante.add(consultarExamen2);


        //boton consultar examen

       JButton consultarNotas = new JButton("consultar Notas");
        consultarNotas.setBounds(50,80,150,20);
        menuEstudiante.add(consultarNotas);
        


        //tesxto para mostar las listas

        JTextField listas =new JTextField("listas");
        listas.setBackground(Color.cyan);
        listas.setBounds(10,150,200,200);
        FrameNotas.add(listas);
        listas.setVisible(false);

        ActionListener botonProfesorListener = new ActionListener() {
        

            @Override
            public void actionPerformed(ActionEvent e) {

                menuPrincipal.setVisible(false);
                menuProfesor.setVisible(true);




            }
        };

        ActionListener botonConsultarListaExamenListener = new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {


                listas.setVisible(true);
                listas.setText(null);
                listas.setEditable(false);



            }



        };

        ActionListener botonRegresarListener = new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {


              menuProfesor.setVisible(false);
              menuPrincipal.setVisible(true);



            }



        };

        ActionListener botonEstudianteListener = new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {


                menuPrincipal.setVisible(false);
                menuEstudiante.setVisible(true);



            }



        };

        ActionListener botonRegresar2Listener = new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {



                menuEstudiante.setVisible(false);
                menuPrincipal.setVisible(true);



            }



        };



        botonRegresar2.addActionListener(botonRegresar2Listener);
        botonRegresar.addActionListener(botonRegresarListener);
        botonProf.addActionListener(botonProfesorListener);
        consultarExamen.addActionListener(botonConsultarListaExamenListener);
        botonEst.addActionListener(botonEstudianteListener);







        }



    }










