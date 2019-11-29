package View;

import Controller.CidadeController;
import Controller.EstadoController;
import Main.HibernateUtil;
import Model.Cidade;
import Model.Estado;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CadastroCidade extends javax.swing.JFrame {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.getCurrentSession();
    Transaction lx = session.beginTransaction();

    public CadastroCidade() {
        initComponents();
        
        //Carregar combo com os estados
        EstadoController daoEstado = new EstadoController();
        for (Estado estado : daoEstado.GetAll()) {
            cbUF.addItem(estado);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNome = new javax.swing.JTextField();
        tfPopulacao = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        cbClima = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNome.setForeground(new java.awt.Color(0, 0, 102));
        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        tfPopulacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfPopulacao.setForeground(new java.awt.Color(0, 0, 102));
        tfPopulacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "População", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfPopulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPopulacaoActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(0, 0, 102));
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/adicionar.png"))); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lbTitulo.setText("ORÇAMENTO NACIONAL - CADASTRO DE CIDADES");
        lbTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 0)));
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbUF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbUF.setForeground(new java.awt.Color(255, 255, 255));
        cbUF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione a UF:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        cbUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUFActionPerformed(evt);
            }
        });

        cbClima.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbClima.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Equatorial", "Tropical", "Semiárido", "Subtropical" }));
        cbClima.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Clima:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfPopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbClima, 0, 119, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPopulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbClima, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfPopulacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPopulacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPopulacaoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {
            Cidade cidade = new Cidade();
            
            CidadeController cidadeDAO = new CidadeController();
            EstadoController estadoDAO = new EstadoController();
            
            cidade.setNome(tfNome.getText());
            Estado estado = estadoDAO.GetAll().get(cbUF.getSelectedIndex());
            cidade.setIdEstado(estado.getId());
            
            for(Cidade cdd : cidadeDAO.GetAllCidadesFromEstado(cidade)){
                if(cdd.getNome().equals(cidade.getNome())){
                    JOptionPane.showMessageDialog(null, "Já existe uma cidade com este nome");
                    return;
                };
            }
            
            cidade.setClima(cbClima.getSelectedItem().toString());
            cidade.setPopulacao(Integer.parseInt(tfPopulacao.getText()));            

            cidadeDAO.Include(cidade);
            
            int status = JOptionPane.showConfirmDialog(null, "Dados da cidade salvos com sucesso! Deseja adicionar gastos para esta cidade?\n", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_OPTION) {
                new AdicionarGasto().setVisible(true);
            } else if (status == JOptionPane.NO_OPTION) {
                this.dispose();
            }            
        } catch (NumberFormatException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados da cidade!\n" + ex);
        }

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cbUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUFActionPerformed

    }//GEN-LAST:event_cbUFActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCidade().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JComboBox cbClima;
    private javax.swing.JComboBox<Object> cbUF;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPopulacao;
    // End of variables declaration//GEN-END:variables
}
