
package objetos;
import Excepciones.RFCException;

/**
 * @author Luis_Od
 */
public class RFC {
    private String rfc;
    private boolean personaFisica;
    
    public RFC(String rfc1)throws RFCException{
        rfc = rfc1.toUpperCase();
        if(!this.isValido()){
            throw new RFCException();
        }
        setPersonaFisica();
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
    
}
