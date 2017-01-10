
package objetos;

import Excepciones.RegimenException;
import java.util.HashSet;

/**
 *
 * @author Luis_Od
 */
public class HashConjunto extends HashSet<Regimen>{
    
    public boolean add(Regimen rgm){
       // if((super.contains(Regimen.INTERMEDIO)==(super.contains(Regimen.INCORPORACIONFISCAL)){
            
        //} hacerlo con if
        
        
        switch(rgm){
            case INCORPORACIONFISCAL:
                if(super.contains(Regimen.INTERMEDIO)){
                    return false;
                }
                super.add(rgm);
                break;
            case INTERMEDIO:
                if(super.contains(Regimen.INCORPORACIONFISCAL)){
                    return false;
                }
                super.add(rgm);
            
            default:
                throw new AssertionError();
        }
        return super.add(rgm);
    }
}
