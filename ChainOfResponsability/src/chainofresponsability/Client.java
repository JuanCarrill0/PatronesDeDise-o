/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author Juan
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Valor monto*/
        Monto monto = new Monto();
        monto.setMonto(80000);
        /*Cadena de responsabilidad*/
        
        Cargo ejecutivo = new Ejecutivo();
        Cargo liderEjecutivo = new LiderEjecutivo();
        Cargo gerente = new Gerente();
        Cargo director = new Director();
        
        ejecutivo.setCargoSiguiente(liderEjecutivo);
        liderEjecutivo.setCargoSiguiente(gerente);
        gerente.setCargoSiguiente(director);
        
        /*Ejecutivo -> Lider Ejecutivo -> Gerente -> Director*/
        
        ejecutivo.aprobarCredito(monto);
        
    }
    
}
