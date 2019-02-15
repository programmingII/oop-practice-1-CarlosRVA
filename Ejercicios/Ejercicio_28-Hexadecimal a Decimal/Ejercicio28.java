//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 13:13
import java.util.Scanner;
class Ejercicio28{
public static void main(String[]args){
Scanner Hex = new Scanner(System.in);
String x;
System.out.println("Inserta un numero en hexadecimal");
x = Hex.nextLine();
System.out.println("Al convertirse a decimal, el numero es: "
+ Integer.toString(Integer.parseInt(x,16),10));
}}