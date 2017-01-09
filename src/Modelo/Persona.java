
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
    
    
}
