package br.com.serraria.view;

import br.com.serraria.util.ResultSetTableModel;
import br.com.serraria.controller.TorasZequinhaDB;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public final class FrmConsultaCargas extends javax.swing.JInternalFrame {

    JTextField edtCodigo = new JTextField();
    JTextField edtNome = new JTextField();
    JTextField edtData = new JTextField();
    JTextField edtTipo = new JTextField();
    JTextField edtPeso = new JTextField();
    JTextField edtValor = new JTextField();
    JTextField edtValorPago = new JTextField();
    JTextField edtTotal = new JTextField();
    JTextField edtTotalGeral = new JTextField();
    private int inicio = 0;
    private final int termina = 29;
    
    public FrmConsultaCargas() {
        initComponents();
        atualizaBusca(0);
    }

    public void atualizaBusca(int tipo) {
        TorasZequinhaDB torasdb = new TorasZequinhaDB();
        if (torasdb.getTotalRegistros() <= termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(false);
        } else if (inicio >= torasdb.getTotalRegistros()-termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(true);
        } else if (inicio <= 0) {
            btnProximo.setEnabled(true);
            btnAnterior.setEnabled(false);
        }
        ResultSetTableModel tabela;
        if (tipo == 1) {
            tabela = torasdb.getConsultas(cbCampo.getSelectedIndex(), cbTipo.getSelectedIndex(), edtBusca.getText());
        } else {
            tabela = torasdb.getToras(inicio, termina);
        }
        tbGride.getTableHeader().setReorderingAllowed(false);
        tbGride.setModel(tabela);
        tbGride.getColumn("Código").setPreferredWidth(100);
        tbGride.getColumn("Nome").setPreferredWidth(450);
        tbGride.getColumn("Data").setPreferredWidth(150);
        tbGride.getColumn("Tipo").setPreferredWidth(100);
        tbGride.getColumn("Peso").setPreferredWidth(100);
        tbGride.getColumn("Valor").setPreferredWidth(100);
        tbGride.getColumn("Valor Pago").setPreferredWidth(110);
        tbGride.getColumn("Total").setPreferredWidth(110);
        tbGride.getColumn("Total Geral").setPreferredWidth(120);
        tbGride.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGride = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbCampo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        edtBusca = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta de Cargas");
        setToolTipText("");
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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
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

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Campo");

        cbCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "CNPJ" }));

        jLabel2.setText("Tipo");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Igual", "Inicia Com", "Termina Com", "Contém" }));
        cbTipo.setSelectedIndex(1);

        jLabel3.setText("Descrição");

        edtBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtBuscaKeyPressed(evt);
            }
        });

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
                .addComponent(cbCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTodos)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(edtBusca)
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
                    .addComponent(jLabel3)
                    .addComponent(btnTodos))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnProximo.setText("Próximo >>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnAnterior.setText("<< Anterior");
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
                    .addComponent(btnExcluir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnProximo)))
                .addContainerGap(812, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbGrideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGrideMouseClicked
        int linha = tbGride.getSelectedRow();
        if (linha >= 0) {
            edtCodigo.setText(tbGride.getValueAt(linha, 0).toString());
            edtNome.setText(tbGride.getValueAt(linha, 1).toString());
            edtData.setText(tbGride.getValueAt(linha, 2).toString());
            edtTipo.setText(tbGride.getValueAt(linha, 3).toString());
            edtPeso.setText(tbGride.getValueAt(linha, 4).toString());
            edtValor.setText(tbGride.getValueAt(linha, 5).toString());
            edtValorPago.setText(tbGride.getValueAt(linha, 6).toString());
            edtTotal.setText(tbGride.getValueAt(linha, 7).toString());
            edtTotalGeral.setText(tbGride.getValueAt(linha, 8).toString());
        }
        if (evt.getClickCount() == 2) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmConsultaCargas");
        }
    }//GEN-LAST:event_tbGrideMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (edtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        } else {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a linha selecionada", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                ResultSetTableModel modelo = (ResultSetTableModel) tbGride.getModel(); //Selecionando o modelo do grid com as colunas e linhas montadas
                modelo.removeControleToras(Integer.parseInt(edtCodigo.getText()));//Removendo a linha selecionada
                atualizaBusca(0);
                edtCodigo.setText("");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void edtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizaBusca(1);
        }
    }//GEN-LAST:event_edtBuscaKeyPressed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        atualizaBusca(0);
        edtCodigo.setText(null);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmConsultaCargas");
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        inicio += termina;
        atualizaBusca(0);
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        inicio -= termina;
        atualizaBusca(0);
    }//GEN-LAST:event_btnAnteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnExcluir;
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
    private javax.swing.JTable tbGride;
    // End of variables declaration//GEN-END:variables
}
