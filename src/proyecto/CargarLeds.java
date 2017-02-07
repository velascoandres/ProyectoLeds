/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author USRKAP
 */
public class CargarLeds extends Thread {

    public ArrayList<Led> aListLed0, aListLed1;

    public void setaListLed0(ArrayList<Led> aListLed0) {
        this.aListLed0 = aListLed0;
    }

    public void setaListLed1(ArrayList<Led> aListLed1) {
        this.aListLed1 = aListLed1;
    }

    public ArrayList<Led> getaListLed1() {
        return aListLed1;
    }

    public ArrayList<Led> getaListLed0() {
        return aListLed0;
    }

    @Override
    public void run() {
        Numero numero = new Numero();
        aListLed0 = numero.cargarLed0();
        aListLed1 = numero.cargarLed1();
    }

}

