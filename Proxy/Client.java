/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronproxy;

/**
 *
 * @author Juan
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProxyIMC Proxy = new ProxyIMC(68,1.65);
        System.out.println(Proxy.obtenerIMC());
    }
    
}
