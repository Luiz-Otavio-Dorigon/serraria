package br.com.serraria.controller;

import br.com.serraria.model.Empresa;
import br.com.serraria.util.Coluna;
import br.com.serraria.util.Conexao;
import br.com.serraria.util.ResultSetTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class EmpresaDB {
    
    private static final String SQL_INSERT = "INSERT INTO empresa (razao_social, nome_fantasia, cnpj, inscricao_estadual, inscricao_municipal, email, telefone) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_CONSULT = "SELECT * FROM empresa WHERE codigo = ?";
    private static final String SQL_ALL = "SELECT * FROM empresa ORDER BY codigo";
    
    public DefaultComboBoxModel getComboEmpresa(){
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        Connection conn = null;
        try{
            conn = Conexao.getConexao();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL_ALL);
            while (rs.next()) {
                int auxcodigo = rs.getInt("codigo");
                String auxrazaosocial = rs.getString("razao_social");
                String auxnomefantasia = rs.getString("nome_fantasia");
                String auxcnpj = rs.getString("cnpj");
                String auxinscricaoestadual = rs.getString("inscricao_estadual");
                String auxinscricaomunicipal = rs.getString("inscricao_municipal");
                String auxemail = rs.getString("email");
                String auxtelefone = rs.getString("telefone");
                Empresa empresa = new Empresa(auxcodigo, auxrazaosocial, auxnomefantasia, auxcnpj, auxinscricaoestadual, auxinscricaomunicipal, auxemail, auxtelefone);
                combo.addElement(empresa);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        }finally{
            Conexao.fecharConexao(conn);
        }
        return combo;
    }
    
    public ResultSetTableModel getConsultas(int campo, int tipo, String descricao) {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        String sql = "SELECT * FROM empresa";
        String auxCampo;
        switch (campo) {
            case 0:
                auxCampo = "codigo";
                break;
            case 1:
                auxCampo = "razao_social";
                break;
            case 2:
                auxCampo = "nome_fantasia";
                break;
            default:
                auxCampo = "cnpj";
                break;
        }
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Razão Social"));
            colunas.add(new Coluna("Nome Fantasia"));
            colunas.add(new Coluna("CNPJ"));
            colunas.add(new Coluna("Inscrição Estadual"));
            colunas.add(new Coluna("Inscrição Municipal"));
            colunas.add(new Coluna("Email"));
            colunas.add(new Coluna("Telefone"));
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
            sql = sql + " order by razao_social, codigo ";
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

    public ResultSetTableModel getEmpresas() {
        ResultSetTableModel tabela = null;
        ArrayList<Coluna> colunas = new ArrayList();
        Connection conn = null;
        try {
            colunas.add(new Coluna("Código"));
            colunas.add(new Coluna("Razão Social"));
            colunas.add(new Coluna("Nome Fantasia"));
            colunas.add(new Coluna("CNPJ"));
            colunas.add(new Coluna("Inscrição Estadual"));
            colunas.add(new Coluna("Inscrição Municipal"));
            colunas.add(new Coluna("Email"));
            colunas.add(new Coluna("Telefone"));
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_ALL);
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
    
    public boolean insereEmpresa(Empresa novaEmpresa) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SQL_INSERT);
            pstmt.setString(1, novaEmpresa.getRazaoSocial());
            pstmt.setString(2, novaEmpresa.getNomeFantasia());
            pstmt.setString(3, novaEmpresa.getCnpj());
            pstmt.setString(4, novaEmpresa.getInscricaoEstadual());
            pstmt.setString(5, novaEmpresa.getInscricaoMunicipal());
            pstmt.setString(6, novaEmpresa.getEmail());
            pstmt.setString(7, novaEmpresa.getTelefone());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conexao);
        }
        return inseriu;
    }
    
    public Empresa getEmpresa(int codigo) {
        Empresa empresa = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_CONSULT);
            pstmt.setInt(1, codigo);
            ResultSet rs = pstmt.executeQuery();
            int auxcodigo = 0;
            String auxrazaosocial = "";
            String auxnomefantasia = "";
            String auxcnpj = "";
            String auxinscricaoestadual = "";
            String auxinscricaomunicipal = "";
            String auxemail = "";
            String auxtelefone = "";
            while (rs.next()) {
                auxcodigo = rs.getInt("codigo");
                auxrazaosocial = rs.getString("razao_social");
                auxnomefantasia = rs.getString("nome_fantasia");
                auxcnpj = rs.getString("cnpj");
                auxinscricaoestadual = rs.getString("inscricao_estadual");
                auxinscricaomunicipal = rs.getString("inscricao_municipal");
                auxemail = rs.getString("email");
                auxtelefone = rs.getString("telefone");
            }
            empresa = new Empresa(auxcodigo, auxrazaosocial, auxnomefantasia, auxcnpj, auxinscricaoestadual, auxinscricaomunicipal, auxemail, auxtelefone);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQl: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return empresa;
    }
}
