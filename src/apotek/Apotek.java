/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apotek;

import javax.swing.SwingUtilities;

/**
 *
 * @author badnoby
 */
public class Apotek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Splash form = new Splash();
                Splash.main(args);
            }
        });
    }
    
}
