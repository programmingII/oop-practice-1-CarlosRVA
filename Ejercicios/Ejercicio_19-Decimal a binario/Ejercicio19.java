//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 13/02/2019
//Hora: 14:07
import java.util.Scanner;//Se importa la librería scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio19 implementa una aplicación que captura un número decimal, lo convierte a binario y lo imprime.
class Ejercicio19{
public static void main(String[]args){/*Se crea el método main para que el programa pueda ejecutarse y se le asignan valores
de disponibilidad de uso, argumentos y valores de retorno.*/
String x;//Se asigna una variable tipo string.
Scanner Dec = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "Dec".
System.out.println("Inserta un numero decimal");//Se utiliza el comando para imprimit en pantalla y se escribe una instrucción.
x = Dec.nextLine();//Se llama al scanner para capturar el texto de la proxima linea que se escriba y asignarlo como valor de x.
System.out.println("Al convertirse a binario el numero insertado es: "
+Integer.toString(Integer.parseInt(x,10),2));
 //El texto es convertido a número decimal con el Integer.parseInt y luego es convertido a binario con el Integer.toString.
}}
