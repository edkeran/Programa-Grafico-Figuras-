/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;
import javax.swing.JComboBox;
/**
 *
 * @author EDGAR
 */
public class comboBox extends JComboBox {
    JComboBox caja1;
    String item="";
    public comboBox() {
        this.caja1 = new JComboBox();
        caja1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AZUL", "ROJO", "VERDE", "BLANCO","CYAN","ROSADO","NARANJA" }));
        add(caja1);
        caja1.getSelectedObjects();
    }
}
