//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 04/03/2019
//Hora: 21:20
import java.util.Scanner;
class Ejercicio82{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int A[] = new int[5];
for(int x=0;x<=4;x++){
System.out.println("Inserta el numero que va en la posicion "+(x+1));
A[x] = Num.nextInt();
}
int Max = A[0];
if(Max<=A[2]){
Max=A[2];
}
if(Max<=A[4]){
Max=A[4];
}
System.out.println("El numero mayor entre los que se encuentran en la posicion inicial, final e intermedia es: "+Max);
}}