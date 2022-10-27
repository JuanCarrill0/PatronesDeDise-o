/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight.rombo;

/**
 *
 * @author Juan
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Generador extends JFrame {
    private List<Rombo> rombos = new ArrayList<>();
    
    public void ponerRombos(int x, int y, String nombre, Color color) {
        RomboType type = RomboFactory.getRomboType(nombre,color);
        Rombo rombo = new Rombo(x, y, type);
        rombos.add(rombo);
    }
    
    @Override
    public void paint(Graphics graphics) {
        for (Rombo rombo : rombos) {
            rombo.draw(graphics);
        }
    }
    
}
