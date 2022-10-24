/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Juan
 */
public class ArmourDecorator extends EnemyDecorator {
    
    public ArmourDecorator(Enemy enemy_new){
        super(enemy_new);
    }
    
    @Override
    public float takeDamage(){
        return this.enemy.takeDamage()/3;
    }
    
}
