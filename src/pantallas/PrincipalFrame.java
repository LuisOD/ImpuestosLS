
package pantallas;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

/**
 *
 * @author Luis_Od
 */
public class PrincipalFrame extends JFrame{
    private BusquedaPanel pnlBusqueda;
    private WorkPanel pnlWork;
    private JToolBar toolbar;
    
    private FisicaDialog dlgFisica;
    private MoralDialog dlgMoral;
    
    private JButton btnPrueba;
    private JButton btnPruebaMoral;
    public PrincipalFrame(){
        super("Impuestos");
        super.setSize(1024, 768);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setJMenuBar(cMenu());
       
        super.setVisible(true);
    }
    public JMenuBar cMenu(){
        JMenuBar menu = new JMenuBar();
        
        JMenu marchivo = new JMenu("Archivo");      
        JMenuItem mguardar = new JMenu("Guardar");
        JMenuItem mbuscar = new JMenu("Buscar");
        JMenuItem msalir = new JMenu("Salir");
        
        JMenu mcontribuyentes = new JMenu("Contribuyentes");
        JMenuItem mmFisica = new JMenuItem("Inscribir persona Fisica...");
        JMenuItem mmMoral = new JMenuItem("Inscribir persona Moral...");
        JMenuItem mmModificar = new JMenuItem("Modificar datos..");
        JMenuItem mmDeclarar = new JMenuItem("Declarar...");
        JMenuItem mmVer = new JMenuItem("Ver obligaciones...");
        
        JMenu maiuda = new JMenu("Ayuda");
        JMenuItem macerca = new JMenuItem("Acerca de...");
        
        marchivo.add(mguardar);
        marchivo.add(mbuscar);
        marchivo.addSeparator();
        marchivo.add(msalir);
        mcontribuyentes.add(mmFisica);
        mcontribuyentes.add(mmMoral);
        mcontribuyentes.add(mmModificar);
        mcontribuyentes.addSeparator();
        mcontribuyentes.add(mmVer);
        mcontribuyentes.add(mmDeclarar);
        maiuda.add(macerca);
        
        menu.add(marchivo);
        menu.add(mcontribuyentes);
        menu.add(maiuda);
        return menu;
    }
}

