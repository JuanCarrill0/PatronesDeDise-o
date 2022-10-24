/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejclasedecorator;

/**
 *
 * @author Juan
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Productos*/
        InterfazProducto ProductoTelevisor = new ProductoConcretoTelevisor();
        InterfazProducto ProductoCelular = new ProductoConcretoCelular();
        /*Decorador Televisor*/
        InterfazProducto ProductoConIva = new DecoratorIVA(ProductoTelevisor);
        InterfazProducto ProductoDescuentoAfiliado = new DecoradorDescuentoAfiliado(ProductoTelevisor);
        InterfazProducto ProductoDescuentoAfiliadoConIVA = new DecoratorIVA(ProductoDescuentoAfiliado);
        
        
        System.out.println("TELEVISOR \nProducto con precio base sin IVA= " +ProductoTelevisor.calcularPrecio()
                            +"\nProducto con IVA = "+ProductoConIva.calcularPrecio()
                              +"\nProducto con descuanto Afiliado = "+ProductoDescuentoAfiliado.calcularPrecio()
                                +"\nProducto con IVA pero con descuento Afiliado= "+ProductoDescuentoAfiliadoConIVA.calcularPrecio());
        
        /*Decorador Celular*/
        InterfazProducto ProductoConIvaC = new DecoratorIVA(ProductoCelular);
        System.out.println("CELULAR \nProducto con precio base sin IVA= "+ProductoCelular.calcularPrecio()
                            +"\n Producto con IVA= "+ProductoConIvaC.calcularPrecio());
    }
    
}
