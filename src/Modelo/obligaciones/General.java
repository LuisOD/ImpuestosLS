
package Modelo.obligaciones;
import objetos.Periodo;
import objetos.Regimen;
import objetos.TipoPeriodo;

/**
 *
 * @author Luis_Od
 */
public abstract class General extends Impuesto{
    private float ingresos;
    private float egresos;

    public General(Periodo p, Regimen re, Boolean obligacionCumplida) {
        super(p, re, obligacionCumplida);
    }

    
}
