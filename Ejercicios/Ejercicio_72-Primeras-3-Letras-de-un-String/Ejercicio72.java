//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 01/03/2019
//Hora: 12:08
import java.util.Scanner;
class Ejercicio72{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
System.out.println("Escribe una palabra");
String P = S.nextLine();
if(P.length()>=3){
System.out.println(P.substring(0,3));
}
else if(P.length()==0){
System.out.println("###");
}
else if(P.length()==1){
System.out.println(P+"##");
}
else if(P.length()==2){
System.out.println(P+"#");
}
}}