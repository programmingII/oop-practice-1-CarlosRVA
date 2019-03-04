//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 04/03/2019
//Hora: 15:34
import java.util.Scanner;
class Ejercicio78{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int A[] = new int[3];
for (int x=1;x<=2;x++){
System.out.println("Inserta el numero que va en la posicion "+x);
A[x]=Num.nextInt();
}
if(A[1]==4||A[1]==7||A[2]==4||A[2]==7){
System.out.println("En el arreglo se encuentra un 4 o un 7");
}
else{
System.out.println("En el arreglo no se encuentra ni un 4 ni un 7");
}
}}