//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 22:38
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, el cual permite utilizar funciones de entrada de datos.
//La clase Ejercicio49 implementa una aplicación que captura un número, determina si es par o impar e imprime el resultado.
class Ejercicio49{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
System.out.println("Inserta un numero");//Se imprime en pantalla la instrucción de insertar un número.
int x = Num.nextInt();//Se declara una variable tipo int y se le asigna el valor del próximo número entero que se inserte.
int y = x%2;//Se declara la variable y, la cual tendrá el valor del residuo de la división de x entre 2. 
if(x%2==0){//Si el residuo de la división de x entre 2 es 0, se imprime en pantalla que el número es par.
System.out.println("Es numero par");
}
else{//Si el residuo no es 0, se imprime en pantalla que el número es impar.
System.out.println("Es numero impar");
}
}}
