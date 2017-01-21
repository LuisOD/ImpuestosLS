
package pantallas;

import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;
import Modelo.Persona;
import javax.swing.JFrame;

/**
 *
 * @author Luis_Od
 */
public class FisicaDialog extends PersonaDialog{
     public FisicaDialog(JFrame frame) {
        super(frame);
    }

    @Override
    protected Persona crearObjeto() throws IntervalosfechaException, PersonaFisicaException {
        throw new PersonaFisicaException();
    }
    
}
