//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 13:30
import java.util.Scanner;
class Ejercicio35{
public static void main(String[]args){
Scanner Valor = new Scanner(System.in);
int n,l;
System.out.println("Inserta el numero de lados del poligono: ");
n=Valor.nextInt();
System.out.println("Inserta la longitud de los lados del poligono: ");
l = Valor.nextInt();
System.out.println("El area del poligono es: "+ ((n*l*l)/(4*Math.tan(Math.PI/n))));
}}