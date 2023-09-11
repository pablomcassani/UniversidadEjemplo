
package universidadejemplo;

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


public class UniversidadEjemplo {


    public static void main(String[] args) throws SQLException {

        //Prueba de agregar alumno.
        Alumno johana = new Alumno(44220089, "Vera","Johana", LocalDate.of(2010, Month.JANUARY, 27),true);
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
            Materia ingles = new Materia(3,"Inglés 2", 2, true);
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
        Inscripcion ins = new Inscripcion(johana, ingles, 9.00);
        InscripcionData insdata = new InscripcionData();
        insdata.guardarInscripcion(ins);
    }

}
