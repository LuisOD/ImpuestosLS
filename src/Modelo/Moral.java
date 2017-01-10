
package Modelo;

import java.util.HashSet;
import objetos.Fecha;
import objetos.RFC;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public class Moral extends Persona{
    private String razonSocial;
    private String tipoSociedad;
    private Fisica representanteLegal;
    private Fecha fechaCreacion;

    public Moral(String razonSocial, String tipoSociedad, Fisica representanteLegal, Fecha fechaCreacion, RFC rfc, HashSet<Direciones> dir, String tel, Fecha fechaInsc, Fecha fechaOper, HashSet<Regimen> reg) {
        super(rfc, dir, tel, fechaInsc, fechaOper, reg);
        this.razonSocial = razonSocial;
        this.tipoSociedad = tipoSociedad;
        this.representanteLegal = representanteLegal;
        this.fechaCreacion = fechaCreacion;
    }
    
    
    
}
