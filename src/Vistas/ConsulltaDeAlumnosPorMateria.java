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
import java.awt.Component;
import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class ConsulltaDeAlumnosPorMateria extends javax.swing.JInternalFrame {
      private DefaultTableModel modelo = new DefaultTableModel();
      private DefaultComboBoxModel<Materia> comboModel;
      
     MateriaData mat = new MateriaData();
     InscripcionData insdata = new InscripcionData();
     AlumnoData aludata = new AlumnoData();
     Materia materia = null;
        int idMateria; 
    public ConsulltaDeAlumnosPorMateria() {
        initComponents();
         cargarCombo();
         armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setText("Seleccione una Materia:");

        jcbMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbMateriasItemStateChanged(evt);
            }
        });
        jcbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriasActionPerformed(evt);
            }
        });

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAlumnos);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
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
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jBSalir)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cargarCombo(){
    comboModel = new DefaultComboBoxModel<>();     

      jcbMaterias.setModel(comboModel);
      for (Materia materia : mat.listarMateria()) {
            comboModel.addElement(materia);          
        }
      

}


 
    private void jcbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriasActionPerformed

        materia = (Materia) comboModel.getSelectedItem();
 
        for (Alumno alum : insdata.obtenerAlumnoXMateria(materia.getIdMateria())) {

            modelo.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre()}); 
        }

      
    }//GEN-LAST:event_jcbMateriasActionPerformed
        
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jcbMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbMateriasItemStateChanged
//        materia = (Materia) comboModel.getSelectedItem();
////        borrarFilas();
////        borrarFilas();
//        for (Alumno alum : insdata.obtenerAlumnoXMateria(materia.getIdMateria())) {
//
//            modelo.addRow(new Object[]{alum.getIdAlumno(), alum.getDni(), alum.getApellido(), alum.getNombre()}); 
//        }
//
//    
    }//GEN-LAST:event_jcbMateriasItemStateChanged
//private void borrarFilas(){
//    int filas = jtAlumnos.getRowCount()-1;
//    for(int f = filas; f>0 ; f--){
//        modelo.removeRow(f);
//    }
    
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jtAlumnos.setModel(modelo);

    }
    
}

