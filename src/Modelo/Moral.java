
package Modelo;

import Excepciones.IntervalosfechaException;
import java.util.HashSet;
import objetos.Fecha;
import objetos.RFC;
import objetos.Regimen;

/**
 * @author Luis_Od
 */
public class Moral extends Persona{
    private String razonSocial;
    private String tipoSociedad;
    private Fisica representanteLegal;
    private Fecha fechaCreacion;

    public Moral(RFC rfc, String telefono, Fecha fechaInscripcion, Fecha fechaOperaciones, String razonSocial, String tipoSociedad, Fisica representanteLegal, Fecha fechaCreacion) throws IntervalosfechaException {
        super(rfc, telefono, fechaInscripcion, fechaOperaciones);
        this.razonSocial = razonSocial;
        this.tipoSociedad = tipoSociedad;
        this.representanteLegal = representanteLegal;
        this.fechaCreacion = fechaCreacion;
    }

    
    
    
    
}
