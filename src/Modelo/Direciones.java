
package Modelo;

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

   
    public boolean validar(){
        boolean resultado = true;
       // if(!cp.matches("/^[0-9]+(5)/")){ //expresion regular para numeros)
       //     throw  new 
       // }
       // else{
            
      //  }
        resultado = resultado && calle.matches("/^[a-zA-Z]+$/"); //expresion regular para letras
        
        
        return resultado;
    }

    public Direciones(TipodeDireccion tipo, String calle, String noExterior, String noInterior, String colonia, String cp, String municipio) {
        this.tipo = tipo;
        this.calle = calle.toUpperCase();
        this.noExterior = noExterior;
        this.noInterior = noInterior;
        this.colonia = colonia;
        this.cp = cp;
        this.municipio = municipio;
        validar();
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
