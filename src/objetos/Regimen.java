
package objetos;

/*
 * @author Luis_Od
 */
public enum Regimen {
    INCORPORACIONFISCAL(1),
    INTERMEDIO(1),
    CEDULAR(2),
    HOSPEDAJE(3),
    IEPS(4);
    
    
    private Regimen(int paramet){
        numerito = paramet;
    }
    private int numerito;

    public int getNumerito() {
        return numerito;
    }
    
    
}
