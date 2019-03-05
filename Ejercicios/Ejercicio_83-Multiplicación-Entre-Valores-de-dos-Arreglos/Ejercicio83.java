//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 05/03/2019
//Hora: 05:41
import java.util.Scanner;
class Ejercicio83{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int A1[]=new int[4];
int A2[]=new int[4];
int A3[]=new int[4];
for(int x=0;x<=3;x++){
System.out.println("Inserta el numero que va en la posicion "+(x+1)+" del primer arreglo");
A1[x]=Num.nextInt();
}
for(int x=0;x<=3;x++){
System.out.println("Inserta el numero que va en la posicion "+(x+1)+" del segundo arreglo");
A2[x]=Num.nextInt();
A3[x]=A1[x]*A2[x];
}
System.out.println("El resultado de la multiplicacion entre los valores de los dos arreglos es: ["
+A3[0]+", "+A3[1]+", "+A3[2]+", "+A3[3]+"]");
}}