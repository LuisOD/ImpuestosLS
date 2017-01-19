
package pantallas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        super.setSize(1000, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        super.setJMenuBar(cMenu());
       
        pnlBusqueda = new BusquedaPanel();
        pnlWork = new WorkPanel();
        toolbar = new JToolBar();
        
        btnPrueba = new JButton("Prueba");
        btnPrueba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inscribirPersonaFisicaClick();
            }
        });
        
        btnPruebaMoral = new JButton("Prueba");
        btnPruebaMoral.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inscribirPersonaMoralClick();
            }
        });  
        
        
        toolbar.add(btnPrueba);
        toolbar.add(btnPruebaMoral);
        
        
        dlgFisica = new FisicaDialog(this);

        
        dlgMoral = new MoralDialog(this);
        
        super.add(toolbar, BorderLayout.NORTH);        
        super.add(pnlBusqueda, BorderLayout.SOUTH);
        super.add(pnlWork, BorderLayout.CENTER);
        super.setVisible(true);
    }
    public JMenuBar cMenu(){
        JMenuBar menu = new JMenuBar();
        
        JMenu marchivo = new JMenu("Archivo");      
        JMenuItem mguardar = new JMenuItem("Guardar");
        JMenuItem mbuscar = new JMenuItem("Buscar");
        JMenuItem msalir = new JMenuItem("Salir");
        
        JMenu mcontribuyentes = new JMenu("Contribuyentes");
        JMenuItem mfisica = new JMenuItem("Inscribir persona Fisica...");
        JMenuItem mmoral = new JMenuItem("Inscribir persona Moral...");
        JMenuItem mmodificar = new JMenuItem("Modificar datos..");
        JMenuItem mdeclarar = new JMenuItem("Declarar...");
        JMenuItem mver = new JMenuItem("Ver obligaciones...");
        
        JMenu maiuda = new JMenu("Ayuda");
        JMenuItem macerca = new JMenuItem("Acerca de...");
        
        marchivo.add(mguardar);
        marchivo.add(mbuscar);
        marchivo.addSeparator();
        marchivo.add(msalir);
        mcontribuyentes.add(mfisica);
        mcontribuyentes.add(mmoral);
        mcontribuyentes.add(mmodificar);
        mcontribuyentes.addSeparator();
        mcontribuyentes.add(mver);
        mcontribuyentes.add(mdeclarar);
        maiuda.add(macerca);
        
        msalir.addActionListener((ae) -> { //cerrar la ventana principal
            System.exit(0);
        });
        
        menu.add(marchivo);
        menu.add(mcontribuyentes);
        menu.add(maiuda);
        return menu;
    }
    private void inscribirPersonaFisicaClick(){
        dlgFisica.setVisible(true);
        System.out.println("añkjfkadjns");
    }
    
    private void inscribirPersonaMoralClick(){
        dlgMoral.setVisible(true);
        System.out.println("añkjfkadjns");
    }   
}

