/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import clases.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Estudiantes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Argumentos[] = new String[4];

        BufferedReader leer;
        try{
            leer = new BufferedReader(new FileReader("C:/Users/Estudiantes/Desktop/Cuaderno.txt"));
            String linea = leer.readLine();
            int Posición = 0;
            while(linea != null){
                System.out.println(linea);
                Argumentos[Posición]= linea;
                linea = leer.readLine();
                Posición++;
            }
            leer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Director director = new Director();
        if(Argumentos[0].equalsIgnoreCase("Economico")){
            BuilderCuaderno CuadernoEconomico = new BuilderCuaderno_Economico();
            director.setCuadernoBuilder(CuadernoEconomico);
            director.construirCuaderno(Argumentos[1], Argumentos[2], Argumentos[3]);
            Cuaderno cuaderno = director.getCuaderno();
            System.out.println(cuaderno.getClass());  
        }else{
            if(Argumentos[0].equalsIgnoreCase("Materias")){
                BuilderCuaderno Cuaderno5Materias = new BuilderCuaderno_5Materias();
                director.setCuadernoBuilder(Cuaderno5Materias);
                director.construirCuaderno(Argumentos[1], Argumentos[2], Argumentos[3]);
                Cuaderno cuaderno = director.getCuaderno();
                System.out.println(cuaderno.getClass());   
            }else{
                System.out.println("Cuaderno no disponible");
            }
        } 
    }
    
}
