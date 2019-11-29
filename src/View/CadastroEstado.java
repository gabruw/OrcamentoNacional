package View;

import Controller.EstadoController;
import Model.Estado;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroEstado extends javax.swing.JFrame {
    public CadastroEstado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDistritoFederal = new javax.swing.ButtonGroup();
        tfSigla = new javax.swing.JTextField();
        tfNomeEstado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rbTrue = new javax.swing.JRadioButton();
        rbFalse = new javax.swing.JRadioButton();
        lbTitulo = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        tfOrcamento = new javax.swing.JTextField();
        tfGastos = new javax.swing.JTextField();
        jMenuBarSupeiror = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orçamento Nacional - Cadastro de Estado");
        setMinimumSize(new java.awt.Dimension(500, 500));

        tfSigla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfSigla.setForeground(new java.awt.Color(0, 0, 102));
        tfSigla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sigla:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfSigla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSiglaActionPerformed(evt);
            }
        });

        tfNomeEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfNomeEstado.setForeground(new java.awt.Color(0, 0, 102));
        tfNomeEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Estado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfNomeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeEstadoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Distrito Federal:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        rbTrue.setBackground(new java.awt.Color(255, 255, 255));
        bgDistritoFederal.add(rbTrue);
        rbTrue.setForeground(new java.awt.Color(0, 0, 102));
        rbTrue.setText("Sim");
        rbTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTrueActionPerformed(evt);
            }
        });

        rbFalse.setBackground(new java.awt.Color(255, 255, 255));
        bgDistritoFederal.add(rbFalse);
        rbFalse.setForeground(new java.awt.Color(0, 0, 102));
        rbFalse.setText("Não");
        rbFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFalseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbTrue)
                .addGap(18, 18, 18)
                .addComponent(rbFalse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbTrue)
                .addComponent(rbFalse))
        );

        lbTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lbTitulo.setText("ORÇAMENTO NACIONAL - CADASTRO DE ESTADOS");
        lbTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 0)));
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(0, 0, 102));
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/adicionar.png"))); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btEditar.setForeground(new java.awt.Color(0, 0, 102));
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/control.png"))); // NOI18N
        btEditar.setText("EDITAR");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(0, 0, 102));
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registroEncomenda.png"))); // NOI18N
        btAtualizar.setText("ATUALIZAR");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btRemover.setForeground(new java.awt.Color(0, 0, 102));
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/excluir.png"))); // NOI18N
        btRemover.setText("REMOVER");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        tfOrcamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfOrcamento.setForeground(new java.awt.Color(0, 0, 102));
        tfOrcamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orçamento Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOrcamentoActionPerformed(evt);
            }
        });

        tfGastos.setEditable(false);
        tfGastos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfGastos.setForeground(new java.awt.Color(0, 0, 102));
        tfGastos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gastos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGastosActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBarSupeiror);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfOrcamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbTitulo)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfOrcamento)
                    .addComponent(tfGastos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTrueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTrueActionPerformed

    private void rbFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFalseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFalseActionPerformed

    private void tfSiglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSiglaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSiglaActionPerformed

    private void tfNomeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeEstadoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
     try {
         Estado estado = new Estado();
         EstadoController estadoDAO = new EstadoController();
         
         for(Estado est : estadoDAO.GetAllDevedor()){
             if(est.getNome().equals(estado.getNome())){
                    JOptionPane.showMessageDialog(null, "Este estado está devendo e não pode conter mais cidades");
                    return;
                };
         }
         
         estado.setNome(tfNomeEstado.getText());
         estado.setSigla(tfSigla.getText());
         estado.setDistritoFederal(comparaDistrito());
         estado.setOrcamentoTotal(Float.parseFloat(tfOrcamento.getText()));
         estado.setGastosTotais(0);
         
         estadoDAO.Include(estado);
         JOptionPane.showMessageDialog(null, "Dados salvos com sucesso! \n");
     } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!\n" + ex);
        }         
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRemoverActionPerformed

    private void tfOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOrcamentoActionPerformed

    private void tfGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGastosActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEstado().setVisible(true);
            }
        });
    }
     
    public byte comparaDistrito(){
        // 1 para Sim e 0 para Não
        byte resultado = 0;
        
        if (rbTrue.isSelected()) {
            return resultado = 1;
        } else if (rbFalse.isSelected()) {
            return  resultado = 0;
        }
        
        return resultado;     
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgDistritoFederal;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRemover;
    private javax.swing.JMenuBar jMenuBarSupeiror;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton rbFalse;
    private javax.swing.JRadioButton rbTrue;
    private javax.swing.JTextField tfGastos;
    private javax.swing.JTextField tfNomeEstado;
    private javax.swing.JTextField tfOrcamento;
    private javax.swing.JTextField tfSigla;
    // End of variables declaration//GEN-END:variables
}
