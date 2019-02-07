//Nombre: Villanueva Aguilar Carlos Raymundo
//Día: 07/02/2019
//Hora: 12:39
import java.util.Scanner;
class Ejercicio6{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);
float x,y,S,R,M,D,Md; //Se declaran como float en caso de que se quiera insertar números decimales
System.out.println("Inserta el primer numero");
x=Num.nextInt();
System.out.println("Inserta el segundo numero");
y=Num.nextInt();
S=x+y;
R=x-y;
M=x*y;
D=x/y;
Md=x%y;
System.out.println(x+" + "+y+" = "+S);
System.out.println(x+" - "+y+" = "+R);
System.out.println(x+" * "+y+" = "+M);
System.out.println(x+"/"+y+" = "+D);
System.out.println(x+" mod "+y+" = "+Md);
}}
