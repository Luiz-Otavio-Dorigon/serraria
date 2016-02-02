package br.com.serraria.view;

import br.com.serraria.controller.EmpresaDB;
import br.com.serraria.util.ResultSetTableModel;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import br.com.serraria.model.Empresa;
import br.com.serraria.model.EmpresaSelecionada;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmConsultaEmpresa extends javax.swing.JInternalFrame {

    public JTextField edtCodigo = new JTextField();
    public JTextField edtRazaoSocial = new JTextField();
    public JTextField edtNomeFantasia = new JTextField();
    public JTextField edtCnpj = new JTextField();
    public JTextField edtInscricaoEstadual = new JTextField();
    public JTextField edtInscricaoMunicipal = new JTextField();
    public JTextField edtEmail = new JTextField();
    public JTextField edtTelefone = new JTextField();

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public FrmConsultaEmpresa() {
        initComponents();
        atualizaBusca(0);
        Empresa empresa = EmpresaSelecionada.getInstance().getEmpresa();
        lblEmpresa.setText(empresa.getCodigo() + " - " + empresa.getRazaoSocial());
    }

    public void atualizaBusca(int tipo) {
        EmpresaDB empresadb = new EmpresaDB();
        ResultSetTableModel tabela = null;
        if (tipo == 1) {
            tabela = empresadb.getConsultas(cbCampo.getSelectedIndex(), cbTipo.getSelectedIndex(), edtBusca.getText());
        } else {
            tabela = empresadb.getEmpresas();
        }
        tbGride.getTableHeader().setReorderingAllowed(false);
        tbGride.setModel(tabela);
        tbGride.getColumn("Código").setPreferredWidth(50);
        tbGride.getColumn("Razão Social").setPreferredWidth(250);
        tbGride.getColumn("Nome Fantasia").setPreferredWidth(250);
        tbGride.getColumn("CNPJ").setPreferredWidth(150);
        tbGride.getColumn("Inscrição Estadual").setPreferredWidth(130);
        tbGride.getColumn("Inscrição Municipal").setPreferredWidth(130);
        tbGride.getColumn("Email").setPreferredWidth(250);
        tbGride.getColumn("Telefone").setPreferredWidth(130);
        tbGride.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    private Empresa getModelSelecionado() {
        Empresa empresa = new Empresa();
        int linha = tbGride.getSelectedRow();
        if (linha >= 0) {
            empresa.setCodigo((int) tbGride.getValueAt(linha, 0));
            empresa.setRazaoSocial(tbGride.getValueAt(linha, 1).toString());
            empresa.setNomeFantasia(tbGride.getValueAt(linha, 2).toString());
            empresa.setCnpj(tbGride.getValueAt(linha, 3).toString());
            empresa.setInscricaoEstadual(tbGride.getValueAt(linha, 4).toString());
            empresa.setInscricaoMunicipal(tbGride.getValueAt(linha, 5).toString());
            empresa.setEmail(tbGride.getValueAt(linha, 6).toString());
            empresa.setTelefone(tbGride.getValueAt(linha, 7).toString());
        }
        return empresa;
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
        lblEmpresa = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Empresa");
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

        jLabel1.setText("Campo");

        cbCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Razão Social", "Nome Fantasia", "CNPJ" }));

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

        lblEmpresa.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1354, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(lblEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(lblEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
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
            edtCodigo.setText(tbGride.getValueAt(linha, 0).toString());
            edtRazaoSocial.setText(tbGride.getValueAt(linha, 1).toString());
            edtNomeFantasia.setText(tbGride.getValueAt(linha, 2).toString());
            edtCnpj.setText(tbGride.getValueAt(linha, 3).toString());
            edtInscricaoEstadual.setText(tbGride.getValueAt(linha, 4).toString());
            edtInscricaoMunicipal.setText(tbGride.getValueAt(linha, 5).toString());
            edtEmail.setText(tbGride.getValueAt(linha, 5).toString());
            edtTelefone.setText(tbGride.getValueAt(linha, 5).toString());
        }
        if (evt.getClickCount() == 2) {
            EmpresaDB empresadb = new EmpresaDB();
            EmpresaSelecionada.getInstance().setEmpresa(empresadb.getEmpresa(Integer.parseInt(edtCodigo.getText())));
            JOptionPane.showMessageDialog(null, "A empresa " + EmpresaSelecionada.getInstance().getEmpresa().getRazaoSocial() + " foi selecionada com sucesso!!!", "Empresa Selecionada", 1);
            this.setVisible(false);
            FrmPrincipal.janelas.remove("FrmConsultaEmpresa");
        }
    }//GEN-LAST:event_tbGrideMouseClicked

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        atualizaBusca(0);
        edtCodigo.setText(null);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        FrmCadEmpresa form = (FrmCadEmpresa) FrmPrincipal.janelas.get("FrmCadEmpresa");
        if (form == null) {
            form = new FrmCadEmpresa();
            form.setTelaConsulta(this, true);
            this.getDesktopPane().add(form);
            form.setVisible(true);
            FrmPrincipal.janelas.put("FrmCadEmpresa", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmConsultaEmpresa");
    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JComboBox cbCampo;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JTextField edtBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JTable tbGride;
    // End of variables declaration//GEN-END:variables
}
