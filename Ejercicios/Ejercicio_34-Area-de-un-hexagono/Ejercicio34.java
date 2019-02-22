//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 19:25
import java.util.Scanner;
class Ejercicio34{
public static void main(String[]args){
Scanner L = new Scanner(System.in);
int x;
System.out.println("Inserta la longitud de los lados de un hexagono: ");
x=L.nextInt();
System.out.println("El area del hexagono es: "+(6*x*x)/(4*Math.tan(Math.PI/6)));
}}
