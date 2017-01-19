
package Modelo.obligaciones;

/**
 * @author Luis_Od
 */
public interface Obligacion { //resuelve la herencia multiple* cada metodo debe de ser definido en donde se implemente la interface
    
    public Float calculaImpuesto();
    public Float calculaRecargos();
    public Float totalPagar();
        
}
