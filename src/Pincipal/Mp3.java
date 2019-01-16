/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pincipal;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 *
 * @author Will2VP
 */
public class Mp3 {
    
    BasicPlayer musica;
    String ruta;
    Mp3(){
        this.musica = new BasicPlayer();
    }
    
    boolean abrir(String ruta){
        File archivo = new File(ruta);
        try {            
            this.ruta = ruta;
            musica.open(archivo);
            return true;
        } catch (BasicPlayerException ex) {
            return false;
        }
    }
    
    boolean reproducir(){
        try {
            musica.play();
            return true;
        } catch (BasicPlayerException ex) {
            return false;
        }
    }
//    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
