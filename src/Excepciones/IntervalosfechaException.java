
package Excepciones;

/**
 *
 * @author Luis_Od
 */
public class IntervalosfechaException extends Exception{
    
    /**
     * Creates a new instance of <code>IntervalosFechaException</code> without
     * detail message.
     */
    public IntervalosfechaException() {
    }

    /**
     * Constructs an instance of <code>IntervalosFechaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public IntervalosfechaException(String msg) {
        super(msg);
    }
}
