package br.com.serraria.view;

import br.com.serraria.controller.ClienteDB;
import br.com.serraria.controller.PagamentoDB;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.serraria.model.Cliente;
import br.com.serraria.model.EmpresaSelecionada;
import br.com.serraria.model.Pagamento;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmPagamentoCliente extends javax.swing.JInternalFrame {

    private FrmConsultaPagamento telaConsultaPagamento;
    private boolean telaConsultaVisivel;
    String dataMySQL;
    String menssagem = "";

    public FrmPagamentoCliente() {
        initComponents();
    }

    public void setTelaConsultaPagamento(FrmConsultaPagamento telaConsultaPagamento, boolean telaConsultaVisivel) {
        this.telaConsultaPagamento = telaConsultaPagamento;
        this.telaConsultaVisivel = telaConsultaVisivel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edtCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        edtDivida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edtPagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        edtData = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Pagamentos de Clientes");
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

        edtCliente.setEditable(false);

        btnBuscar.setText("...");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Divida");

        edtDivida.setEditable(false);

        jLabel3.setText("Pagar");

        edtPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtPagarKeyPressed(evt);
            }
        });

        jLabel4.setText("Nome");

        jLabel1.setText("Cliente");

        edtNome.setEditable(false);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        btnConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmarKeyPressed(evt);
            }
        });

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

        jLabel5.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtDivida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar))
                        .addComponent(edtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edtDivida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(edtPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean verificaData() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date datas = edtData.getDate();
        String data = formato.format(datas.getTime());
        dataMySQL = data;
        return false;
    }

    public boolean pagar() {
        boolean erro = false;
        if (edtData.getDate() == null && edtPagar.getText().equals("")) {
            erro = true;
            menssagem = menssagem + "Preencha todos os campos - ";
        }
        if (!erro) {
            if (edtPagar.getText().equals("")) {
                erro = true;
                menssagem = menssagem + "Informe o valor a ser pago - ";
            }
            if (edtData.getDate() == null) {
                erro = true;
                menssagem = menssagem + "Informe a data - ";
            }
        }
        if (!erro) {
            verificaData();
            float totalDivida = 0, valor, auxDivida = Float.parseFloat(edtDivida.getText());

            String auxValor = edtPagar.getText();
            int achou = 0, cont = 0;
            int contador = auxValor.length();
            for (int i = 0; i < contador; i++) {
                if (auxValor.substring(i, i + 1).equals("R") || auxValor.substring(i, i + 1).equals("r")
                        || auxValor.substring(i, i + 1).equals("$") || auxValor.substring(i, i + 1).equals("S")
                        || auxValor.substring(i, i + 1).equals("s")) {
                    achou = achou + 1;
                }
            }
            if (achou == 0) {
                auxValor = auxValor.replaceAll(",", ".");
                valor = Float.parseFloat(auxValor);
                if (auxDivida != 0) {
                    if (valor <= auxDivida) {
                        totalDivida = Float.parseFloat(edtDivida.getText()) - valor;
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor pago não pode ser maior que a dívida");
                        cont = 1;
                    }
                    if (cont == 0) {
                        DecimalFormat nf = new DecimalFormat(".###");
                        nf.format(totalDivida);
                        Cliente alterarDivida = new Cliente(totalDivida, Integer.parseInt(edtCliente.getText()));
                        PagamentoDB pagamentodb = new PagamentoDB();
                        Pagamento inserPagamento = new Pagamento(dataMySQL, Integer.parseInt(edtCliente.getText()), valor, EmpresaSelecionada.getInstance().getEmpresa().getCodigo());
                        boolean inserepagamento = pagamentodb.inserePagamento(inserPagamento);
                        ClienteDB clientedb = new ClienteDB();
                        boolean alteraCliente = clientedb.alteraDivida(alterarDivida);

                        if (alteraCliente && inserepagamento) {
                            JOptionPane.showMessageDialog(null, "Pago com sucesso");
                            if (telaConsultaVisivel == true) {
                                telaConsultaPagamento.atualizaBusca(0);
                            }
                            edtCliente.setText("");
                            edtNome.setText("");
                            edtDivida.setText("");
                            edtPagar.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro no pagamento");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não possui dívidas");
                    edtCliente.setText("");
                    edtNome.setText("");
                    edtDivida.setText("");
                    edtPagar.setText("");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Informar somente números no campo pagar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro: " + menssagem);
            menssagem = "";
        }
        return false;
    }

    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja relamente cancelar?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmPagamentoCliente");
        }
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        FrmConsultaCliente form = new FrmConsultaCliente();
        form.edtCodigo = edtCliente;
        form.edtNome = edtNome;
        form.edtDivida = edtDivida;
        this.getDesktopPane().add(form);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmPagamentoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        pagar();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        sair();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void edtPagarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPagarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pagar();
        }
    }//GEN-LAST:event_edtPagarKeyPressed

    private void btnConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pagar();
        }
    }//GEN-LAST:event_btnConfirmarKeyPressed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyChar() == 27) {
            sair();
        }
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmPagamentoCliente");
    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JTextField edtCliente;
    private com.toedter.calendar.JDateChooser edtData;
    private javax.swing.JTextField edtDivida;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
