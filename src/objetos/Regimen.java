
package objetos;
/*
 * @author Luis_Od
 */
public enum Regimen {
    INCORPORACIONFISCAL(Periodicidad.BIMESTRAL),
    INTERMEDIO(Periodicidad.MENSUAL),
    CEDULAR(Periodicidad.BIMESTRAL),
    HOSPEDAJE(Periodicidad.TRIMESTRAL),
    IEPS(Periodicidad.MENSUAL);
    
    private Regimen(Periodicidad periodicidad){
        this.periodicidad = periodicidad;
    }
    
    private Periodicidad periodicidad;

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }
    
}
