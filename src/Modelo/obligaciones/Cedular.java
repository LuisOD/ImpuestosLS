
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;


/**
 *
 * @author Luis_Od
 */
//
public class Cedular extends Impuesto{
    private Float totalCasaH;
    private Float totalLocalCom;
    
    public Cedular(Periodo per) {
        super(Regimen.CEDULAR, per);
    }

    @Override
    public Float totalPagar() {
        Float total = totalCasaH * (float)0.10 + totalLocalCom * (float) 0.25;
        Float iva = (totalCasaH + totalLocalCom) * (float)0.16;
        return total + iva;
   }
    
}
