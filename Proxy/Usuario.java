/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronproxy;

/**
 *
 * @author Juan
 */
public class Usuario {
    
    private String tipoUsuario;
    
    Usuario(){
        this.tipoUsuario = "Usuario Normal";
    }
    
    public void convertirPremium(){
        this.tipoUsuario = "Usuario Premium";
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
}
