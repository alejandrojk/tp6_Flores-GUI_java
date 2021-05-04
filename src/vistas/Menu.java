/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Directorio;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {
    private Directorio directorio=new Directorio();

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMbuscarTelefono = new javax.swing.JMenuItem();
        jMEditar = new javax.swing.JMenu();
        jMagregarCliente = new javax.swing.JMenuItem();
        jMborrarCliente = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        jMenu1.setText("Buscar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMbuscarTelefono.setText("Buscar cliente por telefono");
        jMbuscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbuscarTelefonoActionPerformed(evt);
            }
        });
        jMenu1.add(jMbuscarTelefono);

        jMenuBar1.add(jMenu1);

        jMEditar.setText("Editar");
        jMEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEditarActionPerformed(evt);
            }
        });

        jMagregarCliente.setText("Agregar cliente");
        jMagregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMagregarClienteActionPerformed(evt);
            }
        });
        jMEditar.add(jMagregarCliente);

        jMborrarCliente.setText("Borrar cliente");
        jMborrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMborrarClienteActionPerformed(evt);
            }
        });
        jMEditar.add(jMborrarCliente);

        jMenuBar1.add(jMEditar);

        jMSalir.setText("Salir");
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMEditarActionPerformed

    private void jMagregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMagregarClienteActionPerformed
      escritorio.removeAll();
      escritorio.repaint();
      ViewAgregarCliente vac = new ViewAgregarCliente(directorio);
      vac.setVisible(true);
      escritorio.add(vac);
      escritorio.moveToFront(vac);
    }//GEN-LAST:event_jMagregarClienteActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMbuscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbuscarTelefonoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewBuscarClientes vbc = new ViewBuscarClientes(directorio);
        vbc.show();
        escritorio.add(vbc);
        escritorio.moveToFront(vbc);
    }//GEN-LAST:event_jMbuscarTelefonoActionPerformed

    private void jMborrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMborrarClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewBorrarCliente vbCliente = new ViewBorrarCliente(directorio);
        vbCliente.show();
        escritorio.add(vbCliente);
        escritorio.moveToFront(vbCliente);
    }//GEN-LAST:event_jMborrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMEditar;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuItem jMagregarCliente;
    private javax.swing.JMenuItem jMborrarCliente;
    private javax.swing.JMenuItem jMbuscarTelefono;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
