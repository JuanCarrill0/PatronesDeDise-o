/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronproxy;
/**
 *
 * @author Juan
 */
public class ServicioIMC implements InterfaceIMC {
    
    private double peso;
    private double estatura;
    
    ServicioIMC(){
        
    }
    
    ServicioIMC(double peso, double estatura){
        this.peso = peso;
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    @Override
    public double obtenerIMC() {
        return peso/Math.pow(estatura,2);
    }
    
}
