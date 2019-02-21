//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 12:33
import java.util.Scanner;
class Ejercicio33{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int x,n,s;
System.out.println("Inserta un numero entero ");
x=Num.nextInt();
s=0;
n=x;
while(x!=0){
s=s+(x%10);
x=x/10;
}
System.out.println("La suma de los digitos de "+n+" es: "+s);
}}
