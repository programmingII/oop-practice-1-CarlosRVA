//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 14:52
import java.util.Scanner;//Se importa la librería scanner para usar funciones de entrada de datos.
//La clase Ejercicio26 implementa una aplicación que recibe un número en octal, lo convierte a binario y lo imprime en pantalla.
class Ejercicio26{
public static void main(String[]args){/*Se escribe el método main para ejecutar el programa y se le asignan atributos como la
disponibilidad de uso, valor de retorno y argumentos.*/
Scanner Oct = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Oct".
String x;//Se declara una nueva variable tipo string.
System.out.println("Escribe un numero en octal");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = Oct.nextLine();//Se llama al scanner para almacenar en x a la próxima línea de texto que se inserte.
System.out.println("Al convertirse a binario, el numero es: "
+ Integer.toString(Integer.parseInt(x,8),2));
/*El texto es interpretado como octal y convertido a número con Integer.parseInt, es convertido a binario con Integer.toString y finalmente
es impreso en pantalla con Integer.toString.*/
}}
