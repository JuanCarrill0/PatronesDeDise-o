/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron.plantilla;

/**
 *
 * @author Juan
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---PILA---");
        EstructuraArreglo Pila = new Pila(4);
        Pila.Apilar(4);
        Pila.Apilar(3);
        Pila.Apilar(2);
        Pila.Mostrar();
        Pila.Desapilar();
        Pila.Mostrar();
        System.out.println("---COLA----");
        EstructuraArreglo Cola = new Cola(4);
        Cola.Apilar(4);
        Cola.Apilar(3);
        Cola.Apilar(2);
        Cola.Mostrar();
        Cola.Desapilar();
        Cola.Mostrar();
    }
    
}
