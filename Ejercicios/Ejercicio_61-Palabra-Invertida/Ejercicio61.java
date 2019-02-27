//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 05:15
import java.util.Scanner;
class Ejercicio61{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
System.out.println("Escribe una palabra");
String P = S.nextLine();
StringBuilder R = new StringBuilder(P);
R.reverse();
System.out.println("La palabra invertida es: "+R);
}}