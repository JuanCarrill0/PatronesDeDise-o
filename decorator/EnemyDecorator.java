/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author Juan
 */
public abstract class EnemyDecorator implements Enemy {
    
    protected Enemy enemy;
    
    public EnemyDecorator(Enemy enemy_new){
        this.enemy = enemy_new;
    }
    
    @Override
    public float takeDamage() {
        return this.enemy.takeDamage();
    }
    
}
