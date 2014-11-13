/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package produto.controller;

import funcaoes.Coluna;
import funcaoes.ResultSetTableModel;
import funcaoes.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import produto.model.Produto;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class ProdutoDB {

    private static final String sqlInsere = "INSERT INTO produto(descricao, especura, largura, comprimento) VALUES(?,?,?,?)";
    private static final String sqlTodos = "SELECT * FROM produto ORDER BY descricao, codigo LIMIT ?, ?";
    private static final String sqlAltera = "UPDATE produto SET descricao = ?, especura = ?, largura = ?, comprimento = ? WHERE codigo = ?";
    private static final String sqlConsultar = "SELECT * FROM produto WHERE codigo = ?";
    private static final String sqlExclui = "DELETE FROM produto WHERE codigo = ?";
    private static final String sqlTotalItens = "SELECT COUNT(*) AS total FROM produto";
    
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
            return total;
        }
    }

    public boolean excluirProduto(int codigo) {
        boolean excluiu = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlExclui);
            pstmt.setInt(1, codigo);
            pstmt.executeUpdate();
            excluiu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de SQl" ,0);
        } finally {
            Conexao.fecharConexao(conn);
            return excluiu;
        }
    }

    public Produto getConsultar(int codigo) {
        Produto produto = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlConsultar);
            pstmt.setInt(1, codigo);
            ResultSet rs = pstmt.executeQuery();
            int auxcodigo = 0;
            String auxdescricao = "";
            float auxespecura = 0, auxlargura = 0, auxcomprimento = 0;
            while (rs.next()) {
                auxcodigo = rs.getInt("codigo");
                auxdescricao = rs.getString("descricao");
                auxespecura = rs.getFloat("especura");
                auxlargura = rs.getFloat("largura");
                auxcomprimento = rs.getFloat("comprimento");
            }
            produto = new Produto(auxcodigo, auxdescricao, auxespecura, auxlargura, auxcomprimento);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de SQl" ,0);
        } finally {
            Conexao.fecharConexao(conn);
            return produto;
        }
    }

    public boolean alteraProduto(Produto produto) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlAltera);
            pstmt.setString(1, produto.getDescricao());
            pstmt.setFloat(2, produto.getEspecura());
            pstmt.setFloat(3, produto.getLargura());
            pstmt.setFloat(4, produto.getComprimento());
            pstmt.setInt(5, produto.getCodigo());
            pstmt.executeUpdate();
            alterou = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de SQl", 0);
        } finally {
            Conexao.fecharConexao(conn);
            return alterou;
        }
    }

    public ResultSetTableModel getConsultas(int campo, int tipo, String descricao) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        String sql = "SELECT * FROM produto";
        String auxCampo = "";
        if (campo == 0) {
            auxCampo = "codigo";
        } else if (campo == 1) {
            auxCampo = "descricao";
        }
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Descrição"));
            colunas.add(new Coluna("Espeçúra"));
            colunas.add(new Coluna("Largura"));
            colunas.add(new Coluna("Comprimento"));
            conn = Conexao.getConexao();
            if (tipo == 0) {
                sql = sql + " WHERE UPPER(" + auxCampo + ") = UPPER('" + descricao + "')";
            } else if (tipo == 1) {
                sql = sql + " WHERE UPPER(" + auxCampo + ") LIKE UPPER('" + descricao + "%')";
            } else if (tipo == 2) {
                sql = sql + " WHERE UPPER(" + auxCampo + ") LIKE UPPER('%" + descricao + "')";
            } else {
                sql = sql + " WHERE UPPER(" + auxCampo + ") LIKE UPPER('%" + descricao + "%')";
            }
            sql = sql + " ORDER BY descricao, especura, largura, comprimento, codigo ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de SQl", 0);
        } finally {
            Conexao.fecharConexao(conn);
            return tabela;
        }
    }

    public ResultSetTableModel getProdutos(int inicio, int termina) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Descrição"));
            colunas.add(new Coluna("Espeçúra"));
            colunas.add(new Coluna("Comprimento"));
            colunas.add(new Coluna("Largura"));
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTodos);
            pstmt.setInt(1, inicio);
            pstmt.setInt(2, termina);
            ResultSet rs = pstmt.executeQuery();
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de SQl", 0);
        } finally {
            Conexao.fecharConexao(conn);
            return tabela;
        }
    }

    public boolean insereProduto(Produto novoProduto) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(sqlInsere);
            pstmt.setString(1, novoProduto.getDescricao());
            pstmt.setFloat(2, novoProduto.getEspecura());
            pstmt.setFloat(3, novoProduto.getLargura());
            pstmt.setFloat(4, novoProduto.getComprimento());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de SQl", 0);
        } finally {
            Conexao.fecharConexao(conexao);
            return inseriu;
        }
    }
}
