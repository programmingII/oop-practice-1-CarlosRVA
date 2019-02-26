//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:48
import java.util.Scanner;
class Ejercicio43{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
String P[] = new String[6];
for(int x=1;x<=5;x++){
System.out.println("Escriba el texto "+x);
P[x]=S.nextLine();
}
System.out.println(P[1]);
System.out.println("     "+P[2]);
System.out.println("          "+P[3]);
System.out.println("          "+P[4]);
System.out.println(P[5]);
}}