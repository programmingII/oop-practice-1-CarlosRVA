//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 18:26
import java.util.Scanner;
class Ejercicio57{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int n,a;
a=0;
System.out.println("Escribe un numero");
n = Num.nextInt();
for(int x=1;x<=n;x++){
if(n%x==0){
a++;
}}
System.out.println("El numero de factores de "+n+" es: "+a);
}}