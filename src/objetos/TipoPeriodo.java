
package objetos;
import objetos.Fecha;
/**
 * @author Luis_Od
 */
public enum TipoPeriodo {
    ENERO(Periodicidad.MENSUAL,1,1),
    FEBRERO(Periodicidad.MENSUAL,2,2),
    MARZO(Periodicidad.MENSUAL,3,3),
    ABRIL(Periodicidad.MENSUAL,4,4),
    MAYO(Periodicidad.MENSUAL,5,5),
    JUNIO(Periodicidad.MENSUAL,6,6),
    JULIO(Periodicidad.MENSUAL,7,7),
    AGOSTO(Periodicidad.MENSUAL,8,8),
    SEPTIEMBRE(Periodicidad.MENSUAL,9,9),
    OCTUBRE(Periodicidad.MENSUAL,10,10),
    NOVIEMBRE(Periodicidad.MENSUAL,11,11),
    DICIEMBRE(Periodicidad.MENSUAL,12,12),
    ENE_FEB(Periodicidad.BIMESTRAL,1,2),
    MAR_ABR(Periodicidad.BIMESTRAL,3,4),
    MAY_JUN(Periodicidad.BIMESTRAL,5,6),
    JUL_AGO(Periodicidad.BIMESTRAL,7,8),
    SEP_OCT(Periodicidad.BIMESTRAL,9,10),
    NOV_DIC(Periodicidad.BIMESTRAL,11,12),
    ENE_FEB_MAR(Periodicidad.TRIMESTRAL,1,3),
    ABR_MAY_JUN(Periodicidad.TRIMESTRAL,4,6),
    JUL_AGO_SEP(Periodicidad.TRIMESTRAL,7,9),
    OCT_NOV_DIC(Periodicidad.TRIMESTRAL,10,12);

    private Periodicidad periodicidad;
    private Integer mesInicio;
    private Integer mesFinal;
    private TipoPeriodo(Periodicidad periodicidad,Integer mesIni,Integer mesFin){
        this.periodicidad = periodicidad;
        this.mesInicio = mesIni;
        this.mesFinal = mesFin;
    }

    public TipoPeriodo next(){
        TipoPeriodo resultado = null;
        TipoPeriodo tp[] = TipoPeriodo.values();
        for(TipoPeriodo tipoperiodo : tp){
            if(tipoperiodo.getPeriodicidad()== this.getPeriodicidad()){
                System.out.println(tipoperiodo);
            }    
        }
        return resultado;
    }
    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public Integer getMesInicio() {
        return mesInicio;
    }

    public Integer getMesFinal() {
        return mesFinal;
    }
 
    public static TipoPeriodo getPeriodo(Periodicidad p, Fecha fechita){
        TipoPeriodo resultado = null;
        TipoPeriodo tp[] = TipoPeriodo.values();
        for(TipoPeriodo tipoperiodo : tp){
            if(tipoperiodo.getPeriodicidad()==p){
                if(tipoperiodo.getMesInicio()<=fechita.getMes() && tipoperiodo.getMesFinal()>=fechita.getMes()){
                    return resultado;
                }
            }
            //System.out.println(tipoperiodo);
        }
        return resultado;
    }        
}
