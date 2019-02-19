//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 13/02/2019
//Hora: 14:34
import java.util.Scanner;//Se importa la librería scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio20 implementa una aplicación que recibe un número decimal, lo convierte a hexadecimal y lo imprime en pantalla.
class Ejercicio20{
public static void main(String[]args){/*Se crea el método main para que el programa pueda ser ejecutado y se le asignan atributos de
disponibilidad de uso, argumentos y valores de retorno.*/
Scanner Dec = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "Dec".
String x;//Se asigna una nueva variable tipo string
System.out.println("Inserta un numero decimal");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x=Dec.nextLine();//Se llama al scanner para almacenar en x a la proxima linea de texto que se inserte.
System.out.println("Al convertirse a hexadecimal, el numero es: "
+Integer.toString(Integer.parseInt(x,10),16));
/*El de texto escrito en x es convertido a número decimal usando el Integer.parseInt y luego es convertido a hexadecimal con el
Integer.toString para finalmente ser impresa en pantalla.*/
}}
