//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 01/03/2019
//Hora: 12:35
import java.util.Scanner;
class Ejercicio73{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
String A,B;
System.out.println("Escribe una palabra");
A = S.nextLine();
System.out.println("Escribe otra palabra");
B = S.nextLine();
if(A.length()==0){
A="#";
}
else{
A=A.substring(0,1);
}
if(B.length()==0){
B="#";
}
else{
B=B.substring(B.length()-1,B.length());
}
System.out.println(A+B);
}}