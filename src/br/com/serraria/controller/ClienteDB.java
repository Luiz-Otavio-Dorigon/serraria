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
import br.com.serraria.model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class ClienteDB {

    private static final String SQL_INSERT = "INSERT INTO cliente (nome,telefone,email,cnpj,divida) VALUES (?,?,?,?,?)";
    private static final String SQL_ALL = "SELECT * FROM cliente ORDER BY codigo LIMIT ?, ?";
    private static final String SQL_COUNT = "SELECT COUNT(*) AS total FROM cliente";
    private static final String SQL_DEBT = "UPDATE cliente SET divida = ? WHERE codigo = ?";
    private static final String SQL_CONSULT = "SELECT * FROM cliente WHERE codigo = ?";
    private static final String SQL_UPDATE = "UPDATE cliente SET nome = ?, telefone = ?, email = ?, cnpj = ? WHERE codigo = ?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE codigo = ?";
    private static final String SQL_CNPJ = "SELECT cnpj FROM cliente WHERE cnpj = ?";

    public int getTotalRegistros() {
        Connection conn = null;
        int total = 0;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_COUNT);
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

    public Cliente getConsultaCnpj(String cnpj) {
        Cliente cliente = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_CNPJ);
            pstmt.setString(1, cnpj);
            ResultSet rs = pstmt.executeQuery();
            String auxcnpj = "";
            while (rs.next()) {
                auxcnpj = rs.getString("cnpj");
            }
            cliente = new Cliente(auxcnpj);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return cliente;
    }

    public boolean excluirCliente(int codigo) {
        boolean excluiu = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_DELETE);
            pstmt.setInt(1, codigo);
            pstmt.executeUpdate();
            excluiu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return excluiu;
    }

    public Cliente getConsultar(int codigo) {
        Cliente cliente = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_CONSULT);
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
        }
        return cliente;
    }

    public boolean alteraCliente(Cliente cliente) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE);
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
        }
        return alterou;
    }

    public Cliente getConsultaDivida(int codigo) {
        Cliente cliente = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_CONSULT);
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
        }
        return cliente;
    }

    public boolean alteraDivida(Cliente cliente) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_DEBT);
            pstmt.setDouble(1, cliente.getDivida());
            pstmt.setInt(2, cliente.getCodigo());
            pstmt.executeUpdate();
            alterou = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return alterou;
    }

    public ResultSetTableModel getConsultas(int campo, int tipo, String descricao) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        String sql = "SELECT * FROM cliente";
        String auxCampo;
        switch (campo) {
            case 0:
                auxCampo = "codigo";
                break;
            case 1:
                auxCampo = "nome";
                break;
            default:
                auxCampo = "cnpj";
                break;
        }
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Telefone"));
            colunas.add(new Coluna("Email"));
            colunas.add(new Coluna("CNPJ"));
            colunas.add(new Coluna("Dívida"));
            conn = Conexao.getConexao();
            switch (tipo) {
                case 0:
                    sql = sql + " WHERE UPPER(" + auxCampo + ") = UPPER('" + descricao + "')";
                    break;
                case 1:
                    sql = sql + " WHERE UPPER(" + auxCampo + ") LIKE UPPER('" + descricao + "%')";
                    break;
                case 2:
                    sql = sql + " WHERE UPPER(" + auxCampo + ") LIKE UPPER('%" + descricao + "')";
                    break;
                default:
                    sql = sql + " WHERE UPPER(" + auxCampo + ") LIKE UPPER('%" + descricao + "%')";
                    break;
            }
            sql = sql + " order by nome, codigo ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro classe não encontrada: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return tabela;
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
            PreparedStatement pstmt = conn.prepareStatement(SQL_ALL);
            pstmt.setInt(1, inicio);
            pstmt.setInt(2, termina);
            ResultSet rs = pstmt.executeQuery();
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro classe não encontrada: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return tabela;
    }

    public boolean insereCliente(Cliente novoCliente) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SQL_INSERT);
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
        }
        return inseriu;
    }
}
