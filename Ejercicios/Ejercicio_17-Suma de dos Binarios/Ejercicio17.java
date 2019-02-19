//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 12/02/2019
//Hora: 12:20
import java.util.Scanner;//Se importa la libreria scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio17 implementa una aplicación que captura dos variables escritas en binario, las suma e imprime la respuesta.
class Ejercicio17{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos como
disponibilidad de uso, valor de retorno y argumentos.*/
String x,y;//Se declaran dos variables de tipo string.
Scanner num = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "num".
System.out.println("Inserta el primer numero binario");/*Se utiliza este comando para abrir un flujo de salida que está listo para
aceptar e imprimir datos y se escribe una instrucción para mostrar al usuario*/
x = num.nextLine();//Se llama al scanner y se le pide que capture la próxima línea de texto que se inserte, la cual se almacenará en x.
System.out.println("Inserta el primer numero binario");//Se crea otro comando para imprimir en pantalla y se escribe otro mensaje.
y = num.nextLine();//Se vuelve a llamar al scanner para almacenar texto insertado en y
System.out.println("El resultado de la suma entre estos dos binarios es: "+(Integer.toBinaryString(Integer.parseInt(x,2)+Integer.parseInt(y,2))));
/*Se utiliza de nuevo el comando para imprimir en pantalla y se le pide que muestre el valor de la suma, la cual es realizada entre
los dos Integer.parseInt, que convierten el texto insertado en binario a números enteros en decimal. Una vez que se tiene la suma
esta es convertida de nuevo a binario gracias a Integer.toBinaryString.*/
}}
