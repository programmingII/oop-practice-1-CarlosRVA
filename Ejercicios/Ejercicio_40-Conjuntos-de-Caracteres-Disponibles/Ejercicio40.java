//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:23
import java.nio.charset.Charset;/*Se importa la librería Charset, la cual es un trazado de mapas entre unidades de código y secuencias de 
bytes*/
/*La clase Ejercicio40 implementa una aplicación que muestra los conjuntos de caracteres disponibles.*/
class Ejercicio40{
public static void main(String[]args){/*Se crea el método main para ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valor de retorno y argumentos.*/
System.out.println("Los conjuntos caracteres que se tienen disponibles son: ");/*Se utiliza este comando para imprimir algo en 
pantalla*/
for (String S : Charset.availableCharsets().keySet()){//Se utiliza el keyset para fijar una vista de los conjuntos de caracteres contenidos.
System.out.println(S);//Se imprime en pantalla la lista de caracteres disponibles en la librería Charset.
}}}
