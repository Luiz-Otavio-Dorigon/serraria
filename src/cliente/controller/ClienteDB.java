/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.controller;

import funcaoes.Coluna;
import funcaoes.ResultSetTableModel;
import funcaoes.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import cliente.model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class ClienteDB {

    private static final String sqlInsere = "INSERT INTO cliente(nome,telefone,email,cnpj,divida) VALUES(?,?,?,?,?)";
    private static final String sqlTodos = "SELECT * FROM cliente ORDER BY codigo LIMIT ?, ?";
    private static final String sqlTotal = "SELECT COUNT(*) AS total FROM cliente";
    private static final String sqlDivida = "UPDATE cliente SET divida = ? WHERE codigo = ?";
    private static final String sqlConsulta = "SELECT * FROM cliente WHERE codigo = ?";
    private static final String sqlAltera = "UPDATE cliente SET nome = ?, telefone = ?, email = ?, cnpj = ? WHERE codigo = ?";
    private static final String sqlConsultar = "SELECT * FROM cliente WHERE codigo = ?";
    private static final String sqlExclui = "DELETE FROM cliente WHERE codigo = ?";
    private static final String sqlCnpj = "SELECT cnpj FROM cliente WHERE cnpj = ?";

    public int getTotalRegistros() {
        Connection conn = null;
        int total = 0;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTotal);
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

    public Cliente getConsultaCnpj(String cnpj) {
        Cliente cliente = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlCnpj);
            pstmt.setString(1, cnpj);
            ResultSet rs = pstmt.executeQuery();
            String auxcnpj = "";
            while (rs.next()) {
                auxcnpj = rs.getString("cnpj");
            }
            cliente = new Cliente(auxcnpj);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return cliente;
        }
    }

    public boolean excluirCliente(int codigo) {
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
            return excluiu;
        }
    }

    public Cliente getConsultar(int codigo) {
        Cliente cliente = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlConsultar);
            pstmt.setInt(1, codigo);
            ResultSet rs = pstmt.executeQuery();
            int auxcodigo = 0;
            String auxnome = "";
            String auxtelefone = "";
            String auxemail = "";
            String auxcnpj = "";
            float auxdivida = 0;
            while (rs.next()) {
                auxcodigo = rs.getInt("codigo");
                auxnome = rs.getString("nome");
                auxtelefone = rs.getString("telefone");
                auxemail = rs.getString("email");
                auxcnpj = rs.getString("cnpj");
                auxdivida = rs.getFloat("divida");
            }
            cliente = new Cliente(auxcodigo, auxnome, auxtelefone, auxemail, auxcnpj, auxdivida);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return cliente;
        }
    }

    public boolean alteraCliente(Cliente cliente) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlAltera);
            pstmt.setString(1, cliente.getNome());
            pstmt.setString(2, cliente.getTelefone());
            pstmt.setString(3, cliente.getEmail());
            pstmt.setString(4, cliente.getCnpj());
            pstmt.setInt(5, cliente.getCodigo());
            pstmt.executeUpdate();
            alterou = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return alterou;
        }
    }

    public Cliente getConsultaDivida(int codigo) {
        Cliente cliente = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlConsulta);
            pstmt.setInt(1, codigo);
            ResultSet rs = pstmt.executeQuery();
            int auxcodigo = 0;
            float auxdivida = 0;
            while (rs.next()) {
                auxdivida = rs.getFloat("divida");
                auxcodigo = rs.getInt("codigo");
            }
            cliente = new Cliente(auxdivida, auxcodigo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return cliente;
        }
    }

    public boolean alteraDivida(Cliente cliente) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlDivida);
            pstmt.setDouble(1, cliente.getDivida());
            pstmt.setInt(2, cliente.getCodigo());
            pstmt.executeUpdate();
            alterou = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return alterou;
        }
    }

    public ResultSetTableModel getConsultas(int campo, int tipo, String descricao) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        String sql = "SELECT * FROM cliente";
        String auxCampo = "";
        if (campo == 0) {
            auxCampo = "codigo";
        } else if (campo == 1) {
            auxCampo = "nome";
        } else {
            auxCampo = "cnpj";
        }
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Telefone"));
            colunas.add(new Coluna("Email"));
            colunas.add(new Coluna("CNPJ"));
            colunas.add(new Coluna("Dívida"));
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
            sql = sql + " order by nome, codigo ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return tabela;
        }
    }

    public ResultSetTableModel getClientes(int inicio, int termina) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Telefone"));
            colunas.add(new Coluna("Email"));
            colunas.add(new Coluna("CNPJ"));
            colunas.add(new Coluna("Dívida"));
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTodos);
            pstmt.setInt(1, inicio);
            pstmt.setInt(2, termina);
            ResultSet rs = pstmt.executeQuery();
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
            return tabela;
        }
    }

    public boolean insereCliente(Cliente novoCliente) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(sqlInsere);
            pstmt.setString(1, novoCliente.getNome());
            pstmt.setString(2, novoCliente.getTelefone());
            pstmt.setString(3, novoCliente.getEmail());
            pstmt.setString(4, novoCliente.getCnpj());
            pstmt.setDouble(5, novoCliente.getDivida());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conexao);
            return inseriu;
        }
    }
}
