package br.com.serraria.util;

import br.com.serraria.controller.TorasZequinhaDB;
import br.com.serraria.controller.ClienteDB;
import br.com.serraria.controller.ProdutoDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class ResultSetTableModel extends AbstractTableModel {

    public ResultSetTableModel(ArrayList<Coluna> colunas) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private static class Row {

        public final Object[] VALUES;

        public Row(final ResultSet rs) throws SQLException {
            final int columns = rs.getMetaData().getColumnCount();
            VALUES = new Object[columns];
            for (int i = 1; i <= columns; i++) {
                VALUES[i - 1] = rs.getObject(i);
            }
        }
    }
    private static final long serialVersionUID = 1L;
    private List<Coluna> columns;
    private List<Row> lines;

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