//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 05/03/2019
//Hora: 12:42
import java.util.Scanner;
class Ejercicio85{
public static void main(String[]args){
Scanner S = new Scanner(System.in);
System.out.println("Escribe la palabra con la que se debe iniciar");
String P = S.nextLine();
System.out.println("Escribe la sentencia que se va a verificar");
String Sen = S.nextLine();
String[]Ch=Sen.split(" ");
System.out.println(Ch[0].trim());
if(Ch[0].equals(P)){
System.out.println("La sentencia \""+Sen+"\""+" contiene la palabra \""+P+"\" al inicio.");
}
else{
System.out.println("La sentencia \""+Sen+"\""+" no contiene la palabra \""+P+"\" al inicio.");
}
}}