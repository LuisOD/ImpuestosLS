
package Excepciones;
/**
 * @author Luis_Od
 */
public class FisicaException extends Exception{
    private String mensaje;
    public FisicaException(){
        
    }
    public FisicaException(String mensaje){
        super(mensaje);
    }
    
}
