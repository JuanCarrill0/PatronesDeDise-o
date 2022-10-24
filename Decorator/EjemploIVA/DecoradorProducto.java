/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejclasedecorator;

/**
 *
 * @author Juan
 */
public abstract class DecoradorProducto implements InterfazProducto {
    
    InterfazProducto Producto = new ProductoConcretoTelevisor();
    
    DecoradorProducto(InterfazProducto Producto){
        this.Producto = Producto;
    }
    
    @Override
    public double calcularPrecio() {
        return this.Producto.calcularPrecio();
    }
    
}
