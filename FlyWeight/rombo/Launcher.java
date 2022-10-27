/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flyweight.rombo;

/**
 *
 * @author Juan
 */
import java.awt.*;

public class Launcher {
    static int CANVAS_SIZE = 500;
    static int ROMBOS_TO_DRAW = 30;
    static int ROMBOS_TYPES = 2;

    public static void main(String[] args) {
        Generador generador = new Generador();
        
        for (int i = 0; i < Math.floor(ROMBOS_TO_DRAW / ROMBOS_TYPES); i++) {
            generador.ponerRombos(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Mi Rombo", Color.BLUE);

        }
        generador.setSize(CANVAS_SIZE, CANVAS_SIZE);
        generador.setVisible(true);
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
