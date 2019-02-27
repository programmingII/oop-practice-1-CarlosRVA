//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 22:15
//La clase Ejercicio46 implementa una aplicación para imprimir en pantalla la fecha del sistema.
class Ejercicio46{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valor de retorno y argumentos.*/
System.out.format("Fecha Actual: %tc%n",System.currentTimeMillis());/*Gracias al método .currentTimeMilis, se puede extraer la hora actual
en milisegundos, el cual es convertido a formato de fecha usando %tc.*/
}}
