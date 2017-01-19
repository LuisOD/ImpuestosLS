
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public class Hospedaje extends General{

    public Hospedaje(Periodo per){
        super(Regimen.HOSPEDAJE,per);
    }

    @Override
    public Float totalPagar() {
        Float impuesto = getIngresos()*(float)0.02;
        return super.totalPagar()+impuesto;
    }
    
    
}
