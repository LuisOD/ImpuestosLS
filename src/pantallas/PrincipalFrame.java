
package pantallas;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Luis_Od
 */
public class PrincipalFrame extends JFrame{
    private BusquedaPanel pnlBusqueda;
    private WorkPanel pnlwork;
    private JMenuBar menu;
    public PrincipalFrame(){
        super("Impuestos");
        super.setSize(700, 500);
       
        super.setVisible(true);
    }
    public JMenuBar setMenu(){
        menu = new JMenuBar();
        JMenu marchivo = new JMenu("Inscripcion");
        JMenuItem mfisica = new JMenu("Persona Fisica");
        JMenuItem mmoral = new JMenu("Persona Moral");
        JMenuItem msalir = new JMenu("Salir");
        
        marchivo.add(mfisica);
        marchivo.add(mmoral);
        marchivo.addSeparator();
        marchivo.add(msalir);
        
        menu.add(marchivo);
        return menu;
    }
}

