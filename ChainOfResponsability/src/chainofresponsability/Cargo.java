/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author Juan
 */
public interface Cargo {
    
    void setCargoSiguiente(Cargo cargo);
    
    void aprobarCredito(Monto monto);
    
    
}
