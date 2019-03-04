//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 04/03/2019
//Hora: 15:20
import java.util.Scanner;
class Ejercicio77{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int A1[] = new int[4];
int A2[] = new int[4];
int A3[] = new int[3];
for (int x=1;x<=3;x++){
System.out.println("Inserta el numero que va en la posicion "+x+" del primer arreglo:");
A1[x] = Num.nextInt();
}
for (int x=1;x<=3;x++){
System.out.println("Inserta el numero que va en la posicion "+x+" del segundo arreglo:");
A2[x] = Num.nextInt();
}
A3[1]=A1[1];
A3[2]=A2[3];
System.out.println("El nuevo arreglo contiene los numeros: "+A3[1]+" y "+A3[2]);
}}