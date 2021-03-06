
package impuestos;
import Excepciones.DireccionException;
import Excepciones.IntervalosfechaException;
import Excepciones.PersonaFisicaException;

import Excepciones.RFCException;
import Excepciones.RegimenException;
import java.util.ArrayList;
import java.util.HashSet;
import Modelo.Direciones;
import Modelo.Fisica;
import Modelo.Moral;
import Modelo.obligaciones.Cedular;
import Modelo.obligaciones.Ieps;
import Modelo.obligaciones.Incorporacion;
import Modelo.obligaciones.Obligacion;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Fecha;
import objetos.Periodicidad;
import objetos.Periodo;
import objetos.RFC;
import objetos.Regimen;
import objetos.TipoPeriodo;
import objetos.TipodeDireccion;
import objetos.TipodePersona;
import pantallas.PrincipalFrame;
/**
 *
 * @author Luis_Od
 */
public class Impuestos {
        Fisica fisica = null;
        Moral moral = null;
        Fisica juan = null;
        @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args)throws DireccionException, RFCException{
        PrincipalFrame main = new PrincipalFrame();
        Fecha fins = new Fecha(2,2,1990);//fecha nacimiento
        //Fecha f1 = new Fecha();
        //System.out.println(f);
        //System.out.println(f.diaSemana());
        //System.out.println(f.fechaValida()); 
        //aumentar fechas
        //f.aumentar();
        //System.out.println(f);
        //f.decrementar();
        //System.out.println(f);
        //f.aumentar(24);
        //System.out.println(f);
        //f.decrementar(2);
        //System.out.println(f);
//        System.out.println("*******");
//        System.out.println("El dia "+f.diaSemana()+" naciste");//dia de la semana              
//        System.out.println(f.compareTo(f1)); //comparacion de fechas de f a f1
//        System.out.println(f1.compareTo(f)); //comparacion de fechas de f1 a f
//        System.out.println("tienes "+f.diferenciaAnios()+" años");//diferencia anios al dia de hoy
//        System.out.println(f1);
        System.out.println("********");
        ArrayList<Fecha> fechaInhabil = new ArrayList<Fecha>();
        fechaInhabil.add(new Fecha(1,1,2017));
        fechaInhabil.add(new Fecha(24,2,2017));
        fechaInhabil.add(new Fecha(17,4,2017));
        
        for (Fecha fechaInhabile : fechaInhabil) {
            System.out.println(fechaInhabile);    
        }
        
        HashSet<Fecha> fechas = new HashSet<>();
        fechas.add(new Fecha());
        fechas.add(new Fecha());      
        fechas.add(new Fecha());
        
        System.out.println("Prueba RFC mio");
        //HashSet<RFC> fcIn = new HashSet<>();  
        Fecha fcIn1 = new Fecha(2,4,2015); //inicio de inscripcion
        Fecha fcOp = new Fecha(10,4,2015); //inicio de operaciones
        RFC reFc = new RFC("lool900202asl",TipodePersona.Fisica);
//        System.out.println(fcIn1);
//        System.out.println(fcOp);
//        System.out.println(reFc);
//        
//        try {
//            Fisica pf = new Fisica(reFc, "9512267834", fcIn1,fcOp,"Luis", "Lopez", "Ojeda",fcIn1);
//            pf.addRegimen(Regimen.INCORPORACIONFISCAL);
//            
//        } catch (IntervalosfechaException ex) {
//            ex.printStackTrace();
//        } catch (PersonaFisicaException ex) {
//            ex.printStackTrace();
//        }
        
        System.out.println();     
        
        System.out.println("Direccion ");
        Direciones dir = new Direciones(TipodeDireccion.FISICA,"call21e", "323", "23432", "colonia", "68000", "municipio");
        System.out.println(dir);
        System.out.println("****************");//Regimen
        HashSet<Regimen> regimenes = new HashSet<>();
        regimenes.add(Regimen.IEPS);
        regimenes.add(Regimen.HOSPEDAJE);
        regimenes.add(Regimen.CEDULAR);
        regimenes.add(Regimen.INCORPORACIONFISCAL);
        regimenes.add(Regimen.INTERMEDIO);
        
//        for (Regimen regimen : regimenes) {//impresion de regimenes
//            System.out.print(regimen.getNumerito());            
//            System.out.println(" "+regimen);
//        }
        System.out.println("**************************");
        
//        ArrayList<Obligacion> arreglo = new ArrayList<>();
//        Obligacion ob = new Cedular();
//        arreglo.add(ob);
//        arreglo.add(new Ieps());
//        arreglo.add(new Incorporacion());        
//        arreglo.add(new Cedular());
        
//        for (int i = 0; i < arreglo.size(); i++) {
//            Obligacion obj = arreglo.get(i);
//            obj.totalPagar();
//            arreglo.get(i).totalPagar();
//        }
//        System.out.println("Total a pagar es : "+ob.totalPagar());
        
        System.out.println("*************");//Validacion de periodo
        //Fecha dsd = new Fecha(12,12,2012);
        //TipoPeriodo tp[] = TipoPeriodo.values(new Fecha(12,12,2017));
        TipoPeriodo tp =TipoPeriodo.getPeriodo(Periodicidad.MENSUAL,new Fecha(12,12,2012));
        System.out.println("el resultado es: " +tp);
        
        System.out.println("*****");//intanciar persona,direcion,regimen
        
        //Periodo p = new Periodo(TipoPeriodo.ABR_MAY_JUN);
        
        //System.out.println(p.fechaLimite(4));
        
        System.out.println("*******++");
        
        
    }
}