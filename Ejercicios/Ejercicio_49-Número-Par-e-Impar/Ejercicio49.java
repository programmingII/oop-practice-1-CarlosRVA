//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 22:38
import java.util.Scanner;
class Ejercicio49{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
System.out.println("Inserta un numero");
int x = Num.nextInt();
int y = x%2;
if(x%2==0){
System.out.println("Es numero par");
}
else{
System.out.println("Es numero impar");
}
}}