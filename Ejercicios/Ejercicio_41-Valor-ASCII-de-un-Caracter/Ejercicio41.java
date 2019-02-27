//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:30
import java.util.Scanner;//Se importa la librería scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio41 implementa una aplicación que captura un caracter e imprime su valor ASCII
class Ejercicio41{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos
de disponibilidad de uso, valor de retorno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "S".
System.out.println("Escribe un caracter");//Se utiliza este comando para imprimir en pabtalla y se escribe una instrucción.
char C = S.nextLine().charAt(0);/*Se declara la variable C de tipo char y se almacena en ella el caracter en la posición 0
que se inserte en la siguiente línea*/
int c = C;//Se declara la variable c tipo int y se le asigna el valor de la variable C.
System.out.println("El ASCII del caracter insertado es: "+c);/*Cuando el caracter se convierte a tipo de dato entero, se convierte en el
número que corresponda a su valor en ASCII. Una vez hecho esto, se imprime dicho valor.*/
}}
