//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 20:20
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio70 implementa una aplicación que captura dos strings e imprime el más largo entre dos copias del más corto.
class Ejercicio70{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
String A,B;//Se declaran dos variables de tipo String
Scanner S = new Scanner(System.in);
/*Se imprimen en pantalla dos instrucciones que le piden al usuario insertar una sentencia, después de cada instrucción se le almacena 
el texto insertado en cada uno.*/
System.out.println("Inserta una sentencia");
A = S.nextLine();
System.out.println("Inserta otra sentencia");
B = S.nextLine();
if(A.length()>B.length()){//Este if y else realizarán una comparación para imprimir el string más largo entre dos copias del más corto.
System.out.println(B+A+B);
}
else {
System.out.println(A+B+A);
}
}}
