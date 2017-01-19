
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
//
public class Cedular extends Impuesto{
    private Float totalCasaHabitacion;
    private Float totalLocalComercial;

    public Cedular(Periodo per){
        super(Regimen.CEDULAR, per);
    }    
 
    @Override
    public Float totalPagar() {
        Float total = totalCasaHabitacion * (float)0.10 + totalLocalComercial * (float)0.25;
        Float iva = (totalCasaHabitacion + totalLocalComercial) * (float)0.16;
        return total + iva;
    }

}
