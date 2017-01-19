
package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Luis_Od
 */
public class BusquedaPanel extends JPanel{
    private JLabel txtRFC;
    private JLabel txtNombre;
    private JTextField edtRFC;
    private JTextField edtNombre;
    private JButton btnBuscar;
    
    public BusquedaPanel(){
        //setBackground(Color.RED);
        //setPreferredSize(new Dimension(0, 100));
        setLayout(new BorderLayout());
        
        txtRFC = new JLabel("R.F.C.:");
        edtRFC = new JTextField(6);
        
        txtNombre = new JLabel("Nombre:");
        edtNombre = new JTextField(10);
        
        btnBuscar = new JButton("Buscar");        
        
        JPanel pnlControles = new JPanel();
        //pnlControles.setBackground(Color.GREEN);
        pnlControles.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnlControles.add(txtRFC);
        pnlControles.add(edtRFC);
        pnlControles.add(txtNombre);
        pnlControles.add(edtNombre);        
        
        JPanel pnlBotones = new JPanel();
       // pnlBotones.setBackground(Color.PINK);
        pnlBotones.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlBotones.add(btnBuscar);
        

        add(pnlControles, BorderLayout.WEST);
        add(pnlBotones, BorderLayout.EAST);
    }
}
