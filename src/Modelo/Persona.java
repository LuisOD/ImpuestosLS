package Modelo;

import Excepciones.IntervalosfechaException;
import Excepciones.RegimenException;
import Modelo.obligaciones.Cedular;
import Modelo.obligaciones.Hospedaje;
import Modelo.obligaciones.Ieps;
import Modelo.obligaciones.Incorporacion;
import Modelo.obligaciones.Intermedio;
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

    public Persona(RFC rfc, String telefono, Fecha fechaInscripcion, Fecha fechaOperaciones) throws IntervalosfechaException{
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaOperaciones = fechaOperaciones;
        direccion = new HashSet<>();
        regimenes = new HashConjunto();
        this.obligaciones = obligaciones;
    }

    public boolean isValido() {
         return fechaInscripcion.compareTo(fechaOperaciones) <= 0;
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
    public void actualizarObligaciones(){
        Integer anio = fechaOperaciones.getAnio();
        for (Regimen regimen : regimenes) {
            TipoPeriodo tp = TipoPeriodo.getPeriodo(regimen.getPeriodicidad(), fechaOperaciones);
            Periodo periodo = new Periodo(tp, anio);  
            Integer anioActual = (new Fecha()).getAnio();
            do{
            Obligacion obligacion = null;
            switch (regimen) {
                case INCORPORACIONFISCAL:
                    obligacion = new Incorporacion(periodo);
                    break;
                case INTERMEDIO:
                    obligacion = new Intermedio(periodo);
                    break;
                case CEDULAR:
                    obligacion = new Cedular(periodo);
                    break;                
                case IEPS:
                    obligacion = new Ieps(periodo);
                    break;                
                case HOSPEDAJE:
                    obligacion = new Hospedaje(periodo);
                    break;                
                default:
                    throw new AssertionError();
            }
            obligaciones.add(obligacion);
            periodo = periodo.next();
            }while(periodo.getEjercicio() <= anioActual);
        }
        
                
    }
    public RFC getRfc() {
        return rfc;
    }

    public void setRfc(RFC rfc) {
        this.rfc = rfc;
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
    
}