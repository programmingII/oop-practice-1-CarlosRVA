//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 13:21
import java.util.Scanner;//Se importa la librería scanner para usar funciones de entrada de datos.
//La clase Ejercicio30 implementa una aplicación que recibe un número hexadecimal, lo convierte a octal y lo imprime en pantalla.
class Ejercicio30{
public static void main(String[]args){/*Se escribe el método main para que el programa pueda ejecutarse y se le asignan atributos como
Disponibilidad de uso, valor de retorno y argumentos.*/
Scanner Hex = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Hex".
String x;//Se declara una nueva variable tipo string.
System.out.println("Inserta un numero en hexadecimal");//Se utiliza el comando para imprimir en pantalla y se escribe una instruccón.
x = Hex.nextLine();//Se llama al scanner para almacenar en x a la próxima línea de texto que se inserte.
System.out.println("Al convertirse a octal, el numero es: "
+ Integer.toString(Integer.parseInt(x,16),8));
/*El texto es interpretado como hexadecimal y convertido a número con Integer.parseInt, es convertido a octal con Integer.toString y
finalmente es impreso en pantalla con System.out.println.*/
}}
