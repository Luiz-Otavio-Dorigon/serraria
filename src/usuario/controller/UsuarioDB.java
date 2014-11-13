/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario.controller;

import funcaoes.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import usuario.model.Usuario;

/**
 *
 * @author dorigon
 */
public class UsuarioDB {
    
    private static String sqlUsuario = "SELECT * FROM usuario WHERE login = ? AND senha = md5(?)";
    private static String sqlInsere = "INSERT INTO usuario (login, senha) VALUES (?,?)";
    
    public boolean insereUsuario(Usuario novoUsuario) {
        boolean inseriu = false;
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();
            PreparedStatement pstmt = conexao.prepareStatement(sqlInsere);
            pstmt.setString(1, novoUsuario.getLogin());
            pstmt.setString(2, novoUsuario.getSenha());
            pstmt.executeUpdate();
            inseriu = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro de SQl", 0);
        } finally {
            Conexao.fecharConexao(conexao);
            return inseriu;
        }
    }
    
    public Usuario getValidaUsuario(String login, String senha){
        Usuario usuario = null;
        Connection conn = null;
        try{
            conn = Conexao.getConexao();
            PreparedStatement pstmt = conn.prepareStatement(sqlUsuario);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();
            String auxlogin = "";
            String auxsenha = "";
            while(rs.next()){
                auxlogin = rs.getString("login");
                auxsenha = rs.getString("senha");
            }
            usuario = new Usuario(auxlogin, auxsenha);
        }catch(SQLException e){
            System.out.println("Erro de SQL: " + e.getMessage());
        }finally{
            Conexao.fecharConexao(conn);
            return usuario;
        }
    }
}
