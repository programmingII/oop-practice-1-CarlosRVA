//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 12/02/2019
//Hora: 12:20
import java.util.Scanner;
class Ejercicio17{
public static void main(String[]args){
String x,y;
Scanner num = new Scanner(System.in);
System.out.println("Inserta el primer numero binario");
x = num.nextLine();
System.out.println("Inserta el primer numero binario");
y = num.nextLine();
System.out.println("El resultado de la suma entre estos dos binarios es: "+(Integer.toBinaryString(Integer.parseInt(x,2)+Integer.parseInt(y,2))));

}}