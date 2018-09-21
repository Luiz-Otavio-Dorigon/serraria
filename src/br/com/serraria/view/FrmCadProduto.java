package br.com.serraria.view;

import javax.swing.JOptionPane;
import br.com.serraria.controller.ProdutoDB;
import br.com.serraria.model.Produto;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmCadProduto extends javax.swing.JInternalFrame {

    private FrmConsultaProduto telaConsulta;
    private boolean telaConsultaVisivel;
    private float contEsp, contLarg, contCompr;
    private boolean erro;
    String menssagemerro;

    public FrmCadProduto() {
        initComponents();
    }

    private void verificaEspecura() {
        if (txtEspecura.getText().equals("")) {
            contEsp = 0;
        } else {
            String auxQtd = txtEspecura.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contEsp = Float.parseFloat(auxQtd);
        }
    }

    private void verificaLargura() {
        if (txtLargura.getText().equals("")) {
            contLarg = 0;
        } else {
            String auxQtd = txtLargura.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contLarg = Float.parseFloat(auxQtd);
        }
    }

    private void verificaComprimento() {
        if (txtComprimento.getText().equals("")) {
            contCompr = 0;
        } else {
            String auxQtd = txtComprimento.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contCompr = Float.parseFloat(auxQtd);
        }
    }

    public void setTelaConsulta(FrmConsultaProduto telaConsulta, boolean telaConsultaVisivel) {
        this.telaConsulta = telaConsulta;
        this.telaConsultaVisivel = telaConsultaVisivel;
    }

    private void cancelar() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar a operação?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmCadProduto");
        }
    }

    private void cadastrar() {
        if (txtDescricao.getText().equals("") || txtEspecura.getText().equals("") || txtLargura.getText().equals("")
                || txtComprimento.getText().equals("")) {
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
                String descricao = txtDescricao.getText();
                Produto novoProduto = new Produto(descricao, contEsp, contLarg, contCompr);
                ProdutoDB produtodb = new ProdutoDB();
                boolean inseriu = produtodb.insereProduto(novoProduto);
                if (inseriu) {
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
                    txtDescricao.setText("");
                    txtEspecura.setText("");
                    txtLargura.setText("");
                    txtComprimento.setText("");
                    if (telaConsultaVisivel == true) {
                        telaConsulta.atualizaBusca(0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Erro no cadastro de Produto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro: " + menssagemerro);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtEspecura = new javax.swing.JTextField();
        txtLargura = new javax.swing.JTextField();
        txtComprimento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Novo Produto");
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

        jLabel1.setText("Descrição");

        jLabel2.setText("Espessura");

        jLabel3.setText("Largura");

        jLabel4.setText("Comprimento");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtLargura, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEspecura, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtComprimento, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCadastrar)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar))
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEspecura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnCancelar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmCadProduto");
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btnCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtComprimento;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEspecura;
    private javax.swing.JTextField txtLargura;
    // End of variables declaration//GEN-END:variables
}
