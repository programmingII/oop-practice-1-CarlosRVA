//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 18:16
import java.util.Scanner;
class Ejercicio56{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int x,y,p,n;
n=0;
System.out.println("Escribe el limite inferior del rango");
x=Num.nextInt();
System.out.println("Escribe el limite superior del rango");
y=Num.nextInt();
System.out.println("Escribe el divisor del rango");
p=Num.nextInt();
for(x=x;x<=y;x++){
if(x%p==0){
n++;
}}
System.out.println("La cantidad de numeros divisibles entre "+p+" dentro del rango introducido es: "+n);
}}