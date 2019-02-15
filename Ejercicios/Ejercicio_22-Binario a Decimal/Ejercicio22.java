//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 09:33
import java.util.Scanner;
class Ejercicio22{
public static void main(String[]args){
Scanner num = new Scanner(System.in);
String x;
System.out.println("Inserta un numero binario");
x = num.nextLine();
System.out.println("Al convertirse a decimal, el numero es: "+
Integer.toString(Integer.parseInt(x,2),10));
}}