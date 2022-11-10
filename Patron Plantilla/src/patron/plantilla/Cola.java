/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron.plantilla;

/**
 *
 * @author Juan
 */
public class Cola extends EstructuraArreglo{
    
    Cola(int cima){
        super(cima);
    }
    
    /*Desapilando en fifo, "First in, first out"*/
    @Override
    public void Desapilar() {
         if (tama!= 0){
            int aux = Arreglo[0];
            cima--;
            for (int i = 0; i < cima; i++)
               Arreglo[i] = Arreglo[i + 1];
            System.out.println("Desapilado "+ aux);
         }else {
              System.out.println("Cola Vacia");
         }
    } 
}
