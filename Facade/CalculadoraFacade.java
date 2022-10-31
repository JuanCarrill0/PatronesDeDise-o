/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author Juan
 */
public class CalculadoraFacade {
    /*Variables*/
    private Entrada num1 = new Entrada();
    private Entrada num2 = new Entrada();
    private Salida salida = new Salida();
    /*Operaciones*/
    private Suma suma = new Suma();
    
    CalculadoraFacade(double num1, double num2){
        this.num1.setValorEntrada(num1);
        this.num2.setValorEntrada(num2);
    }
    
    /*MODIFICAR SOUT En la clase salida*/
    
    public void Calcular(){
        System.out.print("La SUMA es = ");
        salida.setvalorSalida(suma.operar(this.num1.getvalorEntrada(), this.num2.getvalorEntrada()));
        System.out.println(salida.getvalorSalida());
        System.out.print("La MULTIPLICACIÓN es = ");
        salida.setvalorSalida(multiplicacionEnFachada());
        System.out.println(salida.getvalorSalida());
        
       
    }
    
    public double multiplicacionEnFachada(){
        double multiplicacion = 0;
        for (int i = 0; i < this.num2.getvalorEntrada(); i++) {
            multiplicacion += suma.operar(0, this.num1.getvalorEntrada());
        }
        return multiplicacion;
    }
    
}
