/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author Juan
 */
public class Invoker {
    public void executeCommand(Command command, Receiver receptor){
        command.execute(receptor);
    }
}
