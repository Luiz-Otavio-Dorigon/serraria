package br.com.serraria.view;

import br.com.serraria.controller.ItensRomaneioDB;
import br.com.serraria.controller.ProdutoDB;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.com.serraria.model.ItensRomaneio;
import br.com.serraria.model.Produto;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmAlteraItens extends javax.swing.JInternalFrame {

    boolean erro;
    public int numero;
    private FrmConsultaItensRomaneio telaConsulta;
    JTextField proCodigo = new JTextField();

    public FrmAlteraItens() {
        initComponents();
        btnAlterar.setEnabled(false);
    }
    
    public void setTelaConsulta(FrmConsultaItensRomaneio telaConsulta ) {
        this.telaConsulta = telaConsulta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        edtNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edtEspecura = new javax.swing.JTextField();
        edtLargura = new javax.swing.JTextField();
        edtComprimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edtPecas = new javax.swing.JTextField();
        edtMetros = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        btnRecalcular = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        edtSequencia = new javax.swing.JTextField();
        btnBuscaProduto = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Alterar Itens do Romaneio");
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Número Romaneio");

        edtNumero.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Valor");

        edtValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtValorMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descrição Produto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Espessura");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Largura");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Comprimento");

        edtEspecura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtEspecuraMouseClicked(evt);
            }
        });
        edtEspecura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtEspecuraKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtEspecuraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtEspecuraKeyReleased(evt);
            }
        });

        edtLargura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtLarguraMouseClicked(evt);
            }
        });

        edtComprimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtComprimentoMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Peças");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Metros");

        edtPecas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edtPecasMouseClicked(evt);
            }
        });

        edtMetros.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Total");

        edtTotal.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Unidade");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M³", "M²", "PC" }));
        cbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTipoMouseClicked(evt);
            }
        });

        btnRecalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRecalcular.setText("Recalcular");
        btnRecalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecalcularActionPerformed(evt);
            }
        });
        btnRecalcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRecalcularKeyPressed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        btnCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCancelarKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sequência");

        edtSequencia.setEditable(false);

        btnBuscaProduto.setText("...");
        btnBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(edtSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscaProduto))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(edtComprimento))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRecalcular)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnAlterar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnCancelar))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edtMetros)
                                        .addComponent(edtPecas))
                                    .addGap(40, 40, 40)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(edtEspecura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(edtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(edtSequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaProduto))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtEspecura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edtPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(edtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar)
                    .addComponent(btnRecalcular))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean buscarProduto() {
        FrmConsultaProduto form = new FrmConsultaProduto();
        form.txtDescricao = edtDescricao;
        form.txtCodigo = proCodigo;
        form.txtEspecura = edtEspecura;
        form.txtLargura = edtLargura;
        form.txtComprimento = edtComprimento;
        this.getDesktopPane().add(form);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmCadRomaneio.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
        return false;
    }
    
    private boolean verivicaCampos() {
        if (edtComprimento.getText().equals("") || edtDescricao.getText().equals("") || edtEspecura.getText().equals("") || edtLargura.getText().equals("")
                || edtMetros.getText().equals("") || edtNumero.getText().equals("") || edtPecas.getText().equals("") || edtSequencia.getText().equals("")
                || edtTotal.getText().equals("") || edtValor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos");
            erro = false;
        } else {
            erro = true;
        }
        return false;
    }

    public void setModel(ItensRomaneio model) {
        ProdutoDB produtodb = new ProdutoDB();
        Produto produto = produtodb.getConsultar(model.getProCodigo());
        edtEspecura.setText(String.valueOf(produto.getEspecura()));
        edtLargura.setText(String.valueOf(produto.getLargura()));
        edtComprimento.setText(String.valueOf(produto.getComprimento()));
        edtNumero.setText(String.valueOf(model.getNumeroRomaneio()));
        edtSequencia.setText(String.valueOf(model.getSequencia()));
        proCodigo.setText(String.valueOf(model.getProCodigo()));
        edtDescricao.setText(String.valueOf(model.getProduto()));
        edtValor.setText(String.valueOf(model.getValorUnit()));
        edtPecas.setText(String.valueOf(model.getNumPecas()));
        edtMetros.setText(String.valueOf(model.getMetros()));
        edtTotal.setText(String.valueOf(model.getTotal()));
        String tipo = String.valueOf(model.getTipo());
        switch (tipo) {
            case "M³":
                cbTipo.setSelectedIndex(0);
                break;
            case "M²":
                cbTipo.setSelectedIndex(1);
                break;
            case "PC":
                cbTipo.setSelectedIndex(2);
                break;
        }
    }

    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cancelar a operação?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmAlteraItens");
        }
    }

    private void alterar() {
        ItensRomaneioDB itensromaneiodb = new ItensRomaneioDB();
        ItensRomaneio itens = new ItensRomaneio(
                Integer.parseInt(edtNumero.getText()),
                Integer.parseInt(edtSequencia.getText()),
                Integer.parseInt(proCodigo.getText()),
                Float.parseFloat(edtValor.getText()),
                Float.parseFloat(edtEspecura.getText()),
                Float.parseFloat(edtLargura.getText()),
                Float.parseFloat(edtComprimento.getText()),
                Integer.parseInt(edtPecas.getText()),
                Float.parseFloat(edtMetros.getText()),
                Float.parseFloat(edtTotal.getText()),
                String.valueOf(edtDescricao.getText()),
                String.valueOf(cbTipo.getSelectedItem()));
        boolean alterou = itensromaneiodb.alteraItens(itens);
        if (alterou) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            telaConsulta.atualizaTela(numero);
            telaConsulta.alteraRomaneio();
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Erro na alteração");
        }
    }
    
    private void recalcular(){
        verivicaCampos();
        int contPecas, tipo;
        float contEsp, contLarg, contCompr, quantidade, contValor, metros = 0, totalProduto = 0;
        if (erro == true) {
            String auxQtd = edtPecas.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            quantidade = Float.parseFloat(auxQtd);
            if (quantidade % 1 != 0) {
                JOptionPane.showMessageDialog(null, "Quantidade deve ser inteira");
            } else {
                contPecas = Integer.parseInt(edtPecas.getText());

                String auxEsp = edtEspecura.getText();
                auxEsp = auxEsp.replaceAll(",", ".");
                contEsp = Float.parseFloat(auxEsp);

                String auxLarg = edtLargura.getText();
                auxLarg = auxLarg.replaceAll(",", ".");
                contLarg = Float.parseFloat(auxLarg);

                String auxCompr = edtComprimento.getText();
                auxCompr = auxCompr.replaceAll(",", ".");
                contCompr = Float.parseFloat(auxCompr);

                String auxValor = edtValor.getText();
                auxValor = auxValor.replaceAll(",", ".");
                contValor = Float.parseFloat(auxValor);
                
                tipo = cbTipo.getSelectedIndex();
                if (tipo == 0){
                    metros = (float) (contEsp * contLarg * contCompr * contPecas * 0.000001);
                    totalProduto = (float) (metros * contValor * 0.001);
                }
                else if (tipo == 1){
                    metros = (float) (contLarg * contCompr * contPecas * 0.00001);
                    totalProduto = (float) (metros * contValor * 0.01);
                }
                else if (tipo == 2){
                    metros = (float) (contCompr * contPecas * 0.001);
                    totalProduto = contPecas * contValor;
                }
            }
            edtMetros.setText(String.valueOf(metros));
            edtTotal.setText(String.valueOf(totalProduto));
            btnAlterar.setEnabled(true);
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

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyChar() == 27) {
            sair();
        }
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void btnRecalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecalcularActionPerformed
        recalcular();
    }//GEN-LAST:event_btnRecalcularActionPerformed

    private void btnRecalcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRecalcularKeyPressed
        recalcular();
    }//GEN-LAST:event_btnRecalcularKeyPressed

    private void edtEspecuraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtEspecuraMouseClicked
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_edtEspecuraMouseClicked

    private void edtEspecuraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEspecuraKeyPressed
    }//GEN-LAST:event_edtEspecuraKeyPressed

    private void edtLarguraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtLarguraMouseClicked
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_edtLarguraMouseClicked

    private void edtComprimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtComprimentoMouseClicked
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_edtComprimentoMouseClicked

    private void edtPecasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtPecasMouseClicked
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_edtPecasMouseClicked

    private void edtValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtValorMouseClicked
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_edtValorMouseClicked

    private void cbTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTipoMouseClicked
        btnAlterar.setEnabled(false);
    }//GEN-LAST:event_cbTipoMouseClicked

    private void edtEspecuraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEspecuraKeyReleased
    }//GEN-LAST:event_edtEspecuraKeyReleased

    private void edtEspecuraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtEspecuraKeyTyped
    }//GEN-LAST:event_edtEspecuraKeyTyped

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmAlteraItens");
    }//GEN-LAST:event_formInternalFrameClosing

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void btnBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdutoActionPerformed
        buscarProduto();
    }//GEN-LAST:event_btnBuscaProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscaProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRecalcular;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JTextField edtComprimento;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtEspecura;
    private javax.swing.JTextField edtLargura;
    private javax.swing.JTextField edtMetros;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtPecas;
    private javax.swing.JTextField edtSequencia;
    private javax.swing.JTextField edtTotal;
    private javax.swing.JTextField edtValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
