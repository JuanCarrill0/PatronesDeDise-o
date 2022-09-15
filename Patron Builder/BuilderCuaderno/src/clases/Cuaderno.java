/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Estudiantes
 */
public class Cuaderno {
    /* Pasarlo a objetos y crear tipos en el txt */
    
    private String hoja = "";
    private String tapa = "";
    private String anillo = "";

    public void setHoja(String hoja) {
        this.hoja = hoja;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public void setAnillo(String anillo) {
        this.anillo = anillo;
    }

    public String getHoja() {
        return hoja;
    }

    public String getTapa() {
        return tapa;
    }

    public String getAnillo() {
        return anillo;
    }
    
    
    
}
