//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 12/02/2019
//Hora: 16:23
import java.util.Scanner;//Se importa la librería scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio18 implementa una aplicación que recibe dos variables escritas en binario, las multiplica y escribe el resultado.
class Ejercicio18{
public static void main(String[]args){/*Se crea el método main para que el programa pueda ejecutarse y se le agregan los valores de 
disponibilidad de uso, argumentos y valores de retorno.*/
String x,y;//Se crean dos variables de tipo string.
Scanner num = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "num".
System.out.println("Inserta el primer numero binario");//Se utiliza el comando para imprimir datos en pantalla y se escribe una instrucción.
x = num.nextLine();//Se llama al scanner para almacenar en x a la próxima linea de texto que se inserte.
System.out.println("Inserta el primer numero binario");//Se vuelve a utilizar este comando para escribir otra instrucción.
y = num.nextLine();//Se vuelve a llamar al scanner para almacenar otra línea de texto en y.
System.out.println("El resultado de la multiplicación de estos dos binarios es: "
+(Integer.toBinaryString(Integer.parseInt(x,2)*Integer.parseInt(y,2))));
/*Finalmente, se imprime el resultado de la multiplicación de los binarios escritos en forma de string, los cuales son convertidos 
a entero gracias a Integer.parseInt. Una vez que se realiza la multiplicación, se vuelve a convertir a binario 
usando Integer.toBinaryString para imprimir el resultado en binario.*/
}}
