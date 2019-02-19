//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 13:18
import java.util.Scanner;//Se importa la librería scanner para poder usar funciones de entrada de datos.
//La clase Ejercicio29 implementa una aplicación que recibe un número hexadecimal, lo convierte a binario y lo imprime en pantalla.
class Ejercicio29{
public static void main(String[]args){/*Se escribe el método main para ejecutar el programa y se le asignan atributos como
argumentos, disponibilidad de uso y valores de retorno.*/
Scanner Hex = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Hex".
String x;//Se declara una nueva variable de tipo String.
System.out.println("Inserta un numero en hexadecimal");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = Hex.nextLine();//Se llama al scanner para capturar la próxima línea de texto que se inserte y la almacena en x.
System.out.println("Al convertirse a binario, el numero es: "
+ Integer.toString(Integer.parseInt(x,16),2));
/*El texto es interpretado como hexadecimal y convertido a número con Integer.parseInt, es convertido a binario con Integer.toString y
finalmente es impreso en pantalla con System.out.println.*/
}}
