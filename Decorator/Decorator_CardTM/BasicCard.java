
package Decorator_CardTM;

/**
 * @author Darkmoon
 */

public class BasicCard implements Card {
    
    private int saldo;

    public BasicCard(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public int mostrarSaldo() {
        return saldo;
    }

    @Override
    public int recargarSaldo(int recarga) {
        return saldo += recarga;
    }

    @Override
    public void pagarPasaje() {
        
        if (saldo <= pasaje.getPasaje()) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= pasaje.getPasaje();
            System.out.println("\nGracias.");
        }
        
         setSaldo(saldo);
    }

    @Override
    public String infoTarjeta() {
        return "TARJETA BASICA = Ningún beneficio adicional";
    }
}

