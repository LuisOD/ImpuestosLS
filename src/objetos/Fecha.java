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
    
    private static HashSet<Fecha> diasinhabil = new HashSet<>();
    //private static HashSet<Fecha> diasinhabil = new HashSet<Fecha>();
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
        //int diaAux=0;
        if((anio>=1900)&&(anio<=2100)){
            if((mes>=1)&&(mes<=12)){
                if((dia>=1)&&(dia<= diasdelMes())){
                    return true;
                }
                }
            }
        return false;
    }
    //incrementar fecha
    public void aumentar(){
        dia++;
        if(dia>diasdelMes()){
            mes++;
            dia=1;
            if(mes>12){
                mes=1;
                anio++;
            }
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
    // años
    public Integer diferenciaAnios(){
        Fecha fp = new Fecha();
        int anios = fp.getAnio() - this.getAnio();
        if (this.getMes()> fp.getMes()){
            anios--;
        }else if((fp.getMes() == this.getMes())&&(fp.getDia() < this.getDia())){//lo mimso pero en dias
            anios--;
        }
        return anios;
    }
    //dia inhabil
    public static void agregarDiaInhabil(Fecha f){
        diasinhabil.add(f);
    }
    public static boolean isDiaInhabil(Fecha f){
        return diasinhabil.contains(f);
    }
    //aumentar dia inhabil
    public void aumentarDiaInhabil(){
        do{
            aumentar();
        }while(isDiaInhabil(this));
    }
    public void aumentarDiaInhabil(DayOfWeek ...days){ // con argumento y con tipo arreglo por el ...
        boolean ban = false;
        do{
            ban = false;
            aumentar();
            for (int i = 0; i < days.length; i++) {
                if(days[i]==this.diaSemana()){
                    ban=true;
                }
            }
        }while(isDiaInhabil(this)||ban);
    }    
    private int diasdelMes(){
        int diaAux = 0;
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
        return diaAux;
    }
    //comparacion de fecha
    @Override
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
    
    public DayOfWeek diaSemana(){ //dia de la semana
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
    

}
