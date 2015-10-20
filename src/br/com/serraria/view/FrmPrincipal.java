package br.com.serraria.view;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class FrmPrincipal extends javax.swing.JFrame {

    public static final Map<String, JInternalFrame> janelas = new HashMap();

    public FrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        super.setIconImage(Toolkit.getDefaultToolkit().getImage("serraria.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema para Serraria");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jDesktopPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDesktopPane1KeyPressed(evt);
            }
        });

        jMenuBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuBar1KeyPressed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        menuCadastrar.setText("Cadastrar");

        jMenuItem1.setText("Romaneio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem1);

        jMenuItem5.setText("Cliente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem5);

        jMenuItem8.setText("Controle Toras");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem8);

        jMenuItem12.setText("Produto");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem12);

        jMenuItem14.setText("Usuário");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        menuCadastrar.add(jMenuItem14);

        jMenuBar1.add(menuCadastrar);

        jMenu4.setText("Consultar");

        jMenuItem4.setText("Romaneio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem6.setText("Clientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem3.setText("Pagamentos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem11.setText("Controle de Cargas");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem13.setText("Produto");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Pagamentos");

        jMenuItem7.setText("Clientes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Relatórios");

        jMenuItem10.setText("Pagamentos por Cliente");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem9.setText("Controle Toras");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmCadRomaneio form = (FrmCadRomaneio) FrmPrincipal.janelas.get("frmCadRomaneio");
        if (form == null) {
            form = new FrmCadRomaneio();
            jDesktopPane1.add(form);
            form.setVisible(true);
            form.setPosicao();
            janelas.put("frmCadRomaneio", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sitema?", "Sair", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmConsultaRomaneio form = (FrmConsultaRomaneio) FrmPrincipal.janelas.get("FrmConsultaRomaneio");
        if (form == null) {
            form = new FrmConsultaRomaneio();
            jDesktopPane1.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            form.setVisible(true);
            janelas.put("FrmConsultaRomaneio", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrmCadCliente form = (FrmCadCliente) FrmPrincipal.janelas.get("FrmCadCliente");
        if (form == null){
            form = new FrmCadCliente();
            jDesktopPane1.add(form);
            form.setVisible(true);
            janelas.put("FrmCadCliente", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FrmConsultaCliente form = (FrmConsultaCliente) FrmPrincipal.janelas.get("FrmConsultaCliente");
        if (form == null){
            form = new FrmConsultaCliente();
            jDesktopPane1.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            form.setVisible(true);
            janelas.put("FrmConsultaCliente", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        FrmPagamentoCliente form = (FrmPagamentoCliente) FrmPrincipal.janelas.get("FrmPagamentoCliente");
        if (form == null){
            form = new FrmPagamentoCliente();
            jDesktopPane1.add(form);
            form.setVisible(true);
            janelas.put("FrmPagamentoCliente", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrmConsultaPagamento form = (FrmConsultaPagamento) FrmPrincipal.janelas.get("FrmConsultaPagamento");
        if (form == null){
            form = new FrmConsultaPagamento();
            jDesktopPane1.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            form.setVisible(true);
            janelas.put("FrmConsultaPagamento", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        FrmTorasZequinha form = (FrmTorasZequinha) FrmPrincipal.janelas.get("FrmTorasZequinha");
        if (form == null){
            form = new FrmTorasZequinha();
            jDesktopPane1.add(form);
            form.setVisible(true);
            janelas.put("FrmTorasZequinha", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        FrmDatasControleToras form = (FrmDatasControleToras) FrmPrincipal.janelas.get("FrmDatasControleToras");
        if (form == null){
            form = new FrmDatasControleToras();
            jDesktopPane1.add(form);
            form.setVisible(true);
            janelas.put("FrmDatasControleToras", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        FrmConsultaCliente form = (FrmConsultaCliente) FrmPrincipal.janelas.get("FrmConsultaCliente");
        if (form == null){
            form = new FrmConsultaCliente();
            jDesktopPane1.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            form.setVisible(true);
            janelas.put("FrmConsultaCliente", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (evt.getID() == WindowEvent.WINDOW_CLOSING) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do sitema?", "Sair", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuBar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuBar1KeyPressed
    }//GEN-LAST:event_jMenuBar1KeyPressed

    private void jDesktopPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDesktopPane1KeyPressed
    }//GEN-LAST:event_jDesktopPane1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        FrmConsultaCargas form = (FrmConsultaCargas) FrmPrincipal.janelas.get("FrmConsultaCargas");
        if (form == null){
            form = new FrmConsultaCargas();
            jDesktopPane1.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            form.setVisible(true);
            janelas.put("FrmConsultaCargas", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        FrmCadProduto form = (FrmCadProduto) FrmPrincipal.janelas.get("FrmCadProduto");
        if (form == null){
            form = new FrmCadProduto();
            jDesktopPane1.add(form);
            form.setVisible(true);
            janelas.put("FrmCadProduto", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        FrmConsultaProduto form = (FrmConsultaProduto) FrmPrincipal.janelas.get("FrmConsultaProduto");
        if (form == null){
            form = new FrmConsultaProduto();
            jDesktopPane1.add(form);
            try {
                form.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            form.setVisible(true);
            janelas.put("FrmConsultaProduto", form);
        } else {
            if (!form.isVisible()){
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        FrmCadUsuario form = (FrmCadUsuario) FrmPrincipal.janelas.get("FrmCadUsuario");
        if (form == null){
            form = new FrmCadUsuario();
            jDesktopPane1.add(form);
            form.setVisible(true);
            janelas.put("FrmCadUsuario", form);
        } else {
            if (!form.isVisible()) {
                form.setVisible(true);
            }
            form.moveToFront();
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu menuCadastrar;
    // End of variables declaration//GEN-END:variables
}
