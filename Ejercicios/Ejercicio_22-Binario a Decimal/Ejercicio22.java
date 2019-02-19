//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 09:33
import java.util.Scanner;//Se importa la libreria scanner para utilizar funciones de entrada de datos.
//La clase Ejercicio22 implementa una aplicación que recibe un número binario, lo convierte a decimal y lo imprime en pantalla.
class Ejercicio22{
public static void main(String[]args){/*Se escribe el método main para que el programa pueda ejecutarse y se le asignan atributos
de disponibilidad de uso, valor de retorno y argumentos.*/
Scanner num = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "num".
String x;//Se declara una nueva variable tipo string.
System.out.println("Inserta un numero binario");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = num.nextLine();//Se llama al scanner para almacenar en x a la próxima linea de texto que se inserte.
System.out.println("Al convertirse a decimal, el numero es: "+
Integer.toString(Integer.parseInt(x,2),10));
/*El texto escrito es convertido a número utilizando el Integer.parseInt, para luego ser convertido a número decimal con el Integer.toString,
 posteriormente es impreso en pantalla.*/
}}
