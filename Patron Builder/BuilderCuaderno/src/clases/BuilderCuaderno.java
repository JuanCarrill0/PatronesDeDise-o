/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Estudiantes
 */
public abstract class BuilderCuaderno {
    protected Cuaderno cuaderno;
    
    public Cuaderno getCuaderno(){
        return cuaderno;
    }
    
    public void crearNuevoCuaderno(){
        cuaderno = new Cuaderno();
    }
    
    public abstract void buildHoja(String Hoja);
    public abstract void buildTapa(String Tapa);
    public abstract void buildAnillo(String Anillo);
    
}
