//Nombre: Villanueva Aguilar Carlos Raymundo
//Día: 07/02/2019
//Hora: 12:20
import java.util.Scanner; //Importa las funciones para introducir datos
class Ejercicio5{
public static void main(String[]args){
int x,y;
Scanner Num = new Scanner(System.in); //Crea un scanner para introducir datos
System.out.println("Introduce un numero");
x=Num.nextInt(); //Llama al scanner para que lea el proximo número tipo entero
System.out.println("Introduce otro numero");
y=Num.nextInt();
System.out.println("El producto de los numeros es: "+x*y);
}}