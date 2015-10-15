package br.com.serraria.util;

/**
 *
 * @author Luiz Otávio Dorigon
 */
public class DefaultTableModel extends javax.swing.table.DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {                                                                    
         return false;
    }   
}
