package br.com.serraria.controller;

import br.com.serraria.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.serraria.model.Usuario;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class UsuarioDB {

    private static final String SQL_USER = "SELECT * FROM usuario WHERE login = ? AND senha = md5(?)";
    private static final String SQL_INSERT = "INSERT INTO usuario (login, senha) VALUES (?,?)";

    public boolean insereUsuario(Usuario novoUsuario) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(SQL_INSERT);
            pstmt.setString(1, novoUsuario.getLogin());
            pstmt.setString(2, novoUsuario.getSenha());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de SQl", 0);
        } finally {
            Conexao.fecharConexao(conexao);
        }
        return inseriu;
    }

    public Usuario getValidaUsuario(String login, String senha) {
        Usuario usuario = null;
        Connection conn = null;
        try {
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(SQL_USER);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();
            String auxlogin = "";
            String auxsenha = "";
            while (rs.next()) {
                auxlogin = rs.getString("login");
                auxsenha = rs.getString("senha");
            }
            usuario = new Usuario(auxlogin, auxsenha);
        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        } finally {
            Conexao.fecharConexao(conn);
        }
        return usuario;
    }
}
