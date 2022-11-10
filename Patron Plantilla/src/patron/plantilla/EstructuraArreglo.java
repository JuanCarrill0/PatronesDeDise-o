/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.plantilla;

/**
 *
 * @author Juan
 */
public abstract class EstructuraArreglo {
    
    protected final int Arreglo[];
    protected int cima = 0;
    protected int tama;
    
    
    EstructuraArreglo(int tamaño){
        
        this.Arreglo = new int[tamaño];
        this.tama = tamaño;
        
    }

    
    public final void Apilar(int dato){
        if (cima < tama){
		Arreglo[cima] = dato;
		cima ++;
	}else System.out.println("Arreglo lleno");;
    }
    
    public final void Mostrar(){
        for (int i = 0; i < cima; i++) {
            System.out.println(Arreglo[i] + "| ");
        }
    } 
    
    public abstract void Desapilar();
}
