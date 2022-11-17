/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.strategy;

/**
 *
 * @author Juan
 */
public class Contexto {
    
    private Estrategia estrategia;

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }
    
    public String ejecutarEstrategia(){
        return estrategia.ejecutar();
    }
}
