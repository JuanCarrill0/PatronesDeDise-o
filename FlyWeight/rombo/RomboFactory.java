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
import java.util.HashMap;
import java.util.Map;

public class RomboFactory {
    
    static Map<String, RomboType> romboTypes = new HashMap<>();
    
    public static RomboType getRomboType(String nombre, Color color) {
        RomboType result = romboTypes.get(nombre);
        if (result == null) {
            result = new RomboType(nombre, color);
            romboTypes.put(nombre, result);
        }
        return result;
    }
    
}
