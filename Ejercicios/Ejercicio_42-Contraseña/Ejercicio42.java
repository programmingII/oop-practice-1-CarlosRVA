//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:41
import java.util.Scanner;//Se importa la librería scanner para usar funciones de entrada de datos.
//La clase Ejercicio42 implementa una aplicación que captura una contraseña y la imprime en pantalla.
class Ejercicio42{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner llamado "S".
System.out.println("Escribe una contraseña: ");//Se imprime en pantalla una instrucción para el usuario.
String C = S.nextLine();/*Se declara una variable tipo String y se llama al scanner para asignar en ella a la próxima línea
de texto que se inserte.*/
System.out.println("La contraseña ingresada es: "+C);//Se imprime en pantalla el valor de C, que contiene la contraseña.
}}
