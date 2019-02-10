//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 10/02/2019
//Hora: 09:47
import java.util.Scanner;
class Ejercicio13{
public static void main(String[]args){
Scanner N = new Scanner(System.in);
int L,A;
System.out.println("Introduce el largo del rectangulo");
L = N.nextInt();
System.out.println("Introduce el ancho del rectangulo");
A = N.nextInt();
System.out.println("El area del rectangulo es: "+L*A+" centimetros cuadrados");
System.out.println("El perimetro del rectangulo es: "+(L*2+A*2)+" centimetros");
}}