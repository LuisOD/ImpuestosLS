/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;
import Modelo.Persona;
import javax.swing.JFrame;

/**
 *
 * @author Luis_Od
 */
public class MoralDialog extends PersonaDialog{
    public MoralDialog(JFrame frame) {
        super(frame);
    }

    @Override
    protected Persona crearObjeto() throws IntervalosfechaException, PersonaFisicaException {
        throw new IntervalosfechaException();
    }
}
