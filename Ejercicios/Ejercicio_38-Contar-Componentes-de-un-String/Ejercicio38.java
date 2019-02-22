//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 22/02/2019
//Hora: 10:16
import java.util.Scanner;
class Ejercicio38{
public static void main(String[]args){
String O;
Scanner P = new Scanner(System.in);
System.out.println("Escribe una oracion: ");
O = P.nextLine();
int Letra = 0;
int Espacio = 0;
int Num = 0;
int Otro = 0;
char[]C=O.toCharArray();
for(int x=0;x<O.length();x++){
if(Character.isLetter(C[x])){
Letra++;
}
else if(Character.isDigit(C[x])){
Num++;
}
else if(Character.isSpaceChar(C[x])){
Espacio++;
}
else{
Otro++;
}}
System.out.println("El texto insertado es: "+O);
System.out.println("Letras: "+Letra);
System.out.println("Espacios: "+Espacio);
System.out.println("Numeros: "+Num);
System.out.println("Otros: "+Otro);
}}