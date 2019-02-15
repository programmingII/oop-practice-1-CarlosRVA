//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 10:27
import java.util.Scanner;
class Ejercicio24{
public static void main(String[]args){
Scanner Bin = new Scanner(System.in);
String x;
System.out.println("Inserta un numero binario");
x = Bin.nextLine();
System.out.println("Al convertirse a octal, el numero es: "
+Integer.toString(Integer.parseInt(x,2),8));
}}