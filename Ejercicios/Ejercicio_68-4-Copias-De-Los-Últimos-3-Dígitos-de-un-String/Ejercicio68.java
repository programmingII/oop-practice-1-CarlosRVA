//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 20:10
import java.util.Scanner;
class Ejercicio68{
public static void main(String[]args){
String A;
Scanner S = new Scanner(System.in);
System.out.println("Inserta una sentencia");
A = S.nextLine();
System.out.println(A.substring(A.length()-3,A.length())+A.substring(A.length()-3,A.length())+A.substring(A.length()-3,A.length())+A.substring(A.length()-3,A.length()));
}}