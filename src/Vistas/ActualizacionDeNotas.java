/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Datos.AlumnoData;
import Datos.InscripcionData;
import Datos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
<<<<<<< HEAD
import javax.swing.JComboBox;
=======
import javax.swing.JOptionPane;
>>>>>>> ff0d7cf7d5aefd4c48f95d9a86b2dbb6cd6f9797
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class ActualizacionDeNotas extends javax.swing.JInternalFrame {
<<<<<<< HEAD
    
    private List<Alumno>listaA;
    private List<Inscripcion>listaI;
    private List<Materia>listaM;
    
    private DefaultTableModel modelo;
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    
    public ActualizacionDeNotas() {
        initComponents();
        
        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData= new MateriaData();
        cargaAlumnos();
        armarCabesera();
    }
=======
private DefaultTableModel modelo;
    private List<Materia> listaM;
    private List<Alumno> listaA;
    
   private InscripcionData insData;
    private MateriaData mData;
    private AlumnoData aData;

    public ActualizacionDeNotas() {
FormularioInscripcion();
    }
 private void armarCabeceraTabla(){
      ArrayList<Object> filaCabecera = new ArrayList<>();
      filaCabecera.add("Codigo");
      filaCabecera.add("Nombre");
      filaCabecera.add("Nota");
      for(Object it:filaCabecera){
          modelo.addColumn(it);
      }
      jtNotaMateria.setModel(modelo);
  }
    private void cargarAlumnos(){
      for(Alumno item : listaA){
          jcbAlumno.addItem(item);
      }
  }  
 public void FormularioInscripcion(){
    initComponents();
    aData = new AlumnoData();
    listaA = aData.listarAlumnos();
    modelo = new DefaultTableModel();
    mData= new MateriaData();
    cargarAlumnos();
    armarCabeceraTabla();
    
    insData = new InscripcionData();

}
 
>>>>>>> ff0d7cf7d5aefd4c48f95d9a86b2dbb6cd6f9797

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotaMateria = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("                                       Carga de Notas");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Selecciona un Alumno:");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jtNotaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtNotaMateria);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSalir)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jSalir))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
<<<<<<< HEAD
        
        InscripcionData id =new InscripcionData();
        Inscripcion ins = new Inscripcion();
        Alumno alu = new Alumno();
        Materia mat = new Materia();
        id.actualizarNota(alu.getIdAlumno(),mat.getIdMateria(),ins.getNota());
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnoActionPerformed
        
        borrarFilasTabla();
        mostrarNotas();
        
        
    }//GEN-LAST:event_jCBAlumnoActionPerformed
=======
      Alumno selec= (Alumno) jcbAlumno.getSelectedItem();

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
 
        try{     
      Alumno selec= (Alumno) jcbAlumno.getSelectedItem();
 if(modelo != null){
      borrarFilas();
       borrarFilas();
        for(Inscripcion alum : insData.obtenerInscripcionesPorAlumno(selec.getIdAlumno())) {

            modelo.addRow(new Object[]{alum.getIdInscripcion(), alum.getMateria(), alum.getNota()}); 
        }
 }
}catch(NullPointerException ex){
    ex.getMessage();
}
      
    }//GEN-LAST:event_jcbAlumnoActionPerformed
>>>>>>> ff0d7cf7d5aefd4c48f95d9a86b2dbb6cd6f9797

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
<<<<<<< HEAD
    private javax.swing.JComboBox<Alumno> jCBAlumno;
=======
>>>>>>> ff0d7cf7d5aefd4c48f95d9a86b2dbb6cd6f9797
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JTable jtNotaMateria;
    // End of variables declaration//GEN-END:variables

<<<<<<< HEAD
    private void armarCabesera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
       jTNotaMateria.setModel(modelo);
    }

    private void cargaAlumnos() {
        for(Alumno item:listaA){
            jCBAlumno.addItem(item);
        }
    }

    private void mostrarNotas(){
        
        Alumno selec = (Alumno) jCBAlumno.getSelectedItem();
        List<Inscripcion> lista = inscData.obtenerInscripcionesPorAlumno(selec.getIdAlumno());
        
        
        for(Inscripcion i:lista){
            modelo.addRow(new Object[]{i.getIdInscripcion(), i.getMateria(), i.getNota()});
        }
    }
    
        private void borrarFilasTabla(){
            int indice = modelo .getRowCount()-1;
            
            for(int i = indice;i>=0;i--){
                modelo.removeRow(i);
            }
        }
        
        public boolean isCellEditable(int fila, int columna){
            if(columna == 3 ){
                return true;
            } else {
                return false;
            }
        }
        
    }
=======
  private void borrarFilas(){
    int filas = modelo.getRowCount()-1;
    for(int f = filas; f>-1 ; f--){
        modelo.removeRow(f);
    }
    
}
}
>>>>>>> ff0d7cf7d5aefd4c48f95d9a86b2dbb6cd6f9797
