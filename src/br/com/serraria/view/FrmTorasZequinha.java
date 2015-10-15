package br.com.serraria.view;

import br.com.serraria.controller.TorasZequinhaDB;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.com.serraria.model.TorasZequinha;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmTorasZequinha extends javax.swing.JInternalFrame {

    boolean erro = false;
    String menssagem = "", dataMySQL;
    float contPeso = 0, contValor = 0, contValorPago = 0;

    public FrmTorasZequinha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edtData = new com.toedter.calendar.JDateChooser();
        edtPeso = new javax.swing.JTextField();
        edtValor = new javax.swing.JTextField();
        edtTotal = new javax.swing.JTextField();
        edtValorPago = new javax.swing.JTextField();
        edtTotalGeral = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox();
        btnCalcular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        edtCliente = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        btnBuscaCliente = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Controle Toras Zequinha");
        setToolTipText("Toras Zequinha");
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Peso/Litros");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor Unit");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Valor Pago");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Total Geral");

        edtTotal.setEditable(false);

        edtValorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtValorPagoKeyPressed(evt);
            }
        });

        edtTotalGeral.setEditable(false);
        edtTotalGeral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtTotalGeralKeyPressed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Carga", "Cheque", "Óleo" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        btnCalcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCalcularKeyPressed(evt);
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

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cliente");

        edtCliente.setEditable(false);
        edtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtClienteActionPerformed(evt);
            }
        });

        edtNome.setEditable(false);
        edtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNomeActionPerformed(evt);
            }
        });

        btnBuscaCliente.setText("...");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscaCliente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel2))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtTotalGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCancelar))))
                                .addContainerGap(63, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCliente)
                    .addComponent(jLabel8)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edtTotalGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(edtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificaData() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date datas = edtData.getDate();
        String data = formato.format(datas.getTime());
        dataMySQL = data;
    }

    private void verificaValores() {
        String auxPeso = edtPeso.getText();
        auxPeso = auxPeso.replaceAll(",", ".");
        contPeso = Float.parseFloat(auxPeso);

        String auxValor = edtValor.getText();
        auxValor = auxValor.replaceAll(",", ".");
        contValor = Float.parseFloat(auxValor);

        String auxValorPago = edtValorPago.getText();
        auxValorPago = auxValorPago.replaceAll(",", ".");
        contValorPago = Float.parseFloat(auxValorPago);
    }

    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja cancelar a operação?", "Sair de " + title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmTorasZequinha");
        }

    }

    private void calcular() {

        NumberFormat nf = new DecimalFormat(".##");

        int tipo = cbTipo.getSelectedIndex();
        if (tipo == 0) {
            if (edtData.getDate() == null || edtPeso.getText().equals("") || edtValor.getText().equals("") || edtValorPago.getText().equals("")) {
                erro = true;
                menssagem = menssagem + "Preencher todos os campos - ";
            }
            if (!erro) {
                verificaValores();
                float totalGeral, total;

                total = contPeso * (contValor * -1);
                totalGeral = total + contValorPago;

                edtTotal.setText(String.valueOf(nf.format(total)));
                edtTotalGeral.setText(String.valueOf(nf.format(totalGeral)));
            } else {
                JOptionPane.showMessageDialog(null, "Erro: " + menssagem);
                menssagem = "";
                erro = false;
            }

        } else if (tipo == 1) {
            if (edtData.getDate() == null || edtValor.getText().equals("") || edtValorPago.getText().equals("")) {
                erro = true;
                menssagem = menssagem + "Preencher todos os campos - ";
            }
            if (!erro) {
                verificaValores();
                float totalGeral, total;

                total = contValor;
                totalGeral = total - contValorPago;

                edtTotal.setText(String.valueOf(total));
                edtTotalGeral.setText(String.valueOf(totalGeral));
            } else {
                JOptionPane.showMessageDialog(null, "Erro: " + menssagem);
                menssagem = "";
                erro = false;
            }
        } else if (tipo == 2) {
            if (edtData.getDate() == null || edtPeso.getText().equals("") || edtValor.getText().equals("") || edtValorPago.getText().equals("")) {
                erro = true;
                menssagem = menssagem + "Preencher todos os campos - ";
            }
            if (!erro) {
                verificaValores();
                float totalGeral, total;

                total = contPeso * contValor;
                totalGeral = total - contValorPago;

                edtTotal.setText(String.valueOf(total));
                edtTotalGeral.setText(String.valueOf(totalGeral));
            } else {
                JOptionPane.showMessageDialog(null, "Erro: " + menssagem);
                menssagem = "";
                erro = false;
            }
        }
    }

    private void finalizar() {
        if (edtData.getDate() == null || edtPeso.getText().equals("") || edtValor.getText().equals("") || edtValorPago.getText().equals("")
                || edtTotal.getText().equals("") || edtTotalGeral.getText().equals("") || edtCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos");
        } else {
            verificaData();
            verificaValores();
            String data = dataMySQL, tipo = cbTipo.getSelectedItem().toString();

            String auxTotal = edtTotal.getText();
            auxTotal = auxTotal.replaceAll(",", ".");
            float total = Float.parseFloat(auxTotal);

            String auxTotalGeral = edtTotalGeral.getText();
            auxTotalGeral = auxTotalGeral.replaceAll(",", ".");
            float totalGeral = Float.parseFloat(auxTotalGeral);

            TorasZequinhaDB torasdb = new TorasZequinhaDB();
            TorasZequinha toras = new TorasZequinha(data, tipo, contPeso, contValor, contValorPago, total, totalGeral, Integer.parseInt(edtCliente.getText()));
            boolean inseriu = torasdb.insereControleToras(toras);
            if (inseriu) {
                JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                if (cbTipo.getSelectedIndex() != 1) {
                    edtPeso.setText("");
                    edtValorPago.setText("");
                }
                edtTotal.setText("");
                edtTotalGeral.setText("");
                edtValor.setText("");
                edtCliente.setText("");
                edtNome.setText("");
                edtData.setDate(null);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao finalizar");
            }
        }
    }

    public void buscaCliente() {
        FrmConsultaCliente form = new FrmConsultaCliente();
        form.edtCodigo = edtCliente;
        form.edtNome = edtNome;
        this.getDesktopPane().add(form);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmPagamentoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        sair();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCancelarKeyPressed
        int resposta = 0;
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JOptionPane.showConfirmDialog(null, "Deseja cancelar a operação?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                sair();
            }
        }
        if (evt.getKeyChar() == 27) {
            JOptionPane.showConfirmDialog(null, "Deseja cancelar a operação?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                sair();
            }
        }
    }//GEN-LAST:event_btnCancelarKeyPressed

    private void edtTotalGeralKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtTotalGeralKeyPressed
        if (evt.getKeyChar() == 27) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cancelar a operação?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                sair();
            }
        }
    }//GEN-LAST:event_edtTotalGeralKeyPressed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        int tipo = cbTipo.getSelectedIndex();
        if (tipo == 0) {
            edtValorPago.setEnabled(true);
            edtValorPago.setText("");
            edtPeso.setEnabled(true);
            edtPeso.setText("");
        } else if (tipo == 1) {
            edtValorPago.setEnabled(false);
            edtValorPago.setText("0");
            edtPeso.setEnabled(false);
            edtPeso.setText("0");
        } else if (tipo == 2) {
            edtValorPago.setEnabled(true);
            edtValorPago.setText("");
            edtPeso.setEnabled(true);
            edtPeso.setText("");
        }
    }//GEN-LAST:event_cbTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        finalizar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edtValorPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtValorPagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcular();
        }
    }//GEN-LAST:event_edtValorPagoKeyPressed

    private void btnCalcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCalcularKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcular();
        }
    }//GEN-LAST:event_btnCalcularKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finalizar();
        }
        if (evt.getKeyChar() == 27) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja cancelar a operação?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                sair();
            }
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmTorasZequinha");;
    }//GEN-LAST:event_formInternalFrameClosing

    private void edtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtClienteActionPerformed
    }//GEN-LAST:event_edtClienteActionPerformed

    private void edtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNomeActionPerformed
    }//GEN-LAST:event_edtNomeActionPerformed

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        buscaCliente();
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JTextField edtCliente;
    private com.toedter.calendar.JDateChooser edtData;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtPeso;
    private javax.swing.JTextField edtTotal;
    private javax.swing.JTextField edtTotalGeral;
    private javax.swing.JTextField edtValor;
    private javax.swing.JTextField edtValorPago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
