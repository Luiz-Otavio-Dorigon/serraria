package br.com.serraria.view;

import br.com.serraria.util.ResultSetTableModel;
import br.com.serraria.controller.RomaneioDB;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static br.com.serraria.view.FrmPrincipal.janelas;
import javax.swing.JTable;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public final class FrmConsultaRomaneio extends JInternalFrame {

    public int numero;
    JTextField edtNumero = new JTextField();
    JTextField edtData = new JTextField();
    JTextField edtTotal = new JTextField();
    JTextField edtNome = new JTextField();
    JTextField edtCliente = new JTextField();
    private int inicio = 0;
    private final int termina = 29;

    public FrmConsultaRomaneio() {
        initComponents();
        atualizaBusca(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbCampo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        lblBusca = new javax.swing.JLabel();
        edtBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGride = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovoItem = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Conssultar Romaneio");
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

        jLabel1.setText("Campo");

        cbCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Numero", "Data", "Valor Pago", "Valor Total", "Clinete" }));

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
                        .addComponent(edtBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)))
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

        tbGride.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
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
        tbGride.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbGrideKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbGride);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovoItem.setText("Novo Item");
        btnNovoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoItemActionPerformed(evt);
            }
        });

        btnProximo.setText("Próxima >>");
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovoItem))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnVisualizar)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovoItem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarNovoItemRomaneio() {
        FrmNovoItemRomaneio form = (FrmNovoItemRomaneio) FrmPrincipal.janelas.get("FrmNovoItemRomaneio");
        if (form == null) {
            if (tbGride.getSelectedRow() >= 0) {
                form = new FrmNovoItemRomaneio();
                form.codigoRomaneio = Integer.parseInt(edtNumero.getText());
                form.codigoCliente = Integer.parseInt(edtCliente.getText());
                this.getDesktopPane().add(form);
                form.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um romaneio");
            }
            janelas.put("FrmNovoItemRomaneio", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }

    public void atualizaBusca(int tipo) {
        RomaneioDB romaneiodb = new RomaneioDB();
        if (romaneiodb.getTotalRegistros() <= termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(false);
        } else if (inicio >= romaneiodb.getTotalRegistros()-termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(true);
        } else if (inicio <= 0) {
            btnProximo.setEnabled(true);
            btnAnterior.setEnabled(false);
        }
        ResultSetTableModel tabela;
        if (tipo == 1) {
            tabela = romaneiodb.getConsultar(cbCampo.getSelectedIndex(), cbTipo.getSelectedIndex(), edtBusca.getText());
        } else {
            tabela = romaneiodb.getRomaneios(inicio, termina);
        }
        tbGride.getTableHeader().setReorderingAllowed(false);
        tbGride.setModel(tabela);
        tbGride.getColumn("Número Romaneio").setPreferredWidth(135);
        tbGride.getColumn("Cliente").setPreferredWidth(105);
        tbGride.getColumn("Nome").setPreferredWidth(506);
        tbGride.getColumn("Data").setPreferredWidth(200);
        tbGride.getColumn("Valor Pago").setPreferredWidth(200);
        tbGride.getColumn("Valor Total").setPreferredWidth(200);
        tbGride.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    private void edtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizaBusca(1);
        }
    }//GEN-LAST:event_edtBuscaKeyPressed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        atualizaBusca(0);
        edtNumero.setText("");
    }//GEN-LAST:event_btnTodosActionPerformed

    private void tbGrideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGrideMouseClicked
        int linha = tbGride.getSelectedRow();
        if (linha >= 0) {
            edtNumero.setText(tbGride.getValueAt(linha, 0).toString());
            edtData.setText(tbGride.getValueAt(linha, 3).toString());
            edtTotal.setText(tbGride.getValueAt(linha, 5).toString());
            edtCliente.setText(tbGride.getValueAt(linha, 1).toString());
            edtNome.setText(tbGride.getValueAt(linha, 2).toString());
        }
        if (evt.getClickCount() == 2) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmConsultaRomaneio");
        }
    }//GEN-LAST:event_tbGrideMouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        FrmCadRomaneio form = (FrmCadRomaneio) FrmPrincipal.janelas.get("frmCadRomaneio");
        if (form == null) {
            form = new FrmCadRomaneio();
            form.setTelaConsulta(this, true);
            this.getDesktopPane().add(form);
            form.setVisible(true);
            form.setPosicao();
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        FrmProgresso form = new FrmProgresso();
        if (tbGride.getSelectedRow() >= 0) {
            form.codigoRomaneio = Integer.parseInt(edtNumero.getText());
            form.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um romaneio");
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void tbGrideKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbGrideKeyPressed
    }//GEN-LAST:event_tbGrideKeyPressed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (edtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um romaneio");
        } else {
            FrmConsultaItensRomaneio form = new FrmConsultaItensRomaneio();
            form.atualizaTela(Integer.parseInt(edtNumero.getText()));
            form.cliCodigo = Integer.parseInt(edtCliente.getText());
            this.getDesktopPane().add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmConsultaRomaneio.class.getName()).log(Level.SEVERE, null, ex);
            }
            form.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmConsultaRomaneio");
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoItemActionPerformed
        buscarNovoItemRomaneio();
    }//GEN-LAST:event_btnNovoItemActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        inicio +=termina;
        atualizaBusca(0);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        inicio -=termina;
        atualizaBusca(0);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnNovoItem;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnVisualizar;
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
