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
    
    public TEdit(String label, int size){
        super.setLayout(new FlowLayout(FlowLayout.LEFT));
        super.setOpaque(false);
        etiqueta = new JLabel(label);
        edit = new JTextField(size);
        super.add(etiqueta);
        super.add(edit);
    }
    
    public void setBounds(int x, int y){
        int etiquetaAncho = (int)etiqueta.getPreferredSize().getWidth();
        int editAncho = (int)edit.getPreferredSize().getWidth();
        int etiquetaAlto = (int)etiqueta.getPreferredSize().getHeight();
        int editAlta = (int)edit.getPreferredSize().getHeight(); 
        super.setBounds(
                x, 
                y, 
                10 + etiquetaAncho + editAncho , 
                10 + ( etiquetaAlto > editAlta ? etiquetaAlto : editAlta ) );
    }
    
    
    public String getText(){
        return edit.getText();
    }

    public JTextField getEdit() {
        return edit;
    }

    public void setEdit(JTextField edit) {
        this.edit = edit;
    }
    
}
