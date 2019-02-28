//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 05:15
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio61{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
System.out.println("Escribe una palabra");//Se imprime en pantalla la instrucción que le pide al usuario escribir una palabra
String P = S.nextLine();//Se declara la variable P y se almacena en ella la próxima línea de texto que se inserte.
StringBuilder R = new StringBuilder(P);//Se crea un nuevo StringBuilder y almacena el valor insertado en P
R.reverse();//El String almacenado en R es invertido con el método .reverse.
System.out.println("La palabra invertida es: "+R);//Finalmente se imprime el valor en R, el cual es la palabra original en reversa.
}}
