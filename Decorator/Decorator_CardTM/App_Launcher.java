
package Decorator_CardTM;
import java.util.Scanner;

/**
 * @author Darkmoon
 */


public class App_Launcher {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        boolean finalizar = false;
        Service_TM Servicio = new Service_TM();
        
        while(!finalizar){
            System.out.println("SERVICIO TRANSMILENIO");
            boolean tarjeta = Servicio.validarTarjetas();
            if(tarjeta){
                System.out.println("Opciones \n 1-Comprar Tarjeta\n 2-Recargar Tarjeta \n 3-Cambiar tipo de Tarjeta\n 4-Pagar Pasaje ");
                int valor = sc.nextInt();
                switch(valor){
                    case 1:
                            {
                                Servicio.comprarTarjeta();
                                break;    
                            }
                            
                    case 2:
                            {
                                Servicio.recargarTarjeta();
                                break;
                            }
                    case 3:
                            {
                                Servicio.cambiarTarjeta();
                                break;
                            }
                    case 4:
                            {
                                Servicio.pagarPasaje();
                                break;
                            }
                        
                    default:
                            {
                                System.out.println("Opción no valida");
                                break;
                            }

                                           
                }    
            }   
        }  
    }
}
