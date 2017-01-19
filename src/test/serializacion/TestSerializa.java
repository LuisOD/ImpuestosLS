/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Luis_Od
 */
public class TestSerializa {
    
    public static void main(String[] args) {
        ArrayList<Alumno> alumns = new ArrayList<>();
        Integer op = 0;
        do {            
            System.out.println("1.Agregar");
            System.out.println("2.Modificar");
            System.out.println("3.Eliminar");
            System.out.println("4.Listar");
            System.out.println("5.Guardar");
            System.out.println("6.Cargar");
            System.out.println("7.Salir");
        } while (op!=7);
    }
    
    public static void leer() throws FileNotFoundException {
        File file = new File("pichones.dat");
        FileInputStream input = new FileInputStream(file);
        
        
    }
    public static void Escribir() throws FileNotFoundException {
        Alumno fernando = new Alumno("fernando", 20, (float)5.95);
        Alumno cesar = new Alumno("cesar", 20, (float)5.96);
        Alumno omar = new Alumno("omar", 20, (float)6.95);
        
        File file = new File("pichones.dat");
        FileOutputStream output = new FileOutputStream(file);
        
        
        
    }
}

