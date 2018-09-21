package br.com.serraria.util;

import java.io.File;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Relatorios {
    
    private String getPathRel(String relName) {
        StringBuilder builder = new StringBuilder();
        builder
                .append(System.getProperty("user.dir"))
                .append(File.separator)
                .append("relatorio")
                .append(File.separator)
                .append(relName)
                .append(".jasper");
        
        return String.valueOf(builder);
    }

    public JasperPrint relRomaneioAgrupado(int numero) {
        JasperPrint rel = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            HashMap map = new HashMap();
            map.put("NUMERO", numero);
            String path = this.getPathRel("RomaneioAgrupado");
            Logger.getLogger(this.getClass().getSimpleName()).info(String.format("Path: %s", path));
            rel = JasperFillManager.fillReport(path, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return rel;
    }

    public JasperPrint relRomaneio(int numero) {
        JasperPrint rel = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            HashMap map = new HashMap();
            map.put("NUMERO", numero);
            String path = this.getPathRel("Romaneio");
            Logger.getLogger(this.getClass().getSimpleName()).info(String.format("Path: %s", path));
            rel = JasperFillManager.fillReport(path, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return rel;
    }

    public JasperPrint relOrcamento(int numero) {
        JasperPrint rel = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            HashMap map = new HashMap();
            map.put("NUMERO", numero);
            String path = this.getPathRel("Orcamento");
            Logger.getLogger(this.getClass().getSimpleName()).info(String.format("Path: %s", path));
            rel = JasperFillManager.fillReport(path, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return rel;
    }

    public JasperPrint relToras(int cliente, Date dataInicial, Date dataFinal) {
        JasperPrint rel = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            HashMap map = new HashMap();
            map.put("CLI_CODIGO", cliente);
            map.put("DATA_INICIAL", dataInicial);
            map.put("DATA_FINAL", dataFinal);
            String path = this.getPathRel("RelTorasZequinha");
            Logger.getLogger(this.getClass().getSimpleName()).info(String.format("Path: %s", path));
            rel = JasperFillManager.fillReport(path, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return rel;
    }

    public JasperPrint relPagamentosCliente(int codigo) {
        JasperPrint rel = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            HashMap map = new HashMap();
            map.put("CLI_CODIGO", codigo);
            String path = this.getPathRel("RelPagamentoClientes");
            Logger.getLogger(this.getClass().getSimpleName()).info(String.format("Path: %s", path));
            rel = JasperFillManager.fillReport(path, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return rel;
    }
}
