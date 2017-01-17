
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public class Hospedaje extends Impuesto{

    public Hospedaje(Periodo per) {
        super(Regimen.HOSPEDAJE,per);
    }
    
    
}
