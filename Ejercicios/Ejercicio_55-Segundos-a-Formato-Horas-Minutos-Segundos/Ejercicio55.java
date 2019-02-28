//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 16:29
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio55 implementa una aplicación que captura un número en segundos y lo convierte a un formato de Horas, Minutos y Segundos.
class Ejercicio55{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Seg = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Seg".
int T,H,M,S;//Se declaran 4 variables de tipo int.
System.out.println("Escribe una cantidad de segundos");//Se imprime la instrucción que le pide al usuario escribir una cantidad en segundos.
T = Seg.nextInt();//Se llama al scanner para almacenar en T el valor del próximo número entero que se inserte.
H=T/3600;//En esta variable se almacenarán las horas, por lo que se dividirá la cantidad de segundos insertadas en T entre 3600.
M=(T%3600)/60;/*Aquí se almacenarán los minutos, y se divide el residuo que queda de la división anterior entre 60.*/
S=(T%3600)%60;//Aquí se almacenarán los minutos sacando el residuo de la división anterior.
System.out.println(H+":"+M+":"+S);//Finalmente se imprime el resultado en el formato deseado.
}
}
