//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 09:24
import java.util.Scanner;
class Ejercicio21{
public static void main(String[]args){
Scanner num = new Scanner(System.in);
String x;
System.out.println("Inserta un numero decimal");
x=num.nextLine();
System.out.println("Al convertirse a octal, el numero es: "+
Integer.toString(Integer.parseInt(x,10),8));
}}