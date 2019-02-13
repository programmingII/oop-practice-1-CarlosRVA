//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 13/02/2019
//Hora: 14:34
import java.util.Scanner;
class Ejercicio20{
public static void main(String[]args){
Scanner Dec = new Scanner(System.in);
String x;
System.out.println("Inserta un numero decimal");
x=Dec.nextLine();
System.out.println("Al convertirse a hexadecimal, el numero es: "
+Integer.toString(Integer.parseInt(x,10),16));
}}