package br.com.serraria.view;

import br.com.serraria.controller.ClienteDB;
import br.com.serraria.controller.ItensRomaneioDB;
import br.com.serraria.controller.RomaneioDB;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.InternalFrameEvent;
import br.com.serraria.util.DefaultTableModel;
import br.com.serraria.model.Cliente;
import br.com.serraria.model.ItensRomaneio;
import br.com.serraria.model.Romaneio;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmCadRomaneio extends javax.swing.JInternalFrame {

    public JInternalFrame frame = new JInternalFrame();
    private FrmConsultaRomaneio telaConsulta;
    private boolean telaConsultaVisivel;
    boolean erro = false;
    public int numeroRomaneio = 0;
    int verificaCampos = 0, contData = 0, contPecas = 0, aux = 0, tipo = 0;
    String dataMySQL = "", auxTipo = "", menssagemerro = "";
    float contLarg = 0, contEsp = 0, contCompr = 0, valor = 0, pago = 0, metros = 0;
    private DefaultTableModel tabela;
    JTextField cliCodigo = new JTextField();
    JTextField proCodigo = new JTextField();

    public FrmCadRomaneio() {
        initComponents();
        iniciaRomaneio();
        criaGrid();
    }

    public void setTelaConsulta(FrmConsultaRomaneio telaConsulta, boolean telaConsultaVisivel) {
        this.telaConsulta = telaConsulta;
        this.telaConsultaVisivel = telaConsultaVisivel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        edtEspecura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edtTransportador = new javax.swing.JTextField();
        edtMotorista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edtLargura = new javax.swing.JTextField();
        edtComprimento = new javax.swing.JTextField();
        edtPecas = new javax.swing.JTextField();
        edtValor = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dbGrid = new javax.swing.JTable();
        btnRemover = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lblMedida = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        edtTotalPecas = new javax.swing.JTextField();
        edtTotalMetros = new javax.swing.JTextField();
        edtTotalMedia = new javax.swing.JTextField();
        edtValorTotal = new javax.swing.JTextField();
        edtNumero = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        edtProduto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        edtPago = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        edtCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        edtPlaca = new javax.swing.JFormattedTextField();
        edtData = new com.toedter.calendar.JDateChooser();
        cbTipo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        btnBuscaProduto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastrar Romaneio");
        setToolTipText("Cadastrar Romaneio");
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
        jLabel1.setText("Espeçura");

        edtEspecura.setToolTipText("Espeçura");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Transportador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Motorista");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Placa");

        edtTransportador.setToolTipText("Transportador");

        edtMotorista.setToolTipText("Motorista");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Data");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Largura");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Comprimento");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Peças");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Valor");

        edtLargura.setToolTipText("Largura");

        edtComprimento.setToolTipText("Comprimento");

        edtPecas.setToolTipText("Número de Peças");

        edtValor.setToolTipText("Valor Unitário");
        edtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtValorKeyPressed(evt);
            }
        });

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total Peças");

        lblMedida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedida.setText("Total Metros");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Média Valor");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Valor Total");

        edtTotalPecas.setEditable(false);
        edtTotalPecas.setToolTipText("Número de Peças do Romaneio");

        edtTotalMetros.setEditable(false);
        edtTotalMetros.setToolTipText("Total de metros do Romaneio");

        edtTotalMedia.setEditable(false);
        edtTotalMedia.setToolTipText("Média de Valor do Romaneio");

        edtValorTotal.setEditable(false);
        edtValorTotal.setToolTipText("Valor Total do Romaneio");

        edtNumero.setEditable(false);
        edtNumero.setToolTipText("Número Romaneio");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Produto");

        edtProduto.setToolTipText("Produto");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Pago");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        edtPago.setToolTipText("Valor Pago");
        edtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtPagoKeyPressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Romaneio");

        edtCliente.setEditable(false);
        edtCliente.setToolTipText("Cliente");
        edtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edtClienteKeyPressed(evt);
            }
        });

        btnBuscarCliente.setText("...");
        btnBuscarCliente.setToolTipText("Buscar Clientes");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        btnBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBuscarClienteKeyPressed(evt);
            }
        });

        try {
            edtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***-****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtPlaca.setToolTipText("Placa");

        edtData.setToolTipText("Data");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M³", "M²", "Peças" }));
        cbTipo.setToolTipText("Unidade de Medida");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Unidade Medida");

        btnBuscaProduto.setText("...");
        btnBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaProdutoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel12.setText("R$");

        jLabel14.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel14.setText("R$");

        jLabel20.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel20.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(edtProduto)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscaProduto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(edtData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(edtTransportador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliente))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(edtMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(edtEspecura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel1)
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(26, 26, 26))
                                            .addComponent(edtLargura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtComprimento)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel9)
                                                .addGap(67, 67, 67))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(edtPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel10))
                                    .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(btnAdicionar)
                                .addGap(47, 47, 47)
                                .addComponent(btnRemover))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtTotalPecas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtTotalMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(edtTotalMedia))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(edtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(edtPago, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFinalizar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))
                            .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(edtTransportador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(btnBuscaProduto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(edtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(edtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtEspecura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtPecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar)
                            .addComponent(btnRemover)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnFinalizar)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (0));
    }

    private void iniciaRomaneio() {
        RomaneioDB romaneiodb = new RomaneioDB();
        numeroRomaneio = romaneiodb.getUltimo() + 1;
        edtNumero.setText(String.valueOf(numeroRomaneio));
        edtPago.setText("0");
    }

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

    private void verificaCampos() {
        if (edtData.getDate() == null || edtPecas.getText().equals("") || edtValor.getText().equals("") || edtComprimento.getText().equals("")
                || edtCliente.getText().equals("") || edtProduto.getText().equals("")) {
            verificaCampos = 0;
        } else {
            verificaCampos = 1;
        }
    }

    private boolean verificaData() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date datas = edtData.getDate();
        String data = formato.format(datas.getTime());
        dataMySQL = data;
        return false;
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
            verificaData();
            verificaValor();
            verificaTipo();
            if (valor == 0) {
                erro = true;
                menssagemerro = menssagemerro + "Valor unitário inválido - ";
            }
            boolean inseriu;
            int cont = 0;
            if (erro == false) {
                if (aux == 0) { // Condição para salvar somente uma venda enquanto não seja terminada a venda
                    int numero = Integer.parseInt(edtNumero.getText());
                    RomaneioDB romaneiodb = new RomaneioDB();
                    int ultimo = romaneiodb.getUltimo();
                    while (numero <= ultimo) {
                        numero = numero + 1;
                        cont = cont + 1;
                    }
                    if (cont > 0) {
                        JOptionPane.showMessageDialog(null, "Romaneio com número " + edtNumero.getText() + " já cadastrado");
                    }
                    edtNumero.setText(String.valueOf(numero));
                    String data = dataMySQL, transportador = edtTransportador.getText(), motorista = edtMotorista.getText(), placa = edtPlaca.getText();

                    int pecasTotal = 0;
                    float metrosTotal = 0, mediaValor = 0, total = 0, valorPago = 0;

                    //salvando o romaneio no banco de dados
                    Romaneio novoRomaneio = new Romaneio(numero, data, transportador, motorista, placa, Integer.parseInt(cliCodigo.getText()),
                            pecasTotal, metrosTotal, mediaValor, total, valorPago);
                    inseriu = romaneiodb.insereRomaneio(novoRomaneio);
                    if (inseriu) {
                        aux = aux + 1;
                        btnBuscarCliente.setEnabled(false);
                        edtCliente.setEnabled(false);
                        edtTransportador.setEnabled(false);
                        edtMotorista.setEnabled(false);
                        edtPlaca.setEnabled(false);
                        edtData.setEnabled(false);
                    }
                }
                if (aux != 0) {
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
                    aux = 0;
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar itens no romaneio, verifique se os campos acima foram informados corretamente");
                }
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
        int sequencia = 0;
        verificaTotalPago();
        if (pago >= 0) {
            int linhas = dbGrid.getRowCount(); //Selecionando número de linhas (ítems do grid)
            int codigoRomaneio = Integer.parseInt(edtNumero.getText()), codigoProduto = Integer.parseInt(proCodigo.getText()), auxPecas;
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
                //salvando o detalhes da venda
                sequencia = sequencia + 1;
                ItensRomaneioDB itensromaneiodb = new ItensRomaneioDB();
                ItensRomaneio novoIten = new ItensRomaneio(
                        codigoRomaneio, 
                        sequencia, 
                        codigoProduto,
                        auxValorUnitario, 
                        auxEespecura,
                        auxLargura,
                        auxComprimento,
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
                Cliente cliente = clientedb.getConsultaDivida(Integer.parseInt(cliCodigo.getText()));
                dividaParcial = cliente.getDivida();

                totalDivida = Float.parseFloat(edtValorTotal.getText()) - pago;
                totalDivida = totalDivida + dividaParcial;

                Cliente alterarDivida = new Cliente(totalDivida, Integer.parseInt(cliCodigo.getText()));
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

                Romaneio alterarRomaneio = new Romaneio(Integer.parseInt(edtTotalPecas.getText()), totalMetros, totalMedia,
                        totalValor, totalPago, Integer.parseInt(edtNumero.getText()));
                RomaneioDB romaneiodb = new RomaneioDB();
                boolean alteraRomaneio = romaneiodb.alteraRomaneio(alterarRomaneio);

                if (alteraRomaneio && alteraCliente) {
                    FrmProgresso form = new FrmProgresso();
                    form.codigoRomaneio = Integer.parseInt(edtNumero.getText());
                    form.setVisible(true);

                    aux = 0;// zerando a variavel para poder gerar outra venda
                    tabela = (DefaultTableModel) dbGrid.getModel();
                    tabela.setNumRows(0);
                    edtNumero.setText("");
                    edtCliente.setText("");
                    edtProduto.setText("");
                    edtPecas.setText("");
                    edtValor.setText("");
                    edtTotalMedia.setText("");
                    edtTotalMetros.setText("");
                    edtTotalPecas.setText("");
                    edtEspecura.setText("");
                    edtEspecura.setText("");
                    edtLargura.setText("");
                    edtMotorista.setText("");
                    edtValorTotal.setText("");
                    edtTransportador.setText("");
                    edtComprimento.setText("");
                    edtPlaca.setText("");
                    edtCliente.setEnabled(true);
                    btnBuscarCliente.setEnabled(true);
                    edtTransportador.setEnabled(true);
                    edtMotorista.setEnabled(true);
                    edtPlaca.setEnabled(true);
                    edtData.setEnabled(true);
                    iniciaRomaneio();
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

    private boolean buscarCliente() {
        FrmConsultaCliente form = new FrmConsultaCliente();
        form.edtNome = edtCliente;
        form.edtCodigo = cliCodigo;
        this.getDesktopPane().add(form);
        try {
            form.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmCadRomaneio.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
        return false;
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
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        adicionarPlroduto();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        finalizar();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        removeProduto();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void edtClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
        }
    }//GEN-LAST:event_edtClienteKeyPressed

    private void btnBuscarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarClienteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
        }
    }//GEN-LAST:event_btnBuscarClienteKeyPressed

    private void edtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtValorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adicionarPlroduto();
        }
    }//GEN-LAST:event_edtValorKeyPressed

    private void btnAdicionarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAdicionarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            adicionarPlroduto();
        }
    }//GEN-LAST:event_btnAdicionarKeyPressed

    private void btnRemoverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRemoverKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            removeProduto();
        }
    }//GEN-LAST:event_btnRemoverKeyPressed

    private void edtPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtPagoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finalizar();
        }
    }//GEN-LAST:event_edtPagoKeyPressed

    private void btnFinalizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFinalizarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            finalizar();
        }
    }//GEN-LAST:event_btnFinalizarKeyPressed

    private void dbGridKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dbGridKeyPressed
    }//GEN-LAST:event_dbGridKeyPressed

    private void dbGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbGridMouseClicked
    }//GEN-LAST:event_dbGridMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if (evt.getID() == InternalFrameEvent.INTERNAL_FRAME_CLOSING) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                this.setVisible(false);
                FrmPrincipal.janelas.remove("frmCadRomaneio");
            }
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaProdutoActionPerformed
        buscarProduto();
    }//GEN-LAST:event_btnBuscaProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscaProduto;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JTable dbGrid;
    private javax.swing.JTextField edtCliente;
    private javax.swing.JTextField edtComprimento;
    private com.toedter.calendar.JDateChooser edtData;
    private javax.swing.JTextField edtEspecura;
    private javax.swing.JTextField edtLargura;
    private javax.swing.JTextField edtMotorista;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtPago;
    private javax.swing.JTextField edtPecas;
    private javax.swing.JFormattedTextField edtPlaca;
    private javax.swing.JTextField edtProduto;
    private javax.swing.JTextField edtTotalMedia;
    private javax.swing.JTextField edtTotalMetros;
    private javax.swing.JTextField edtTotalPecas;
    private javax.swing.JTextField edtTransportador;
    private javax.swing.JTextField edtValor;
    private javax.swing.JTextField edtValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedida;
    // End of variables declaration//GEN-END:variables
}
