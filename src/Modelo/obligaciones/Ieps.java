
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 * @author Luis_Od
 */
public class Ieps extends Impuesto{
    private float litrosMagna;
    private float litrosPremium;
    private float litrosDisel;
    
    public Ieps(Periodo per) {
        super(Regimen.IEPS,per);
    }
    
     @Override
    public float calculaRecargos(){
        return (float) 2.0;
    }  
    @Override
    public float calculaImpuesto(){
        return (float) 1.0;
    }    

    @Override
    public float totalPagar() {
        Float magna = litrosMagna * (float)15.99;
        Float premium = litrosPremium * (float) 17.79;
        Float disel = litrosDisel * (float) 12;
        return magna + premium+disel;
    }

}
