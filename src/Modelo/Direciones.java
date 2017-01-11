
package Modelo;

import Excepciones.DireccionException;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.tipo);
        return hash;
    }
//HashCode e Equals automatico
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Direciones other = (Direciones) obj;
        if (!Objects.equals(this.calle, other.calle)) {
            return false;
        }
        if (!Objects.equals(this.noExterior, other.noExterior)) {
            return false;
        }
        if (!Objects.equals(this.noInterior, other.noInterior)) {
            return false;
        }
        if (!Objects.equals(this.colonia, other.colonia)) {
            return false;
        }
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        if (!Objects.equals(this.municipio, other.municipio)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }
    
//fin    

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
