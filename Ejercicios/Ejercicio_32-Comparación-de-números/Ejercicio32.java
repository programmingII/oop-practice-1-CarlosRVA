//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 20/02/2019
//Hora: 05:49
import java.util.Scanner;
class Ejercicio32{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int x,y;
System.out.println("Escribe el primer numero ");
x=Num.nextInt();
System.out.println("Escribe el segundo numero ");
y=Num.nextInt();
if(x!=y){
System.out.println(x+" es diferente de "+y);
}
else
{
System.out.println(x+" es igual que "+y);
}
if(x<y){
System.out.println(x+" es menor que "+y);
}
else
{
System.out.println(x+" es mayor o igual que "+y);
}
if(x<=y){
System.out.println(x+" es menor o igual que "+y);
}
else
{
System.out.println(x+" es mayor que "+y);
}
}}