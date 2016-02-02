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
import br.com.serraria.model.Romaneio;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class RomaneioDB {

    private static final String sqlInsere = "INSERT INTO romaneio(data,transportador,motorista,placa,cli_codigo,pecas_total,metros_total,media_valor,valor_total,"
            + "valor_pago, tipo, emp_codigo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String sqlUltimo = "SELECT MAX(numero) AS ultimo FROM romaneio";
    private static final String sqlAltera = "UPDATE romaneio SET pecas_total = ?, metros_total = ?, media_valor = ?, valor_total = ?, valor_pago = ? WHERE numero = ?";
    private static final String sqlTodos = "SELECT romaneio.numero, romaneio.cli_codigo, cliente.nome AS clinome, DATE_FORMAT(romaneio.data, '%d/%m/%Y') AS novadata, romaneio.valor_pago, romaneio.valor_total, romaneio.tipo FROM romaneio, cliente "
            + "WHERE romaneio.cli_codigo = cliente.codigo ORDER BY romaneio.numero DESC LIMIT ?, ?";
    private static final String sqlAlteraItens = "UPDATE romaneio SET pecas_total = ?, metros_total = ?, media_valor = ?, valor_total = ? WHERE numero = ?";
    private static final String sqlTotal = "SELECT valor_total, valor_pago FROM romaneio WHERE numero = ?";
    private static final String sqlTotais = "SELECT pecas_total, metros_total, media_valor, valor_total, valor_pago FROM romaneio WHERE romaneio.numero = ?";
    private static final String sqlTotalItens = "SELECT COUNT(*) AS total FROM romaneio";

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
    
    public Romaneio getTotais(int numero) {
        Romaneio romaneio = null;
        float totalMetros = 0, mediaValor = 0, totalValor = 0, pago = 0;
        int totalPecas = 0;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTotais);
            pstmt.setInt(1, numero);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                totalPecas = rs.getInt("pecas_total");
                totalMetros = rs.getFloat("metros_total");
                mediaValor = rs.getFloat("media_valor");
                totalValor = rs.getFloat("valor_total");
                pago = rs.getFloat("valor_pago");
            }
            romaneio = new Romaneio(totalPecas, totalMetros, mediaValor, totalValor, pago);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return romaneio;
    }

    public Romaneio getValores(int numero) {
        Romaneio romaneio = null;
        float total = 0, pago = 0;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlTotal);
            pstmt.setInt(1, numero);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                total = rs.getFloat("valor_total");
                pago = rs.getFloat("valor_pago");
            }
            romaneio = new Romaneio(total, pago);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return romaneio;
    }

    public boolean alteraRomaneioItens(Romaneio total) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlAlteraItens);
            pstmt.setInt(1, total.getPecasTotal());
            pstmt.setFloat(2, total.getMetrosTotal());
            pstmt.setFloat(3, total.getMediaValor());
            pstmt.setFloat(4, total.getValorTotal());
            pstmt.setFloat(5, total.getNumero());
            pstmt.executeUpdate();
            alterou = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return alterou;
    }

    public ResultSetTableModel getConsultar(int campo, int tipo, String descricao) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        String sql = "SELECT romaneio.numero, romaneio.cli_codigo, cliente.nome AS clinome, DATE_FORMAT(romaneio.data, '%d/%m/%Y') AS novadata, romaneio.valor_pago, romaneio.valor_total, romaneio.tipo FROM romaneio, cliente "
                + "WHERE romaneio.cli_codigo = cliente.codigo";
        String auxCampo = "";
        if (campo == 0) {
            auxCampo = "romaneio.numero";
        } else if (campo == 1) {
            auxCampo = "romaneio.data";
        } else if (campo == 2) {
            auxCampo = "romaneio.valor_pago";
        } else if (campo == 3) {
            auxCampo = "romaneio.valor_total";
        } else {
            auxCampo = "cliente.nome";
        }
        try {
            colunas.add(new Coluna("Número Romaneio"));
            colunas.add(new Coluna("Cliente"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Data"));
            colunas.add(new Coluna("Valor Pago"));
            colunas.add(new Coluna("Valor Total"));
            colunas.add(new Coluna("Tipo"));
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
            sql = sql + " ORDER BY " + auxCampo;
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

    public ResultSetTableModel getRomaneios(int inicio, int termina) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        try {
            colunas.add(new Coluna("Número Romaneio"));
            colunas.add(new Coluna("Cliente"));
            colunas.add(new Coluna("Nome"));
            colunas.add(new Coluna("Data"));
            colunas.add(new Coluna("Valor Pago"));
            colunas.add(new Coluna("Valor Total"));
            colunas.add(new Coluna("Tipo"));
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

    public boolean alteraRomaneio(Romaneio total) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlAltera);
            pstmt.setInt(1, total.getPecasTotal());
            pstmt.setFloat(2, total.getMetrosTotal());
            pstmt.setFloat(3, total.getMediaValor());
            pstmt.setFloat(4, total.getValorTotal());
            pstmt.setFloat(5, total.getValorPago());
            pstmt.setFloat(6, total.getNumero());
            pstmt.executeUpdate();
            alterou = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return alterou;
    }

    public int getUltimo() {
        int ultimo = 0;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            Statement pstmt = conn.createStatement();
            ResultSet rs = pstmt.executeQuery(sqlUltimo);
            while (rs.next()) {
                ultimo = rs.getInt("ultimo");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return ultimo;
    }

    public boolean insereRomaneio(Romaneio novoRomaneio) {
        boolean inseriu = false;
        int auxRomaneio;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(sqlInsere);
            pstmt.setString(1, novoRomaneio.getData());
            pstmt.setString(2, novoRomaneio.getTransportador());
            pstmt.setString(3, novoRomaneio.getMotorista());
            pstmt.setString(4, novoRomaneio.getPlaca());
            pstmt.setInt(5, novoRomaneio.getCliCodigo());
            pstmt.setInt(6, novoRomaneio.getPecasTotal());
            pstmt.setFloat(7, novoRomaneio.getMetrosTotal());
            pstmt.setFloat(8, novoRomaneio.getMediaValor());
            pstmt.setFloat(9, novoRomaneio.getValorTotal());
            pstmt.setFloat(10, novoRomaneio.getValorPago());
            pstmt.setInt(11, novoRomaneio.getTipo());
            pstmt.setInt(12, novoRomaneio.getEmpresaCodigo());
            auxRomaneio = pstmt.executeUpdate();
            if (auxRomaneio != 0) {
                inseriu = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conexao);
        }
        return inseriu;
    }
}
