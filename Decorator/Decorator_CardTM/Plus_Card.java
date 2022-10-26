/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator_CardTM;

/**
 *
 * @author Juan
 */
public class Plus_Card extends CardDecorator {
    
    boolean transbordo = false;
    
    public Plus_Card(Card tarjetaTM) {
        super(tarjetaTM);
    }

    @Override
    public String infoTarjeta() {
        return getCard().infoTarjeta()+"\n TARJETA PLUS - beneficio de transbordo";
    }

    @Override
    public void setSaldo(int newSaldo) {
        getCard().setSaldo(newSaldo);
    }

    @Override
    public int mostrarSaldo() {
        return getCard().mostrarSaldo();
    }

    @Override
    public int recargarSaldo(int recarga) {
        return getCard().recargarSaldo(recarga);
    }

    @Override
    public void pagarPasaje() {
        if (getCard().mostrarSaldo() <= pasaje.getPasaje() && transbordo == false) {
            System.out.println("Saldo insuficiente.");
        } else {
            if(transbordo==false){
                System.out.println("\nGracias.");
                System.out.println("\nEsta tarjeta cuenta con 1 transbordo, no se cobrará el siguiente pasaje.");
                getCard().setSaldo(getCard().mostrarSaldo() - pasaje.getPasaje());
                transbordo = true;
            }else{
                System.out.println("Transbordo Exitoso");
                transbordo=false;
            }
        }
    }
    
}
