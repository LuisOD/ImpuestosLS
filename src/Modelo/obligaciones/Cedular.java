
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
//clase abstracta
public class Cedular extends Impuesto{
    private float habitacion;
    private float localComercial;

    public Cedular(Periodo per) {
        super(Regimen.CEDULAR, per);
    }
    
    @Override
    public float calculaRecargos(){
        return (float) 0.0;
    }  
    @Override
    public float calculaImpuesto(){
    return (float) 0.0;
    }    

    @Override
    public float totalPagar() {
        Float total = habitacion * (float)0.10 + localComercial * (float)0.25;
        Float iva = (habitacion + localComercial)* (float) 0.16;
        return total+iva;
    }

}
