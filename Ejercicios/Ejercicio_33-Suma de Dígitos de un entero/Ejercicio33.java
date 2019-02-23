//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 12:33
import java.util.Scanner;//Se importa la librería scanner para poder usar funciones de entrada de datos
//La clase Ejercicio33 implementa una aplicación que captura un número, realiza una suma entre sus dígitos e imprime el resultado.
class Ejercicio33{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valor de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int x,n,s;//Se declaran 3 variables tipo int.
System.out.println("Inserta un numero entero ");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x=Num.nextInt();//Se llama al scanner y se le pide que capture el próximo número entero que se inserte para almacenar este valor en x.
s=0;//A la variable S se le asigna un valor de 0.
n=x;//A la variable n se le asigna el valor que se inserte en x para su uso posterior.
while(x!=0){/*Este while va a realizar las acciones que se encuentren dentro del corchete mientras x sea diferente de 0, si se terminan de
realizar se volverán a hacer hasta que x sea 0*/
s=s+(x%10);/*Lo que se hace aqui es la suma entre el valor actual de s y el valor del residuo de la división entre x y 10, el resultado se 
asignará como nuevo valor de s.*/
x=x/10;//Aquí se dividirá x entre 10 y el resultado se asignará como el nuevo valor de x.
}
System.out.println("La suma de los digitos de "+n+" es: "+s);/*Finalmente, aquí se imprime el resultado, utilizando n para mostrar el número
insertado originalmente y s para mostrar el resultado de la suma.*/
}}
