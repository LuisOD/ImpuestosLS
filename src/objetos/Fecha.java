package objetos;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;
/*
 * @author Luis_Od
 */
public class Fecha implements Comparable<Fecha>{
    
    private Integer dia;
    private Integer mes;
    private Integer anio;
    
    private static HashSet<Fecha> diasinhabil = new HashSet<Fecha>;
    
    
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
    public boolean fechaValida(){
        int diaAux=0;
        int mesAux =0;
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
    @Override
    public String toString(){
        //mes>0&&mes<10?mes="0":"";
        return String.format("%02d/%02d/%02d",dia,mes,anio);//if
        //System.out.println(strDays[now.get(Calendar.DAY_OF_WEEK)-1];/
    }
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
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Fecha){
            return compareTo((Fecha)obj)==0;
        }
        return false;
    }
    public int hashCode(){
        int hash =7;
        hash = 71 * hash * Objects.hashCode(this.dia);
        hash = 71 * hash * Objects.hashCode(this.mes);
        hash = 71 * hash * Objects.hashCode(this.anio);
        return hash;
    }
    public void incrementar(){
        dia++;
        if(dia>diaDelMes()){
            mes++;
            dia=1;
            if(mes>12){
                mes=1;
                anio++;
            }
        }
    }
    
    public void incremenatarDiasinhabiles(DayOfWeek ...days){
        boolean bandera =false;
        do{
            incrementar();
            for (int days[i] = 0; days[i] < 10; days[i]++) {
                
            }
        }while(lsdiainhabil(this));
    }
    
    
    //public char diaSemana(){
      //   System.out.println("El dia de hoy: " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
        //return 0;
    //}
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
    public Date sumarRestarDiasFecha(Date fecha, int dias){
 
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(fecha);
      calendar.add(Calendar.DAY_OF_YEAR, dias);
      
      return calendar.getTime();
    }
}
