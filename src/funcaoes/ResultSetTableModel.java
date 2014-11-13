/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoes;

import cargas.controller.TorasZequinhaDB;
import cliente.controller.ClienteDB;
import produto.controller.ProdutoDB;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * Implementação de um {@link TableModel} para renderizar o {@link ResultSet} de
 * uma consulta ao banco
 *
 * @author Ricardo Artur Staroski
 */
public class ResultSetTableModel extends AbstractTableModel {

    public ResultSetTableModel(ArrayList<Coluna> colunas) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Classe interna utilizada para armazenar os valores de um registro da
     * tabela
     */
    private static class Row {

        /**
         * Os valores de cada coluna do registro
         */
        public final Object[] VALUES;

        /**
         * Instancia um objeto {@link Row} para o {@link ResultSet} informado
         *
         * @param rs O {@link ResultSet} da linha a ser processada
         * @throws SQLException
         */
        public Row(final ResultSet rs) throws SQLException {
            final int columns = rs.getMetaData().getColumnCount();
            VALUES = new Object[columns];
            for (int i = 1; i <= columns; i++) {
                VALUES[i - 1] = rs.getObject(i);
            }
        }
    }
    // Classes serializável, declarar este atributo para não gerar warnings
    private static final long serialVersionUID = 1L;
    // linsta de colunas da tabela
    private List<Coluna> columns;
    // lista de registros da tabela
    private List<Row> lines;

    /**
     * Instancia um {@link ResultSetTableModel} para o {@link ResultSet}
     * informado
     *
     * @param rs O {@link ResultSet} que a {@link JTable} deste modelo irá
     * renderizar
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ResultSetTableModel(final ResultSet rs, ArrayList<Coluna> colunas) throws SQLException,
            ClassNotFoundException {
        columns = colunas;
        lines = new ArrayList<Row>();
        while (rs.next()) {
            lines.add(new Row(rs));
        }
    }

    @Override
    public Class<?> getColumnClass(final int columnIndex) {
        return columns.get(columnIndex).CLASS;
    }

    @Override
    public int getColumnCount() {
        return columns.size();
    }

    @Override
    public String getColumnName(final int column) {
        return columns.get(column).NAME;
    }

    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public Object getValueAt(final int rowIndex, final int columnIndex) {
        return lines.get(rowIndex).VALUES[columnIndex];
    }

    @Override
    public boolean isCellEditable(final int rowIndex, final int columnIndex) {
        return false;
    }
    
    public int removeCliente(int codigo){
        ClienteDB clientedb = new ClienteDB();
        boolean excluiu = clientedb.excluirCliente(codigo);
        if (excluiu) {
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Cliente não pode ser excluído");
        }
        return codigo;
    }

    public int removeProduto(int codigo){
        ProdutoDB produtodb = new ProdutoDB();
        boolean excluiu = produtodb.excluirProduto(codigo);
        if (excluiu) {
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Produto não pode ser excluído");
        }
        return codigo;
    }

    public int removeControleToras(int codigo){
        TorasZequinhaDB torasdb = new TorasZequinhaDB();
        boolean excluiu = torasdb.excluirToras(codigo);
        if (excluiu) {
            JOptionPane.showMessageDialog(null, "Linha excluída com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "A linha  não pode ser excluída");
        }
        return codigo;
    }
}