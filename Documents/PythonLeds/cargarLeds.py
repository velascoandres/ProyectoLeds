#!/usr/bin/python

import threading # Libreria para el manejo de los hilos
import time
from Numeros import Numeros
import RPi.GPIO as GPIO

class cargarLeds(threading.Thread): #El módulo threading contiene una clase Thread que debemos extender para crear nuestros propios hilos de ejecución
    def __init__(self):
        threading.Thread.__init__(self) #Si queremos especificar nuestro propio constructor, este deberá llamar a threading.Thread.__init__(self) para inicializar el objeto correctamente.
        self.aLed0 = list()             #OTRA FORMA MAS FACIL DE ENTENDER, CUANDO UNA CLASE HEREDA LOS ATRIBUTOS DE OTRA CLASE, Y ESA CLASE TIENE OTROS ATRIBUTOS MAS, EN PYTHON SE ESPECIFICA
        self.aLed1 = list()             # EL CONSTRUCTOR , ES DECIR EN JAVA CUANDO LA CLASE "cliente" HEREDA LOS ATRIBUTOS DE LA CLASE "persona", PERO CLIENTE VA A TENER OTROS ATRIBUTOS APARTE DE LOS QUE HEREDO DE PERSONA
        self.aLed2 = list()             # ENTONCES EN PYTHON, "threading.Thread.__init__(self)" vendria a ser el constructor de la clase Thread, y las VARIABLES QUE
        self.aLed3 = list()             # ESTAN DESPUES SON LOS ATRIBUTOS QUE LA CLASE ACTUAL NECESITA, APARTE DE LOS METODOS Y ATRIBUTOS QUE HEREDO DE Thread.
        self.aLed4 = list()
        self.aLed5 = list()
        self.aLed6 = list()
        self.aLed7 = list()
        self.aLed8 = list()
        self.aLed9 = list()


    #ESTE METODO VA A INICIALIZAR EL NUMERO 0, EN LOS LEDS, VEASE EN EL METODO "controlador"
    def getNum0(self):
       self.controlador(self.aLed0)

    def getNum1(self):
       self.controlador(self.aLed1)

    def getNum2(self):
       self.controlador(self.aLed2)

    def getNum3(self):
       self.controlador(self.aLed3)

    def getNum4(self):
       self.controlador(self.aLed4)

    def getNum5(self):
       self.controlador(self.aLed5)

    def getNum6(self):
       self.controlador(self.aLed6)

    def getNum7(self):
       self.controlador(self.aLed7)

    def getNum8(self):
      self.controlador(self.aLed8)

    def getNum9(self):
      self.controlador(self.aLed9)

# ESTE METODO RECIBIRA COMO ARGUMENTO UN ARREGLO DE LEDS
    def controlador(self,led):
        for x in led:  # SE DECLARA UN ITERADOR "x" QUE RECORRERA EL ARREGLO DE LEDS
            x.prenderLeds() #CADA ITERADOR QUE ES UN LED, SE PRENDERA
            #time.sleep(1/(num)
        time.sleep(1) # DESPUES DEL BUCLE SE DENTENDRA UN SEGUNDO
        for x in led: # SE DECLARA UN ITERADOR  "x" QUE RECORRERA EL ARREGLO DE LEDS
            x.apagarLeds() # CADA ITERADOR QUE ES UN LED, SE APAGARA
        for x in led: # DE NUEVO EL ITERADOR PERO ESTA VEZ PARA LIMPIAR LOS PINES QUE ESTAN INSTANCIADOS
            GPIO.cleanup(x.getPin()) # ESTE METODO LIMPIARA CADA PIN QUE ESTE INSTANCIADO, PARA QUE NO HAYA ALGUN PROBLEMA DE REDUNDANCIA

    def run(self): #METODO QUE EJECUTARA EL CODIGO QUE CONTIENE
        cargarNum = Numeros() #SE DECLARA UN OBJETO DEL TIPO NUMERO
        self.aLed0 = cargarNum.cargar_alistLed0() #SE CARGARA EL ARREGLO DE LEDS A TRAVES DE LOS METODOS QUE ESTAN EN LA CLASSE "Numero"
        self.aLed1 = cargarNum.cargar_alistLed1()
        self.aLed2 = cargarNum.cargar_alistLed2()
        self.aLed3 = cargarNum.cargar_alistLed3()
        self.aLed4 = cargarNum.cargar_alistLed4()
        self.aLed5 = cargarNum.cargar_alistLed5()
        self.aLed6 = cargarNum.cargar_alistLed6()
        self.aLed7 = cargarNum.cargar_alistLed7()
        self.aLed8 = cargarNum.cargar_alistLed8()
        self.aLed9 = cargarNum.cargar_alistLed9()
