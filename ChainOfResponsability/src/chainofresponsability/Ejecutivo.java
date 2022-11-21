/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author Juan
 */
public class Ejecutivo implements Cargo {
    
    private Cargo cargo;
    private final Credito credito = new Credito();
    
    @Override
    public void setCargoSiguiente(Cargo cargo) {
        this.cargo = cargo;

    }

    @Override
    public void aprobarCredito(Monto monto) {
                if(monto.getMonto()< 10000){
			System.out.println("Credito aprobado por Ejecutivo");
                        credito.setMesesPago(3);
                        credito.setInteres(10);
                        System.out.println("Meses de pago= " + credito.getMesesPago());
                        System.out.println("Interes= "+ credito.calcularInteres(credito.getInteres(), monto.getMonto()));
                        
		}else{
                        System.out.println("Paso por el Ejecutivo");
			this.cargo.aprobarCredito(monto);
		}
    }
    
}
