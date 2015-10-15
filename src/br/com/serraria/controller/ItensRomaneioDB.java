package br.com.serraria.controller;

import br.com.serraria.util.Coluna;
import br.com.serraria.util.ResultSetTableModel;
import br.com.serraria.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import br.com.serraria.model.ItensRomaneio;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class ItensRomaneioDB {

    private static final String sqlInsere = "INSERT INTO itens_romaneio(numero_romaneio, sequencia, codigo_produto, "
            + "valor_unit, especura, largura, comprimento, num_pecas, metros,total, produto,tipo) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String sqlConsulta = "SELECT sequencia,numero_romaneio,codigo_produto,produto,tipo,especura,"
            + "largura,comprimento,valor_unit,num_pecas,metros,total FROM itens_romaneio WHERE numero_romaneio = ?";
    private static final String sqlAltera = "UPDATE itens_romaneio SET codigo_produto = ?, valor_unit = ?, especura = ?, largura = ?, comprimento = ?, num_pecas = ?, metros = ?, "
            + "total = ?, produto = ?, tipo = ? WHERE numero_romaneio = ? AND sequencia = ?";    
    private static final String sqlSequencia = "SELECT MAX(sequencia) AS ultima FROM itens_romaneio WHERE numero_romaneio = ?";
    private static final String sqlMedia = "SELECT avg(valor_unit) AS media FROM itens_romaneio WHERE numero_romaneio = ?";

    public float getMedia(int numero) {
        float mediaValor = 0;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlMedia);
            pstmt.setInt(1, numero);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mediaValor = rs.getFloat("media");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de SQl" ,0);
        } finally {
            Conexao.fecharConexao(conn);
        }
        return mediaValor;
    }

    public int getSequencia(int numeroRomaneio) {
        int ultima = 0;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlSequencia);
            pstmt.setInt(1, numeroRomaneio);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ultima = rs.getInt("ultima");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de SQl" ,0);
        } finally {
            Conexao.fecharConexao(conn);
        }
        return ultima;
    }

    public boolean alteraItens(ItensRomaneio itensRomaneio) {
        boolean alterou = false;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlAltera);
            pstmt.setInt(1, itensRomaneio.getProCodigo());
            pstmt.setFloat(2, itensRomaneio.getValorUnit());
            pstmt.setFloat(3, itensRomaneio.getEspecura());
            pstmt.setFloat(4, itensRomaneio.getLargura());
            pstmt.setFloat(5, itensRomaneio.getComprimento());
            pstmt.setInt(6, itensRomaneio.getNumPecas());
            pstmt.setFloat(7, itensRomaneio.getMetros());
            pstmt.setFloat(8, itensRomaneio.getTotal());
            pstmt.setString(9, itensRomaneio.getProduto());
            pstmt.setString(10, itensRomaneio.getTipo());
            pstmt.setInt(11, itensRomaneio.getNumeroRomaneio());
            pstmt.setInt(12, itensRomaneio.getSequencia());
            pstmt.executeUpdate();
            alterou = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de SQl" ,0);
        } finally {
            Conexao.fecharConexao(conn);
        }
        return alterou;
    }

    public ResultSetTableModel getItens(int numero) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        try {
            colunas.add(new Coluna("Sequência"));//0
            colunas.add(new Coluna("Número"));//1
            colunas.add(new Coluna("Produto"));//2
            colunas.add(new Coluna("Descrição"));//3
            colunas.add(new Coluna("Tipo"));//4
            colunas.add(new Coluna("Espeçura"));//5
            colunas.add(new Coluna("Largura"));//6
            colunas.add(new Coluna("Comprimento"));//7
            colunas.add(new Coluna("Valor Unitário"));//8
            colunas.add(new Coluna("Número de Peças"));//9
            colunas.add(new Coluna("Metros"));//10
            colunas.add(new Coluna("Total"));//11
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlConsulta);
            pstmt.setInt(1, numero);
            ResultSet rs = pstmt.executeQuery();
            tabela = new ResultSetTableModel(rs, colunas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de SQl" ,0);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro classe não encontrada: " +e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return tabela;
    }

    public boolean insereItensRomaneio(ItensRomaneio novoItensRomaneio) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(sqlInsere);
            pstmt.setInt(1, novoItensRomaneio.getNumeroRomaneio());
            pstmt.setInt(2, novoItensRomaneio.getSequencia());
            pstmt.setInt(3, novoItensRomaneio.getProCodigo());
            pstmt.setFloat(4, novoItensRomaneio.getValorUnit());
            pstmt.setFloat(5, novoItensRomaneio.getEspecura());
            pstmt.setFloat(6, novoItensRomaneio.getLargura());
            pstmt.setFloat(7, novoItensRomaneio.getComprimento());
            pstmt.setInt(8, novoItensRomaneio.getNumPecas());
            pstmt.setFloat(9, novoItensRomaneio.getMetros());
            pstmt.setFloat(10, novoItensRomaneio.getTotal());
            pstmt.setString(11, novoItensRomaneio.getProduto());
            pstmt.setString(12, novoItensRomaneio.getTipo());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de SQl" ,0);
        } finally {
            Conexao.fecharConexao(conexao);
        }
        return inseriu;
    }
}
