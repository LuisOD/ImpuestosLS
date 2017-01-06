
package Excepciones;
/**
 * @author Luis_Od
 */
public class DireccionException extends Exception{
    private String mensaje;
    public DireccionException(String msg){
        super(msg);
        mensaje = msg;
    }
    public String getMensaje(){
        return mensaje;
    }
       
}
