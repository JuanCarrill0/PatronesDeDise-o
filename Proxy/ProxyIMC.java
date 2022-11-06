/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronproxy;

/**
 *
 * @author Juan
 */
public class ProxyIMC implements InterfaceIMC {
    
    ServicioIMC Servicio = new ServicioIMC();
    Usuario usuario = new Usuario();
    
    ProxyIMC(double peso, double estatura, Usuario usuario){
        Servicio.setEstatura(estatura);
        Servicio.setPeso(peso);
    }
    @Override
    public double obtenerIMC() {
        if(usuario.getTipoUsuario().equalsIgnoreCase("Usuario Premium")){
            System.out.println("Este el significado de su IMC");
            if(Servicio.obtenerIMC()<)
        }
        return Servicio.obtenerIMC();
    }
    
}
