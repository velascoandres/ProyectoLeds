import RPi.GPIO as GPIO
import time
class Led(object):
    def __init__(self, pin):    #Constructor de la clase Led
        self.pin = pin #INICIANDO VARIABLE PIN

#DEFINIENDO GETTERS Y SETTERS
    def getPin(self):
        return self.pin

    def setPin(self,pin):
        self.pin=pin
#METODOS PARA ENCENDER LOS LEDS Y APAGARLOS
    def prenderLeds(self):
      GPIO.setmode(GPIO.BOARD) #USAR LA NUMERACION FISCIA DE LOS PINES, NO LA NUMERACION GPIO
      GPIO.setup(self.pin, GPIO.OUT) # INSTANCIAR EL PIN, COMO PIN DE SALIDA
      GPIO.output(self.getPin(),GPIO.HIGH) # AL PIN DE SALIDA INSTANCIADO SE LE DARA UN VOLTAJE
      print "Se ha encendido el pin: "+str(self.getPin())

    def apagarLeds(self):
      GPIO.setmode(GPIO.BOARD) #USAR LA NUMERACION FISCIA DE LOS PINES, NO LA NUMERACION GPIO
      GPIO.setup(self.pin, GPIO.OUT)  # INSTANCIAR EL PIN, COMO PIN DE SALIDA
      GPIO.output(self.getPin(),GPIO.LOW) # AL PIN DE SALIDA INSTANCIADO SE LE QUITARA EL VOLTAJE
      print "Se ha apagado el pin: "+str(self.getPin())
