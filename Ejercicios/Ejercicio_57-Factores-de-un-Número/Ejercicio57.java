//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 18:26
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio57 implementa una aplicación que captura un número e imprime la cantidad de factores que tiene.
class Ejercicio57{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int n,a;//Se declaran dos variables de tipo int.
a=0;//Se le asigna un valor de 0 a la variable a.
System.out.println("Escribe un numero");//Se imprime la instruccion que le pide al usuario insertar un número.
n = Num.nextInt();//Se llama al scanner y se le pide almacenar en n al próximo número entero que se inserte.
for(int x=1;x<=n;x++){/*Este ciclo for va a utilizar a x empezando en 1 y continuará hasta que x sea mayor que n, cada vez que se complete
un ciclo se le sumara 1 al valor de x. Si el residuo de n entre x es 0, se le sumará 1 al valor de a, indicando que este número es factor
de n.*/
if(n%x==0){
a++;
}}
System.out.println("El numero de factores de "+n+" es: "+a);//Finalmente, se imprime el número de factores que tiene el valor insertado en n.
}}
