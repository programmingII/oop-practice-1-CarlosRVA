//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 16:15
import java.util.Scanner;
class Ejercicio54{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int a,b,c;
System.out.println("Escribe el primer numero");
a = Num.nextInt();
System.out.println("Escribe el segundo numero");
b = Num.nextInt();
System.out.println("Escribe el tercer numero");
c = Num.nextInt();
if(a%10==b%10||a%10==c%10||b%10==c%10){
System.out.println("Al menos dos de los numeros insertados comparten el mismo digito final.");
}
else{
System.out.println("Ninguno de los numeros insertados comparten el mismo digito final.");
}
}}
