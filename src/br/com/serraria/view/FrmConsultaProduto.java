package br.com.serraria.view;

import br.com.serraria.controller.ProdutoDB;
import br.com.serraria.util.ResultSetTableModel;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.com.serraria.model.Produto;
import javax.swing.JTable;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmConsultaProduto extends javax.swing.JInternalFrame {

    public JTextField txtCodigo = new JTextField();
    public JTextField txtDescricao = new JTextField();
    public JTextField txtEspecura = new JTextField();
    public JTextField txtLargura = new JTextField();
    public JTextField txtComprimento = new JTextField();
    private int inicio = 0, termina = 29;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrmConsultaProduto() {
        initComponents();
        atualizaBusca(0);
    }

    public void atualizaBusca(int tipo) {
        ProdutoDB produtodb = new ProdutoDB();
        if (produtodb.getTotalRegistros() <= termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(false);
        } else if (inicio >= produtodb.getTotalRegistros()-termina) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(true);
        } else if (inicio <= 0) {
            btnProximo.setEnabled(true);
            btnAnterior.setEnabled(false);
        }
        ResultSetTableModel tabela;
        if (tipo == 1) {
            tabela = produtodb.getConsultas(cbCampo.getSelectedIndex(), cbTipo.getSelectedIndex(), edtBusca.getText());
        } else {
            tabela = produtodb.getProdutos(inicio, termina);
        }
        tbGride.getTableHeader().setReorderingAllowed(false);
        tbGride.setModel(tabela);
        tbGride.getColumn("Código").setPreferredWidth(100);
        tbGride.getColumn("Descrição").setPreferredWidth(600);
        tbGride.getColumn("Espeçúra").setPreferredWidth(180);
        tbGride.getColumn("Largura").setPreferredWidth(300);
        tbGride.getColumn("Comprimento").setPreferredWidth(150);
        tbGride.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    private Produto getModelSelecionado() {
        Produto produto = new Produto();
        int linha = tbGride.getSelectedRow();
        if (linha >= 0) {
            produto.setCodigo((int) tbGride.getValueAt(linha, 0));
            produto.setDescricao(tbGride.getValueAt(linha, 1).toString());
            produto.setEspecura((float) tbGride.getValueAt(linha, 2));
            produto.setLargura((float) tbGride.getValueAt(linha, 3));
            produto.setComprimento((float) tbGride.getValueAt(linha, 4));
        }
        return produto;
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
        jLabel3 = new javax.swing.JLabel();
        edtBusca = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Produto");
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

        tbGride.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        cbCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Descrição" }));
        cbCampo.setSelectedIndex(1);

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

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnProximo)))
                .addContainerGap(771, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtBuscaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            atualizaBusca(1);
        }
    }//GEN-LAST:event_edtBuscaKeyPressed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tbGrideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGrideMouseClicked
        int linha = tbGride.getSelectedRow();
        if (linha >= 0) {
            txtCodigo.setText(tbGride.getValueAt(linha, 0).toString());
            txtDescricao.setText(tbGride.getValueAt(linha, 1).toString());
            txtEspecura.setText(tbGride.getValueAt(linha, 2).toString());
            txtLargura.setText(tbGride.getValueAt(linha, 3).toString());
            txtComprimento.setText(tbGride.getValueAt(linha, 4).toString());
        }
        if (evt.getClickCount() == 2) {
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmConsultaProduto");
        }
    }//GEN-LAST:event_tbGrideMouseClicked

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        atualizaBusca(0);
        txtCodigo.setText(null);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        FrmCadProduto form = (FrmCadProduto) FrmPrincipal.janelas.get("FrmCadProduto");
        if (form == null) {
            form = new FrmCadProduto();
            form.setTelaConsulta(this, true);
            this.getDesktopPane().add(form);
            form.setVisible(true);
            FrmPrincipal.janelas.put("FrmCadProduto", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
        } else {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                ResultSetTableModel modelo = (ResultSetTableModel) tbGride.getModel(); //Selecionando o modelo do grid com as colunas e linhas montadas
                modelo.removeProduto(Integer.parseInt(txtCodigo.getText()));//Removendo a linha selecionada
                atualizaBusca(0);
                txtCodigo.setText("");
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
        } else {
            FrmAlteraProduto form = (FrmAlteraProduto) FrmPrincipal.janelas.get("FrmAlteraProduto");
            if (form == null) {
                form = new FrmAlteraProduto();
                form.setTelaConsulta(this, true);
                form.setModel(getModelSelecionado());
                this.getDesktopPane().add(form);
                form.setVisible(true);
                FrmPrincipal.janelas.put("FrmAlteraProduto", form);
            } else {
                if (!form.isVisible()) {
                    form.setVisible(true);
                }
                form.moveToFront();
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmConsultaProduto");
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        inicio -= termina;
        atualizaBusca(0);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        inicio += termina;
        atualizaBusca(0);
    }//GEN-LAST:event_btnProximoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCadastrar;
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
