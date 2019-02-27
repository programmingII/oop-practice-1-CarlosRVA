//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 05:21
import java.util.Scanner;
class Ejercicio62{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
int a,b,c;
System.out.println("Inserta el primer numero: ");
a = Num.nextInt();
System.out.println("Inserta el segundo numero: ");
b = Num.nextInt();
System.out.println("Inserta el tercer numero: ");
c = Num.nextInt();
if(a>=20&&a<Math.abs(b-c)||b>=20&&b<Math.abs(a-c)||c>=20&&c<Math.abs(b-a)){
System.out.println("Se cumple con la condicion, uno de los numeros es mayor o igual a 20 y menor que la diferencia entre los otros dos.");
}
else{
System.out.println("No se cumple con la condicion de que uno de los numeros sea mayor o igual a 20 y menor que la diferencia entre los otros dos.");
}}}