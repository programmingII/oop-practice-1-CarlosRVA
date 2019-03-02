//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 02/03/2019
//Hora: 11:20
import java.util.Scanner;
class Ejercicio75{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
System.out.println("Inserta el tamaño que va a tener el arreglo");
int x = Num.nextInt();
int A[] = new int[x+1];
for(int n = 1;n<=x;n++){
System.out.println("Inserta el numero de la posicion "+n+" del arreglo");
A[n]=Num.nextInt();
}
if(A[1]==A[x]){
System.out.println("Los numeros insertados en la primera y ultima posicion son iguales");
}
else{
System.out.println("Los numeros insertados en la primera y ultima posicion no son iguales");
}
}}