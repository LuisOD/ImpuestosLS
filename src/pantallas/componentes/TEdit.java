/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.componentes;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Luis_Od
 */
public class TEdit extends JPanel{
    private JTextField edit;
    private JLabel etiqueta;
    public TEdit(String lbl, int size){
        super.setLayout(new FlowLayout(FlowLayout.LEFT));
        etiqueta = new JLabel(lbl);
        edit = new JTextField(size);
        int etiquetaAlto = (int) edit.getPreferredSize().getWidth();
        int edit = (int)
        super.setBounds(x, y, size, size);
        super.add(etiqueta);
        super.add(edit);
    }
}
