//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 20:01
import java.util.Scanner;
class Ejercicio67{
public static void main(String[]args){
String A,B;
Scanner S = new Scanner(System.in);
System.out.println("Inserta la primera sentencia");
A = S.nextLine();
System.out.println("Inserta la segunda sentencia");
B = S.nextLine();
System.out.println(A.substring(0,A.length()/2)+B+A.substring(A.length()/2,A.length()));
}}