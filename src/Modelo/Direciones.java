
package Modelo;

import Excepciones.DireccionException;
import objetos.TipodeDireccion;

/**
 * @author Luis_Od
 */
public class Direciones {
    private TipodeDireccion tipo;
    private String calle;
    private String noExterior;
    private String noInterior;
    private String colonia;
    private String cp;
    private String municipio;

   
    public void validar() throws DireccionException{
        if(!cp.matches("^[0-9]{5}$")){ //expresion regular para numeros)
            throw  new  DireccionException("Codigo postal incorrecto");
        }
        else if(!calle.matches("^[A-Z .]*$")){
            throw new DireccionException("Calle con caracteres no validos"); //expresion regular para letras
        }
    }

    public Direciones(TipodeDireccion tipo, String calle, String noExterior, String noInterior, String colonia, String cp, String municipio) throws DireccionException{
        this.tipo = tipo;
        this.calle = calle.toUpperCase();
        this.noExterior = noExterior;
        this.noInterior = noInterior;
        this.colonia = colonia;
        this.cp = cp;
        this.municipio = municipio;
       
    }

    public TipodeDireccion getTipo() {
        return tipo;
    }
    public void setTipo(TipodeDireccion tipo) {
        this.tipo = tipo;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNoExterior() {
        return noExterior;
    }
    public void setNoExterior(String noExterior) {
        this.noExterior = noExterior;
    }
    public String getNoInterior() {
        return noInterior;
    }
    public void setNoInterior(String noInterior) {
        this.noInterior = noInterior;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCp() {
        return cp;
    }
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
        
}
