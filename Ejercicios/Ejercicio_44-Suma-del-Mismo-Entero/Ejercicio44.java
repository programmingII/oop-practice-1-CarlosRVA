//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:57
import java.util.Scanner;//Se importa la librería scanner para poder usar funciones de entrada de datos
//La clase Ejercicio44 implementa una aplicación que recibe un numero entero y lo suma con un foemato específico.
class Ejercicio44{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner N = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de N.
System.out.println("Escribe un numero entero ");//Se utiliza el comando para imprimir en pantalla una instrucción.
int a,b,c;//Se declaran 3 variables de tipo int
int x = N.nextInt();//Se llama al scanner para almacenar en x el valor del siguiente número entero.
a= x+(x*10);//Se asigna como valor de "a" a la suma entre x y 10 veces x.
b=a+(x*100);//A b se le asigna el valor de la suma entre a y 100 veces x.
c=x+a+b;//A c se le asigna el valor de la suma entre x, a y b.
System.out.println(x+" + "+a+" + "+b+ " = "+c);//Se imprime en pantalla la suma y su resultado.
}}
