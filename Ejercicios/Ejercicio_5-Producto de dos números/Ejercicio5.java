//Nombre: Villanueva Aguilar Carlos Raymundo
//Día: 07/02/2019
//Hora: 12:20
import java.util.Scanner; //Importa las funciones para la entrada de datos.
/*La clase Ejercicio5 implementa una aplicación que recibe dos entradas numéricas e imprime su producto.*/
class Ejercicio5{
public static void main(String[]args){/*Se crea el metodo main para que el programa pueda ser ejecutado y se agregan sus atributos
de disponibilidad de uso, valores de retorno y argumentos.*/
int x,y;//Se declaran los valores enteros de entrada para realizar la operación.
Scanner Num = new Scanner(System.in); //Crea un scanner para introducir datos.
System.out.println("Introduce un numero");//Se utiliza el comando para imprimir texto
x=Num.nextInt(); //Llama al scanner para que lea el proximo número tipo entero.
System.out.println("Introduce otro numero");//Es importante recordar que para imprimir el texto, este debe de ir entre comillas.
y=Num.nextInt();//Vuelve a llamar al scanner, se puede usar el mismo scanner para declarar distintas variables
System.out.println("El producto de los numeros es: "+x*y);/*Despues del texto que va entre comillas se agrega un "+"
para hacerle saber al programa que se está agregando otro dato a mostrar.*/
}}
