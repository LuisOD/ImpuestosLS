
package Modelo;

import Excepciones.FisicaException;
import java.util.HashSet;
import objetos.Fecha;
import objetos.RFC;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public class Fisica extends Persona{
    private String nombre;
    private String paterno;
    private String matern;
    private Fecha fechaNacimiento;

    public Fisica(String nom, String pat, String mat, Fecha fechaNac, RFC rfc, HashSet<Direciones> dir, String tel, Fecha fechaInsc, Fecha fechaOper, HashSet<Regimen> reg) {
        super(rfc, dir, tel, fechaInsc, fechaOper, reg);
        this.nombre = nom;
        this.paterno = pat;
        this.matern = mat;
        this.fechaNacimiento = fechaNac;
    }
  
    public void valida() throws FisicaException{
        //int fisAux = 0;
        //if(() == this.fechaNacimiento){
            
        //}else{
        //    throw new FisicaException("Error");
        //}
        //return false;
    }
   
    
    
}
