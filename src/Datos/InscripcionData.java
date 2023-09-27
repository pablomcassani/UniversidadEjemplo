
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
     private MateriaData matData = new MateriaData();
     private AlumnoData aluData = new AlumnoData();

public InscripcionData(){
        this.con = miConexion.getConexion();
}     
    public void guardarInscripcion(Inscripcion inscripcion){
               String sql = "INSERT INTO inscripción (nota, idAlumno, idMateria) VALUES (?,?,?)";

        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, inscripcion.getNota());
           ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
           ps.setInt(3, inscripcion.getMateria().getIdMateria());           
        
          
           ps.executeUpdate();
           
          ResultSet rs = ps.getGeneratedKeys();
          if(rs.next()){
              inscripcion.setIdInscripcion(rs.getInt(1));
              JOptionPane.showMessageDialog(null,"Inscripto en materia");
          }else{
              System.out.println("No se pudo obtener ID");
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Inscripcion"+ex.getMessage());
    } 

    }
        public List<Inscripcion> obtenerInscripciones(){
       ArrayList<Inscripcion> inscripciones = new ArrayList<>();
       String sql = "SELECT * FROM inscripción";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               Inscripcion inscripcion = new Inscripcion();
               inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
               Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno")) ;
               Materia mat = matData.buscarMateria(rs.getInt("idMateria")); 
               inscripcion.setAlumno(alu);
               inscripcion.setMateria(mat);
               inscripcion.setNota(rs.getInt("nota"));
               inscripciones.add(inscripcion);
         
                
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion "+ex.getMessage());
        }
        return inscripciones;
    }
        public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        ArrayList<Inscripcion> inscripcionesPorAlumno = new ArrayList<>();
        String sql = "SELECT * FROM inscripción WHERE idAlumno = ?";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               Inscripcion inscripcion = new Inscripcion();
               inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
               Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno")) ;
               Materia mat = matData.buscarMateria(rs.getInt("idMateria")) ;
               inscripcion.setAlumno(alu);
               inscripcion.setMateria(mat);
               inscripcion.setNota(rs.getInt("nota"));
               inscripcionesPorAlumno.add(inscripcion);
            }
            ps.close();
        } catch(SQLException |NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción "+ex.getMessage());
        }
        return inscripcionesPorAlumno;
        
        
    }


 
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripción WHERE idAlumno = ? and idMateria = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2,idMateria);
            
            int filas = ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Inscripción borrada.");
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
       }
    }

   public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql = "UPDATE inscripción SET nota = ? WHERE idAlumno = ? and idMateria = ?";
        try{
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setDouble(1,nota);
        ps.setInt(2, idAlumno);
        ps.setInt(3, idMateria);
        
        int filas = ps.executeUpdate();
        if(filas > 0){
             JOptionPane.showMessageDialog(null, "Nota actualizada");
    }
        ps.close();
        }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
    }   
    
}
public List<Materia> obtenerMateriasCursadas(int id) {
    ArrayList<Materia> materias = new ArrayList<>();
    String sql = "SELECT inscripción.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria AND inscripcion.idAlumno = ?;";
    try{
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1,id);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              Materia materia = new Materia();
              materia.setIdMateria(rs.getInt("idMateria"));
              materia.setNombre(rs.getString("nombre"));
              materia.setAnioMateria(rs.getInt("año"));
              materias.add(materia);
          }
       ps.close();   
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
    }   
  
         return materias;
    
}
public List<Materia> obtenerMateriasNoCursadas(int id){
    ArrayList<Materia> materias = new ArrayList<>();
    String sql = "SELECT * FROM materia WHERE estado = 1 AND idMateria not in (SELECT idMateria FROM inscripcion WHERE idAlumno = ?);";
            try{
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1,id);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              Materia materia = new Materia();
              materia.setIdMateria(rs.getInt("idMateria"));
              materia.setNombre(rs.getString("nombre"));
              materia.setAnioMateria(rs.getInt("año"));
              materias.add(materia);
          }
       ps.close();   
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
    }   
  
         return materias;
    
}   
public List<Alumno> obtenerAlumnoXMateria(int idMateria){
    ArrayList<Alumno> alumnosMateria = new ArrayList<>();
    String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado =1;";
         try{
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, idMateria);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
          Alumno alumno = new Alumno();
          alumno.setIdAlumno(rs.getInt("idAlumno"));
          alumno.setDni(rs.getInt("dni"));
          alumno.setApellido(rs.getString("apellido"));
          alumno.setNombre(rs.getString("nombre"));
          alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
          alumno.setActivo(rs.getBoolean("estado"));
          alumnosMateria.add(alumno);
          }
          ps.close();
          }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
    }   
    return alumnosMateria;
}
}
