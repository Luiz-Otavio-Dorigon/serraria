package br.com.serraria.controller;

import br.com.serraria.util.Coluna;
import br.com.serraria.util.Conexao;
import br.com.serraria.util.ResultSetTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import br.com.serraria.model.TorasZequinha;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class TorasZequinhaDB {

    private static final String sqlInsere = "INSERT INTO toras(data, tipo, peso, valor, valor_pago, total, total_geral, cli_codigo) VALUES (?,?,?,?,?,?,?,?)";
    private static final String sqlTodos = "SELECT T.codigo, C.nome, DATE_FORMAT(T.data, '%d/%m/%Y') AS novadata, T.tipo, T.peso, T.valor, T.valor_pago, T.total, T.total_geral FROM toras T, cliente C WHERE C.codigo = T.cli_codigo ORDER BY T.codigo DESC LIMIT ?, ?";
    private static final String sqlExclui = "DELETE FROM toras WHERE codigo = ?";
    private static final String sqlTotalItens = "SELECT COUNT(*) AS total FROM toras";
    
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
            JOptionPane.showMessageDialog(null, "Erro de SQl: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return total;
    }

    public ResultSetTableModel getToras(int inicio, int termina) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Data"));
            colunas.add(new Coluna("Tipo"));
            colunas.add(new Coluna("Peso"));
            colunas.add(new Coluna("Valor"));
            colunas.add(new Coluna("Valor Pago"));
            colunas.add(new Coluna("Total"));
            colunas.add(new Coluna("Total Geral"));
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTodos);
            pstmt.setInt(1, inicio);
            pstmt.setInt(2, termina);
            ResultSet rs = pstmt.executeQuery();
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " +e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro classe não encontrada: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return tabela;
    }

    public ResultSetTableModel getConsultas(int campo, int tipo, String descricao) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        String sql = "SELECT T.codigo, C.nome, DATE_FORMAT(T.data, '%d/%m/%Y') AS novadata, T.tipo, T.peso, T.valor, T.valor_pago, T.total, T.total_geral FROM toras T, cliente C WHERE C.codigo = T.cli_codigo";
        String auxCampo = "";
        if (campo == 0) {
            auxCampo = "T.codigo";
        } else if (campo == 1) {
            auxCampo = "C.nome";
        } else {
            auxCampo = "T.data";
        }
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Data"));
            colunas.add(new Coluna("Tipo"));
            colunas.add(new Coluna("Peso"));
            colunas.add(new Coluna("Valor"));
            colunas.add(new Coluna("Valor Pago"));
            colunas.add(new Coluna("Total"));
            colunas.add(new Coluna("Total Geral"));
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
            sql = sql + " ORDER BY C.nome, novadata";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " +e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro classe não encontrada: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return tabela;
    }

    public boolean insereControleToras(TorasZequinha novoCadastro) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(sqlInsere);
            pstmt.setString(1, novoCadastro.getData());
            pstmt.setString(2, novoCadastro.getTipo());
            pstmt.setFloat(3, novoCadastro.getPeso());
            pstmt.setFloat(4, novoCadastro.getValor());
            pstmt.setFloat(5, novoCadastro.getValorPago());
            pstmt.setFloat(6, novoCadastro.getTotal());
            pstmt.setFloat(7, novoCadastro.getTotalGeral());
            pstmt.setInt(8, novoCadastro.getCliCodigo());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conexao);
        }
        return inseriu;
    }

    public boolean excluirToras(int codigo) {
        boolean excluiu = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlExclui);
            pstmt.setInt(1, codigo);
            pstmt.executeUpdate();
            excluiu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return excluiu;
    }
}
