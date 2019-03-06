//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 05/03/2019
//Hora: 18:35
import java.util.Scanner;
class Ejercicio87{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
System.out.println("Escribe un numero");
int n = Num.nextInt();
int s = 0;
int x=0;
String A[] = new String[Integer.toString(n).length()];
for (x=x;n!=0;x++){
s=s+(n%10);
switch(n%10){
case 0:
A[x]="Zero";
break;
case 1:
A[x]="One";
break;
case 2:
A[x]="Two";
break;
case 3:
A[x]="Three";
break;
case 4:
A[x]="Four";
break;
case 5:
A[x]="Five";
break;
case 6:
A[x]="Six";
break;
case 7:
A[x]="Seven";
break;
case 8:
A[x]="Eight";
break;
case 9:
A[x]="Nine";
break;
}
n=n/10;
}
for(x=x;x>0;x--){
if(x-1==0){
System.out.print(A[x-1]+" = ");
}
else{
System.out.print(A[x-1]+" + ");
}
}
System.out.print(s);
}}