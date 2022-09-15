/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Estudiantes
 */
public class Director {
    private BuilderCuaderno builder;
    
    public void setCuadernoBuilder(BuilderCuaderno builderCuaderno){
        builder = builderCuaderno;
    }
    
    public Cuaderno getCuaderno(){
        return builder.getCuaderno();
    }
    
    public void construirCuaderno(String Hoja, String Tapa, String Anillo){
        builder.crearNuevoCuaderno();
        builder.buildHoja(Hoja);
        builder.buildTapa(Tapa);
        builder.buildAnillo(Anillo);
    }
}
