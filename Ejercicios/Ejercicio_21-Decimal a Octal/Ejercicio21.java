//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 09:24
import java.util.Scanner;//Se importa la librería scanner para poder usar funciones de entrada de datos.
//La clase Ejercicio21 implementa una aplicación que recibe un número decimal, lo convierte a octal y lo imprime en pantalla.
class Ejercicio21{
public static void main(String[]args){/*Se escribe el metodo main para poder ejecutar el programa y se asignan los atributos de
argumentos, valor de retorno y disponibilidad de uso.*/
Scanner num = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "num".
String x;//Se declara una nueva variable tipo string
System.out.println("Inserta un numero decimal");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x=num.nextLine();//Se llama al scanner para almacenar en x el texto que se inserte en la próxima línea.
System.out.println("Al convertirse a octal, el numero es: "+
Integer.toString(Integer.parseInt(x,10),8));
/*El texto escrito es convertido a número decimal utilizando Integer.parseInt, luego es convertido a octal con Integer.toString y
finalmente es impreso en pantalla.*/
}}
