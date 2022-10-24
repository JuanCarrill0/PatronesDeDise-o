/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejclasedecorator;

/**
 *
 * @author Juan
 */
public class DecoradorDescuentoAfiliado extends DecoradorProducto{
    
    DecoradorDescuentoAfiliado(InterfazProducto Producto){
        super(Producto);
    }
    
    @Override
    public double calcularPrecio() {
        return this.Producto.calcularPrecio()-this.Producto.calcularPrecio()*0.30;
    }
    
}
