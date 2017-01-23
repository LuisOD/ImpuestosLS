/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;
import Excepciones.RFCException;
import Modelo.Moral;
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
public class MoralDialog extends PersonaDialog{
    private TEdit edtRazonSocial;
    private TEdit edtTipoSociedad;
    
    public MoralDialog(JFrame frame) {
        super(frame);
        
        edtRazonSocial = new TEdit("RazonSocial:", 7);
        edtRazonSocial.setBounds(50, 100);
        edtTipoSociedad = new TEdit("Tipo", 6);
        edtTipoSociedad.setBounds(230, 100);
        
        super.getPnlElementos().add(edtRazonSocial);
        super.getPnlElementos().add(edtTipoSociedad);
        
    }

    @Override
    protected Persona crearObjeto() throws IntervalosfechaException, PersonaFisicaException, RFCException {
        Moral moral = new Moral (new RFC(super.edtRFC.getText(), TipodePersona.Moral), 
                edtRazonSocial.getText(), edtTipoSociedad.getText(), 
                null, 
                super.edtTelefono.getText(), 
                new Fecha(), 
                new Fecha(),
                new Fecha());    
        return moral;
    }
}
