//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 10:27
import java.util.Scanner;//Se importa la librería scanner para utilizar funciones de entrada de datos.
//La clase Ejercicio24 implementa una aplicación que recibe un número en binario y lo convierte a octal.
class Ejercicio24{
public static void main(String[]args){/*Se escribe el método main para poder ejecutar el programa y se le asignan atributos como
disponibilidad de uso, argumentos y valor de retorno.*/
Scanner Bin = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "Bin".
String x;//Se declara una nueva variable tipo string.
System.out.println("Inserta un numero binario");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = Bin.nextLine();//Se llama al scanner para almacenar en x a la próxima línea de texto que se inserte.
System.out.println("Al convertirse a octal, el numero es: "
+Integer.toString(Integer.parseInt(x,2),8));
/*El texto es interpretado como binario y convertido a número con Integer.parseInt, es convertido a octal con Integer.toString y es
impreso en pantalla.*/
}}
