//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 01/03/2019
//Hora: 10:28
import java.util.Scanner;
class Ejercicio71{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
String A,B;
System.out.println("Escribe una palabra");
A = S.nextLine();
System.out.println("Escribe otra palabra");
B = S.nextLine();
System.out.println(A.substring(1,A.length())+B.substring(1,B.length()));
}}