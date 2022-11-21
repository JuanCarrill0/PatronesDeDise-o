/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsability;

/**
 *
 * @author Juan
 */
public class Credito {
    
    private int valorCreditoAprobado;
    private int mesesPago;
    private int interes;
    
    public double calcularInteres(int interes, int monto){
        return (double)monto*((double)interes/100);
    }

    public int getValorCreditoAprobado() {
        return valorCreditoAprobado;
    }

    public int getMesesPago() {
        return mesesPago;
    }

    public int getInteres() {
        return interes;
    }

    public void setValorCreditoAprobado(int valorCreditoAprobado) {
        this.valorCreditoAprobado = valorCreditoAprobado;
    }

    public void setMesesPago(int mesesPago) {
        this.mesesPago = mesesPago;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
}
