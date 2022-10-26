package Decorator_CardTM;

/**
 * @author Darkmoon
 */

public class thirdAge_Card extends CardDecorator {
    

    public thirdAge_Card(Card tarjetaTM) {
        super(tarjetaTM);
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
        
        if (getCard().mostrarSaldo() <= pasaje.getPasajeTerceraEdad()) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("\nGracias.");
             getCard().setSaldo(getCard().mostrarSaldo() - pasaje.getPasajeTerceraEdad());
        }
    }

    @Override
    public void setSaldo(int newSaldo) {
        getCard().setSaldo(newSaldo);
    }

    @Override
    public String infoTarjeta() {
        return getCard().infoTarjeta()+"\n TARJETA TERCERA EDAD - Beneficio de menos costo del pasaje";
    }
}
