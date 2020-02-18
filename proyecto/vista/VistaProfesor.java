/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.vista;


import proyecto.controlador.Controlador;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class VistaProfesor extends javax.swing.JFrame {

    /**
     * Creates new form VistaCalendario
     */
    public VistaProfesor(Controlador controlador) {

        initComponents(controlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents(Controlador controlador) {

        btnCrearCalendario = new javax.swing.JButton();
        btnDudas = new javax.swing.JButton();
        btnMensajeDirecto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCalendarioCreados = new javax.swing.JList<>();
        labelCalendariosCreados = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCrearCalendario.setText("Crear calendario");
        btnCrearCalendario.addActionListener(controlador);

        btnDudas.setText("Dudas");

        btnMensajeDirecto.setText("Chat");
        btnMensajeDirecto.addActionListener(controlador);

        listaCalendarioCreados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Calendario PSP", "Calendario PMDM", "..." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaCalendarioCreados);

        labelCalendariosCreados.setText("Calendarios creados:");

        btnCerrarSesion.setText("Cerrar sesion");
        btnCerrarSesion.addActionListener(controlador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrarSesion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(btnCrearCalendario)
                            .addGap(18, 18, 18)
                            .addComponent(btnDudas)
                            .addGap(18, 18, 18)
                            .addComponent(btnMensajeDirecto))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelCalendariosCreados)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDudas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMensajeDirecto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(labelCalendariosCreados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCalendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearCalendarioActionPerformed

    private void btnMensajeDirectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajeDirectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMensajeDirectoActionPerformed

    /*
     * @param args the command line arguments
     */

    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
*/
        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProfesor().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCrearCalendario;
    private javax.swing.JButton btnDudas;
    private javax.swing.JButton btnMensajeDirecto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCalendariosCreados;
    private javax.swing.JList<String> listaCalendarioCreados;
    // End of variables declaration//GEN-END:variables


    public void actualizarCalendario(ArrayList<String> lista){
        listaCalendarioCreados.setModel(new javax.swing.AbstractListModel<String>() {
            ArrayList<String> strings = lista;
            public int getSize() {
                return strings.size(); }
            public String getElementAt(int i) {
                return strings.get(i); }
        });
    }



}

