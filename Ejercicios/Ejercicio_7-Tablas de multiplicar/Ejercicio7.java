//Nombre: Villanueva Aguilar Carlos Raymundo
//Día: 07/02/2019
//Hora: 13:03
import java.util.Scanner;
class Ejercicio7{
public static void main(String[]args){
Scanner N= new Scanner(System.in);
int x,n;
System.out.println("Inserta un numero para ver su tabla de multiplicar");
n=N.nextInt();
for (x=1;x<=10;x++){
System.out.println(n+" x "+x+" = "+n*x);
}}}