//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 10/02/2019
//Hora: 09:19
import java.util.Scanner;//Se importan las funciones que se utilizan para la entrada de datos.
//La clase Ejercicio11 implementa una aplicación que recibe el radio de un círculo y calcula e imprime su área y perímetro.
class Ejercicio11{
public static void main(String[]args){
Scanner Rad = new Scanner(System.in);//Se crea un nuevo scanner para la entrada de datos y se le asigna el nombre de "Rad".
double R,P,A;//Se asignan variables tipo double para que se puedan introducir números decimales.
System.out.println("Introduce el radio del circulo");//Se utiliza el comando para imprimir texto y se escribe una instrucción.
R=Rad.nextDouble();//Se llama al scanner y se le ordena capturar el próximo valor númerico de tipo double.
System.out.println("El perimetro es: "+R*2*Math.PI);/*Se imprime el texto y el resultado el perímetro calculado con la fórmula que se 
muestra. Se utiliza Math.PI para llamar al valor de PI desde la librería, de esta manera se ahorra tiempo de escritura y 
se puede realizar un cálculo más preciso.*/
System.out.println("El area es: "+R*R*Math.PI);//Se repite el proceso con una fórmula diferente para el cálculo de area.
}}
