
package impuestos;
import java.util.ArrayList;
import java.util.HashSet;
import objetos.Fecha;
/**
 *
 * @author Luis_Od
 */
public class Impuestos {

    public static void main(String[] args) {
        
        Fecha f = new Fecha(20,11,1996);
        Fecha f1 = new Fecha(20,10,1996);
        System.out.println(f);
        System.out.println(f.diaSemana());
        System.out.println(f.fechaValida()); 
        
        System.out.println(f.compareTo(f1));
        System.out.println(f);
        System.out.println(f1);
        System.out.println("********");
        ArrayList<Fecha> fechaInhabil = new ArrayList<Fecha>();
        fechaInhabil.add(new Fecha(1,1,2017));
        fechaInhabil.add(new Fecha(24,2,2017));
        
       // for (Fecha fechaInhabil : fechaInhabil){
         //   System.out.println(fechaInhabil);
       // }
        
        HashSet<Fecha> fechas = new HashSet<>();
        fechas.add(new Fecha(dia));
        fechas.add(new Fecha(mes));      
        fechas.add(new Fecha(anio));
        
        System.out.println("*******+");
        System.out.println(f.diaSemana());//dia de la semana
        
        
    }
    
}
