//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 13:06
import java.util.Scanner;//Se importa la librería scanner para usar funciones de entrada de datos.
//La clase Ejercicio27 implementa una aplicación que recibe un número en octal, lo convierte a hexadecimal y lo imprime en pantalla.
class Ejercicio27{
public static void main(String[]args){/*Se escribe el método main para ejecutar el programa y se le asignan atributos como
valor de retorno, argumentos y disponibilidad de uso.*/
Scanner Oct = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Oct".
String x;//Se declara una nueva variable tipo string.
System.out.println("Inserta un numero en octal");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = Oct.nextLine();//Se llama al scanner y se le asigna a x el valor de la próxima línea de texto que se inserte.
System.out.println("Al convertirse a hexadecimal, el numero es: "
+ Integer.toString(Integer.parseInt(x,8),16));
/*El texto es interpretado en octal y convertido a número con Integer.parseInt, es convertido a hexadecimal con Integer.toString y
es impreso en pantalla con System.out.println.*/
}}
