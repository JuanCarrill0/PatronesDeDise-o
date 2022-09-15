/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Estudiantes
 */
public class BuilderCuaderno_5Materias extends BuilderCuaderno {
    
    @Override
    public void buildHoja(String Hoja){
        System.out.println("Cuaderno 5 Materias con Hojas tipo " + Hoja);
        cuaderno.setHoja(Hoja);
    }
    @Override
    public void buildTapa(String Tapa){
        System.out.println("Cuaderno 5 Materias con Tapa tipo "+ Tapa);
        cuaderno.setTapa(Tapa);
    }
    @Override
    public void buildAnillo(String Anillo){
        System.out.println("Cuaderno 5 Materias con Anillo tipo "+ Anillo);
        cuaderno.setAnillo(Anillo);
    }
    
}
