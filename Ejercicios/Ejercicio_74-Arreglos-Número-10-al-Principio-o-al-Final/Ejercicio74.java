//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 02/03/2019
//Hora: 10:09
import java.util.Scanner;
class Ejercicio74{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
System.out.println("Inserta el tamaño del arreglo");
int x = Num.nextInt();
int A[] = new int[x+1];
for(int n=1;n<=x;n++){
System.out.println("Inserta el numero que va en la posicion "+n+" del arreglo");
A[n] = Num.nextInt();
}
if(A[1]==10||A[x]==10){
System.out.println("El numero 10 se encuentra en la primera o ultima posicion");
}
else{
System.out.println("El numero 10 no se encuentra en la primera o ultima posicion");
}
}}