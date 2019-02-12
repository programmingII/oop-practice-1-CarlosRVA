//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 10/02/2019
//Hora: 09:47
import java.util.Scanner;//Se importan las funciones de scanner para introducir datos.
class Ejercicio13{
public static void main(String[]args){
Scanner N = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "N".
int L,A;//Se asignan variables tipo int para almacenar números enteros.
System.out.println("Introduce el largo del rectangulo");//Se realiza el comando para imprimir en pantalla y se escribe una instrucción.
L = N.nextInt();/*Se llama al scanner y se le pide que capture el próximo número entero que se inserte, el cual es asignado
como valor del largo del rectángulo.*/
System.out.println("Introduce el ancho del rectangulo");/*Es importante recordar que para que se muestre el texto se debe poner
entre comillas*/
A = N.nextInt();//Se vuelve a llamar al scanner y se repite el proceso para el valor de la altura.
System.out.println("El area del rectangulo es: "+L*A+" centimetros cuadrados");/*Se imprime el texto junto con la multiplicación.
El resultado de esta multiplicación es calculada por el programa. Adicionalmente, se debe de poner un "+" después de las comillas
que identifican el contenido como string para que el programa pueda identificar que se está agregando otro tipo de dato a imprimir.
Se aplica lo mismo para datos posteriores a la multiplicación.*/
System.out.println("El perimetro del rectangulo es: "+(L*2+A*2)+" centimetros");/*Se realiza lo mismo que en el proceso anterior,
pero con una fórmula diferente para el perímetro del rectángulo.*/
}}
