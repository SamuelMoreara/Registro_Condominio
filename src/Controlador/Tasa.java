
package Controlador;


/**
 *
 * @author ARANAGA
 */
public class Tasa {
    
    public float transformaraDolares(int bolivares, int tasa){
        
        float dolares = bolivares / tasa;
        
        return dolares;
    }
    
    public int transformaraBolivares(float dolares, int tasa){
        
    
        int bolivares = Math.round(dolares * tasa);
        
        return bolivares;
    }
}
