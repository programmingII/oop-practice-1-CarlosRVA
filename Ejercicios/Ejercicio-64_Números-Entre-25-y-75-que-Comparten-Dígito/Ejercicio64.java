//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 05:43
import java.util.Scanner;
class Ejercicio64{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int x,y;
System.out.println("Escribe el primer numero");
x = Num.nextInt();
System.out.println("Escribe el segundo numero");
y = Num.nextInt();
if(x%10==y%10 || x-(x%10)==y-(y%10)){
System.out.println("Se cumple con la condicion, los dos numeros coinciden con algun digito");
}
else{
System.out.println("Ne cumple con la condicion, los numeros no comparten digitos");
}}}