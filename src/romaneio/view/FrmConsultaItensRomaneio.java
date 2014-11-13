/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package romaneio.view;

import cliente.controller.ClienteDB;
import romaneio.controller.ItensRomaneioDB;
import funcaoes.ResultSetTableModel;
import romaneio.controller.RomaneioDB;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import cliente.model.Cliente;
import romaneio.model.ItensRomaneio;
import romaneio.model.Romaneio;
import view.FrmPrincipal;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public final class FrmConsultaItensRomaneio extends javax.swing.JInternalFrame {

    public int numero, cliCodigo;
    JTextField edtNumero = new JTextField();

    /**
     * Creates new form FrmConsultaItensRomaneio
     */
    public FrmConsultaItensRomaneio() {
        initComponents();
        atualizaTela(0);
    }

    public void atualizaTela(int numero) {
        ItensRomaneioDB itensromaneiodb = new ItensRomaneioDB();
        ResultSetTableModel tabela = itensromaneiodb.getItens(numero);
        tbGrid.getTableHeader().setReorderingAllowed(false);
        tbGrid.setModel(tabela);
        tbGrid.getColumn("Sequência").setPreferredWidth(80);
        tbGrid.getColumn("Número").setPreferredWidth(80);
        tbGrid.getColumn("Produto").setPreferredWidth(70);
        tbGrid.getColumn("Descrição").setPreferredWidth(230);
        tbGrid.getColumn("Tipo").setPreferredWidth(80);
        tbGrid.getColumn("Espeçura").setPreferredWidth(80);
        tbGrid.getColumn("Largura").setPreferredWidth(80);
        tbGrid.getColumn("Comprimento").setPreferredWidth(100);
        tbGrid.getColumn("Valor Unitário").setPreferredWidth(130);
        tbGrid.getColumn("Número de Peças").setPreferredWidth(130);
        tbGrid.getColumn("Metros").setPreferredWidth(120);
        tbGrid.getColumn("Total").setPreferredWidth(120);
        tbGrid.setAutoResizeMode(tbGrid.AUTO_RESIZE_OFF);
    }

    private ItensRomaneio getModelSelecionado() {
        ItensRomaneio itens = new ItensRomaneio();
        int linha = tbGrid.getSelectedRow();
        if (linha >= 0) {
            itens.setSequencia((int) tbGrid.getValueAt(linha, 0));
            itens.setNumero_romaneio((int) tbGrid.getValueAt(linha, 1));
            itens.setCodigo_produto((int) tbGrid.getValueAt(linha, 2));
            itens.setProduto(tbGrid.getValueAt(linha, 3).toString());
            itens.setTipo(tbGrid.getValueAt(linha, 4).toString());
            itens.setEspecura((float) tbGrid.getValueAt(linha, 5));
            itens.setLargura((float) tbGrid.getValueAt(linha, 6));
            itens.setComprimento((float) tbGrid.getValueAt(linha, 7));
            itens.setValor_unit((float) tbGrid.getValueAt(linha, 8));
            itens.setNum_pecas((int) tbGrid.getValueAt(linha, 9));
            itens.setMetros((float) tbGrid.getValueAt(linha, 10));
            itens.setTotal((float) tbGrid.getValueAt(linha, 11));
                        
        }
        return itens;
    }

    public void alteraRomaneio() {
        float media = 0, auxMetroTotal = 0, auxValorTotal = 0, auxTotalRomaneio = 0;
        int linhas = tbGrid.getRowCount(), auxTotalPecas = 0;
        for (int i = 0; i < linhas; i++) {
            auxTotalPecas = auxTotalPecas + (int) tbGrid.getValueAt(i, 9);
            auxMetroTotal = auxMetroTotal + (float) tbGrid.getValueAt(i, 10);
            auxValorTotal = auxValorTotal + (float) tbGrid.getValueAt(i, 8);
            media = auxValorTotal / linhas;
            auxTotalRomaneio = auxTotalRomaneio + (float) tbGrid.getValueAt(i, 11);
        }

        RomaneioDB romaneiodb = new RomaneioDB();
        ClienteDB clientedb = new ClienteDB();

        Romaneio romaneioValores = romaneiodb.getValores(Integer.parseInt(edtNumero.getText()));
        float total = romaneioValores.getValor_total();

        Cliente cliente = clientedb.getConsultaDivida(this.cliCodigo);
        float divida = cliente.getDivida();

        Romaneio romaneio = new Romaneio(Integer.parseInt(edtNumero.getText()), auxTotalPecas, auxMetroTotal, media, auxTotalRomaneio);
        romaneiodb.alteraRomaneioItens(romaneio);

        Romaneio romaneioVlr = romaneiodb.getValores(Integer.parseInt(edtNumero.getText()));
        float totalAlterado = romaneioVlr.getValor_total();

        float auxTotal;
        if (total > totalAlterado) {
            auxTotal = total - totalAlterado;
            divida = divida - auxTotal;
            Cliente alterarDivida = new Cliente(divida, this.cliCodigo);
            clientedb.alteraDivida(alterarDivida);
        } else if (total < totalAlterado) {
            auxTotal = totalAlterado - total;
            divida = divida + auxTotal;
            Cliente alterarDivida = new Cliente(divida, this.cliCodigo);
            clientedb.alteraDivida(alterarDivida);
        } else if (total == totalAlterado) {
            Cliente alterarDivida = new Cliente(divida, this.cliCodigo);
            clientedb.alteraDivida(alterarDivida);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbGrid = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("Itens do Romaneio");
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

        tbGrid.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tbGrid.setModel(new javax.swing.table.DefaultTableModel(
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
        tbGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGridMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGrid);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnAlterar)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (edtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um item");
        } else {
            FrmAlteraItens form = (FrmAlteraItens) FrmPrincipal.janelas.get("FrmAlteraItens");
            if (form == null) {
                form = new FrmAlteraItens();
                form.numero = Integer.parseInt(edtNumero.getText());
                form.setTelaConsulta(this);
                form.setModel(getModelSelecionado());
                this.getDesktopPane().add(form);
                form.setVisible(true);
                FrmPrincipal.janelas.put("FrmAlteraItens", form);
            } else {
                if (!form.isVisible()) {
                    form.setVisible(true);
                }
                form.moveToFront();
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tbGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGridMouseClicked
        // TODO add your handling code here:
        int linha = tbGrid.getSelectedRow();
        if (linha >= 0) {
            edtNumero.setText(tbGrid.getValueAt(linha, 1).toString());
        }
        if (evt.getClickCount() == 2) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_tbGridMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGrid;
    // End of variables declaration//GEN-END:variables
}
