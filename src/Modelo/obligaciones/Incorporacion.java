
package Modelo.obligaciones;

import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public class Incorporacion extends Impuesto{
    
    private Float ingresosBismestrales;
    
    public Incorporacion(Periodo per){
        super(Regimen.INCORPORACIONFISCAL, per);
    }
   
     @Override
    public Float totalPagar() {
        if (ingresosBismestrales < 10000){
            return (float)250;
        }else if (ingresosBismestrales < 20000){
            return (float)480;
        }else if (ingresosBismestrales < 30000){
            return (float)1000;
        }else if (ingresosBismestrales < 40000){
            return (float)1500;
        }else if (ingresosBismestrales < 50000){
            return (float)5000;
        }else{
            return (float)10000;
        }
    }
    
}
