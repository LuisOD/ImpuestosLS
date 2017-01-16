
package Modelo.obligaciones;

/**
 *
 * @author Luis_Od
 */
public class Incorporacion extends Impuesto{

    public Incorporacion() {
        
    }
    
     @Override
    public float calculaRecargos(){
        return (float) 2.0;
    }  
    @Override
    public float calculaImpuesto(){
        return (float) 1.0;
    }    

    @Override
    public float totalPagar() {
         return calculaImpuesto()+calculaRecargos();
    }
}
