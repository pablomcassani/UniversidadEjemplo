/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;
import Datos.AlumnoData;
import Entidades.Alumno;
import Datos.InscripcionData;
import Datos.MateriaData;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nacho
 */
public class Inscripciones extends javax.swing.JInternalFrame {
    
    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    private InscripcionData inscData;
    private AlumnoData aData;
    
    private DefaultTableModel modelo;
    
    public Inscripciones(){
        initComponents();
        aData=new AlumnoData();
        listaA=(ArrayList<Alumno>)aData.listarAlumnos();
        modelo= new DefaultTableModel();
        inscData = new InscripcionData();
       // mData= new MateriaData();
        
        cargarAlumnos();
        armarCabeceraTabla();
        
      
    }
    
   /* private DefaultTableModel modelo = new DefaultTableModel();
    
    public Inscripciones() {
        initComponents();
        armarCabesera();
    }*/

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        javax.swing.ButtonGroup MateriasInscriptasNoInscriptas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jboxAlumno = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTInscripcion = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnularInscripcion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setTitle("                                  Formulario de Inscripcion");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Formulario de inscripcion");

        jLabel3.setText("Seleccione un Alumno:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Listado de Materias:");

        MateriasInscriptasNoInscriptas.add(radioInscriptas);
        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        MateriasInscriptasNoInscriptas.add(radioNoInscriptas);
        radioNoInscriptas.setText("Materias no Inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        jTInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4 "
            }
        ));
        jScrollPane2.setViewportView(jTInscripcion);

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnularInscripcion.setText("Anular inscripsion");
        jBAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscripcionActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioInscriptas)
                        .addGap(70, 70, 70)
                        .addComponent(radioNoInscriptas)
                        .addGap(71, 71, 71))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jBInscribir)
                .addGap(52, 52, 52)
                .addComponent(jBAnularInscripcion)
                .addGap(51, 51, 51)
                .addComponent(jBSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioInscriptas)
                    .addComponent(radioNoInscriptas))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnularInscripcion)
                    .addComponent(jBSalir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
        borrarFilaTabla();
        radioNoInscriptas.setSelected(false);
        cargarDatosInscriptas();
       jBAnularInscripcion.setEnabled(true);
       jBInscribir.setEnabled(false);
    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed
      borrarFilaTabla();
      radioInscriptas.setSelected(false);
      cargaDatosNoInscriptas();
       jBAnularInscripcion.setEnabled(false);
       jBInscribir.setEnabled(true);
      
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        // TODO add your handling code here:
        
        int filaSeleccionada= jTInscripcion.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a=(Alumno)jboxAlumno.getSelectedItem();
            
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0 );
            String nombreMateria=(String)modelo.getValueAt(filaSeleccionada, 1);
            int anio=(Integer)modelo.getValueAt(filaSeleccionada, 2);
        
            Materia m=new Materia(idMateria,nombreMateria,anio,true);
        
            Inscripcion i=new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscripcionActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada=jTInscripcion.getSelectedRow();
        if(filaSeleccionada!= -1){
            Alumno a=(Alumno)jboxAlumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada,0);
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jBAnularInscripcionActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnularInscripcion;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTInscripcion;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<Alumno> jboxAlumno;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables

    

private void cargarAlumnos(){
    for(Alumno item: listaA){
        jboxAlumno.addItem(item);
        
    }
}
    
private void armarCabeceraTabla(){
    ArrayList<Object> filaCabecera = new ArrayList<>();
    
    filaCabecera.add("ID");
    filaCabecera.add("Nombre");
    filaCabecera.add("Año");
    for(Object it: filaCabecera){
        modelo.addColumn(it);
    }
    jTInscripcion.setModel(modelo);
    
}
    
    /*modelo.addColumn("ID");
    modelo.addColumn("Nombre");
    modelo.addColumn("Año");
    jTInscripcion.setModel(modelo);*/
 
 private void borrarFilaTabla(){
     int indice = modelo.getRowCount()-1;
     for( int i = indice;i >=0; i--){
         modelo.removeRow(i);
     }
 }
  private void cargaDatosNoInscriptas(){
      //borrarFilasTablas();
      
      Alumno selec = (Alumno)jboxAlumno.getSelectedItem();
      listaM =(ArrayList) inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());
      for(Materia m: listaM){
          modelo.addRow(new Object[]{m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
      }
  
  }
  private void cargarDatosInscriptas(){
      //borrarFilasTabla();
      Alumno selec=(Alumno)jboxAlumno.getSelectedItem();
      List <Materia> lista =(ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
      for(Materia m :lista){
          modelo.addRow(new Object[]{ m.getIdMateria(),m.getNombre(),m.getAnioMateria()});
          
      }
  }
  
}



