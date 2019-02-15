//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 14:52
import java.util.Scanner;
class Ejercicio26{
public static void main(String[]args){
Scanner Oct = new Scanner(System.in);
String x;
System.out.println("Escribe un numero en octal");
x = Oct.nextLine();
System.out.println("Al convertirse a binario, el numero es: "
+ Integer.toString(Integer.parseInt(x,8),2));
}}