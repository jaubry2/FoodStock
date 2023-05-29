package interfaceGraphique;

import javax.swing.table.DefaultTableModel;

public class EditableTableModel extends DefaultTableModel {
    @Override
    public boolean isCellEditable(int row, int column) {
        // Rendre toutes les cellules éditables
        return true;
    }
}

