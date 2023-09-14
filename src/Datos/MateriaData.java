
package Datos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MateriaData {
    private Connection con = null;
    
    public MateriaData(){
    con = miConexion.getConexion();
}
    public void guardarMateria(Materia materia) throws SQLException{
               String sql = "INSERT INTO materia ( nombre, año, estado) VALUES (?,?,?)";
        try{
           PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setString(1, materia.getNombre());
           ps.setInt(2, materia.getAnioMateria());
           ps.setBoolean(3, materia.isActivo());
           ps.executeUpdate();
           
          ResultSet rs = ps.getGeneratedKeys();
          if(rs.next()){
              materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Materia agregada.");
          }else{
              System.out.println("No se pudo obtener ID");
        }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a Materia"+ex.getMessage());
    } 

    }
        public Materia buscarMateria(int id){
        Materia materia = null;
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
            materia = new  Materia();
            materia.setIdMateria(id);
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            materia.setActivo(true);
//            JOptionPane.showMessageDialog(null, materia.toString());
        }else {
                JOptionPane.showMessageDialog(null, "No está anotado a materia");
                }
        ps.close();
        } catch (SQLException | NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia "+ex.getMessage());
        }
        return materia;
    }
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET  nombre = ?, año = ? , estado = ? WHERE idMateria = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3,materia.isActivo());
             ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Modificado exitosamente.");
            }else{
                JOptionPane.showMessageDialog(null,"El alumno no existe");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno "+ex.getMessage());
        }
    }
    public void eliminarMateria(int id){
        try{
            String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if(fila == 1){
                JOptionPane.showMessageDialog(null," Se eliminó la materia.");
            }
            ps.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error al acceder a 'Materia'.");
        }
    }
        public List<Materia> listarMateria(){
        List<Materia> materias = new ArrayList<>();
        try{
            String sql = "SELECT * FROM materia where estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
               Materia materia = new Materia();
               materia.setIdMateria(rs.getInt("idMateria"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnioMateria(rs.getInt("año"));
               materia.setActivo(rs.getBoolean("estado"));
               materias.add(materia);                       
               
               JOptionPane.showMessageDialog(null, materia.toString());
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
        }
        return materias;
    }        
}
