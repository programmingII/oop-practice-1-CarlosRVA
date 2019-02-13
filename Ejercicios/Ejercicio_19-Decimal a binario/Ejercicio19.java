//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 13/02/2019
//Hora: 14:07
import java.util.Scanner;
class Ejercicio19{
public static void main(String[]args){
String x;
Scanner Dec = new Scanner(System.in);
System.out.println("Inserta un numero decimal");
x = Dec.nextLine();
System.out.println("Al convertirse a binario el numero insertado es: "
+Integer.toString(Integer.parseInt(x,10),2));
}}