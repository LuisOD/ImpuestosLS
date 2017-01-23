
package pantallas;

import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;
import Excepciones.RFCException;
import Modelo.Fisica;
import Modelo.Persona;
import javax.swing.JFrame;
import objetos.Fecha;
import objetos.RFC;
import objetos.TipodePersona;
import pantallas.componentes.TEdit;

/**
 *
 * @author Luis_Od
 */
public class FisicaDialog extends PersonaDialog{
    private TEdit edtNombre;
    private TEdit edtPaterno;
    private TEdit edtMaterno;
    
    public FisicaDialog(JFrame frame) {
        super(frame);
        
        edtNombre = new TEdit("Nombre:", 7);
        edtNombre.setBounds(50, 100);
        edtPaterno = new TEdit("Paterno", 6);
        edtPaterno.setBounds(230, 100);
        edtMaterno = new TEdit("Materno", 6);
        edtMaterno.setBounds(400, 100);
        
        super.getPnlElementos().add(edtNombre);
        super.getPnlElementos().add(edtPaterno);
        super.getPnlElementos().add(edtMaterno);

    }

    @Override
    protected Persona crearObjeto() throws IntervalosfechaException, PersonaFisicaException, RFCException {
        Fisica fisica = new Fisica(new RFC(super.edtRFC.getText(), TipodePersona.Fisica), 
                edtNombre.getText(), 
                edtPaterno.getText(), 
                edtMaterno.getText(), 
                new Fecha(4,9,1981), 
                super.edtTelefono.getText(), 
                new Fecha(), 
                new Fecha());
        return fisica;
    }
}
