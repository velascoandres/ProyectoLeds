# -*- coding: utf-8 -*-

from cargarLeds import cargarLeds
import time
import RPi.GPIO as GPIO

class temporizador (): #CLASE PRINCIPAL
    def empezar(self): #METODO QUE DARA COMIENZO AL TEMPORIZADOR
        print("INICIANDO TEMPORIZADOR!");
        cargador=cargarLeds() # INSTANCIADO cargador del tipo cargarLeds
        cargador.start() #SE DA COMIENZO AL HILO
        time.sleep(1) # ESPERA UN SEGUNDO HASTA QUE LOS ARREGLOS DE LEDS DE LA CLASE "cargarLeds" ESTEN LLENOS
        cargador.getNum0() #EMPEZARA A CONTAR CON EL NUMERO 0 EN LOS LEDS, DEL CIRCUITO Y ASI SUCESIVAMENTE
        cargador.getNum1()
        cargador.getNum2()
        cargador.getNum3()
        cargador.getNum4()
        cargador.getNum5()
        cargador.getNum6()
        cargador.getNum7()
        cargador.getNum8()
        cargador.getNum9()
        print("TEMPORIZADOR FINALIZADO!");

# FUNCION PRINCIPAL O "main"
if __name__ == "__main__":
    Mitemporizador=temporizador() #Se declara Mitemporizador del tipo temporizador
    Mitemporizador.empezar() #SE INICIA EL TEMPORIZADOR
