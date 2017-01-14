
package Modelo.obligaciones;

/**
 *
 * @author Luis_Od
 */
//clase abstracta
public  class Cedular implements Obligacion{
    
    public void metodoPrueba(){
        System.out.println("CEDULAR");
    }
    public Cedular(){
        
    }
    @Override
    public float calculaRecargos(){
        return (float) 2.0;
    }  
    @Override
    public float totalPagar(){
        return (float) 1.0;
    }
    

  
    
}
