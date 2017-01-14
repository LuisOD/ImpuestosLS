
package Modelo.obligaciones;

/**
 * @author Luis_Od
 */
public interface Obligacion { //resuelve la herencia multiple
    
    public float calculaImpuesto();
    public float calculaRecargos();
    public float totalPagar();

    public void metodoPrueba();
    
    
    
}
