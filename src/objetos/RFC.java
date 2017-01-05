
package objetos;
import Excepciones.RFCException;
import java.util.Objects;

/**
 * @author Luis_Od
 */
public class RFC {
    private String rfc;
    private TipodePersona Fisica;
    private TipodePersona Moral;
    
    
    
    public RFC(String rfc1)throws RFCException{
        rfc = rfc1.toUpperCase();
        if(!this.isValido()){
            throw new RFCException();
        }
        setPersonaFisica();
    }

    public RFC() {
       
    }
    //igualar rfc
    @Override
    public boolean equals(Object obj){
        if(obj instanceof RFC){
           RFC rfc =(RFC)obj;
           return this.compareTo(rfc)==0;
        }
        return false;
    }
    //igualar rfc hashCode
    @Override
    public int hashCode(){
        int hash =7;
        hash = 71 * hash + Objects.hashCode(this.rfc);
        return hash;
    }
    //comparacion de fecha
    public int compareTo(RFC rfcita){
       boolean igual;
        if(rfc!=rfcita){
            
        }
       
    }
    
    public boolean isValido(){
        return rfc.matches("^[a-zA-Z]{3,4}(\\\\d{6})((\\\\D|\\\\d){3})?$");
    }
    private void setPersonaFisica(){
        personaFisica = rfc.matches("^[a-zA-Z]{3,4}(\\\\d{6})((\\\\D|\\\\d){3})?$");
    }

    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    public boolean isPersonaFisica() {
        return personaFisica;
    }
    public void setPersonafisica(boolean personaFisica) {
        this.personaFisica = personaFisica;
    }

    public boolean isPersonaMoral() {
        return personaMoral;
    }

    public void setPersonaMoral(boolean personaMoral) {
        this.personaMoral = personaMoral;
    }

    private int compareTo(RFC rfc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
