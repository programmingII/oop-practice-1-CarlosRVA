//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 22/02/2019
//Hora: 07:41
import java.util.Scanner;//Se importa la libreria scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio37 implementa una aplicación que captura un string, lo invierte y lo imprime en pantalla.
class Ejercicio37{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan los atributos de
disponibilidad de uso, argumentos y valor de retorno.*/
Scanner Pal = new Scanner(System.in);//Se llama al scanner y se le asigna el nombre de "Pal".
System.out.println("Escribe una oracion: ");//Se imprime en pantalla la instrucción de escribir una oración.
String S = Pal.nextLine();/*Se declara una variable tipo String y se llama al scanner para almacenar en ella a la próxima línea de
texto que se inserte.*/
StringBuilder Reversa = new StringBuilder(S);/*Se crea un nuevo stringbuilder para crear un string que puede ser modificado, y se le
almacena el valor escrito en S. Se le asigna el nombre de Reversa.*/
Reversa.reverse();//Se invierte el string almacenado en este StringBuilder.
System.out.println("Lo que se escribio fue: "+S);//Se imprime el string escrito originalmente.
System.out.println("Y la reversa es: "+Reversa);//Se imprime la reversa de este string.
}}
