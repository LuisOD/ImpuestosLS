
package Modelo.obligaciones;

/**
 *
 * @author Luis_Od
 */
//clase abstracta
public class Cedular implements Obligacion{
    
    @Override
    public void metodoPrueba(){
        System.out.println("CEDULAR");
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
