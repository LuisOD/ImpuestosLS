
package Modelo;

import Excepciones.FisicaException;
import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;
import java.util.HashSet;
import objetos.Fecha;
import objetos.RFC;
import objetos.Regimen;

/**
 * @author Luis_Od
 */
public class Fisica extends Persona{
    private String nombre;
    private String paterno;
    private String matern;
    private Fecha fechaNacimiento;

    public Fisica(RFC rfc, String telefono, Fecha fechaInscripcion, Fecha fechaOperaciones, String nombre, String paterno, String matern, Fecha fechaNacimiento) throws IntervalosfechaException, PersonaFisicaException {
        super(rfc, telefono, fechaInscripcion, fechaOperaciones);
        this.nombre = nombre;
        this.paterno = paterno;
        this.matern = matern;
        this.fechaNacimiento = fechaNacimiento;
        if(!isValido()){
            throw new PersonaFisicaException();
        }
    }
    
    public boolean isValido(){
        boolean resultado = isValido();
        return resultado && fechaNacimiento.diferenciaAnios() >= 18;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMatern() {
        return matern;
    }

    public void setMatern(String matern) {
        this.matern = matern;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
