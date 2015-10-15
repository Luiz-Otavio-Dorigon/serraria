package br.com.serraria.view;

import br.com.serraria.util.Relatorios;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmProgresso extends javax.swing.JFrame {

    private Timer objTimer;
    private int a;
    public int codigoRomaneio;

    public FrmProgresso() {
        initComponents();
        setLocationRelativeTo(getParent());
        super.setIconImage(Toolkit.getDefaultToolkit().getImage("imagen.png"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgbarra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Aguarde carregando...");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pgbarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pgbarra.setName(""); // NOI18N
        pgbarra.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgbarra, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgbarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        objTimer = new Timer(20, new ClasseTimer());
        objTimer.start();
    }//GEN-LAST:event_formWindowOpened

    public class ClasseTimer implements ActionListener {

        public int codigo = codigoRomaneio;

        @Override
        public void actionPerformed(ActionEvent e) {
            a = pgbarra.getValue();
            if (a < 100) {
                a++;
                pgbarra.setValue(a);
            } else {
                objTimer.stop();
                fechar();
                Relatorios relatorios = new Relatorios();
                FrmCadRomaneio form = new FrmCadRomaneio();
                form.numeroRomaneio = this.codigo;
                JasperPrint rel = relatorios.relRomaneio(codigo);
                if (rel.getPages().size() > 0 ){
                    JasperViewer.viewReport(rel, false);
                } else {
                    JOptionPane.showMessageDialog(null, "Relatório não contém páginas");
                }
            }
        }
    }

    private void fechar() {
        this.dispose();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProgresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmProgresso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar pgbarra;
    // End of variables declaration//GEN-END:variables
}
