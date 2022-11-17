/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron.strategy;

/**
 *
 * @author Juan
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estrategia estrategiaA = new EstrategiaConcretaA();
        Contexto contexto = new Contexto();
        contexto.setEstrategia(estrategiaA);
        System.out.println(contexto.ejecutarEstrategia());
    }
    
}
