
package Modelo.obligaciones;

/**
 *
 * @author Luis_Od
 */
public class Incorporacion implements Obligacion{

    @Override
    public void metodoPrueba(){
        System.out.println("INCORPORACION");
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
