
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
    public boolean addDireccion(Direccion dir){
        return direciones.add(dir);
    }
    public boolean isDireccion(TipoDireccion td){
        return false;
    }
    public Direccion getDireccion(TipoDireccion td){
        return null;        
    }
    public List<Direccion> getDireccion(){
        
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

    public void setFechaInscripcion(Fecha fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Fecha getFechaOperaciones() {
        return fechaOperaciones;
    }

    public void setFechaOperaciones(Fecha fechaOperaciones) {
        this.fechaOperaciones = fechaOperaciones;
    }

    public HashSet<Regimen> getRegimen() {
        return regimen;
    }

    public void setRegimen(HashSet<Regimen> regimen) {
        this.regimen = regimen;
    }
   
    
    
    
}
