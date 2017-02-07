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

    public ArrayList<Led> aListLed0, aListLed1,aListLed2, aListLed3,aListLed4, aListLed5,aListLed6, aListLed7
    ,aListLed8, aListLed9;

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
        aListLed2 = numero.cargarLed2();
        aListLed3 = numero.cargarLed3();
        aListLed4 = numero.cargarLed4();
        aListLed5 = numero.cargarLed5();
        aListLed6 = numero.cargarLed6();
        aListLed7 = numero.cargarLed7();
        aListLed8 = numero.cargarLed8();
        aListLed9 = numero.cargarLed9();
    }

}

