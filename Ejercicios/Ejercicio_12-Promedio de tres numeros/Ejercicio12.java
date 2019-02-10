//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 10/02/2019
//Hora: 09:38
import java.util.Scanner;
class Ejercicio12{
public static void main(String[]args){
Scanner N = new Scanner(System.in);
int A,B,C,S;
System.out.println("Introduce el primer numero");
A=N.nextInt();
System.out.println("Introduce el segundo numero");
B=N.nextInt();
System.out.println("Introduce el tercer numero");
C=N.nextInt();
S=A+B+C;
System.out.println("El promedio de los tres numeros es: "+S/3.0);
}}