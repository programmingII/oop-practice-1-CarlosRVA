//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 22/02/2019
//Hora: 10:16
import java.util.Scanner;//Se importa la librería scanner para utilziar funciones de entrada de datos
//La clase Ejercicio38 implementa una aplicación que captura un string y cuenta e imprime la cantidad de caracteres según su tipo.
class Ejercicio38{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asigna atributos de
argumentos, valor de retorno y disponibilidad de uso.*/
String O;//Se declara una variable tipo String.
Scanner P = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "P".
System.out.println("Escribe una oracion: ");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
O = P.nextLine();//Se llama al scanner para almacenar en O a la próxima línea de texto que se inserte.
int Letra = 0;
int Espacio = 0;
int Num = 0;
int Otro = 0;
//Se declaran estas variables de tipo int para contar cada caracter en el string y almacenarlo en su respectiva variable.
char[]C=O.toCharArray();//Se crea una variable tipo char y se almacena en ella el valor insertado en O en modo de arreglo de caracteres.
for(int x=0;x<O.length();x++){
/*En este ciclo for se va a analizar cada caracter uno por uno y dependiendo del tipo de caracter que sea, se le sumara 1 al valor de la
variable que se encarga de contar los caracteres de este tipo. Una vez que se identifica el tipo de caracter que es, se analiza el siguiente.*/
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
System.out.println("El texto insertado es: "+O);//Se imprime el texto que se almacenó en O.
System.out.println("Letras: "+Letra);
System.out.println("Espacios: "+Espacio);
System.out.println("Numeros: "+Num);
System.out.println("Otros: "+Otro);
//Se imprime la cantidad de caracteres de cada tipo.
}}
