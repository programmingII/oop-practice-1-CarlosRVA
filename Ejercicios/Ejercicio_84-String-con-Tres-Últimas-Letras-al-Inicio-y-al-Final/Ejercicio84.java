//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 05/03/2019
//Hora: 12:26
import java.util.Scanner;
class Ejercicio84{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
System.out.println("Escribe una palabra");
String P = S.nextLine();
System.out.println(P.substring(P.length()-3,P.length())+P+P.substring(P.length()-3,P.length()));
}}