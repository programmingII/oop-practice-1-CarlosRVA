//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 10/02/2019
//Hora: 13:28
import java.util.Scanner;
class Ejercicio15{
public static void main(String[]args){
Scanner N = new Scanner(System.in);
int x,y,z;
System.out.println("Inserta el primer numero");
x = N.nextInt();
System.out.println("Inserta el segundo numero");
y= N.nextInt();
System.out.println("El valor del primer numero es: "+x);
System.out.println("El valor del segundo numero es: "+y);
z=x;
x=y;
y=z;
System.out.println("El nuevo valor del primer numero es: "+x);
System.out.println("El nuevo valor del segundo numero es: "+y);
}}