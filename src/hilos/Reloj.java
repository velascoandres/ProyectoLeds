/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USRKAP
 */
public class Reloj extends Thread {

    @Override
    public void run() {
        SimpleDateFormat simpleDate = new SimpleDateFormat("MM/DD/YY hh:mm:ss");

        while (true) {
            try {
                Date fecha = new Date();
                String fechaActual = simpleDate.format(fecha);
                sleep(1000);
                System.out.println(fechaActual);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

