
package objetos;

import java.time.DayOfWeek;

/**
 * @author Luis_Od
 */
public class Periodo extends Fecha{
    
    private TipoPeriodo tipoPeriodo;
    private Fecha fechalmlpago;
    
    public Periodo(TipoPeriodo tp){
        tipoPeriodo = tp;
        
    }
    public Fecha fechaCero(){
        tipoPeriodo.getMesFinal();
        Fecha f=new Fecha(17,tipoPeriodo.getMesFinal()+1,2017);
        f.aumentarDiaInhabil(DayOfWeek.SATURDAY,DayOfWeek.SUNDAY);
        return f;
    }
    public Fecha fechaLimite(){//falta
        return null;
    }
    
    //calcular fecha limite y asignar
//    public int compareTo(Fecha fechalmt){
//       Fecha flm = new Fecha();
//       int mesplus= flm.getMes()+1;
//       if(flm.getMes()==1){
//           mesplus++;
//           System.out.println("mensual");
//           if(flm.getMes()>=1&&flm.getMes()<=2){
//               mesplus++;
//               System.out.println("bimestral");
//               if(flm.getMes()>=1&&flm.getMes()<=3){
//                   mesplus++;
//                   System.out.println("trimestral");
//               }
//           }
//           flm.aumentar(16);
//       }else if(flm.getMes()==2){
//           mesplus++;
//           System.out.println("mensual");
//           if(flm.getMes()>=2&&flm.getMes()<=3){
//               mesplus++;
//               System.out.println("trimestral");
//           }
//           flm.aumentar(16);
//       }else if(flm.getMes()==3){
//           mesplus++;
//           System.out.println("mensual");
//           if(flm.getMes()>=3&&flm.getMes()<=4){
//               mesplus++;
//               System.out.println("bimestral");
//            }
//           flm.aumentar(16);
//       }else if(flm.getMes()==4){
//           mesplus++;
//           System.out.println("mesual");
//           if(flm.getMes()>=4&&flm.getMes()<=6){
//               mesplus++;
//               System.out.println("trimestral");
//           }
//           //this.fechalmlpago= super.getDia(16);
//           flm.aumentar(16);
//       }else if(flm.getMes()==5){
//           mesplus++;
//           System.out.println("mensual");
//           if(flm.getMes()>=5&&flm.getMes()<=6){
//               mesplus++;
//               System.out.println("bimestral");
//            }
//            flm.aumentar(16);
//       }else if(flm.getMes()==6){
//           mesplus++;
//           System.out.println("mensual");
//       }else if(flm.getMes()==7){
//           mesplus++;
//           System.out.println("mensual");
//           if(flm.getMes()>=7&&flm.getMes()<=9){
//               System.out.println("trimestral");
//           }
//       }
//       return mesplus;
//    }
    
    
    
}

