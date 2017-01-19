
package test.serializacion;

import java.io.Serializable;

/**
 *
 * @author Luis_Od
 */
public class Alumno implements Serializable{
    private String nombre;
    private Integer edad;
    private Float calificacion;

    public Alumno(String nombre, Integer edad, Float calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Float calificacion) {
        this.calificacion = calificacion;
    }

   
    
    
}
