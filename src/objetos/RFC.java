
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
    private boolean valida(){
        if(tipo == TipodePersona.Fisica){
            return rfc.matches("/^([A-Z,Ñ,&]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\\d]{3})$/");
        }
        else{
            return rfc.matches("/^([A-Z,Ñ,&]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])[A-Z|\\d]{3})$/");
        }
    }
    

    //igualar rfc hashCode
    @Override
    public int hashCode(){
        int hash =7;
        hash = 71 * hash + Objects.hashCode(this.rfc);
        return hash;
    }

   
     
}
