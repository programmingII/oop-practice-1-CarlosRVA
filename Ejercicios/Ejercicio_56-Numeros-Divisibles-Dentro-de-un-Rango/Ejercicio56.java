//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 18:16
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio56{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int x,y,p,n;//Se declaran cuatro variables de tipo int.
n=0;//Se le asigna a n un valor de 0
/*Se escriben 3 instrucciones, dos de ellas para indicar que se inserten los límites inferior y superior del rango, y la tercera para pedir
que se inserte el divisor del rango establecido. A cada variable se le asignará un valor entero determinado por el usuario.*/
System.out.println("Escribe el limite inferior del rango");
x=Num.nextInt();
System.out.println("Escribe el limite superior del rango");
y=Num.nextInt();
System.out.println("Escribe el divisor del rango");
p=Num.nextInt();
for(x=x;x<=y;x++){
/*En este ciclo for se establecen la variable x y la variable y como límites inferior y superior, con un aumento de 1 a x cada vez que se
repita el ciclo. Si el residuo de x entre p es 0, se le sumará 1 al valor de n para indicar que este número es divisible entre el rango
establecido.*/
if(x%p==0){
n++;
}}
System.out.println("La cantidad de numeros divisibles entre "+p+" dentro del rango introducido es: "+n);/*Finalmente, se imprime la
cantidad de números divisibles entre p dentro del rango, la cual está almacenada en n.*/
}}
