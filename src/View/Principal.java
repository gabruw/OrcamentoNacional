package View;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;

public class Principal extends javax.swing.JFrame {
    Cidade jPanelCidade = new Cidade();
    Estado jPanelEstado = new Estado();
     
    public Principal() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        
        // JPanel Cidade
        jPanelCidade.setSize(100, 100);
        jPanelCidade.setVisible(false);
        this.add(jPanelCidade);
        
        // JPanel Estado
        jPanelEstado.setSize(100, 100);
        jPanelEstado.setVisible(false);
        this.add(jPanelEstado);
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuBarSupeiror = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jRadioButtonMenuItemCidade = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItemEstado = new javax.swing.JRadioButtonMenuItem();
        jSeparatorCadastro = new javax.swing.JPopupMenu.Separator();
        jRadioButtonMenuItemSair = new javax.swing.JRadioButtonMenuItem();

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastro.setText("Cadastro");

        jRadioButtonMenuItemCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItemCidade.setSelected(true);
        jRadioButtonMenuItemCidade.setText("Cidade");
        jRadioButtonMenuItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemCidadeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jRadioButtonMenuItemCidade);

        jRadioButtonMenuItemEstado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItemEstado.setSelected(true);
        jRadioButtonMenuItemEstado.setText("Estado");
        jRadioButtonMenuItemEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemEstadoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jRadioButtonMenuItemEstado);
        jMenuCadastro.add(jSeparatorCadastro);

        jRadioButtonMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jRadioButtonMenuItemSair.setSelected(true);
        jRadioButtonMenuItemSair.setText("Sair");
        jRadioButtonMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jRadioButtonMenuItemSair);

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

    private void jRadioButtonMenuItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemCidadeActionPerformed
        jPanelCidade.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItemCidadeActionPerformed

    private void jRadioButtonMenuItemEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemEstadoActionPerformed
        jPanelEstado.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItemEstadoActionPerformed

    private void jRadioButtonMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItemSairActionPerformed

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
    private javax.swing.JMenuBar jMenuBarSupeiror;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemCidade;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemEstado;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemSair;
    private javax.swing.JPopupMenu.Separator jSeparatorCadastro;
    // End of variables declaration//GEN-END:variables
}
