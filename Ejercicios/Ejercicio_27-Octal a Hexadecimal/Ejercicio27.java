//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 13:06
import java.util.Scanner;
class Ejercicio27{
public static void main(String[]args){
Scanner Oct = new Scanner(System.in);
String x;
System.out.println("Inserta un numero en octal");
x = Oct.nextLine();
System.out.println("Al convertirse a hexadecimal, el numero es: "
+ Integer.toString(Integer.parseInt(x,8),16));
}}