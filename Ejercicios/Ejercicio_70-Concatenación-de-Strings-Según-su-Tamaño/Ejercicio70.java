//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 20:20
import java.util.Scanner;
class Ejercicio70{
public static void main(String[]args){
String A,B;
Scanner S = new Scanner(System.in);
System.out.println("Inserta una sentencia");
A = S.nextLine();
System.out.println("Inserta otra sentencia");
B = S.nextLine();
if(A.length()>B.length()){
System.out.println(B+A+B);
}
else {
System.out.println(A+B+A);
}
}}