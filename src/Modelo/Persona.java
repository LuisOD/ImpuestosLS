
package Modelo;

import Excepciones.IntervalosfechaException;
import java.util.HashSet;
import objetos.Fecha;
import objetos.HashConjunto;
import objetos.RFC;
import objetos.Regimen;
import objetos.TipodeDireccion;

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
    private HashConjunto regimenes;

    public Persona(RFC rfc, String telefono, Fecha fechaInscripcion, Fecha fechaOperaciones) throws IntervalosfechaException{
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaOperaciones = fechaOperaciones;
        
        if(isValida()){
            throw new IntervalosfechaException();
        }
    }
         
    public boolean isValida(){
        return.fechaInscripcion.compareTo(fechaInscripcion <= 0);
    }
    
    public boolean addDireciones(Direciones dir){
        return Direciones.add(dir);
    }
    public boolean isDireccion(TipodeDireccion td){
        return direciones.Stream().filter(obj -> obj.getTipo() == td).count()>0;
    }
    public Direcion getDireccion(TipodeDireccion td){
        Direccion direccionRetorno = null;
        for(Direccion direncioncita : direciones){
            if(direcioncita.getTipo()==td){
                direcionRetorno = direcioncita;
            }
        }
        return direccionRetorno;
    }
    public List<Direcion> getDireciones(){
        
    }
    public void addRegimen(Regimen rgm) throws RegimenException{
        if(!Regimenes.add(rgm)){
            throw new RegimenException;
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
        if(!isValida()){
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
    
    
}
