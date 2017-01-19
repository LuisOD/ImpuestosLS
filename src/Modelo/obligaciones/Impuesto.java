
package Modelo.obligaciones;
import objetos.Fecha;
import objetos.Periodo;
import objetos.Regimen;

/**
 *
 * @author Luis_Od
 */
public abstract class Impuesto implements Obligacion{
    private Regimen regimen;
    private Periodo periodo;
    private Boolean obligacionCumplida;
    
    public Impuesto(Regimen regm, Periodo per){
        this.regimen = regm;
        this.periodo = per;
        obligacionCumplida = false;
    }
    @Override
    public Float calculaImpuesto(){
        return totalPagar() + calculaRecargos();
    }
    @Override
    public Float calculaRecargos(){
        if(getPeriodo().getFechalmlpago().compareTo(new Fecha())<=0){
            return (float) 0.0;
        }else{
            return totalPagar()*(float) 0.03;
        }
    }
    public String toString(){
        return getRegimen().toString()+" "+getPeriodo().toString();
    }

    public Regimen getRegimen() {
        return regimen;
    }

    public void setRegimen(Regimen regimen) {
        this.regimen = regimen;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Boolean getObligacionCumplida() {
        return obligacionCumplida;
    }

    public void setObligacionCumplida(Boolean obligacionCumplida) {
        this.obligacionCumplida = obligacionCumplida;
    }
    
}
