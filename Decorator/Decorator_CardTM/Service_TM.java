/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator_CardTM;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Service_TM {
    
    static Scanner sc = new Scanner(System.in);
    
    private ArrayList<Card> Tarjetas = new ArrayList<Card>();
    
    public boolean validarTarjetas(){
        boolean validacion = false;
        if(!Tarjetas.isEmpty()){
                for (int i = 0; i < Tarjetas.size(); i++) {
                    System.out.println(i+"-TARJETA TIPO \n "+Tarjetas.get(i).infoTarjeta());
                    System.out.println("SALDO - "+ Tarjetas.get(i).mostrarSaldo());
                    validacion = true;
                }
            }else{
                  System.out.println("No tiene tarjetas - Se le comprará una");
                  comprarTarjeta();
                    }
        return validacion;
    }
    
    public boolean validarTarjeta(int tarjeta){
        boolean validacion = false;
        if(Tarjetas.size()-1 >= tarjeta){
            validacion = true;
        }else{
            System.out.println("La tarjeta no existe o no está disponible");
        }
        return validacion;
    }
    
    public void comprarTarjeta(){
        Card Tarjeta = new BasicCard(0);
        Tarjetas.add(Tarjeta);
        System.out.println("Tarjeta comprada");
    }
    
    public void recargarTarjeta(){
        System.out.println("¿Que tarjeta desea recargar?");
        validarTarjetas();
        int tarjeta = sc.nextInt();
        if(validarTarjeta(tarjeta)){
            System.out.println("¿Con que saldo desea recargar?");
            int saldo = sc.nextInt();
            Tarjetas.get(tarjeta).recargarSaldo(saldo);  
        }   
    }
    
    public void cambiarTarjeta(){
        System.out.println("¿Que tarjeta desea cambiar");
        validarTarjetas();
        int tarjeta = sc.nextInt();
        if(validarTarjeta(tarjeta)){
                System.out.println("1. Cambiar a tercera edad /--/ 2.Cambiar a Plus");
                int tipo = sc.nextInt();
                switch(tipo){
                    case 1:
                            {
                              Card tarjetaTerceraEdad = new thirdAge_Card(Tarjetas.get(tarjeta));
                              Tarjetas.add(tarjeta, tarjetaTerceraEdad);
                              Tarjetas.remove(tarjeta+1);
                              break;
                            }
                    case 2:
                            {
                             Card tarjetaPlus = new Plus_Card(Tarjetas.get(tarjeta));
                             Tarjetas.add(tarjeta, tarjetaPlus);
                             Tarjetas.remove(tarjeta+1);
                             break;
                            }
                    default:
                            {
                             System.out.println("Opcion no valida");
                             break;
                            }
                }
            }
        }
    
    public void pagarPasaje(){
        System.out.println("¿Con que tarjeta desea pagar?");
        validarTarjetas();
        int tarjeta = sc.nextInt();
        if(validarTarjeta(tarjeta)){
            Tarjetas.get(tarjeta).pagarPasaje();
        }
        
    }
}        
   
