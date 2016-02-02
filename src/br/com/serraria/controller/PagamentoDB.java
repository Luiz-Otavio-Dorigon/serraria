package br.com.serraria.controller;

import br.com.serraria.util.Coluna;
import br.com.serraria.util.ResultSetTableModel;
import br.com.serraria.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.serraria.model.Pagamento;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class PagamentoDB {

    private static final String sqlInsere = "INSERT INTO pagamento(data,cli_codigo,valor_pago,emp_codigo) VALUES(?,?,?,?)";
    private static final String sqlTodos = "SELECT pagamento.codigo, DATE_FORMAT(pagamento.data, '%d/%m/%Y') AS novadata, pagamento.cli_codigo, cliente.nome AS clinome, pagamento.valor_pago FROM pagamento, cliente "
            + "WHERE pagamento.cli_codigo = cliente.codigo ORDER BY pagamento.codigo DESC LIMIT ?, ?";
    private static final String sqlTotalItens = "SELECT COUNT(*) AS total FROM pagamento";

    public int getTotalRegistros() {
        Connection conn = null;
        int total = 0;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTotalItens);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return total;
    }

    public ResultSetTableModel getConsultar(int campo, int tipo, String descricao) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        String sql = "SELECT pagamento.codigo, DATE_FORMAT(pagamento.data, '%d/%m/%Y') AS novadata, pagamento.cli_codigo, cliente.nome AS clinome, pagamento.valor_pago FROM pagamento, cliente "
                + "WHERE pagamento.cli_codigo = cliente.codigo";
        String auxCampo = "";
        if (campo == 0) {
            auxCampo = "pagamento.codigo";
        } else if (campo == 1) {
            auxCampo = "pagamento.data";
        } else if (campo == 2) {
            auxCampo = "pagamento.valor_pago";
        } else {
            auxCampo = "cliente.nome";
        }
        try {
            colunas.add(new Coluna("Código Pagamento"));
            colunas.add(new Coluna("Data"));
            colunas.add(new Coluna("Cliente"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Valor Pago"));
            conn = Conexao.getConexao();
            if (tipo == 0) {
                sql = sql + " AND UPPER(" + auxCampo + ") = UPPER('" + descricao + "')";
            } else if (tipo == 1) {
                sql = sql + " AND UPPER(" + auxCampo + ") LIKE UPPER('" + descricao + "%')";
            } else if (tipo == 2) {
                sql = sql + " AND UPPER(" + auxCampo + ") LIKE UPPER('%" + descricao + "')";
            } else {
                sql = sql + " AND UPPER(" + auxCampo + ") LIKE UPPER('%" + descricao + "%')";
            }
            sql = sql + " order by " + auxCampo;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro classe não encontrada: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return tabela;
    }

    public ResultSetTableModel getPagamentos(int inicio, int termina) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        try {
            colunas.add(new Coluna("Código Pagamento"));
            colunas.add(new Coluna("Data"));
            colunas.add(new Coluna("Cliente"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Valor Pago"));
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTodos);
            pstmt.setInt(1, inicio);
            pstmt.setInt(2, termina);
            ResultSet rs = pstmt.executeQuery();
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro classe não encontrada: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return tabela;
    }

    public boolean inserePagamento(Pagamento novoPagamento) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(sqlInsere);
            pstmt.setString(1, novoPagamento.getData());
            pstmt.setInt(2, novoPagamento.getCliCodigo());
            pstmt.setFloat(3, novoPagamento.getValorPago());
            pstmt.setInt(4, novoPagamento.getEmpCodigo());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conexao);
        }
        return inseriu;
    }
}
