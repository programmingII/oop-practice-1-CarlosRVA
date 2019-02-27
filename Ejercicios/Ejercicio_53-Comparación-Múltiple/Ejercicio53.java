//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 16:04
import java.util.Scanner;
class Ejercicio53{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int a,b,c;
System.out.println("Inserta el primer numero: ");
a = Num.nextInt();
System.out.println("Inserta el segundo numero: ");
b = Num.nextInt();
System.out.println("Inserta el tercer numero: ");
c = Num.nextInt();
if(a<b&&b<c){
System.out.println("Se cumple con la condicion de que "+a+" sea menor que "+b+" y que "+b+" sea menor que "+c);
}
else{
System.out.println("No se cumple con la condicion de que "+a+" sea menor que "+b+" y que "+b+" sea menor que "+c);
}
}}
