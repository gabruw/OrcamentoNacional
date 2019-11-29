package View;

import Controller.CidadeController;
import Model.Cidade;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bibim
 */
public class ConsultaCidadeClima extends javax.swing.JFrame {

    /**
     * Creates new form cadastrarEstado
     */
    public ConsultaCidadeClima() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCidades = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        tfClima = new javax.swing.JTextField();
        btListar1 = new javax.swing.JButton();
        cbClima = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orçamento Nacional - Cadastro de Estado");

        tabelaCidades.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 102)));
        tabelaCidades.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaCidades.setForeground(new java.awt.Color(0, 0, 102));
        tabelaCidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "População", "Clima", "Gastos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCidades.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabelaCidades);
        tabelaCidades.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lbTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 102));
        lbTitulo.setText("ORÇAMENTO NACIONAL - CONSULTA DE CIDADES POR CLIMA");
        lbTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 0, 0)));
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(0, 0, 102));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisarCopia.png"))); // NOI18N
        btPesquisar.setText("PESQUISAR");
        btPesquisar.setFocusable(false);
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btPesquisar.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btPesquisar.setMaximumSize(new java.awt.Dimension(49, 43));
        btPesquisar.setMinimumSize(new java.awt.Dimension(100, 45));
        btPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPesquisarMouseClicked(evt);
            }
        });
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        tfClima.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfClima.setForeground(new java.awt.Color(0, 0, 102));
        tfClima.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Clima:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        tfClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClimaActionPerformed(evt);
            }
        });

        btListar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btListar1.setForeground(new java.awt.Color(0, 0, 102));
        btListar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisarCopia.png"))); // NOI18N
        btListar1.setText("LISTAR TODAS AS CIDADES");
        btListar1.setFocusable(false);
        btListar1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btListar1.setMargin(new java.awt.Insets(2, 8, 2, 8));
        btListar1.setMaximumSize(new java.awt.Dimension(49, 43));
        btListar1.setMinimumSize(new java.awt.Dimension(100, 45));
        btListar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btListar1MouseClicked(evt);
            }
        });
        btListar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListar1ActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
                    .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfClima, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbClima, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(98, 98, 98)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btListar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btListar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfClima, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addComponent(cbClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarMouseClicked

    }//GEN-LAST:event_btPesquisarMouseClicked

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        readClima(cbClima.getSelectedItem().toString());
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tfClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClimaActionPerformed

    private void btListar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btListar1MouseClicked

    }//GEN-LAST:event_btListar1MouseClicked

    private void btListar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListar1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabelaCidades.getModel();
        CidadeController cidadeDAO = new CidadeController();
        cidadeDAO.GetAllTable(model);
    }//GEN-LAST:event_btListar1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaCidadeClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaCidadeClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaCidadeClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaCidadeClima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ConsultaCidadeClima().setVisible(true);
            }
        });
    }
    
    public void readClima(String clima) {
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaCidades.getModel();
        modelo.setNumRows(0);
        CidadeController cidadeDAO = new CidadeController();

        for (Cidade cidade : cidadeDAO.GetAllClima(clima)) {

            modelo.addRow(new Object[]{
                    cidade.getNome(),
                    cidade.getPopulacao(),
                    cidade.getClima(),
                    cidade.getGastos(),});

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListar1;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JComboBox cbClima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTable tabelaCidades;
    private javax.swing.JTextField tfClima;
    // End of variables declaration//GEN-END:variables
}
