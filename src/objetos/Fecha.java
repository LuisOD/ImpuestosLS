package objetos;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;
/*
 * @author Luis_Od
 */
public class Fecha implements Comparable<Fecha>{
    
    private Integer dia;
    private Integer mes;
    private Integer anio;
    
    private static HashSet<Fecha> diasinhabil = new HashSet<Fecha>();
    
    public Fecha(Integer dia,Integer mes,Integer anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha(){
        LocalDate date= LocalDate.now();
        dia = date.getDayOfMonth();
        mes = date.getMonthValue();
        anio = date.getYear();
    }
//Fecha valida de 1900 a 2100
    public boolean fechaValida(){
        int diaAux=0;
        if((anio>=1900)&&(anio<=2100)){
            if((mes>=1)&&(mes<=12)){
                switch(mes){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        diaAux = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: 
                        diaAux = 30;
                        break;
                    case 2:
                        diaAux = anio % 4 == 0 ? 29 : 28;
                        break;
                }
                if((dia>=1)&&(dia<diaAux)){
                    return true;
                }
            }
        }
        return false;
    }
    //incrementar fecha
    public void aumentar(){
        int diaAux = 0;
        dia++;
        switch(mes){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        diaAux = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: 
                        diaAux = 30;
                        break;
                    case 2:
                        diaAux = anio % 4 == 0 ? 29 : 28;
                        break;
                }
        if(dia>diaAux){
            mes++;
            dia =1;
        }
        if(mes>12){
            anio++;
            mes =1;
        }
    }
    public void aumentar(Integer aum){
        int diaAux = 0;
        dia=dia + aum;
        switch(mes){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        diaAux = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: 
                        diaAux = 30;
                        break;
                    case 2:
                        diaAux = anio % 4 == 0 ? 29 : 28;
                        break;
                }
        if(dia>diaAux){
            dia=dia-diaAux;
            mes++;
        }
        if(mes>12){
            anio++;
        }
    }
    //decrementar fecha
    public void decrementar(){
        int diaAux = 0;
        dia--;
        switch(mes){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        diaAux = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: 
                        diaAux = 30;
                        break;
                    case 2:
                        diaAux = anio % 4 == 0 ? 29 : 28;
                        break;
                }
        if(dia<=0){
            mes--;
            dia =diaAux;
        }
        if(mes<=0){
            anio--;
            mes =12;
        }
    }
    public void decrementar(Integer decre){//decrementar fecha con argumentos
        int diaAux = 0;
        dia=dia - decre;
        switch(mes){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        diaAux = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: 
                        diaAux = 30;
                        break;
                    case 2:
                        diaAux = anio % 4 == 0 ? 29 : 28;
                        break;
                }
        if(dia<=0){
            dia=dia+diaAux;
            mes++;
        }
        if(mes<=0){
            mes=12;
            anio--;
        }
    }    
    
    //impresion de fecha
    @Override
    public String toString(){
        //mes>0&&mes<10?mes="0":"";
        return String.format("%02d/%02d/%02d",dia,mes,anio);//if
        //System.out.println(strDays[now.get(Calendar.DAY_OF_WEEK)-1];/
    }
    //dia inhabil
    public static void agregarDiaInhabil(Fecha f){
        diasinhabil.add(f);
    }
    public static boolean esDiaInhabil(Fecha f){
        return diasinhabil.equals(f);
    }
    //aumentar dia inhabil
    public void aumentarDiaInhabil(){
        do{
            aumentar();
        }while(esDiaInhabil(this));
    }
    public void aumentarDiaInhabil(String ...x){ // con argumento y con tipo arreglo por el ...
        boolean ban = false;
        do{
            aumentar();
            for (int i = 0; i < x.length; i++) {
                
            }
        }while(esDiaInhabil(this));
    }    
    //
    //comparacion de fecha
    public int compareTo(Fecha fechita){
           int resultado = this.anio - fechita.anio;
        if(resultado==0){
            resultado = this.mes -fechita.mes;
            if(resultado==0){
                resultado=this.dia-fechita.dia;
            }
        }
        return resultado; 
    }
    //igualar fechas
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Fecha){
           Fecha f =(Fecha)obj;
           return this.compareTo(f)==0;
        }
        return false;
    }
    //igualar fechas hashCode
    @Override
    public int hashCode(){
        int hash =7;
        hash = 71 * hash + Objects.hashCode(this.dia);
        hash = 71 * hash + Objects.hashCode(this.mes);
        hash = 71 * hash + Objects.hashCode(this.anio);
        return hash;
    }
    public char diaSemanaa(){
       System.out.println("El dia de hoy: " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
        return 0;
    }
    public DayOfWeek diaSemana(){
        LocalDate dateTemporal = LocalDate.of(anio,mes,dia);
        return dateTemporal.getDayOfWeek();
    }
    public Integer getDia(){
        return dia;
    }
    public void setDia(Integer dia){
        this.dia = dia;
    }   
    public Integer getMes(){
        return mes;
    }
    public void setMes(Integer mes){
        this.mes = mes;
    }
    public Integer getAnio(){
        return anio;
    }
    public void setAnio(Integer anio){
     this.anio = anio;   
    }
    Calendar now = Calendar.getInstance();
    String[] strDays = new String[]{
        "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado"
    };

}
