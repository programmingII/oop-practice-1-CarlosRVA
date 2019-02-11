//Nombre: Villanueva Aguilar Carlos Raymundo
//Día: 07/02/2019
//Hora: 13:03
import java.util.Scanner;//Importa las funciones que se utilizan para la entrada de datos
/*La clase Ejercicio7 implementa una aplicación que muestra la tabla de multiplicación de un número dado.*/
class Ejercicio7{
public static void main(String[]args){
Scanner N= new Scanner(System.in);//Se crea un nuevo scanner para la entrada de datos y se le asigna el nombre de "N".
int x,n;//Se declaran dos variables de tipo entero para su uso posterior en el programa
System.out.println("Inserta un numero para ver su tabla de multiplicar");/*Se utiliza el comando para imprimir una instrucción dada en
pantalla.*/
n=N.nextInt();//Se llama al scanner para leer el proximo número entero.
for (x=1;x<=10;x++){/*Se implementa el ciclo for, el cual dice que inicia con la variable x teniendo un valor de 1, e indica que el
ciclo debe continuar siempre y cuando la variable x sea menor o igual a 10, con un incremento de 1 cada vez que se realizen todas las
instrucciones antes de volver a empezar el ciclo.*/
System.out.println(n+" x "+x+" = "+n*x);/*Este comando va a tomar la variable n y va a imprimir que se multiplica por la variable x
y mostrará el resultado de la multiplicación. Como este es un ciclo for, esta acción se repetirá siempre y cuando la variable x no supere
un valor de 10. El resultado de la operación cambiará dependiendo del valor actual de x en el ciclo.*/
}}} 
