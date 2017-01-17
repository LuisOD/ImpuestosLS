
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
    private Boolean obligacionCumplida;

    public Impuesto(Periodo p, Regimen re, Boolean obligacionCumplida) {
        this.periodo = p;
        this.regimen = re;
        this.obligacionCumplida = obligacionCumplida;
    }
    
    
    @Override
    public float calculaImpuesto(){
        return totalPagar()+calculaRecargos();
    }
    
}
