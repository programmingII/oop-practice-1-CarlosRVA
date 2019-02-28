//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 20:01
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio67 implementa una aplicación que captura dos strings y los imprime, poniendo el segundo a la mitad del primero.
class Ejercicio67{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
String A,B;//Se declaran dos variables de tipo String
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
/*Se imprimen en pantalla dos instrucciones que le piden al usuario insertar una sentencia, después de cada instrucción se le almacena 
el texto insertado en cada uno.*/
System.out.println("Inserta la primera sentencia");
A = S.nextLine();
System.out.println("Inserta la segunda sentencia");
B = S.nextLine();
System.out.println(A.substring(0,A.length()/2)+B+A.substring(A.length()/2,A.length()));
//Se imprime en pantalla la primera mitad del primer string, luego el segundo string, y luego la segunda mitad del primer string.
}}
