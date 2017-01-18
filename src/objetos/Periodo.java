
package objetos;

import java.time.DayOfWeek;
/**
 * @author Luis_Od
 */
public class Periodo extends Fecha{
    
    private TipoPeriodo tipoPeriodo;
    private Integer ejercicio;
    private Fecha fechalmlpago;
    
    public Periodo(TipoPeriodo tp, Integer ejercicio){
        tipoPeriodo = tp;
        this.ejercicio = ejercicio;
    }
    
    public Fecha fechaCero(){
        tipoPeriodo.getMesFinal();
        Fecha f=new Fecha(17,tipoPeriodo.getMesFinal()+1,ejercicio);
        f.aumentarDiaInhabil(DayOfWeek.SATURDAY,DayOfWeek.SUNDAY);
        return f;
    }
    public Fecha fechaLimite( Integer diasAdicionales){//falta
        Fecha cero = fechaCero();
        for (int i = 0; i < diasAdicionales; i++) {
            cero.aumentarDiaInhabil(DayOfWeek.FRIDAY,DayOfWeek.SATURDAY,DayOfWeek.SUNDAY);
        }
        return cero;
    }
    @Override
    public String toString(){
        return tipoPeriodo.toString()+" "+ejercicio;
    }
    public Periodo next(){
        Integer ej = ejercicio;
        TipoPeriodo tp = tipoPeriodo.next();
        if (tp == null){
            ej++;
            tp = TipoPeriodo.getPeriodo(this.tipoPeriodo.getPeriodicidad(), new Fecha(1,1,ej));
        }
        Periodo resultado = new Periodo(tp, ej);

        
        return resultado;
    }
//    @Override
//    public String toString(){
//        return tipoPeriodo.toString()+" "+ejercicio;
//    }
    
    public TipoPeriodo getTipoPeriodo() {
        return tipoPeriodo;
    }

    public void setTipoPeriodo(TipoPeriodo tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
    }

    public Integer getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Integer ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Fecha getFechalmlpago() {
        return fechalmlpago;
    }

    public void setFechalmlpago(Fecha fechalmlpago) {
        this.fechalmlpago = fechalmlpago;
    }
    
    
    
}

