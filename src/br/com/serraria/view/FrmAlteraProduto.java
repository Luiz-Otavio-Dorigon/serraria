package br.com.serraria.view;

import br.com.serraria.controller.ProdutoDB;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import br.com.serraria.model.Produto;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmAlteraProduto extends javax.swing.JInternalFrame {

    private FrmConsultaProduto telaConsulta;
    private boolean telaConsultaVisivel;
    private float contEsp, contLarg, contCompr;
    private boolean erro;
    String menssagemerro;

    public FrmAlteraProduto() {
        initComponents();

    }

    public void setTelaConsulta(FrmConsultaProduto telaConsulta, boolean telaConsultaVisivel) {
        this.telaConsulta = telaConsulta;
        this.telaConsultaVisivel = telaConsultaVisivel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        edtDescricao = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        edtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edtLargura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        edtComprimento = new javax.swing.JTextField();
        edtEspecura = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setTitle("Alterar Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        edtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtDescricaoKeyPressed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        btnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlterarKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        edtCodigo.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Largura");

        edtLargura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtLarguraKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Comprimento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Espessura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edtLargura, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtComprimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(edtEspecura))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addComponent(edtDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 59, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edtEspecura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificaEspecura() {
        if (edtEspecura.getText().equals("")) {
            contEsp = 0;
        } else {
            String auxQtd = edtEspecura.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contEsp = Float.parseFloat(auxQtd);
        }
    }

    private void verificaLargura() {
        if (edtLargura.getText().equals("")) {
            contLarg = 0;
        } else {
            String auxQtd = edtLargura.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contLarg = Float.parseFloat(auxQtd);
        }
    }

    private void verificaComprimento() {
        if (edtComprimento.getText().equals("")) {
            contCompr = 0;
        } else {
            String auxQtd = edtComprimento.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contCompr = Float.parseFloat(auxQtd);
        }
    }

    private void alterar() {
        if (edtDescricao.getText().equals("") || edtEspecura.getText().equals("") || edtLargura.getText().equals("")
                || edtComprimento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            verificaEspecura();
            if (contEsp == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Espessura inválida - ";
            }
            verificaLargura();
            if (contLarg == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Largura inválida - ";
            }
            verificaComprimento();
            if (contCompr == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Comprimento inválido - ";
            }
            if (!erro) {
                ProdutoDB produtodb = new ProdutoDB();
                Produto produto = new Produto(Integer.parseInt(edtCodigo.getText()), edtDescricao.getText(),
                        Float.parseFloat(edtEspecura.getText()),
                        Float.parseFloat(edtLargura.getText()), Float.parseFloat(edtComprimento.getText()));
                boolean alterou = produtodb.alteraProduto(produto);
                if (alterou) {
                    JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
                    if (telaConsultaVisivel == true) {
                        telaConsulta.atualizaBusca(0);
                    }
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro na alteração do produto!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro: " + menssagemerro);
            }
        }
    }

    public void setModel(Produto model) {
        edtCodigo.setText(String.valueOf(model.getCodigo()));
        edtDescricao.setText(model.getDescricao());
        edtEspecura.setText(String.valueOf(model.getEspecura()));
        edtLargura.setText(String.valueOf(model.getLargura()));
        edtComprimento.setText(String.valueOf(model.getComprimento()));
    }

    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmAlteraProduto");
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        sair();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alterar();
        }
        if (evt.getKeyChar() == 27) {
            sair();
        }
    }//GEN-LAST:event_btnAlterarKeyPressed

    private void edtLarguraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLarguraKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alterar();
        }
        if (evt.getKeyChar() == 27) {
            sair();
        }
    }//GEN-LAST:event_edtLarguraKeyPressed

    private void edtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alterar();
        }
        if (evt.getKeyChar() == 27) {
            sair();
        }
    }//GEN-LAST:event_edtDescricaoKeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmAlteraProduto");
    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField edtCodigo;
    private javax.swing.JTextField edtComprimento;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtEspecura;
    private javax.swing.JTextField edtLargura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
