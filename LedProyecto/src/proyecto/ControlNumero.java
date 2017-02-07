/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import hilos.Hilos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USRKAP
 */
public class ControlNumero {

    public void control0(ArrayList<Led> aListLed0) {
        if (aListLed0 != null) {
            for (Iterator<Led> iterator = aListLed0.iterator();
                    iterator.hasNext();) {
                Led led = iterator.next();
                led.encender();
                try {
                    Thread.sleep(167);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }
    
    public void controlNum(ArrayList<Led> aListLedNum, int num){
    	if (aListLedNum != null) {
            for (Iterator<Led> iterator = aListLedNum.iterator();iterator.hasNext();) {
                Led led = iterator.next();
                led.encender();
                try {
                    Thread.sleep( (long) Math.ceil( (1000) / (num) ));
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            apagarLeds(aListLedNum,num);
            
        }
    }
    
    public void apagarLeds(ArrayList<Led> aListLedNum, int num){
        for (Iterator<Led> iterator = aListLedNum.iterator();iterator.hasNext();) {
            Led led = iterator.next();
            led.apagar();
            try {
                Thread.sleep( (long) Math.ceil( (1000) / (num) ));
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   	
    
    }

}

