//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 22/02/2019
//Hora: 07:41
import java.util.Scanner;
class Ejercicio37{
public static void main(String[]args){
Scanner Pal = new Scanner(System.in);
System.out.println("Escribe una oracion: ");
String S = Pal.nextLine();
StringBuilder Reversa = new StringBuilder(S);
Reversa.reverse();
System.out.println("Lo que se escribio fue: "+S);
System.out.println("Y la reversa es: "+Reversa);
}}