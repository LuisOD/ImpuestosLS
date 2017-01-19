
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public abstract class General extends Impuesto{
    private Float ingresos;
    private Float egresos;    
    
    public General(Regimen reg, Periodo per){
        super(reg,per);
    }
    @Override
    public Float totalPagar(){
        Float iva = (ingresos - egresos)*(float)0.16;
        return iva;
    }
    
    public Float getIngresos() {
        return ingresos;
    }

    public void setIngresos(Float ingresos) {
        this.ingresos = ingresos;
    }

    public Float getEgresos() {
        return egresos;
    }

    public void setEgresos(Float egresos) {
        this.egresos = egresos;
    }
    
    
    
   
}
