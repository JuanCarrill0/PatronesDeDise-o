/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author Juan
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Enemy enemy = new BaseEnemy();
        Enemy enemyWithHelmet = new HelmetDecorator(enemy);
        Enemy enemyWithHelmetAndArmour = new ArmourDecorator(enemyWithHelmet);
        
        float Daño = enemyWithHelmetAndArmour.takeDamage();
        System.out.println(Daño);
        
    }
    
}
