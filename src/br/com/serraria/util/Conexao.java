package br.com.serraria.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class Conexao {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB = "serraria";
    private static final String USER = "root";
    private static final String PASSWORD = "lod310893";
    private static final String SERVER = "localhost";
    private static final String URL = "jdbc:mysql://" + SERVER + ":3306/" + DB;

    public static Connection getConexao() {
        Connection conn;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro de driver: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
        }
        return null;
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
