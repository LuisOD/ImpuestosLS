
package Modelo;

import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;
import Modelo.obligaciones.Obligacion;
import java.util.ArrayList;
import objetos.Fecha;
import objetos.RFC;


/**
 * @author Luis_Od
 */
public class Fisica extends Persona{
   private String nombre;
    private String paterno;
    private String materno;
    private Fecha fechaNacimiento;

    public Fisica(RFC rfc,String nombre, String paterno, String materno, Fecha fechaNacimiento,
             String telefono, Fecha fechaInscripcion, Fecha fechaOperaciones) throws IntervalosfechaException, PersonaFisicaException {
        super(rfc, telefono, fechaInscripcion, fechaOperaciones);
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.fechaNacimiento = fechaNacimiento;
        if (!isValido()){
            throw new PersonaFisicaException();
        }
    }



    
   @Override
    public boolean isValido() {
        boolean resultado = super.isValido();
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

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEdad() {
        return fechaNacimiento.diferenciaAnios();
    }
   
    
    
}
