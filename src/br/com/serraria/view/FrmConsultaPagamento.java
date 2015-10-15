package br.com.serraria.view;

import br.com.serraria.controller.PagamentoDB;
import br.com.serraria.util.ResultSetTableModel;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public final class FrmConsultaPagamento extends javax.swing.JInternalFrame {

    JTextField edtCodigo = new JTextField();
    JTextField edtData = new JTextField();
    JTextField edtPago = new JTextField();
    JTextField edtNome = new JTextField();
    private final int inicio = 0, termina = 29;
    
    public FrmConsultaPagamento() {
        initComponents();
        atualizaBusca(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGride = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbCampo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        lblBusca = new javax.swing.JLabel();
        edtBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTodos = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Pagamento");
        setPreferredSize(new java.awt.Dimension(1034, 786));
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

        tbGride.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbGride.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbGride.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGrideMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGride);

        jLabel1.setText("Campo");

        cbCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Data", "Valor Pago", "Clinete" }));

        jLabel2.setText("Tipo");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Igual", "Inicia Com", "Termina Com", "Contém" }));
        cbTipo.setSelectedIndex(1);

        edtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtBuscaKeyPressed(evt);
            }
        });

        jLabel3.setText("Descrição");

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBusca)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(edtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBusca)
                    .addComponent(jLabel3)
                    .addComponent(btnTodos))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Novo Pagamento");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnProximo.setText("Próximo>>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnterior)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaBusca(int tipo) {
        PagamentoDB pagamentodb = new PagamentoDB();
        if (pagamentodb.getTotalRegistros() <= termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(false);
        } else if (inicio >= pagamentodb.getTotalRegistros()-termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(true);
        } else if (inicio <= 0) {
            btnProximo.setEnabled(true);
            btnAnterior.setEnabled(false);
        }
        ResultSetTableModel tabela;
        if (tipo == 1) {
            tabela = pagamentodb.getConsultar(cbCampo.getSelectedIndex(), cbTipo.getSelectedIndex(), edtBusca.getText());
        } else {
            tabela = pagamentodb.getPagamentos(inicio, termina);
        }
        tbGride.getTableHeader().setReorderingAllowed(false);
        tbGride.setModel(tabela);
        tbGride.getColumn("Código Pagamento").setPreferredWidth(155);
        tbGride.getColumn("Data").setPreferredWidth(205);
        tbGride.getColumn("Cliente").setPreferredWidth(155);
        tbGride.getColumn("Nome").setPreferredWidth(655);
        tbGride.getColumn("Valor Pago").setPreferredWidth(160);
        tbGride.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    private void tbGrideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGrideMouseClicked
        int linha = tbGride.getSelectedRow();
        if (linha >= 0) {
            edtCodigo.setText(tbGride.getValueAt(linha, 0).toString());
            edtData.setText(tbGride.getValueAt(linha, 1).toString());
            edtPago.setText(tbGride.getValueAt(linha, 2).toString());
            edtNome.setText(tbGride.getValueAt(linha, 4).toString());
        }
        if (evt.getClickCount() == 2) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmConsultaPagamento");
        }
    }//GEN-LAST:event_tbGrideMouseClicked

    private void edtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizaBusca(1);
        }
    }//GEN-LAST:event_edtBuscaKeyPressed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        atualizaBusca(0);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        FrmPagamentoCliente form = (FrmPagamentoCliente) FrmPrincipal.janelas.get("FrmPagamentoCliente");
        if (form == null){
            form = new FrmPagamentoCliente();
            form.setTelaConsultaPagamento(this, true);
            this.getDesktopPane().add(form);
            form.setVisible(true);
            FrmPrincipal.janelas.put("FrmPagamentoCliente", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmConsultaPagamento");
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
    }//GEN-LAST:event_btnAnteriorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnTodos;
    private javax.swing.JComboBox cbCampo;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JTextField edtBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JTable tbGride;
    // End of variables declaration//GEN-END:variables
}
