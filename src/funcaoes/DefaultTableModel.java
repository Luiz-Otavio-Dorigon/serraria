/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcaoes;

/**
 *
 * @author dorigon
 */
public class DefaultTableModel extends javax.swing.table.DefaultTableModel {

    @Override
    public boolean isCellEditable(int row, int column) {                                                                    
         return false;
    }   
}
