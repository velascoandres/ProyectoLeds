/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USRKAP
 */
public class Hilo2 extends Thread{
    @Override
    public void run() {
        try {

            for (int i = 0; i < 10; i++) {
                sleep(1000);//dormir por milisegundos    
                System.out.println("Hola 2");
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
