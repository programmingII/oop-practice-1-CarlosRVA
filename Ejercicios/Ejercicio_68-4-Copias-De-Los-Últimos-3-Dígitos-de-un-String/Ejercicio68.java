//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 20:10
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio68 implementa una aplicación que captura un string e imprime en pantalla 4 copias de sus 3 últimos dígitos.
class Ejercicio68{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
String A;//Se declara una variable tipo String
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
System.out.println("Inserta una sentencia");//Se imprime en pantalla una instruccion que le pide al usuario insertar una sentencia
A = S.nextLine();//Se llama al Scanner para almacenar en A el próximo texto que se inserte.
System.out.println(A.substring(A.length()-3,A.length())+A.substring(A.length()-3,A.length())+A.substring(A.length()-3,A.length())+A.substring(A.length()-3,A.length()));
//Se imprime en pantalla el substring que empieza desde la antepenultima letra y termina en la última letra, se repite esto 3 veces más.
}}
