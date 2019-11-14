package View;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.BLACK);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarSupeiror = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jCheckBoxMenuItemCidade = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemEstado = new javax.swing.JCheckBoxMenuItem();
        jSeparatorCadastro = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItemSair = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastro.setText("Cadastro");

        jCheckBoxMenuItemCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jCheckBoxMenuItemCidade.setText("Cidade");
        jCheckBoxMenuItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemCidadeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCheckBoxMenuItemCidade);

        jCheckBoxMenuItemEstado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jCheckBoxMenuItemEstado.setText("Estado");
        jCheckBoxMenuItemEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemEstadoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCheckBoxMenuItemEstado);
        jMenuCadastro.add(jSeparatorCadastro);

        jCheckBoxMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItemSair.setText("Sair");
        jCheckBoxMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jCheckBoxMenuItemSair);

        jMenuBarSupeiror.add(jMenuCadastro);

        setJMenuBar(jMenuBarSupeiror);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItemEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemEstadoActionPerformed
        
    }//GEN-LAST:event_jCheckBoxMenuItemEstadoActionPerformed

    private void jCheckBoxMenuItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemCidadeActionPerformed
        
    }//GEN-LAST:event_jCheckBoxMenuItemCidadeActionPerformed

    private void jCheckBoxMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jCheckBoxMenuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemCidade;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemEstado;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemSair;
    private javax.swing.JMenuBar jMenuBarSupeiror;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JPopupMenu.Separator jSeparatorCadastro;
    // End of variables declaration//GEN-END:variables
}
