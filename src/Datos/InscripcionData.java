
package Datos;

import Entidades.Alumno;
import Entidades.Materia;
import Entidades.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class InscripcionData {
     private Connection con = null;
     private MateriaData matData;
     private AlumnoData aluData;

public InscripcionData(){
        con = miConexion.getConexion();
}     
    public void guardarInscripcion(Inscripcion inscripcion){
               String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (?,?,?)";
        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setDouble(1, inscripcion.getNota());
           ps.setObject(2, inscripcion.getAlumno().getIdAlumno());
           ps.setObject(3, inscripcion.getMateria().getIdMateria());           
        
          
           ps.executeUpdate();
           
          ResultSet rs = ps.getGeneratedKeys();
          if(rs.next()){
              inscripcion.setIdInscripcion(rs.getInt(1));
          }else{
              System.out.println("No se pudo obtener ID");
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Inscripcion"+ex.getMessage());
    } 

    }
    public List<Inscripcion> obtenerInscripcion(){
        List<Inscripcion> inscripciones = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inscripcion where activo = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               Inscripcion inscripcion = new Inscripcion();
               inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
               inscripcion.setAlumno((Alumno) rs.getObject("alumno"));
               inscripcion.setMateria((Materia)rs.getObject("materia"));
               inscripciones.add(inscripcion);                       
                
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion "+ex.getMessage());
        }
        return inscripciones;
    }
        public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        List<Inscripcion> inscripcionesPorAlumno = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inscripcion INNER JOIN alumno where idInscripcion AND idAlumno = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               Inscripcion inscripcion = new Inscripcion();
               inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
               inscripcion.setAlumno((Alumno) rs.getObject("alumno"));
               inscripcion.setMateria((Materia)rs.getObject("materia"));
               inscripcionesPorAlumno.add(inscripcion);                       
                
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion "+ex.getMessage());
        }
        return inscripcionesPorAlumno;
    }

    
}
