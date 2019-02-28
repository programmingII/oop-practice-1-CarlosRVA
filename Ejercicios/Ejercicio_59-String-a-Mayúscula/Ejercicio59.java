//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 18:56
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio59{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
System.out.println("Escribe una palabra o sentencia");/*Se imprime en pantalla la instrucción que le pide al usuario escribir una palabra
o sentencia*/
String P = S.nextLine();//Se declara la variable P, la cual almacenará el texto insertado en la próxima línea.
P=P.toUpperCase();/*Aquí se reemplaza el valor actual de P con el valor de P, pero convertido completamenta a mayúscula con el método
.toUpperCase.*/
System.out.println(P);//Finalmente, se imprime en pantalla el nuevo valor de P, que contiene la sentencia escrita en mayúsculas.
}}
