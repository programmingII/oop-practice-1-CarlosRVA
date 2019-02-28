//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 19:09
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio60 {
public static void main(String[] args){	/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
System.out.print("Escribe una palabra o sentencia: ");/*Se imprime en pantalla la instrucción que le pide al usuario escribir una palabra
o sentencia*/
String P = S.nextLine();//Se declara la variable P, la cual almacenará el texto insertado en la próxima línea.
String[] C = P.split(" ");/*Se crea un arreglo de Strings, el cual almacenará cada palabra en un arreglo diferente, usando el espacio
entre ellas como el indicador para saber que una palabra ha terminado*/
System.out.println("La penultima palabra es: "+C[C.length - 2]);/*Se imprime la penúltima palabra del string utilizando el método .length
para indicar el tamaño del arreglo, y restandole 2 para encontrar la penúltima palabra.*/
}}
