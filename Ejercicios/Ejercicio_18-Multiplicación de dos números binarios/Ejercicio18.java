//Nombre: Villanueva Aguilar Carlos Raymundo 
//D�a: 12/02/2019
//Hora: 16:23
import java.util.Scanner;
class Ejercicio18{
public static void main(String[]args){
String x,y;
Scanner num = new Scanner(System.in);
System.out.println("Inserta el primer numero binario");
x = num.nextLine();
System.out.println("Inserta el primer numero binario");
y = num.nextLine();
System.out.println("El resultado de la multiplicaci�n de estos dos binarios es: "
+(Integer.toBinaryString(Integer.parseInt(x,2)*Integer.parseInt(y,2))));

}}