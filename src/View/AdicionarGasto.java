package View;

import Controller.CidadeController;
import Model.Cidade;
import java.util.ArrayList;
import java.util.List;

public class AdicionarGasto extends javax.swing.JFrame {
    List<Cidade> Cidades = new ArrayList<Cidade>();
    CidadeController controllerCidade = new CidadeController();
    
    public AdicionarGasto() {
        initComponents();
        
        // Transfere as cidades do banco para a lista de cidades da view
        Cidades.addAll(controllerCidade.GetAll());
        
        //Carregar combo com os estados
        for (Cidade cidade: Cidades) {
           cbCidade.addItem(cidade.getNome());            
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDistritoFederal = new javax.swing.ButtonGroup();
        tfGasto = new javax.swing.JFormattedTextField();
        btAddGasto = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        cbCidade = new javax.swing.JComboBox<>();
        jMenuBarSupeiror = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orçamento Nacional - Cadastro de Estado");

        tfGasto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor do Gasto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfGasto.setForeground(new java.awt.Color(0, 0, 102));
        tfGasto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        tfGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGastoActionPerformed(evt);
            }
        });

        btAddGasto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAddGasto.setForeground(new java.awt.Color(0, 0, 102));
        btAddGasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionar.png"))); // NOI18N
        btAddGasto.setText("ADICIONAR");
        btAddGasto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAddGasto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btAddGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddGastoActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Consolas", 1, 17)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lbTitulo.setText(" ORÇAMENTO NACIONAL - ADICIONAR GASTO");
        lbTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 0)));
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(0, 0, 102));
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancelar.png"))); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        cbCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbCidade.setForeground(new java.awt.Color(255, 255, 255));
        cbCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecionea Cidade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        cbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCidadeActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBarSupeiror);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfGasto)
                    .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAddGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar))
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAddGasto, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGastoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        cbCidade.setSelectedIndex(-1);   
        tfGasto.setText("");
        cbCidade.requestFocus();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCidadeActionPerformed
        
    }//GEN-LAST:event_cbCidadeActionPerformed

    private void btAddGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddGastoActionPerformed
        String nomeCidade = cbCidade.getSelectedItem().toString();
        float gasto = Float.parseFloat(tfGasto.getText());
        
        for(Cidade cidade : Cidades){
            if(cidade.getNome().equals(nomeCidade)){
                cidade.setGastos(cidade.getGastos() + gasto);
                controllerCidade.addGastoToCidade(cidade);
            }
        }
    }//GEN-LAST:event_btAddGastoActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarGasto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgDistritoFederal;
    private javax.swing.JButton btAddGasto;
    private javax.swing.JButton btCancelar;
    private javax.swing.JComboBox<Object> cbCidade;
    private javax.swing.JMenuBar jMenuBarSupeiror;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JFormattedTextField tfGasto;
    // End of variables declaration//GEN-END:variables
}
