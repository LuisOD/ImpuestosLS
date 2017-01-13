
package objetos;

/**
 * @author Luis_Od
 */
public class Periodo extends Fecha{
    
    private Periodicidad periodicidad;
    private TipoPeriodo tipoPeriodo;
    private Fecha fechalmlpago;
    
    public Periodo(Periodicidad p, TipoPeriodo tp){
        periodicidad = p;
        tipoPeriodo = tp;
    }
    //calcular fecha limite y asignar
    public int compareTo(Fecha fechalmt){
       Fecha flm = new Fecha();
       int mesplus= flm.getMes()+1;
       if(flm.getMes()==1){
           mesplus++;
           System.out.println("mensual");
           if(flm.getMes()>=1&&flm.getMes()<=2){
               mesplus++;
               System.out.println("bimestral");
               if(flm.getMes()>=1&&flm.getMes()<=3){
                   mesplus++;
                   System.out.println("trimestral");
               }
           }
           this.fechalmlpago= super.getDia(16);
       }else if(flm.getMes()==2){
           mesplus++;
           System.out.println("mensual");
           if(flm.getMes()>=2&&flm.getMes()<=3){
               mesplus++;
               System.out.println("trimestral");
           }
           this.fechalmlpago= super.getDia(16);
       }else if(flm.getMes()==3){
           mesplus++;
           System.out.println("mensual");
           if(flm.getMes()>=3&&flm.getMes()<=4){
               mesplus++;
               System.out.println("bimestral");
            }
           this.fechalmlpago= super.getDia(16);
       }else if(flm.getMes()==4){
           mesplus++;
           System.out.println("mesual");
           if(flm.getMes()>=3&&flm.getMes()<=4){
               
           }
           this.fechalmlpago= super.getDia(16);
       }
       
        
        return mesplus;
    }
}

