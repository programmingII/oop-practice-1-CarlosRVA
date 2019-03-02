//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 02/03/2019
//Hora: 14:10
import java.util.Scanner;
class Ejercicio76{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
System.out.println("Inserta el tamaño del primer arreglo");
int x=Num.nextInt();
System.out.println("Inserta el tamaño del segundo arreglo");
int y=Num.nextInt();
int A1[]=new int[x+1];
int A2[]=new int[y+1];
for(int n=1;n<=x;n++){
System.out.println("Inserta el numero que va en la posicion "+n+" del primer arreglo");
A1[n]=Num.nextInt();
}
for(int n=1;n<=x;n++){
System.out.println("Inserta el numero que va en la posicion "+n+" del segundo arreglo");
A2[n]=Num.nextInt();
}
if(A1[1]==A2[y]){
System.out.println("Los numeros insertados en la primera posicion el primer arreglo y la ultima posicion del segundo son iguales.");
}
else{
System.out.println("Los numeros insertados en la primera posicion el primer arreglo y la ultima posicion del segundo no son iguales.");
}
}}