
package objetos;
import Excepciones.RFCException;
import java.util.Objects;


/**
 * @author Luis_Od
 */
public class RFC {

    private String rfc;
    private final TipodePersona tipo;
    
    public RFC(String rfc1, TipodePersona tipo)throws RFCException{
        this.tipo = tipo;
        rfc = rfc1.toUpperCase();
        if(!this.valida()){
            throw new RFCException();
        }
        
    }

    public RFC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private boolean valida(){
        if(tipo == TipodePersona.Fisica){
            return rfc.matches("");
        }
        else{
            return rfc.matches("");
        }
    }
    

    //igualar rfc hashCode
    @Override
    public int hashCode(){
        int hash =7;
        hash = 71 * hash + Objects.hashCode(this.rfc);
        return hash;
    }
    //comparacion de fecha
    //public int compareTo(RFC rfcita){
     //  boolean igual;
        //if(rfc!=rfcita){
            
        //}
      
}
