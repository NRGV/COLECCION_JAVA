/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainColecciones;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        //ORDENAR UNA COLECCION:


        //Listas
        ArrayList<Integer> numeros = new ArrayList();
        Collections.sort(numeros);
        

        //Conjunos
        HashSet<Integer> numerosSet = new HashSet();
        
        //Se convierte en el HashSet a lista
        
        ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
        Collections.sort(numerosLista);
        
        //Mapas:
        
        HashMap<Integer, String> alumnos = new HashMap();
        //Se convierte el HashMap a TreeMap
        TreeMap<Integer, String> alumnosTree = new TreeMap();
        
        
        
        //Añadir elementos 
        
         Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Libro> libros = new ArrayList();
        Libro libro1 = new Libro();
        System.out.println("Ingresa titulo del primer libro");
        libro1.setTitulo(read.next());
        System.out.println("Ingresa autor");
        libro1.setAutor(read.next());
        System.out.println("Ingresa año de publicacion");
        libro1.setYearofpublish(read.nextInt());
        libros.add(libro1);
        Libro libro2 = new Libro();
        System.out.println("Ingresa titulo del segundo libro");
        libro2.setTitulo(read.next());
        System.out.println("Ingresa autor");
        libro2.setAutor(read.next());
        System.out.println("Ingresa año de publicacion");
        libro2.setYearofpublish(read.nextInt());
        libros.add(libro2);
        Libro libro3 = new Libro();
        System.out.println("Ingresa titulo del tercer libro");
        libro3.setTitulo(read.next());
        System.out.println("Ingresa autor");
        libro3.setAutor(read.next());
        System.out.println("Ingresa año de publicacion");
        libro3.setYearofpublish(read.nextInt());
        libros.add(libro3);
        System.out.println(libros);
        {
            
        }
        
    }
    
}
