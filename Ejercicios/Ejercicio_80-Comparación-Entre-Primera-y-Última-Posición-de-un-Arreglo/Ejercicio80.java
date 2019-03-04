//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 04/03/2019
//Hora: 15:57
import java.util.Scanner;
class Ejercicio80{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int A[] = new int[3];
for(int x=0;x<=2;x++){
System.out.println("Inserta el numero que va en la posicion "+(x+1));
A[x]=Num.nextInt();
}
if(A[0]>A[2]){
System.out.println("Entre los numeros insertados en la primera y ultima posicion, el mas grande es: "+A[0]);
}
else{
System.out.println("Entre los numeros insertados en la primera y ultima posicion, el mas grande es: "+A[2]);
}
}}