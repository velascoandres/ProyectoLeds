/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

import com.pi4j.io.gpio.RaspiPin;

/**
 *
 * @author USRKAP
 */
public class Numero {

    private ArrayList<Led> aListLed1, aListLed2, aListLed3, aListLed4,
            aListLed5, aListLed6, aListLed7, aListLed9, aListLed8, aListLed0;

    public ArrayList<Led> cargarLed1() {
    	aListLed1=new ArrayList<>();
    	aListLed1.add(new Led(false, RaspiPin.GPIO_02));
    	aListLed1.add(new Led(false, RaspiPin.GPIO_03));
//        aListLed1.add(new Led(false, 18));
//        aListLed1.add(new Led(false, 19));
//        aListLed1.add(new Led(false, 20));
//        aListLed1.add(new Led(false, 21));
        return aListLed1;
    }

    public ArrayList<Led> cargarLed2() {
        aListLed2 = new ArrayList<>();
        aListLed2.add(new Led(false, RaspiPin.GPIO_01));
        aListLed2.add(new Led(false, RaspiPin.GPIO_02));
        aListLed2.add(new Led(false, RaspiPin.GPIO_00));
        aListLed2.add(new Led(false, RaspiPin.GPIO_05));
        aListLed2.add(new Led(false, RaspiPin.GPIO_06));
        return aListLed2;
    }

    public ArrayList<Led> cargarLed3() {
        aListLed3 = new ArrayList<>();
        aListLed3.add(new Led(false, RaspiPin.GPIO_01));
        aListLed3.add(new Led(false, RaspiPin.GPIO_02));
        aListLed3.add(new Led(false, RaspiPin.GPIO_00));
        aListLed3.add(new Led(false, RaspiPin.GPIO_03));
        aListLed3.add(new Led(false, RaspiPin.GPIO_06));
        return aListLed3;
    }

    public ArrayList<Led> cargarLed4() {
        aListLed4 = new ArrayList<>();
        aListLed4.add(new Led(false, RaspiPin.GPIO_04));
        aListLed4.add(new Led(false, RaspiPin.GPIO_00));
        aListLed4.add(new Led(false, RaspiPin.GPIO_02));
        aListLed4.add(new Led(false, RaspiPin.GPIO_03));
        return aListLed4;
    }

    public ArrayList<Led> cargarLed5() {
        aListLed5 = new ArrayList<>();
        aListLed5.add(new Led(false, RaspiPin.GPIO_01));
        aListLed5.add(new Led(false, RaspiPin.GPIO_04));
        aListLed5.add(new Led(false, RaspiPin.GPIO_00));
        aListLed5.add(new Led(false, RaspiPin.GPIO_03));
        aListLed5.add(new Led(false, RaspiPin.GPIO_06));
        return aListLed5;
    }

    public ArrayList<Led> cargarLed6() {
    	aListLed6 = new ArrayList<>();
        aListLed6.add(new Led(false, RaspiPin.GPIO_04));
        aListLed6.add(new Led(false, RaspiPin.GPIO_00));
        aListLed6.add(new Led(false, RaspiPin.GPIO_05));
        aListLed6.add(new Led(false, RaspiPin.GPIO_03));
        aListLed6.add(new Led(false, RaspiPin.GPIO_06));
    	return aListLed6;
    }

    public ArrayList<Led> cargarLed7() {
    	aListLed7 = new ArrayList<>();
        aListLed7.add(new Led(false, RaspiPin.GPIO_01));
        aListLed7.add(new Led(false, RaspiPin.GPIO_02));
        aListLed7.add(new Led(false, RaspiPin.GPIO_00));
        aListLed7.add(new Led(false, RaspiPin.GPIO_03));
        return aListLed7;
    }

    public ArrayList<Led> cargarLed8() {
    	aListLed8 = new ArrayList<>();
    	aListLed8.add(new Led(false, RaspiPin.GPIO_01));
    	aListLed8.add(new Led(false, RaspiPin.GPIO_02));
    	aListLed8.add(new Led(false, RaspiPin.GPIO_03));
    	aListLed8.add(new Led(false, RaspiPin.GPIO_00));
    	aListLed8.add(new Led(false, RaspiPin.GPIO_04));
    	aListLed8.add(new Led(false, RaspiPin.GPIO_05));
    	aListLed8.add(new Led(false, RaspiPin.GPIO_06));
        return aListLed8;
    }

    public ArrayList<Led> cargarLed9() {
    	aListLed9 = new ArrayList<>();
    	aListLed9.add(new Led(false, RaspiPin.GPIO_01));
    	aListLed9.add(new Led(false, RaspiPin.GPIO_02));
    	aListLed9.add(new Led(false, RaspiPin.GPIO_03));
    	aListLed9.add(new Led(false, RaspiPin.GPIO_00));
    	aListLed9.add(new Led(false, RaspiPin.GPIO_04));
    	aListLed9.add(new Led(false, RaspiPin.GPIO_06));
        return aListLed9;
    }

    public ArrayList<Led> cargarLed0() {
        aListLed0 = new ArrayList<>();
        aListLed0.add(new Led(false, RaspiPin.GPIO_01));
        aListLed0.add(new Led(false, RaspiPin.GPIO_02));
        aListLed0.add(new Led(false, RaspiPin.GPIO_03));
        aListLed0.add(new Led(false, RaspiPin.GPIO_04));
        aListLed0.add(new Led(false, RaspiPin.GPIO_05));
        aListLed0.add(new Led(false, RaspiPin.GPIO_06));
        /*aListLed0.add(new Led(false, 7));
        aListLed0.add(new Led(false, 8));
        aListLed0.add(new Led(false, 9));
        aListLed0.add(new Led(false, 13));
        aListLed0.add(new Led(false, 14));
        aListLed0.add(new Led(false, 15));
        aListLed0.add(new Led(false, 16));
        aListLed0.add(new Led(false, 17));
        aListLed0.add(new Led(false, 18));
        aListLed0.add(new Led(false, 19));
        aListLed0.add(new Led(false, 20));
        aListLed0.add(new Led(false, 21));*/
        return aListLed0;

    }

    public ArrayList<Led> getaListLed1() {
    
        return aListLed1;
    }

    public void setaListLed1(ArrayList<Led> aListLed1) {
    	
        this.aListLed1 = aListLed1;
    }

    public ArrayList<Led> getaListLed2() {
        return aListLed2;
    }

    public void setaListLed2(ArrayList<Led> aListLed2) {
        this.aListLed2 = aListLed2;
    }

    public ArrayList<Led> getaListLed3() {
        return aListLed3;
    }

    public void setaListLed3(ArrayList<Led> aListLed3) {
        this.aListLed3 = aListLed3;
    }

    public ArrayList<Led> getaListLed4() {
        return aListLed4;
    }

    public void setaListLed4(ArrayList<Led> aListLed4) {
        this.aListLed4 = aListLed4;
    }

    public ArrayList<Led> getaListLed5() {
        return aListLed5;
    }

    public void setaListLed5(ArrayList<Led> aListLed5) {
        this.aListLed5 = aListLed5;
    }

    public ArrayList<Led> getaListLed6() {
        return aListLed6;
    }

    public void setaListLed6(ArrayList<Led> aListLed6) {
        this.aListLed6 = aListLed6;
    }

    public ArrayList<Led> getaListLed7() {
        return aListLed7;
    }

    public void setaListLed7(ArrayList<Led> aListLed7) {
        this.aListLed7 = aListLed7;
    }

    public ArrayList<Led> getaListLed9() {
        return aListLed9;
    }

    public void setaListLed9(ArrayList<Led> aListLed9) {
        this.aListLed9 = aListLed9;
    }

    public ArrayList<Led> getaListLed8() {
        return aListLed8;
    }

    public void setaListLed8(ArrayList<Led> aListLed8) {
        this.aListLed8 = aListLed8;
    }

    public ArrayList<Led> getaListLed0() {
        return aListLed0;
    }

    public void setaListLed0(ArrayList<Led> aListLed0) {
        this.aListLed0 = aListLed0;
    }

}

