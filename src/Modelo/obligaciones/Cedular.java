
package Modelo.obligaciones;

/**
 *
 * @author Luis_Od
 */
//clase abstracta
public class Cedular implements Obligacion{
    private Integer habitacion;
    private float ingresos=100000;
    private float egresos=50000;
    private float iva16;
    private float imp05;
    
    @Override
    public void metodoPrueba(){
        System.out.println("CEDULAR");
    }
    @Override
    public float calculaRecargos(){
        return (float) 0.0;
    }  
    @Override
    public float calculaImpuesto(){
        Cedular nc = new Cedular();
        iva16 = (float) ((nc.ingresos - nc.egresos)*.16);
        imp05 = (float) (((nc.ingresos - nc.egresos)*.16)*.05);
        return iva16+imp05;
        //return (float) ((ingresos - egresos)*.16);
    }    

    @Override
    public float totalPagar() {
         return calculaImpuesto()+calculaRecargos();
    }

    public Integer getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Integer habitacion) {
        this.habitacion = habitacion;
    }

    
    public void setIngresos(Integer ingresos) {
        this.ingresos = ingresos;
    }

    
    public void setEgresos(Integer egresos) {
        this.egresos = egresos;
    }

    public float getIva16() {
        return iva16;
    }

    public void setIva16(float iva16) {
        this.iva16 = iva16;
    }

    public float getImp05() {
        return imp05;
    }

    public void setImp05(float imp05) {
        this.imp05 = imp05;
    }
    
}
