//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 19:09
import java.util.Scanner;
class Ejercicio60 {
public static void main(String[] args){	
Scanner S = new Scanner(System.in);
System.out.print("Escribe una palabra o sentencia: ");
String P = S.nextLine();
String[] C = P.split(" ");
System.out.println("La penultima palabra es: "+C[C.length - 2]);
}}