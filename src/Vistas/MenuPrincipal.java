/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Vistas.GestionDeMaterias;
import Vistas.GestiondeAlumnos;
import Vistas.ConsulltaDeAlumnosPorMateria;
import Vistas.ActualizacionDeNotas;
import Entidades.Alumno;
import java.awt.Color;
import static java.awt.Color.yellow;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.ImageIcon;

/**
 *
 * @author nacho
 */
public class MenuPrincipal extends javax.swing.JFrame{
public static ArrayList<Alumno>ListaAlumno = new ArrayList<>();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 520);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Recursos/Fondo.jpg"));
        Image miImagen = icono.getImage();
        jDEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMFormularioDeAlumnos = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMFormularioDeMateria = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMManejoDeInscripcioes = new javax.swing.JMenuItem();
        jMManipulacionDeNotas = new javax.swing.JMenuItem();
        jMAlumnosPorMateria = new javax.swing.JMenu();
        jmAlumnosPorMateria = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenuItem1.setText("jMenuItem1");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDEscritorio.setBackground(new java.awt.Color(102, 102, 255));
        jDEscritorio.setForeground(new java.awt.Color(0, 0, 255));
        jDEscritorio.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout jDEscritorioLayout = new javax.swing.GroupLayout(jDEscritorio);
        jDEscritorio.setLayout(jDEscritorioLayout);
        jDEscritorioLayout.setHorizontalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jDEscritorioLayout.setVerticalGroup(
            jDEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(java.awt.Color.white);

        jMFormularioDeAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/alumno_1.png"))); // NOI18N
        jMFormularioDeAlumnos.setText("Alumno");
        jMFormularioDeAlumnos.setContentAreaFilled(false);
        jMFormularioDeAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMFormularioDeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioDeAlumnosActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Formulario de Alumno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMFormularioDeAlumnos.add(jMenuItem2);

        jMenuBar1.add(jMFormularioDeAlumnos);

        jMFormularioDeMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/materia_1.png"))); // NOI18N
        jMFormularioDeMateria.setText("Materia");
        jMFormularioDeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioDeMateriaActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Formulario de Materia");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMFormularioDeMateria.add(jMenuItem3);

        jMenuBar1.add(jMFormularioDeMateria);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/administracion_1.png"))); // NOI18N
        jMenu8.setText("Administracion");

        jMManejoDeInscripcioes.setText("Manejo de Inscripciones");
        jMManejoDeInscripcioes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMManejoDeInscripcioesActionPerformed(evt);
            }
        });
        jMenu8.add(jMManejoDeInscripcioes);

        jMManipulacionDeNotas.setText("Manipulacion de Notas");
        jMManipulacionDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMManipulacionDeNotasActionPerformed(evt);
            }
        });
        jMenu8.add(jMManipulacionDeNotas);

        jMenuBar1.add(jMenu8);

        jMAlumnosPorMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/consultas_1.png"))); // NOI18N
        jMAlumnosPorMateria.setText("Consultas");
        jMAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumnosPorMateriaActionPerformed(evt);
            }
        });

        jmAlumnosPorMateria.setText("Alumnos por Materia");
        jmAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosPorMateriaActionPerformed(evt);
            }
        });
        jMAlumnosPorMateria.add(jmAlumnosPorMateria);

        jMenuBar1.add(jMAlumnosPorMateria);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir_1.png"))); // NOI18N
        jMenu10.setText("Salir");
        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMFormularioDeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioDeAlumnosActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        GestiondeAlumnos gda = new GestiondeAlumnos();
        gda.setVisible(true);
        gda.getContentPane().setBackground(yellow);
        jDEscritorio.add(gda);
        jDEscritorio.moveToFront(gda);
        
    }//GEN-LAST:event_jMFormularioDeAlumnosActionPerformed

    private void jMFormularioDeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioDeMateriaActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        GestionDeMaterias gdm = new GestionDeMaterias();
        gdm.setVisible(true);
        jDEscritorio.add(gdm);
        jDEscritorio.moveToFront(gdm);
    }//GEN-LAST:event_jMFormularioDeMateriaActionPerformed

    private void jMManejoDeInscripcioesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMManejoDeInscripcioesActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        Inscripciones ins = new Inscripciones();
        ins.setVisible(true);
        jDEscritorio.add(ins);
        jDEscritorio.moveToFront(ins);
    }//GEN-LAST:event_jMManejoDeInscripcioesActionPerformed

    private void jMManipulacionDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMManipulacionDeNotasActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ActualizacionDeNotas adn = new ActualizacionDeNotas();
        adn.setVisible(true);
        jDEscritorio.add(adn);
        jDEscritorio.moveToFront(adn);
    }//GEN-LAST:event_jMManipulacionDeNotasActionPerformed

    private void jMAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumnosPorMateriaActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ConsulltaDeAlumnosPorMateria cdapm = new ConsulltaDeAlumnosPorMateria();
        cdapm.setVisible(true);
        jDEscritorio.add(cdapm);
        jDEscritorio.moveToFront(cdapm);
    }//GEN-LAST:event_jMAlumnosPorMateriaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          jDEscritorio.removeAll();
        jDEscritorio.repaint();
        GestiondeAlumnos gda = new GestiondeAlumnos();
        gda.setVisible(true);
        jDEscritorio.add(gda);
        jDEscritorio.moveToFront(gda);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosPorMateriaActionPerformed
        jDEscritorio.removeAll();
        jDEscritorio.repaint();
        ConsulltaDeAlumnosPorMateria cdapm = new ConsulltaDeAlumnosPorMateria();
        cdapm.setVisible(true);
        jDEscritorio.add(cdapm);
        jDEscritorio.moveToFront(cdapm);
    }//GEN-LAST:event_jmAlumnosPorMateriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDEscritorio;
    private javax.swing.JMenu jMAlumnosPorMateria;
    private javax.swing.JMenu jMFormularioDeAlumnos;
    private javax.swing.JMenu jMFormularioDeMateria;
    private javax.swing.JMenuItem jMManejoDeInscripcioes;
    private javax.swing.JMenuItem jMManipulacionDeNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmAlumnosPorMateria;
    // End of variables declaration//GEN-END:variables


}
