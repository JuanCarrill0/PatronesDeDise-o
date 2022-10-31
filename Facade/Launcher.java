/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade;

/**
 *
 * @author Juan
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadoraFacade calculadora = new CalculadoraFacade(5,5);
        
        calculadora.Calcular();
    }
    
}
