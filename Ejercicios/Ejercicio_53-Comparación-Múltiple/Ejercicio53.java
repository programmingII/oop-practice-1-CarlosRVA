//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 16:04
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio53 implementa una aplicación que captura 3 números, los compara, e imprime si se cumple o no la condición establecida.
class Ejercicio53{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int a,b,c;//Se declaran tres variables de tipo int.
/*Se imprimen en pantalla tres instrucciones que le piden al usuario insertar un número, después de cada instrucción se le asigna a cada
variable un valor dependiendo del número entero que se inserte en cada uno.*/
System.out.println("Inserta el primer numero: ");
a = Num.nextInt();
System.out.println("Inserta el segundo numero: ");
b = Num.nextInt();
System.out.println("Inserta el tercer numero: ");
c = Num.nextInt();
if(a<b&&b<c){//Si a es menor que b y b es menor que c, se imprime un texto que dice que se cumple la condición
System.out.println("Se cumple con la condicion de que "+a+" sea menor que "+b+" y que "+b+" sea menor que "+c);
}
else{//En caso de que no, se imprime que no se cumple.
System.out.println("No se cumple con la condicion de que "+a+" sea menor que "+b+" y que "+b+" sea menor que "+c);
}
}}
