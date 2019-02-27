//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 15:49
import java.util.Scanner;
class Ejercicio52{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int a,b,c;
System.out.println("Inserta el primer numero");
a = Num.nextInt();
System.out.println("Inserta el segundo numero");
b = Num.nextInt();
System.out.println("Inserta el tercer numero");
c = Num.nextInt();
if(a+b==c){
System.out.println("La suma entre "+a+" y "+b+" es igual a "+c);
}
else{
System.out.println("La suma entre "+a+" y "+b+" no es igual a "+c);
}
}}
