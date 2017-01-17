
package Modelo;

import Excepciones.IntervalosfechaException;
import Excepciones.RegimenException;
import Modelo.obligaciones.Obligacion;
import java.util.HashSet;
import objetos.Fecha;
import objetos.HashConjunto;
import objetos.RFC;
import objetos.Regimen;
import objetos.TipodeDireccion;
import java.util.ArrayList;
import java.util.List;
import objetos.Periodicidad;
import objetos.Periodo;
import objetos.TipoPeriodo;

/**
 * @author Luis_Od
 */
public abstract class Persona {
    
    private RFC rfc;
    private HashSet<Direciones> direccion;
    private String telefono;
    private Fecha fechaInscripcion;
    private Fecha fechaOperaciones;
    private HashConjunto regimenes;
    private ArrayList<Obligacion> obligaciones;

    public Persona(RFC rfc, String telefono, Fecha fechaInscripcion, Fecha fechaOperaciones,ArrayList<Obligacion> obligaciones) throws IntervalosfechaException{
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaOperaciones = fechaOperaciones;
        direccion = new HashSet<>();
        regimenes = new HashConjunto();
        this.obligaciones = obligaciones;
    }

    private boolean isValido() {
        return false;
    }   
    
    public boolean addDireccion(Direciones dir){
        return direccion.add(dir);
    }
    public boolean isDireccion(TipodeDireccion td){
        return direccion.stream().filter(obj -> obj.getTipo() == td).count()>0;
    }
    public Direciones getDireccion(TipodeDireccion td){
        Direciones direccionRetorno = null;
        for(Direciones direccioncita : direccion){
            if(direccioncita.getTipo()==td){
                direccionRetorno = direccioncita;
            }
        }
        return direccionRetorno;
    }
    public List<Direciones> getDireciones(){
        return new ArrayList<>(direccion);
    }
    
    public void addRegimen(Regimen rgm) throws RegimenException{
        if(!regimenes.add(rgm)){
            throw new RegimenException();
        }
    }
    
    public RFC getRfc() {
        return rfc;
    }

    public void setRfc(RFC rfc) {
        this.rfc = rfc;
    }

    public HashSet<Direciones> getDireccion() {
        return direccion;
    }

    public void setDireccion(HashSet<Direciones> direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Fecha getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Fecha fechaInscripcion) throws IntervalosfechaException{        
        Fecha aux= this.fechaInscripcion;
        this.fechaInscripcion = fechaInscripcion;
        if(!isValido()){
            this.fechaInscripcion = aux;
            throw new IntervalosfechaException();
        }
    }

    public Fecha getFechaOperaciones() {
        return fechaOperaciones;
    }

    public void setFechaOperaciones(Fecha fechaOperaciones) {
        this.fechaOperaciones = fechaOperaciones;
    }
    public void actualizarObligaciones(){
        Integer anio = fechaInscripcion.getAnio();
        TipoPeriodo tp = TipoPeriodo.getPeriodo(getPeriodicidad(), fechaOperaciones);
        
        Periodo periodo = new Periodo(tp,anio);
        do{
            Obligacion obligacion = null;
        switch(regimen){
            case INCORPORACION:
                break;
            case
        }
        //obligaciones.add(inicial);
        }
        
                
    }
    public abstract Periodicidad getPeriodicidad();
    
}
