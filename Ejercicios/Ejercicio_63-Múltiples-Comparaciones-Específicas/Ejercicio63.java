//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 05:32
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
/*La clase Ejercicio53 implementa una aplicación que captura 3 números, realiza varias comparaciones, e imprime un valor según
el resultado de la comparación.*/
class Ejercicio63{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int a,b;//Se declaran dos variables de tipo int.
/*Se imprimen en pantalla dos instrucciones que le piden al usuario insertar un número, después de cada instrucción se le asigna a cada
variable un valor dependiendo del número entero que se inserte en cada uno.*/
System.out.println("Inserta el primer numero");
a = Num.nextInt();
System.out.println("Inserta el segundo numero");
b = Num.nextInt();
if(a>b){//Si a es mayor que b, se imprime el valor de a.
System.out.println(a);
}
else{//Si a no es mayor que b, se imprime el valor de b.
System.out.println(b);
}
if(a==b){//Si a es igual a b, se imprime un 0.
System.out.println(0);
}
if(a>b&&a%6==b%6){//Si a es mayor que b, y sus residuos al ser divididos entre 6 son iguales, se imprime b.
System.out.println(b);
}
else if(b>a&&b%6==a%6){//Si b es mayor que a, y sus residuos al ser divididos entre 6 son iguales, se imprime a.
System.out.println(a);
}
}}
