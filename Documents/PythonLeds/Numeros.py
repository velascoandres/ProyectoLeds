from Led import Led
#LAS VARIABLES SON PRIVATE, PARA HACER EL ENCAPSULAMIENTO EN PYTHON A LAS VARIABLES SE LAS INICIA EN EL CONSTRUCTOR
#"self" ES EL EQUIVALENTE A "this"
#En cada metodo de una clase se usa el parametro self, Se trata simplemente de una referencia al objeto cuyo método es llamado
class Numeros(object):
    def __init__(self): #CONSTRUCTOR DE LA CLASE NUMEROS
        self.alistLed0 = list() #SE ENCAPSULAN LAS VARIABLES, Y SE LAS INICIAN COMO UNA LISTA VACIA
        self.alistLed1 = list() #ESTAS LISTAS CONTENDRAN A LOS LEDS QUE SE USARAN PARA FORMAR EL NUMERO
        self.alistLed2 = list()
        self.alistLed3 = list()
        self.alistLed4 = list()
        self.alistLed5 = list()
        self.alistLed6 = list()
        self.alistLed7 = list()
        self.alistLed8 = list()
        self.alistLed9 = list()

#ESTE METODO VA A LLENAR A LA LISTA, CON LOS LEDS NECESARIOS PARA FORMAR EL NUMERO 0
    def cargar_alistLed0(self):
        self.alistLed0=self.asignarLeds([16,18,12,13,15,22]) # EL METODO asignarLeds RETORNARA UNA LISTA DE LEDS
        return self.alistLed0

#ESTE METODO VA A LLENAR A LA LISTA, CON LOS LEDS NECESARIOS PARA FORMAR EL NUMERO 1 Y ASI HASTA EL 9
    def cargar_alistLed1(self):
        self.alistLed1=self.asignarLeds([13,15])
        return self.alistLed1

    def cargar_alistLed2(self):
        self.alistLed2=self.asignarLeds([12,13,11,18,22])
        return self.alistLed2

    def cargar_alistLed3(self):
        self.alistLed3=self.asignarLeds([13,15,12,22,11])
        return self.alistLed3

    def cargar_alistLed4(self):
        self.alistLed4=self.asignarLeds([16,11,13,15])
        return self.alistLed4

    def cargar_alistLed5(self):
        self.alistLed5=self.asignarLeds([12,16,11,15,22])
        return self.alistLed5

    def cargar_alistLed6(self):
        self.alistLed6=self.asignarLeds([12,16,11,18,22,15])
        return self.alistLed6

    def cargar_alistLed7(self):
        self.alistLed7=self.asignarLeds([12,13,15,11])
        return self.alistLed7

    def cargar_alistLed8(self):
        self.alistLed8=self.asignarLeds([16,18,12,13,15,22,11])
        return self.alistLed8

    def cargar_alistLed9(self):
        self.alistLed9=self.asignarLeds([16,12,13,15,22,11])
        return self.alistLed9

#ESTE METODO RECIBIRA COMO UNICO PARAMETRO UN ARREGLO QUE CONTIENE A LOS NUMEROS FISICOS DE LOS PINES
# SOLO RECIBE UN PARAMETRO NO LE PAREN BOLA AL "self", ES SOLO POR ESTANDAR QUE SE LO PONE, YA SE HA EXPLICADO AL PRINCIPIO
    def asignarPines(self,arrPin):
        listLeds=list() # SE DECLARA UNA VARIABLE GLOBAL, SE LA INICIALIZA COMO UNA LISTA VACIA
        for x in arrPin: # SE DECLARA UN ITERADOR PARA RECORRER EL ARREGLO DE PINES
            listLeds.append(Led(x)) # A LA LISTA SE LA LLENA CON LOS LEDS QUE SE VAN CREANDO, RECUERDEN QUE CON CADA PIN, SE CREA UN NUEVO LED
        return listLeds # SE RETORNA LA LISTA DE LEDS
