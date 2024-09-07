
package Modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Tables extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(
            JTable jtable, Object o, boolean bln, boolean bln1, int row, int col) {
        super.getTableCellRendererComponent(jtable, o, bln, bln1, row, col);
        switch (jtable.getValueAt(row, 6).toString()) {
            case "PENDIENTE" -> {
                setBackground(new Color(255,51,51));
                setForeground(Color.white);
            }
            case "FINALIZADO" -> {
                setBackground(new Color(1,202,2));
                setForeground(Color.white);
            }
            default -> {
                    setBackground(Color.white);
                    setForeground(Color.black);
            }
        }
        return this;
    }
}
