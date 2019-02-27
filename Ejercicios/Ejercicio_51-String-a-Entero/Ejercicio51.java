//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 13:11
import java.util.Scanner;//Se importa la clase Scanner desde la librería util para utilizar funciones de entrada de datos.
//La clase Ejercicio51 implmenta una aplicación que captura un número en string y lo convierte a número entero.
class Ejercicio51{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
System.out.println("Inserta un numero en string");//Se imprime en pantalla la instrucción de insertar un número en un string.
String x = S.nextLine();//Se declara la variable x y se le asigna el valor de la próxima línea de texto que se inserte.
int X = Integer.parseInt(x,10);/*Se utiliza Integer.parseInt para convertir el valor introducido en X a número entero, identificandolo con
base 10 y asignandose el valor entero a la variable X.*/
System.out.println("El valor entero del numero es: "+X);//Se imprime el número en valor de tipo entero.
}}
