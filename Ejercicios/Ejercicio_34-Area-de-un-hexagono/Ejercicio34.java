//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 19:25
import java.util.Scanner;//Se importa la librería scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio34 implementa una aplicación que captura la longitud del lado de un hexagono, calcula su area e imprime el resultado.
class Ejercicio34{
public static void main(String[]args){/*Se crea el método main y se escriben los atributos de disponibilidad de uso,
argumentos y valor de retorno.*/
Scanner L = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "L"
int x;//Se declara una variable tipo int llamada "x"
System.out.println("Inserta la longitud de los lados de un hexagono: ");//Se imprime una instrucción en pantalla
x=L.nextInt();//Se llama al scanner para que almacene en x el valor del próximo número entero que se inserte.
System.out.println("El area del hexagono es: "+(6*x*x)/(4*Math.tan(Math.PI/6)));/*Se utiliza la fórmula para calcular el
valor del área, es importante usar las funciones tan y PI de la librería Math.*/
}}
