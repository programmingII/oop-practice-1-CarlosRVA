//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 18:36
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio58{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner S = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "S".
System.out.println("Escribe una palabra o sentencia");/*Se imprime en pantalla la instrucción que le pide al usuario escribir una palabra
o sentencia*/
String P = S.nextLine();//Se declara la variable P, la cual almacenará el texto insertado en la próxima línea.
String May = "";//Se declara la variable May que almacenará un espacio.
Scanner Linea = new Scanner(P);//Se crea el scanner Linea, que tendrá dentro de él al valor insertado en P.
while(Linea.hasNext()){/*Se crea un búcle while, que indica que mientras el scanner Linea tenga otro string, se seguirá repitiendo.*/
String Pal = Linea.next();//Se crea el string Pal, el cual lee el valor de una palabra hasta que se encuentre un espacio.
May = May+Character.toUpperCase(Pal.charAt(0))+Pal.substring(1)+" ";/*Aquí se utiliza el string May para ir almacenando cada palabra individualmente.
En cada palabra se va convirtiendo el primer caracter a mayuscula, y mediante la concatenación se le agrega el resto de la palabra, la cual
termina cuando el string Pal detecta un espacio.*/
}
System.out.println(May.trim());/*Finalmente se imprime el string May, que contiene cada palabra en mayúscula. Aquí se le agrega el
método .trim para ignorar los espacios iniciales y finales que se tengan, de esta manera sólo se muestra la oración escrita.*/
}}
