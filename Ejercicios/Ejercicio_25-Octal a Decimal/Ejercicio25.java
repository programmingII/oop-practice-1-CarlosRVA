//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 14:42
import java.util.Scanner;//Se importa la librería scanner para utilizar funciones de entrada de datos.
//La clase Ejercicio25 implementa una aplicación que recibe un número en octal, lo convierte a decimal y lo imprime en pantalla.
class Ejercicio25{
public static void main(String[]args){/*Se crea el método main y se le asignan argumentos de disponibilidad de uso, valor de retorno y argumentos.*/
Scanner Oct = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "Oct".
String x;//Se declara una nueva variable tipo string.
System.out.println("Escribe un numero en octal");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = Oct.nextLine();//Se llama al scanner para almacenar en x a la próxima línea de texto que se inserte.
System.out.println("Al convertirse a decimal, el numero es: "
+ Integer.toString(Integer.parseInt(x,8),10));
/*El texto es interpretado como octal y es convertido a número con Integer.parseInt, es convertido a decimal con Integer.toString y es
impreso en pantalla con System.out.println.*/
}}
