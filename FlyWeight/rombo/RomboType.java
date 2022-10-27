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

public class RomboType {
    
    private String name;
    private Color color;
    private String otroValorRombo;
    
    public RomboType(String name, Color color){
        this.name = name;
        this.color = color;;
    }
    
    public void draw(Graphics g, int x, int y){
        Graphics2D g2 = (Graphics2D) g;
        g2.rotate(90, x, y);
        g2.setColor( color );
        g2.fillRect(x, y, 50, 50);
        
    }
}
