/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoes;

import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Relatorios {
    
    public JasperPrint relRomaneio(int numero) {
        JasperPrint rel = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            HashMap map = new HashMap();
            map.put("NUMERO", numero);
            String arquivo = "./relatorio/Romaneio.jasper";
            rel = JasperFillManager.fillReport(arquivo, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return rel;
        }
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
            String arquivo = "./relatorio/RelTorasZequinha.jasper";
            rel = JasperFillManager.fillReport(arquivo, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return rel;
        }
    }

    public JasperPrint relPagamentosCliente(int codigo) {
        JasperPrint rel = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            HashMap map = new HashMap();
            map.put("CLI_CODIGO", codigo);
            String arquivo = "./relatorio/RelPagamentoClientes.jasper";
            rel = JasperFillManager.fillReport(arquivo, map, conn);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return rel;
        }
    }
}