/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.plantilla;

/**
 *
 * @author Juan
 */
public class Pila extends EstructuraArreglo{
    
    Pila(int cima){
        super(cima);
    }
    
    /*Desapila en LIFO "last in, first out" */
    
    @Override
    public void Desapilar() {
        if (cima > 0){
		int aux = Arreglo[cima-1];
		cima --;
	        System.out.println("Desapilado "+ aux);
	}else {
		System.out.println("Pila Vacia");
	}
    }
    
}
