/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author Juan
 */
public class ConcreteCommand implements Command {

    @Override
    public void execute(Receiver receptor) {
        receptor.doSomething();
    }
    
}
