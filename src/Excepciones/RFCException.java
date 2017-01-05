package Excepciones;
/**
 * @author Luis_Od
 */
public class RFCException extends Exception{
    public RFCException(){
        
    }
    public RFCException(String mensaje){
        super(mensaje);
    }
}