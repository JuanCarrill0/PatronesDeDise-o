/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight.rombo;

/**
 *
 * @author Juan
 */
import java.awt.*;

public class Rombo {
    private int x;
    private int y;
    private RomboType type;
    
    public Rombo(int x, int y, RomboType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    public void draw(Graphics g){
        type.draw(g,x,y);
    }
}
