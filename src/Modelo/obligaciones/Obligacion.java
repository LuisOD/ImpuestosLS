
package Modelo.obligaciones;

/**
 * @author Luis_Od
 */
public interface Obligacion { //resuelve la herencia multiple* cada metodo debe de ser definido en donde se implemente la interface
    
    public float calculaImpuesto();
    public float calculaRecargos();
    public float totalPagar();

    public void metodoPrueba();
        
}
