/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Datos.AlumnoData;
import Datos.InscripcionData;
import Datos.MateriaData;
import Datos.miConexion;
import static Datos.miConexion.getConexion;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.sql.SQLException;

/**
 *
 * @author gassani
 */
public class Pruebas {    public static void main(String[] args) throws SQLException {

        //Prueba de agregar alumno.
//        Alumno johana = new Alumno(41625482, "Mujica","Manuel", LocalDate.of(2010, Month.APRIL, 07),true);
//       AlumnoData alu = new AlumnoData();
//       alu.guardarAlumno(johana);

            //Prueba de modificar alumno.
//          Alumno martin = new Alumno(12, 43233862 , "Luna","Martín", LocalDate.of(2008, Month.JANUARY, 27),true);
//          AlumnoData alu = new AlumnoData();
//          alu.modificarAlumno(martin);

        //Prueba de borrar alumno.
//                  AlumnoData alu = new AlumnoData();
//                  alu.eliminarAlumno(12);

        //Prueba buscar alumno por Id.
//        AlumnoData alu = new AlumnoData();
//        alu.buscarAlumno(19);

        //Prueba buscar alumno por Dni.
//         AlumnoData alu = new AlumnoData();
//        alu.buscarAlumnoPorDni(44220089);

        //Prueba listar alumnos.
//        AlumnoData alu = new AlumnoData();
//        alu.listarAlumnos();

       //Prueba agregar materia.
//       Materia ingles = new Materia("Inglés ", 1, true);
//       MateriaData mat = new MateriaData();
//       mat.guardarMateria(ingles);

        //Prueba modificar materia.
//            Materia ingles = new Materia(3,"Inglés 2", 2, true);
//            MateriaData mat = new MateriaData();
//            mat.modificarMateria(ingles);

        //Prueba buscar materia.
//        MateriaData mat = new MateriaData();
//        mat.buscarMateria(3);

        //Prueba eliminar materia.
//        MateriaData mat = new MateriaData();
//        mat.eliminarMateria(1);

        //Prueba listar materia.
//        MateriaData mat = new MateriaData();
//        mat.listarMateria();

        //Prueba agregar inscripcion.  
//        AlumnoData alu = new AlumnoData();
//        MateriaData mat = new MateriaData();
//        InscripcionData insdata = new InscripcionData();
//         
//        Alumno martin = alu.buscarAlumno(19);
//        Materia ingles = mat.buscarMateria(2);
//        Inscripcion ins = new Inscripcion(martin,ingles ,7);
//       
//        
//        insdata.guardarInscripcion(ins);
//    }

        //Prueba actualizar nota
        
//        AlumnoData alu = new AlumnoData();
//        MateriaData mat = new MateriaData();
//        InscripcionData insdata = new InscripcionData();
         
//        Alumno johana = alu.buscarAlumno(19);
//        Materia lab2 = mat.buscarMateria(1);
//        Inscripcion ins = new Inscripcion(johana,lab2,9);
//        insdata.actualizarNota(19,1,5);

        //Prueba borrar inscripción.
//        AlumnoData alu = new AlumnoData();
//        MateriaData mat = new MateriaData();
//        InscripcionData insdata = new InscripcionData();
//        
//        Alumno johana = alu.buscarAlumno(19);
//        Materia lab2 = mat.buscarMateria(1);
//        
//        insdata.borrarInscripcionMateriaAlumno(19, 2);


        //Prueba obtener inscripciones.

//        InscripcionData insdata = new InscripcionData();
//         
//
//        for(Inscripcion inscripcion:insdata.obtenerInscripciones()){
//            System.out.println("id "+inscripcion.getIdInscripcion());
//            System.out.println("Apellido: "+inscripcion.getAlumno().getApellido());
//            System.out.println(inscripcion.getMateria().getNombre());
//       }
//        //Prueba obtener inscripcion por id de alumno.

//        InscripcionData insdata = new InscripcionData();
////         
//
//         for(Inscripcion inscripcion:insdata.obtenerInscripcionesPorAlumno(12)){
//            System.out.println("id "+inscripcion.getIdInscripcion());
//            System.out.println("Apellido: "+inscripcion.getAlumno().getApellido());
//            System.out.println("Nota: " +inscripcion.getNota());
//            System.out.println(inscripcion.getMateria());
//     }
        //Prueba de materias cursadas por id de alumno.
//     InscripcionData insdata = new InscripcionData();
////         
//
//         for(Materia materia:insdata.obtenerMateriasCursadas(19)){
//           
//            System.out.println("id "+materia.getIdMateria());
//            System.out.println("nombre: "+materia.getNombre());
//            System.out.println("año: " +materia.getAnioMateria());

        //Prueba de materias no cursadas por id de alumno    
//    InscripcionData insdata = new InscripcionData();
//   
//            for(Materia materia:insdata.obtenerMateriasNoCursadas(12)){
//           
//            System.out.println("id "+materia.getIdMateria());
//            System.out.println("nombre: "+materia.getNombre());
//            System.out.println("año: " +materia.getAnioMateria());
//  }
    //Pruba buscar alumno por materia.
//         InscripcionData insdata = new InscripcionData();
//    for(Alumno alumno:insdata.obtenerAlumnoXMateria(1)){
//            System.out.println("id "+alumno.getIdAlumno());
//            System.out.println("Apellido: "+alumno.getApellido());
//            System.out.println("Nombre: " +alumno.getNombre());

//    }
                  }
        }