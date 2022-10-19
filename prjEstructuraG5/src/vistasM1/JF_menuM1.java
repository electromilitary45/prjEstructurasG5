/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasM1;

import javax.swing.JOptionPane;
import prjestructurag5.JF_menuPrincipal;
import prjestructurag5.ListaES;
/**
 *
 * @author Derek
 */
public class JF_menuM1 extends javax.swing.JFrame {

    /**
     * Creates new form JF_menuM1
     */
    public JF_menuM1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ico_registroUsuario = new javax.swing.JLabel();
        ico_desactivarUsuario = new javax.swing.JLabel();
        ico_listarUsuarios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ico_retroceder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MENU USUARIOS"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ico_registroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_UsuRegistro128.png"))); // NOI18N
        ico_registroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_registroUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(ico_registroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        ico_desactivarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_UsuDesactivar128.png"))); // NOI18N
        ico_desactivarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_desactivarUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(ico_desactivarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        ico_listarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_lista128.png"))); // NOI18N
        ico_listarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_listarUsuariosMouseClicked(evt);
            }
        });
        jPanel1.add(ico_listarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DESACTIVAR USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MENU DE USUARIOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LISTAR USUARIOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("REGISTRAR USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_usuario24.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        ico_retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico_atras32.png"))); // NOI18N
        ico_retroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ico_retrocederMouseClicked(evt);
            }
        });
        jPanel1.add(ico_retroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ico_desactivarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_desactivarUsuarioMouseClicked
        // TODO add your handling code here:
        dispose();
        new JF_desactivarUsuario().setVisible(true);
    }//GEN-LAST:event_ico_desactivarUsuarioMouseClicked

    private void ico_listarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_listarUsuariosMouseClicked
        // TODO add your handling code here:
        ListaES LE = new ListaES();
        LE.mostrarUsuarios();
    }//GEN-LAST:event_ico_listarUsuariosMouseClicked

    private void ico_registroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_registroUsuarioMouseClicked
        // TODO add your handling code here:
        dispose();
        new JF_crearUsuario().setVisible(true);
    }//GEN-LAST:event_ico_registroUsuarioMouseClicked

    private void ico_retrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ico_retrocederMouseClicked
        // TODO add your handling code here:
        dispose();
        new JF_menuPrincipal().setVisible(true);
    }//GEN-LAST:event_ico_retrocederMouseClicked

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
            java.util.logging.Logger.getLogger(JF_menuM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_menuM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_menuM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_menuM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_menuM1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ico_desactivarUsuario;
    private javax.swing.JLabel ico_listarUsuarios;
    private javax.swing.JLabel ico_registroUsuario;
    private javax.swing.JLabel ico_retroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
