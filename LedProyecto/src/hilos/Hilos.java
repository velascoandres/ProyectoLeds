/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;
import proyecto.CargarLeds;
import proyecto.ControlNumero;
import proyecto.Led;

/**
 *
 * @author USRKAP
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Hilo1 hilo1 = new Hilo1();
//        Hilo2 hilo2 = new Hilo2();
//
//        hilo1.start();
//        hilo2.start();
//        Reloj r = new Reloj();
//        r.start();
        CargarLeds cl = new CargarLeds();
        cl.start();
        ControlNumero controlador = new ControlNumero();
        //esperar hasta que lo AL esten llenos
        ArrayList<Led> aListLed0 = cl.getaListLed0();
        controlador.controlNum(aListLed0, 6);
        /*if (aListLed0 != null) {
            for (Iterator<Led> iterator = aListLed0.iterator(); iterator.hasNext();) {
                Led led = iterator.next();
                led.encender();
                try {
                    Thread.sleep(167);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }*/
        ArrayList<Led> aListLed1=cl.getaListLed1();
        controlador.controlNum(aListLed1, 2);
        ArrayList<Led> aListLed2=cl.getaListLed1();
        controlador.controlNum(aListLed2, 2);
        ArrayList<Led> aListLed3=cl.getaListLed1();
        controlador.controlNum(aListLed3, 2);
        ArrayList<Led> aListLed4=cl.getaListLed1();
        controlador.controlNum(aListLed4, 2);
        ArrayList<Led> aListLed5=cl.getaListLed1();
        controlador.controlNum(aListLed5, 2);
        ArrayList<Led> aListLed6=cl.getaListLed1();
        controlador.controlNum(aListLed6, 2);
        ArrayList<Led> aListLed7=cl.getaListLed1();
        controlador.controlNum(aListLed7, 2);
        ArrayList<Led> aListLed8=cl.getaListLed1();
        controlador.controlNum(aListLed8, 2);
        ArrayList<Led> aListLed9=cl.getaListLed1();
        controlador.controlNum(aListLed9, 2);
    }

}
