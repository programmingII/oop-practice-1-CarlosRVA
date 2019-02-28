//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 18:23
import java.util.Scanner;
class Ejercicio65{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int x,y;
System.out.println("Inserta el numero que va a ser el dividendo:");
x = Num.nextInt();
System.out.println("Inserta el numero que va a ser el divisor:");
y = Num.nextInt();
while(x>=y){
x=x-y;
}
System.out.println("El residuo de la division es: "+x);
}}