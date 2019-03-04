//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 04/03/2019
//Hora: 15:46
import java.util.Scanner;
class Ejercicio79{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int A[] = new int[3];
for(int x=0;x<=2;x++){
System.out.println("Inserta el numero que va en la posicion "+(x+1));
A[x] = Num.nextInt();
}
int y = A[0];
System.out.println(A[0]+""+A[1]+""+A[2]);
A[0]=A[1];
A[1]=A[2];
A[2]=y;
System.out.println(A[0]+""+A[1]+""+A[2]);
}}