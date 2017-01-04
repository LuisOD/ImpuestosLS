package objetos;
import java.util.Date;
import java.util.Calendar;
/*
 * @author Luis_Od
 */
public class Fecha {
    
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Fecha(Integer dia,Integer mes,Integer anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha(){
        Date date = new Date();
        dia = date.getDay()+1;
        mes = date.getMonth()+1;
        anio = date.getYear()+1900;
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
        return String.format(+0+"%d/"+0+"%d/%d",dia,mes,anio);//if
    }
    public char diaSemana(){
         System.out.println("Hoy es : " + strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
        return 0;
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
