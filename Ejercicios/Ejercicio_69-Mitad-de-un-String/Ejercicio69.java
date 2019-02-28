//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 20:17
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio69 implementa una aplicación que captura un string e imprime la mitad de este.
class Ejercicio69{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
String A;//Se declara una variable tipo String.
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
System.out.println("Inserta una sentencia");//Se imprime en pantalla una instruccion que le pide al usuario insertar una sentencia
A = S.nextLine();//Se llama al Scanner para almacenar en A el próximo texto que se inserte.
System.out.println(A.substring(0,A.length()/2));
//Se imprime en pantalla el substring de A que empieza desde la primera letra y acaba en la mitad de la palabra.
}}
