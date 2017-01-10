
package Modelo;

import java.util.HashSet;
import objetos.Fecha;
import objetos.RFC;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public abstract class Persona {
    
    
    private RFC rfc;
    private HashSet<Direciones> direccion;
    private String telefono;
    private Fecha fechaInscripcion;
    private Fecha fechaOperaciones;
    private HashSet<Regimen> regimen;

    public Persona(RFC rfc, HashSet<Direciones> dir, String tel, Fecha fechaInsc, Fecha fechaOper, HashSet<Regimen> reg) {
        this.rfc = rfc;
        this.direccion = dir;
        this.telefono = tel;
        this.fechaInscripcion = fechaInsc;
        this.fechaOperaciones = fechaOper;
        this.regimen = reg;
    }
   
    
    
    
}
