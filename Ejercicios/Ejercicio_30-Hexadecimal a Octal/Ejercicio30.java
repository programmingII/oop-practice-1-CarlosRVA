//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 13:21
import java.util.Scanner;
class Ejercicio30{
public static void main(String[]args){
Scanner Hex = new Scanner(System.in);
String x;
System.out.println("Inserta un numero en hexadecimal");
x = Hex.nextLine();
System.out.println("Al convertirse a octal, el numero es: "
+ Integer.toString(Integer.parseInt(x,16),8));
}}