//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 18:23
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio65 implementa una aplicación que pide un divisor y dividendo, y realiza una resta iterada para obtener e imprimir el residuo.
class Ejercicio65{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int x,y;//Se declaran dos variables de tipo int.
/*Se imprimen en pantalla dos instrucciones que le piden al usuario insertar un número, después de cada instrucción se le asigna a cada
variable un valor dependiendo del número entero que se inserte en cada uno.*/
System.out.println("Inserta el numero que va a ser el dividendo:");
x = Num.nextInt();
System.out.println("Inserta el numero que va a ser el divisor:");
y = Num.nextInt();
while(x>=y){//Este bucle while le restará a x el valor de y hasta que el valor de x sea menor que y, siendo x ahora el residuo.
x=x-y;
}
System.out.println("El residuo de la division es: "+x);//Se imprime el valor de x, que ahora es el residuo
}}
