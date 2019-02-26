//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 13:30
import java.util.Scanner;//Se importa la librería scanner para poder utilizar funciones de entrada de datos
/*La clase Ejercicio35 implementa una aplicación que captura la longitud y número de lados de un polígono, calcula el área e imprime el
resultado*/
class Ejercicio35{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Valor = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Valor".
int n,l;//Se asignan dos variables de tipo int.
System.out.println("Inserta el numero de lados del poligono: ");//Se utiliza el comando para imprimir en pantalla una instrucción al usuario.
n=Valor.nextInt();//Se llama al scanner para almacenar en n el valor del próximo entero que se inserte.
System.out.println("Inserta la longitud de los lados del poligono: ");//Se imprime una instrucción al usuario.
l = Valor.nextInt();//Se vuelve a llamar al scanner para hacer lo mismo con la variable l.
System.out.println("El area del poligono es: "+ ((n*l*l)/(4*Math.tan(Math.PI/n))));
/*Se utiliza la fórmula para calcular el área del polígono, utilizando n para calcular el area segun el número de lados, y se utilizan
las funciones tan y PI de la librería math como parte de la fórmula.*/
}}
