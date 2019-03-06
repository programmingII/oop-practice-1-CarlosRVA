//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 05/03/2019
//Hora: 18:23
import java.util.Scanner;
class Ejercicio86{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
System.out.println("Inserta un numero");
int n = Num.nextInt();
while (n!=1){
if(n%2==0){
n=n/2;
}
else{
n=(n*3)+1;
}
System.out.println(n);
}
}}
