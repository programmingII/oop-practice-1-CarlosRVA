//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 09:57
import java.util.Scanner;//Se importa la librería scanner para utilizar funciones de entrada de datos.
//La clase Ejercicio23 implementa una aplicación que recibe un número en binario, lo convierte a hexadecimal y lo imprime en pantalla.
class Ejercicio23{
public static void main(String[]args){/*Se escribe el método main para poder iniciar el programa y se le asignan atributos como
disponibilidad de uso, valor de retorno y argumentos.*/
Scanner Bin = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "Bin".
String x;//Se declara una variable tipo string.
System.out.println("Escribe un numero binario");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x = Bin.nextLine();//Se llama al scanner para capturar la próxima linea de texto que se inserte y así almacenarla en x.
System.out.println("Al convertirse a hexadecimal, el numero es: "
+Integer.toString(Integer.parseInt(x,2),16));
/*El texto es identificado como binario y convertido a número con Integer.parseInt, es convertido a hexadecimal utilizando Integer.toString
y es impreso en pantalla.*/
}}
