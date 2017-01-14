
package Modelo.obligaciones;
import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public abstract class Impuesto implements Obligacion{
    private Periodo periodo;
    private Regimen regimen;
    
    @Override
    public float calculaImpuesto(){
        return totalPagar()+calculaRecargos();
    }
    
}
