package br.com.serraria.view;

import br.com.serraria.controller.ClienteDB;
import br.com.serraria.controller.ItensRomaneioDB;
import br.com.serraria.controller.RomaneioDB;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.com.serraria.util.DefaultTableModel;
import br.com.serraria.model.Cliente;
import br.com.serraria.model.ItensRomaneio;
import br.com.serraria.model.Romaneio;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmNovoItemRomaneio extends javax.swing.JInternalFrame {

    public int codigoRomaneio, codigoCliente;
    public JInternalFrame frame = new JInternalFrame();
    private FrmConsultaRomaneio telaConsulta;
    private boolean telaConsultaVisivel;
    boolean erro = false;
    int sequencia = 0, verificaCampos = 0, contData = 0, contPecas = 0, aux = 0, tipo = 0;
    String dataMySQL = "", auxTipo = "", menssagemerro = "";
    float contLarg = 0, contEsp = 0, contCompr = 0, valor = 0, pago, metros = 0;
    private DefaultTableModel tabela;
    JTextField proCodigo = new JTextField();

    public FrmNovoItemRomaneio() {
        initComponents();
        criaGrid();
        edtPago.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edtPago = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edtComprimento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edtLargura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbGrid = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        edtValor = new javax.swing.JTextField();
        edtPecas = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblMedida = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edtEspecura = new javax.swing.JTextField();
        edtTotalPecas = new javax.swing.JTextField();
        edtTotalMetros = new javax.swing.JTextField();
        edtTotalMedia = new javax.swing.JTextField();
        edtValorTotal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        edtProduto = new javax.swing.JTextField();
        btnBuscaProduto = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("Adicionar Novos Itens");
        setToolTipText("Adicionar Novos Itens");
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

        edtPago.setToolTipText("Valor Pago");
        edtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtPagoKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Pago");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Comprimento");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Peças");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Largura");

        edtComprimento.setToolTipText("Comprimento");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Valor");

        edtLargura.setToolTipText("Largura");

        dbGrid.setModel(new javax.swing.table.DefaultTableModel(
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
        dbGrid.setToolTipText("Produtos Romaneio");
        dbGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbGridMouseClicked(evt);
            }
        });
        dbGrid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dbGridKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(dbGrid);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setToolTipText("Adicionar Produtos");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        btnAdicionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAdicionarKeyPressed(evt);
            }
        });

        edtValor.setToolTipText("Valor Unitário");
        edtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtValorKeyPressed(evt);
            }
        });

        edtPecas.setToolTipText("Número de Peças");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Média Valor");

        lblMedida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedida.setText("Total Metros");

        btnRemover.setText("Remover");
        btnRemover.setToolTipText("Remover Produtos");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        btnRemover.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRemoverKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Peças");

        btnFinalizar.setText("Finalizar");
        btnFinalizar.setToolTipText("Finalizar Romaneio");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        btnFinalizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFinalizarKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Espeçura");

        edtEspecura.setToolTipText("Espeçura");

        edtTotalPecas.setEditable(false);
        edtTotalPecas.setToolTipText("Número de Peças do Romaneio");

        edtTotalMetros.setEditable(false);
        edtTotalMetros.setToolTipText("Total de metros do Romaneio");

        edtTotalMedia.setEditable(false);
        edtTotalMedia.setToolTipText("Média de Valor do Romaneio");

        edtValorTotal.setEditable(false);
        edtValorTotal.setToolTipText("Valor Total do Romaneio");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Valor Total");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Unidade Medida");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M³", "M²", "Peças" }));
        cbTipo.setToolTipText("Unidade de Medida");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Produto");

        edtProduto.setToolTipText("Produto");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtTotalPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtTotalMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtTotalMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(edtPago, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFinalizar)
                                    .addGap(43, 43, 43))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edtEspecura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(462, 462, 462)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(edtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(btnBuscaProduto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtLargura)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(edtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(edtPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtValor)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdicionar)
                                        .addGap(36, 36, 36)
                                        .addComponent(btnRemover)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaProduto)
                    .addComponent(edtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edtEspecura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAdicionar)
                                .addComponent(btnRemover))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))
                                .addGap(31, 31, 31)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblMedida)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTotalPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTotalMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtTotalMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void criaGrid() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Produto");//0
        modelo.addColumn("Espeçura");//1
        modelo.addColumn("Largura");//2
        modelo.addColumn("Comprimento");//3
        modelo.addColumn("Unidade");//4
        modelo.addColumn("Peças");//5
        modelo.addColumn("Metros"); //6
        modelo.addColumn("Valor"); //7
        modelo.addColumn("Total"); //8
        dbGrid.getTableHeader().setReorderingAllowed(false);
        dbGrid.setModel(modelo);//passando o modelo para o grid
    }
    
    private boolean buscarProduto() {
        FrmConsultaProduto form = new FrmConsultaProduto();
        form.txtDescricao = edtProduto;
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

    private void verificaCampos() {
        if (edtPecas.getText().equals("") || edtValor.getText().equals("") || edtComprimento.getText().equals("") || edtProduto.getText().equals("")) {
            verificaCampos = 0;
        } else {
            verificaCampos = 1;
        }
    }

    private void verificaEspecura() {
        if (edtEspecura.getText().equals("")) {
            contEsp = 0;
        } else {
            String auxQtd = edtEspecura.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contEsp = Float.parseFloat(auxQtd);
        }
    }

    private void verificaLargura() {
        if (edtLargura.getText().equals("")) {
            contLarg = 0;
        } else {
            String auxQtd = edtLargura.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contLarg = Float.parseFloat(auxQtd);
        }
    }

    private void verificaComprimento() {
        if (edtComprimento.getText().equals("")) {
            contCompr = 0;
        } else {
            String auxQtd = edtComprimento.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            contCompr = Float.parseFloat(auxQtd);
        }
    }

    private void verificaPecas() {
        if (edtPecas.getText().equals("")) {
            contPecas = 0;
        } else {
            float quantidade;
            String auxQtd = edtPecas.getText();
            auxQtd = auxQtd.replaceAll(",", ".");
            quantidade = Float.parseFloat(auxQtd);
            if (quantidade % 1 != 0) {
                contPecas = 0;
            } else {
                contPecas = Integer.parseInt(edtPecas.getText());
            }
        }
    }

    private void verificaValor() {
        if (edtValor.getText().equals("")) {
            valor = 0;
        } else {
            String auxValor = edtValor.getText();
            int achou = 0;
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
            } else {
                valor = 0;
            }
        }
    }

    private void verificaTotalPago() {
        String auxValorPago = edtPago.getText();
        int achou = 0;
        int contador = auxValorPago.length();
        for (int i = 0; i < contador; i++) {
            if (auxValorPago.substring(i, i + 1).equals("R") || auxValorPago.substring(i, i + 1).equals("r")
                    || auxValorPago.substring(i, i + 1).equals("$") || auxValorPago.substring(i, i + 1).equals("S")
                    || auxValorPago.substring(i, i + 1).equals("s")) {
                achou = achou + 1;
            }
        }
        if (achou == 0) {
            auxValorPago = auxValorPago.replaceAll(",", ".");
            pago = Float.parseFloat(auxValorPago);
        } else {
            pago = 0;
        }
    }

    private void verificaTipo() {
        tipo = cbTipo.getSelectedIndex();
        if (tipo == 0) {
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
            verificaPecas();
            if (contPecas == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Quantidade de peças inválida - ";
            }
            auxTipo = "M³";
            metros = (float) (contEsp * contLarg * contCompr * contPecas * 0.000001);
        } else if (tipo == 1) {
            if (!"".equals(edtEspecura.getText())) {
                verificaEspecura();
                if (contEsp == 0) {
                    erro = true;
                    menssagemerro = menssagemerro + "Espessura inválida - ";
                }
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
            verificaPecas();
            if (contPecas == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Quantidade de peças inválida - ";
            }
            auxTipo = "M²";
            metros = (float) (contLarg * contCompr * contPecas * 0.00001);
        } else if (tipo == 2) {
            if (!"".equals(edtEspecura.getText())) {
                verificaEspecura();
                if (contEsp == 0) {
                    erro = true;
                    menssagemerro = menssagemerro + "Espessura inválida - ";
                }
            }
            if (!"".equals(edtLargura.getText())) {
                verificaLargura();
                if (contLarg == 0) {
                    erro = true;
                    menssagemerro = menssagemerro + "Largura inválida - ";
                }
            }
            verificaComprimento();
            if (contCompr == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Comprimento inválido - ";
            }
            verificaPecas();
            if (contPecas == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Quantidade de peças inválida - ";
            }
            auxTipo = "PC";
            metros = (float) (contCompr * contPecas * 0.001);
        }
    }

    private boolean adicionarPlroduto() {
        verificaCampos();
        if (verificaCampos == 0) {
            erro = true;
            menssagemerro = menssagemerro + "Preencher todos os campos - ";
        }
        if (!erro) {
            verificaValor();
            verificaTipo();
            if (valor == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Valor unitário inválido - ";
            }
            if (erro == false) {
                float totalRomaneio = 0, media = 0, metroCubico = 0, valorTotal = 0;
                int totalPecas = 0;

                float totalProduto = 0;
                if (tipo == 0) {
                    totalProduto = (float) (metros * valor * 0.001);
                } else if (tipo == 1) {
                    totalProduto = (float) (metros * valor * 0.01);
                } else if (tipo == 2) {
                    totalProduto = contPecas * valor;
                }

                NumberFormat nf = new DecimalFormat(".##");
                nf.format(totalProduto);
                nf.format(contEsp);
                nf.format(contLarg);
                nf.format(contCompr);
                nf.format(contPecas);
                nf.format(metros);
                nf.format(valor);

                DefaultTableModel modelo = (DefaultTableModel) dbGrid.getModel(); //Selecionando o modelo do grid com as colunas e linhas montadas
                modelo.addRow(new Object[]{edtProduto.getText(), String.valueOf(contEsp), String.valueOf(contLarg), String.valueOf(contCompr),
                    String.valueOf(auxTipo), String.valueOf(contPecas), String.valueOf(metros), String.valueOf(valor), String.valueOf(totalProduto)}); //Adicionando nova linha

                int linhas = dbGrid.getRowCount(); //Selecionando número de linhas (ítems do grid)
                for (int i = 0; i < linhas; i++) {
                    String auxTotalPecas = (String) dbGrid.getValueAt(i, 5);
                    totalPecas = totalPecas + Integer.parseInt(auxTotalPecas);

                    String auxMetroCubico = (String) dbGrid.getValueAt(i, 6);
                    metroCubico = metroCubico + Float.parseFloat(auxMetroCubico);

                    String auxValorTotal = (String) dbGrid.getValueAt(i, 7);
                    valorTotal = valorTotal + Float.parseFloat(auxValorTotal);
                    media = valorTotal / linhas;

                    String auxTotalRomaneio = (String) dbGrid.getValueAt(i, 8);
                    totalRomaneio = totalRomaneio + Float.parseFloat(auxTotalRomaneio);
                }
                edtValorTotal.setText(String.valueOf(totalRomaneio));
                edtTotalPecas.setText(String.valueOf(totalPecas));
                edtTotalMedia.setText(String.valueOf(nf.format(media)));
                edtTotalMetros.setText(String.valueOf(metroCubico));
            } else {
                JOptionPane.showMessageDialog(null, "Erro: " + menssagemerro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro: " + menssagemerro);
        }
        contEsp = 0;
        contLarg = 0;
        menssagemerro = "";
        erro = false;
        return false;
    }

    private boolean removeProduto() {        
        if (dbGrid.getSelectedRow() >= 0) {
            float totalRomaneio = 0, media = 0, metroTotal = 0, valorTotal = 0;
            int totalPecas = 0;

            int linha = dbGrid.getSelectedRow(); //Pegando a linha selecionada no grid
            if (linha >= 0) { //verificando se a linha é  maior ou igual a zero, ou seja se possui linha
                DefaultTableModel modelo = (DefaultTableModel) dbGrid.getModel(); //Selecionando o modelo do grid com as colunas e linhas montadas
                modelo.removeRow(linha);//Removendo a linha selecionada
            }

            int linhas = dbGrid.getRowCount(); //Selecionando número de linhas (ítems do grid)
            for (int i = 0; i < linhas; i++) {
                String auxTotalPecas = (String) dbGrid.getValueAt(i, 5);
                totalPecas = totalPecas + Integer.parseInt(auxTotalPecas);

                String auxMetroCubico = (String) dbGrid.getValueAt(i, 6);
                metroTotal = metroTotal + Float.parseFloat(auxMetroCubico);

                String auxValorTotal = (String) dbGrid.getValueAt(i, 7);
                valorTotal = valorTotal + Float.parseFloat(auxValorTotal);
                media = valorTotal / linhas;

                String auxTotalRomaneio = (String) dbGrid.getValueAt(i, 8);
                totalRomaneio = totalRomaneio + Float.parseFloat(auxTotalRomaneio);
            }
            edtValorTotal.setText(String.valueOf(totalRomaneio));
            edtTotalPecas.setText(String.valueOf(totalPecas));
            edtTotalMedia.setText(String.valueOf(media));
            edtTotalMetros.setText(String.valueOf(metroTotal));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
        return false;
    }

    private boolean finalizar() {
        boolean inseriu = false;
        verificaTotalPago();
        if (pago >= 0) {
            int linhas = dbGrid.getRowCount(); //Selecionando número de linhas (ítems do grid)
            int auxPecas;
            String especura, largura, comprimento, totmetros, valorUnitario, totalRomaneio, pecas;
            float auxEespecura, auxLargura, auxComprimento, auxTotmetros, auxValorUnitario, auxTotalRomaneio;

            for (int i = 0; i < linhas; i++) {

                String produto = (String) dbGrid.getValueAt(i, 0);

                especura = (String) dbGrid.getValueAt(i, 1);
                auxEespecura = Float.parseFloat(especura);

                largura = (String) dbGrid.getValueAt(i, 2);
                auxLargura = Float.parseFloat(largura);

                comprimento = (String) dbGrid.getValueAt(i, 3);
                auxComprimento = Float.parseFloat(comprimento);

                String tipos = (String) dbGrid.getValueAt(i, 4);

                pecas = (String) dbGrid.getValueAt(i, 5);
                auxPecas = Integer.parseInt(pecas);

                totmetros = (String) dbGrid.getValueAt(i, 6);
                auxTotmetros = Float.parseFloat(totmetros);

                valorUnitario = (String) dbGrid.getValueAt(i, 7);
                auxValorUnitario = Float.parseFloat(valorUnitario);

                totalRomaneio = (String) dbGrid.getValueAt(i, 8);
                auxTotalRomaneio = Float.parseFloat(totalRomaneio);

                //salvando o detalhes do romaneio
                ItensRomaneioDB itensromaneiodb = new ItensRomaneioDB();
                sequencia = itensromaneiodb.getSequencia(codigoRomaneio);

                sequencia = sequencia + 1;

                ItensRomaneio novoIten = new ItensRomaneio(
                        codigoRomaneio, 
                        sequencia,
                        Integer.parseInt(proCodigo.getText()),
                        auxEespecura,
                        auxLargura,
                        auxComprimento,
                        auxValorUnitario,
                        auxPecas, 
                        auxTotmetros,
                        auxTotalRomaneio, 
                        produto,
                        tipos);
                inseriu = itensromaneiodb.insereItensRomaneio(novoIten);
            }
            if (inseriu) {
                float totalDivida, dividaParcial;
                ClienteDB clientedb = new ClienteDB();
                Cliente cliente = clientedb.getConsultaDivida(codigoCliente);
                dividaParcial = cliente.getDivida();

                totalDivida = dividaParcial + Float.parseFloat(edtValorTotal.getText());
                totalDivida = totalDivida - pago;

                Cliente alterarDivida = new Cliente(totalDivida, codigoCliente);
                boolean alteraCliente = clientedb.alteraDivida(alterarDivida);

                String auxTotMetros = edtTotalMetros.getText();
                auxTotMetros = auxTotMetros.replaceAll(",", ".");
                float totalMetros = Float.parseFloat(auxTotMetros);
                String auxTotMedia = edtTotalMedia.getText();
                auxTotMedia = auxTotMedia.replaceAll(",", ".");
                float totalMedia = Float.parseFloat(auxTotMedia);
                String auxTotValor = edtValorTotal.getText();
                auxTotValor = auxTotValor.replaceAll(",", ".");
                float totalValor = Float.parseFloat(auxTotValor);
                String auxTotValorPag = edtPago.getText();
                auxTotValorPag = auxTotValorPag.replaceAll(",", ".");
                float totalPago = Float.parseFloat(auxTotValorPag);

                RomaneioDB romaneiodb = new RomaneioDB();

                Romaneio totais = romaneiodb.getTotais(codigoRomaneio);
                int totalPecas = totais.getPecasTotal() + Integer.parseInt(edtTotalPecas.getText());
                totalMetros = totais.getMetrosTotal() + totalMetros;
                
                ItensRomaneioDB novaMedia = new ItensRomaneioDB();
                totalMedia = novaMedia.getMedia(codigoRomaneio);
                
                totalValor = totais.getValorTotal() + totalValor;
                totalPago = totais.getValorPago() + totalPago;

                Romaneio alterarRomaneio = new Romaneio(totalPecas, totalMetros, totalMedia,
                        totalValor, totalPago, codigoRomaneio);
                boolean alteraRomaneio = romaneiodb.alteraRomaneio(alterarRomaneio);

                if (alteraRomaneio && alteraCliente) {
                    FrmProgresso form = new FrmProgresso();
                    form.codigoRomaneio = codigoRomaneio;
                    form.setVisible(true);

                    aux = 0;// zerando a variavel para poder gerar outra venda
                    tabela = (DefaultTableModel) dbGrid.getModel();
                    tabela.setNumRows(0);
                    edtProduto.setText("");
                    edtPecas.setText("");
                    edtValor.setText("");
                    edtTotalMedia.setText("");
                    edtTotalMetros.setText("");
                    edtTotalPecas.setText("");
                    edtEspecura.setText("");
                    edtEspecura.setText("");
                    edtLargura.setText("");
                    edtValorTotal.setText("");
                    edtComprimento.setText("");
                    edtPago.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao finalizar o romaneio!!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao finalizar o romaneio!!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar o romaneio!!!");
        }
        if (telaConsultaVisivel == true) {
            telaConsulta.atualizaBusca(0);
        }
        return false;
    }


    private void edtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finalizar();
        }
    }//GEN-LAST:event_edtPagoKeyPressed

    private void dbGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbGridMouseClicked
    }//GEN-LAST:event_dbGridMouseClicked

    private void dbGridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbGridKeyPressed
    }//GEN-LAST:event_dbGridKeyPressed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        adicionarPlroduto();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAdicionarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAdicionarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adicionarPlroduto();
        }
    }//GEN-LAST:event_btnAdicionarKeyPressed

    private void edtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtValorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adicionarPlroduto();
        }
    }//GEN-LAST:event_edtValorKeyPressed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        removeProduto();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnRemoverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRemoverKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            removeProduto();
        }
    }//GEN-LAST:event_btnRemoverKeyPressed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        finalizar();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnFinalizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFinalizarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finalizar();
        }
    }//GEN-LAST:event_btnFinalizarKeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        FrmPrincipal.janelas.remove("FrmNovoItemRomaneio");
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdutoActionPerformed
        buscarProduto();
    }//GEN-LAST:event_btnBuscaProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscaProduto;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JTable dbGrid;
    private javax.swing.JTextField edtComprimento;
    private javax.swing.JTextField edtEspecura;
    private javax.swing.JTextField edtLargura;
    private javax.swing.JTextField edtPago;
    private javax.swing.JTextField edtPecas;
    private javax.swing.JTextField edtProduto;
    private javax.swing.JTextField edtTotalMedia;
    private javax.swing.JTextField edtTotalMetros;
    private javax.swing.JTextField edtTotalPecas;
    private javax.swing.JTextField edtValor;
    private javax.swing.JTextField edtValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedida;
    // End of variables declaration//GEN-END:variables
}
