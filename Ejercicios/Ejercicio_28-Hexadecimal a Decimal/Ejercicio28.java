//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 13:13
import java.util.Scanner;//Se importa la librería scanner para utilizar funciones de entrada de datos.
//La clase Ejercicio28 implementa una aplicación que recibe un número hexadecimal, lo convierte a octal y lo imprime en pantalla.
class Ejercicio28{
public static void main(String[]args){/*Se escribe el metodo main para ejecutar el programa y se le asignan atributos como
valor de retorno, disponibilidad de uso y argumentos.*/
Scanner Hex = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "Hex".
String x;//Se declara una nueva variable tipo string.
System.out.println("Inserta un numero en hexadecimal");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = Hex.nextLine();//Se llama al scanner para almacenar en x a la próxima línea de texto que se inserte.
System.out.println("Al convertirse a decimal, el numero es: "
+ Integer.toString(Integer.parseInt(x,16),10));
/*El texto es interpretado como hexadecimal y convertido a número con Integer.parseInt, es convertido a decimal con Integer.toString y
es impreso en pantalla con System.out.println.*/
}}
