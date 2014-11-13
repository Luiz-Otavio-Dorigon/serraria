/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Conexao {

    //Classe do driver do banco de dados

    private static String driver = "com.mysql.jdbc.Driver";
    //Nome do banco de dados
    private static String banco = "serraria";
    //Usuário do banco de dados
    private static String usuario = "root";
    //Senha do banco de dados
    private static String senha = "lod310893";
    //Servidor do banco de dados
    private static String servidor = "localhost";
    //URL conexão
    private static String url = "jdbc:mysql://" + servidor + ":3306/" + banco;

    public static Connection getConexao() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro de driver: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de driver: " + e.getMessage());
        } finally {
            return conn;
        }
    }

    public static void fecharConexao(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }
}
