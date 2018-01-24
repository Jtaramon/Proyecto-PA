/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seleccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Juan Ramón
 */
public class Archivos {



   private Scanner entrada;

   // permite al usuario abrir el archivo
   public void abrirArchivo()
   {
      try
      {
         entrada = new Scanner( new File( "Numero1.txt" ) );
      } // fin de try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error al abrir el archivo." );
         System.exit( 1 );
      } // fin de catch
   } // fin del m�todo abrirArchivo

   
   
   
   
   // lee registro del archivo
   public ArrayList<Integer> leerRegistros()
   {
      
      ArrayList<Integer> lista = new ArrayList<Integer>();
      try // lee registros del archivo, usando el objeto Scanner
      {
         
         while ( entrada.hasNext() )
         {
             // System.out.println(entrada.nextLine());
             String cadena = entrada.nextLine();
             ArrayList<String> registro = new ArrayList<String>(Arrays.asList(cadena.split(",")));

             int e = Integer.parseInt(registro.get(0));
             int f = Integer.parseInt(registro.get(1));
             
             lista.add(e);
             lista.add(f);
                    
         } // fin de while
      } // fin de try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "El archivo no esta bien formado." );
         entrada.close();
         System.exit( 1 );
      } // fin de catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error al leer del archivo." );
         System.exit( 1 );
      } // fin de catch
      return lista;
   } // fin del m�todo leerRegistros

   // lee registro del archivo
   
   // cierra el archivo y termina la aplicaci�n
   public void cerrarArchivo()
   {
      if ( entrada != null )
         entrada.close(); // cierra el archivo
   } // fin del m�todo cerrarArchivo
   
   
   
   public int [] transformar_arrayList_arreglo(ArrayList<Integer>l){
       int [] arreglo = new int [l.size()];
       for (int i = 0; i < l.size(); i++) {
           arreglo[i] = l.get(i);
           
       }
       return arreglo;
   }
}

    

