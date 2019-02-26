//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:57
import java.util.Scanner;
class Ejercicio44{
public static void main(String[]args){
Scanner N = new Scanner(System.in);
System.out.println("Escribe un numero entero ");
int a,b,c;
int x = N.nextInt();
a= x+(x*10);
b=a+(x*100);
c=x+a+b;
System.out.println(x+" + "+a+" + "+b+ " = "+c);
}}