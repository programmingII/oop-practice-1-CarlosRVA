//Nombre: Villanueva Aguilar Carlos Raymundo 
//D�a: 2/02/2019
//Hora: 16:29
import java.util.Scanner;
class Ejercicio55{
public static void main(String[]args){
Scanner Seg = new Scanner(System.in);
int T,H,M,S;
System.out.println("Escribe una cantidad de segundos");
T = Seg.nextInt();
H=T/3600;
M=(T%3600)/60;
S=(T%3600)%60;
System.out.println(H+":"+M+":"+S);
}
}