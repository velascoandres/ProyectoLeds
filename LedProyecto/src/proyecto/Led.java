
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
//import com.sun.org.apache.bcel.internal.generic.GETFIELD;

/**
 *
 * @author USRKAP
 */
public class Led {

    private boolean estado;
    private Pin pin;
    private GpioController gpio; 
    private GpioPinDigitalOutput ledPin;
    
    public Pin getPin() {
        return pin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }

    public Led(boolean estado, Pin pin) {
        this.estado = estado;
        this.pin = pin;
    }

    public boolean encender() {
        this.gpio=GpioFactory.getInstance();
        this.ledPin = this.gpio.provisionDigitalOutputPin( this.getPin(), "LED", PinState.HIGH);
        return true;
    }

    public boolean apagar() {
        this.ledPin=this.gpio.provisionDigitalOutputPin( this.getPin(), "LED", PinState.LOW);
        return false;
    }
    
    /*public static void main(String args[]){
    	Led led1=new Led(true,RaspiPin.GPIO_02);
    	System.out.println("Este es el Pin: "+led1.getPin()); 
    }*/

}
