
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public class Incorporacion extends Impuesto{  
    private Float ingresosBimestrales;
    
    public Incorporacion(Periodo per){
        super(Regimen.INCORPORACIONFISCAL,per);
    }
    @Override
    public Float totalPagar() {
        if(ingresosBimestrales<10000){
            return (float)250;
        }else if(ingresosBimestrales<20000){
            return (float)480;
        }else if(ingresosBimestrales<30000){
            return (float)1000;
        }else if(ingresosBimestrales<40000){
            return (float)1500;
        }else if(ingresosBimestrales<50000){
            return (float)5000;
        }else{
            return (float)10000;
        }
        
    }

    public Float getIngresosBimestrales() {
        return ingresosBimestrales;
    }

    public void setIngresosBimestrales(Float ingresosBimestrales) {
        this.ingresosBimestrales = ingresosBimestrales;
    }
    
    
}
