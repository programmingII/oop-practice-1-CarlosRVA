//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 15/02/2019
//Hora: 09:57
import java.util.Scanner;
class Ejercicio23{
public static void main(String[]args){
Scanner Bin = new Scanner(System.in);
String x;
System.out.println("Escribe un numero binario");
x = Bin.nextLine();
System.out.println("Al convertirse a hexadecimal, el numero es: "
+Integer.toString(Integer.parseInt(x,2),16));
}}