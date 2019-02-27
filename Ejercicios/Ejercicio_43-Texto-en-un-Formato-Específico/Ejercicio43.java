//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:48
import java.util.Scanner;//Se importa la librería scanner para usar funciones de entrada de datos.
//La clase Ejercicio43 implementa una aplicación que captura texto y lo imprime en un formato específico.
class Ejercicio43{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos
de disponibilidad de uso, valor de retoeno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner llamado "S"
String P[] = new String[6];//Se crea un arreglo de string capaz de almacenar hasta 6 de ellos.
for(int x=1;x<=5;x++){/*Este ciclo for va a pedir que se inserte texto y lo va a almacenar en el arreglo de P con la
posición que tenga según el valor de x.*/
System.out.println("Escriba el texto "+x);
P[x]=S.nextLine();
}
System.out.println(P[1]);
System.out.println("     "+P[2]);
System.out.println("          "+P[3]);
System.out.println("          "+P[4]);
System.out.println(P[5]);
//Finalmente, se imprime el texto insertado en el formato que se desea.
}}
