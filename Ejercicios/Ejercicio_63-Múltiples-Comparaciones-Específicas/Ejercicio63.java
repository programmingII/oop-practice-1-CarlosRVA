//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 05:32
import java.util.Scanner;
class Ejercicio63{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int a,b;
System.out.println("Inserta el primer numero");
a = Num.nextInt();
System.out.println("Inserta el segundo numero");
b = Num.nextInt();
if(a>b){
System.out.println(a);
}
else{
System.out.println(b);
}
if(a==b){
System.out.println(0);
}
if(a>b&&a%6==b%6){
System.out.println(b);
}
else if(b>a&&b%6==a%6){
System.out.println(a);
}
}}