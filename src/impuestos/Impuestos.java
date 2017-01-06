
package impuestos;
import Excepciones.DireccionException;
import java.util.ArrayList;
import java.util.HashSet;
import Modelo.Direciones;
import objetos.Fecha;
import objetos.RFC;
import objetos.Regimen;
import objetos.TipodeDireccion;
/**
 *
 * @author Luis_Od
 */
public class Impuestos {

    public static void main(String[] args) throws DireccionException {
       
        Fecha f = new Fecha(20,11,1996);
        Fecha f1 = new Fecha(20,10,1996);
        System.out.println(f);
        System.out.println(f.diaSemana());
        System.out.println(f.fechaValida()); 
        //aumentar fechas
        //f.aumentar();
        //System.out.println(f);
        //f.decrementar();
        //System.out.println(f);
        //f.aumentar(24);
        //System.out.println(f);
        //f.decrementar(2);
        //System.out.println(f);
        System.out.println("*******+");
        System.out.println(f.diaSemana());//dia de la semana
        System.out.println(f.diaSemanaa());//dia de la semana
              
        System.out.println(f.compareTo(f1)); //comparacion de fechas de f a f1
        System.out.println(f1.compareTo(f)); //comparacion de fechas de f1 a f
        System.out.println(f);
        System.out.println(f1);
        System.out.println("********");
        ArrayList<Fecha> fechaInhabil = new ArrayList<Fecha>();
        fechaInhabil.add(new Fecha(1,1,2017));
        fechaInhabil.add(new Fecha(24,2,2017));
        
        for (Fecha fechaInhabile : fechaInhabil) {
            System.out.println(fechaInhabile);    
        }
        
        HashSet<Fecha> fechas = new HashSet<>();
        fechas.add(new Fecha());
        fechas.add(new Fecha());      
        fechas.add(new Fecha());
        
        System.out.println("*********");
        //RFC r1 = new RFC();
        System.out.println("*****");
        
        Direciones dir = new Direciones(TipodeDireccion.FISICA,"calle", "323", "23432", "colonia", "68000", "municipio");
        System.out.println(dir);//impresion de direccion
        
        System.out.println("****************");//Regimen
        HashSet<Regimen> regimenes = new HashSet<>();
        regimenes.add(Regimen.IEPS);
        regimenes.add(Regimen.HOSPEDAJE);
        regimenes.add(Regimen.INCORPORACIONFISCAL);
        
        for (Regimen regimen : regimenes) {//impresion de regimenes
            System.out.println(regimen);            
        }
        
           
    }
}