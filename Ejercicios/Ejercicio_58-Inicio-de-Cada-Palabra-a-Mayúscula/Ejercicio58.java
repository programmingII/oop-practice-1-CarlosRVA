//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 18:36
import java.util.Scanner;
class Ejercicio58{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
System.out.println("Escribe una palabra o sentencia");
String P = S.nextLine();
String May = "";
Scanner Linea = new Scanner(P);
while(Linea.hasNext()){
String Pal = Linea.next();
May = May+Character.toUpperCase(Pal.charAt(0))+Pal.substring(1)+" ";
}
System.out.println(May.trim());
}}