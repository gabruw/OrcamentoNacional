
package View;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    
          
    
    public Principal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
      
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mnMenuPrincipal = new javax.swing.JMenuBar();
        mnOperacoes = new javax.swing.JMenu();
        btCadEstado = new javax.swing.JMenuItem();
        mnCidade = new javax.swing.JMenu();
        mnCadCidade = new javax.swing.JMenuItem();
        mnAddGasto = new javax.swing.JMenuItem();
        SeparadorCadastro1 = new javax.swing.JPopupMenu.Separator();
        mnSairCad1 = new javax.swing.JMenuItem();
        SeparadorCadastro = new javax.swing.JPopupMenu.Separator();
        mnSairCad = new javax.swing.JMenuItem();
        mnOperacoes1 = new javax.swing.JMenu();
        mnConsultaClima = new javax.swing.JMenuItem();
        SeparadorConsultas = new javax.swing.JPopupMenu.Separator();
        mnSairCons = new javax.swing.JMenuItem();
        mnOperacoes2 = new javax.swing.JMenu();
        mnListaEstado = new javax.swing.JMenuItem();
        mnListaEstadoDevedor = new javax.swing.JMenuItem();
        mnListaCidade = new javax.swing.JMenuItem();
        SeparadorControle = new javax.swing.JPopupMenu.Separator();
        mnSairControl = new javax.swing.JMenuItem();
        mnAjuda = new javax.swing.JMenu();
        mnAjudaSobre = new javax.swing.JMenuItem();
        SeparadorSobre = new javax.swing.JPopupMenu.Separator();
        mnSairAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lbLogo.setForeground(new java.awt.Color(255, 255, 255));
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/LogoOrçamento.png"))); // NOI18N
        jPanel1.add(lbLogo, java.awt.BorderLayout.CENTER);

        jLabel1.setText("https://www.flaticon.com/search?word=package&style_id=28");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        mnMenuPrincipal.setForeground(new java.awt.Color(153, 153, 255));
        mnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnMenuPrincipal.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        mnMenuPrincipal.setMargin(new java.awt.Insets(0, 0, 2, 0));

        mnOperacoes.setForeground(new java.awt.Color(0, 0, 102));
        mnOperacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionar.png"))); // NOI18N
        mnOperacoes.setText("CADASTROS");
        mnOperacoes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btCadEstado.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        btCadEstado.setForeground(new java.awt.Color(0, 0, 102));
        btCadEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarUsario.png"))); // NOI18N
        btCadEstado.setText("ESTADO");
        btCadEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadEstadoActionPerformed(evt);
            }
        });
        mnOperacoes.add(btCadEstado);

        mnCidade.setForeground(new java.awt.Color(0, 0, 102));
        mnCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionar.png"))); // NOI18N
        mnCidade.setText("CIDADE OPÇÕES");
        mnCidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mnCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCidadeActionPerformed(evt);
            }
        });

        mnCadCidade.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnCadCidade.setForeground(new java.awt.Color(0, 0, 102));
        mnCadCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarUsario.png"))); // NOI18N
        mnCadCidade.setText("CIDADE");
        mnCadCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadCidadeActionPerformed(evt);
            }
        });
        mnCidade.add(mnCadCidade);

        mnAddGasto.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnAddGasto.setForeground(new java.awt.Color(0, 0, 102));
        mnAddGasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/adicionarUsario.png"))); // NOI18N
        mnAddGasto.setText("ADICIONAR GASTO");
        mnAddGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAddGastoActionPerformed(evt);
            }
        });
        mnCidade.add(mnAddGasto);
        mnCidade.add(SeparadorCadastro1);

        mnSairCad1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnSairCad1.setForeground(new java.awt.Color(153, 0, 0));
        mnSairCad1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair.png"))); // NOI18N
        mnSairCad1.setText("SAIR");
        mnSairCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairCad1ActionPerformed(evt);
            }
        });
        mnCidade.add(mnSairCad1);

        mnOperacoes.add(mnCidade);
        mnOperacoes.add(SeparadorCadastro);

        mnSairCad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnSairCad.setForeground(new java.awt.Color(153, 0, 0));
        mnSairCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair.png"))); // NOI18N
        mnSairCad.setText("SAIR");
        mnSairCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairCadActionPerformed(evt);
            }
        });
        mnOperacoes.add(mnSairCad);

        mnMenuPrincipal.add(mnOperacoes);

        mnOperacoes1.setForeground(new java.awt.Color(0, 0, 102));
        mnOperacoes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        mnOperacoes1.setText("CONSULTA");
        mnOperacoes1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        mnConsultaClima.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnConsultaClima.setForeground(new java.awt.Color(0, 0, 102));
        mnConsultaClima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisarCopia.png"))); // NOI18N
        mnConsultaClima.setText("POR CLIMA");
        mnConsultaClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultaClimaActionPerformed(evt);
            }
        });
        mnOperacoes1.add(mnConsultaClima);
        mnOperacoes1.add(SeparadorConsultas);

        mnSairCons.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnSairCons.setForeground(new java.awt.Color(153, 0, 0));
        mnSairCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair.png"))); // NOI18N
        mnSairCons.setText("SAIR");
        mnSairCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairConsActionPerformed(evt);
            }
        });
        mnOperacoes1.add(mnSairCons);

        mnMenuPrincipal.add(mnOperacoes1);

        mnOperacoes2.setForeground(new java.awt.Color(0, 0, 102));
        mnOperacoes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/control.png"))); // NOI18N
        mnOperacoes2.setText("LISTAGEM");
        mnOperacoes2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        mnListaEstado.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnListaEstado.setForeground(new java.awt.Color(0, 0, 102));
        mnListaEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/controleEncomenda.png"))); // NOI18N
        mnListaEstado.setText("ESTADO");
        mnListaEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListaEstadoActionPerformed(evt);
            }
        });
        mnOperacoes2.add(mnListaEstado);

        mnListaEstadoDevedor.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnListaEstadoDevedor.setForeground(new java.awt.Color(0, 0, 102));
        mnListaEstadoDevedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/controleEncomenda.png"))); // NOI18N
        mnListaEstadoDevedor.setText("ESTADOS DEVEDORES");
        mnListaEstadoDevedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListaEstadoDevedorActionPerformed(evt);
            }
        });
        mnOperacoes2.add(mnListaEstadoDevedor);

        mnListaCidade.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnListaCidade.setForeground(new java.awt.Color(0, 0, 102));
        mnListaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/controleEncomenda.png"))); // NOI18N
        mnListaCidade.setText("CIDADE");
        mnListaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListaCidadeActionPerformed(evt);
            }
        });
        mnOperacoes2.add(mnListaCidade);
        mnOperacoes2.add(SeparadorControle);

        mnSairControl.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnSairControl.setForeground(new java.awt.Color(153, 0, 0));
        mnSairControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair.png"))); // NOI18N
        mnSairControl.setText("SAIR");
        mnSairControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairControlActionPerformed(evt);
            }
        });
        mnOperacoes2.add(mnSairControl);

        mnMenuPrincipal.add(mnOperacoes2);

        mnAjuda.setForeground(new java.awt.Color(0, 0, 102));
        mnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ajuda.png"))); // NOI18N
        mnAjuda.setText("AJUDA");
        mnAjuda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        mnAjudaSobre.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnAjudaSobre.setForeground(new java.awt.Color(0, 0, 102));
        mnAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sobre.png"))); // NOI18N
        mnAjudaSobre.setText("SOBRE");
        mnAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAjudaSobreActionPerformed(evt);
            }
        });
        mnAjuda.add(mnAjudaSobre);
        mnAjuda.add(SeparadorSobre);

        mnSairAjuda.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        mnSairAjuda.setForeground(new java.awt.Color(153, 0, 0));
        mnSairAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sair.png"))); // NOI18N
        mnSairAjuda.setText("SAIR");
        mnSairAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairAjudaActionPerformed(evt);
            }
        });
        mnAjuda.add(mnSairAjuda);

        mnMenuPrincipal.add(mnAjuda);

        setJMenuBar(mnMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(828, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void mnSairCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairCadActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSairCadActionPerformed

    private void btCadEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadEstadoActionPerformed
       new CadastroEstado().setVisible(true);

    }//GEN-LAST:event_btCadEstadoActionPerformed

    private void mnSairConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairConsActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSairConsActionPerformed

    private void mnSairControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairControlActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSairControlActionPerformed

    private void mnSairAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairAjudaActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSairAjudaActionPerformed

    private void mnConsultaClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultaClimaActionPerformed
       new ConsultaCidadeClima().setVisible(true);
    }//GEN-LAST:event_mnConsultaClimaActionPerformed

    private void mnListaEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListaEstadoActionPerformed
        new ListaEstado().setVisible(true);
    }//GEN-LAST:event_mnListaEstadoActionPerformed

    private void mnAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAjudaSobreActionPerformed
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String header = ("\n══════════════════════════════════════════════\n");
        String aluno1 = ("\nALUNO (A): BIANCA MORAIS SOUZA");
        String aluno2 = ("\nALUNO (A): GABRIEL MARQUES FRANÇA");
        String tema = ("\nTEMA:ORÇAMENTO NACIONAL");
        String disciplina = ("\nDISCIPLINA: LABORATÓRIO DE PROGRAMAÇÃO DE PERSISTÊNCIA DE OBJETOS ");
        String data = ("\nDATA ATUAL:" + f.format(new Date()));
        JOptionPane.showMessageDialog(null,(header + aluno1 + aluno2 + tema + disciplina + data + header), "SOBRE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnAjudaSobreActionPerformed

    private void mnListaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListaCidadeActionPerformed
        new ListaCidade().setVisible(true);
    }//GEN-LAST:event_mnListaCidadeActionPerformed

    private void mnListaEstadoDevedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListaEstadoDevedorActionPerformed
        new ListaDevedores().setVisible(true);
    }//GEN-LAST:event_mnListaEstadoDevedorActionPerformed

    private void mnSairCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairCad1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSairCad1ActionPerformed

    private void mnAddGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAddGastoActionPerformed
        new AdicionarGasto().setVisible(true);
    }//GEN-LAST:event_mnAddGastoActionPerformed

    private void mnCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCidadeActionPerformed
      
    }//GEN-LAST:event_mnCidadeActionPerformed

    private void mnCadCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadCidadeActionPerformed
       new CadastroCidade().setVisible(true);
    }//GEN-LAST:event_mnCadCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator SeparadorCadastro;
    private javax.swing.JPopupMenu.Separator SeparadorCadastro1;
    private javax.swing.JPopupMenu.Separator SeparadorConsultas;
    private javax.swing.JPopupMenu.Separator SeparadorControle;
    private javax.swing.JPopupMenu.Separator SeparadorSobre;
    private javax.swing.JMenuItem btCadEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JMenuItem mnAddGasto;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenuItem mnAjudaSobre;
    private javax.swing.JMenuItem mnCadCidade;
    private javax.swing.JMenu mnCidade;
    private javax.swing.JMenuItem mnConsultaClima;
    private javax.swing.JMenuItem mnListaCidade;
    private javax.swing.JMenuItem mnListaEstado;
    private javax.swing.JMenuItem mnListaEstadoDevedor;
    private javax.swing.JMenuBar mnMenuPrincipal;
    private javax.swing.JMenu mnOperacoes;
    private javax.swing.JMenu mnOperacoes1;
    private javax.swing.JMenu mnOperacoes2;
    private javax.swing.JMenuItem mnSairAjuda;
    private javax.swing.JMenuItem mnSairCad;
    private javax.swing.JMenuItem mnSairCad1;
    private javax.swing.JMenuItem mnSairCons;
    private javax.swing.JMenuItem mnSairControl;
    // End of variables declaration//GEN-END:variables
}
