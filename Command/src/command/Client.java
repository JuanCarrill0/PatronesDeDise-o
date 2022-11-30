/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package command;

/**
 *
 * @author Juan
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receptor = new Receiver();
        
        invoker.executeCommand(new ConcreteCommand(), receptor);
    }
    
}
