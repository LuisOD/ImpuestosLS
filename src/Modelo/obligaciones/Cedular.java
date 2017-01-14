
package Modelo.obligaciones;

/**
 *
 * @author Luis_Od
 */
//clase abstracta
public abstract class Cedular implements Obligacion{
    
//    public void metodoPrueba(){
//        System.out.println("CEDULAR");
//    }
  @Override
  public float calculaRecargos(){
      return (float) 2.0;
  }  
  @Override
  public float totalPagar(){
      return (float) 1.0;
  }
    

  
    
}
