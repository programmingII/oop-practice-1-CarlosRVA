//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 10/02/2019
//Hora: 13:28
import java.util.Scanner;//Se importa la librería scanner para poder utilizar funciones de entrada de datos.
//La clase Ejercicio15 implementa una aplicación que captura dos variables, muestra su valor, y luego las cambia de posición.
class Ejercicio15{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos
como valor de retorno, disponibilidad de uso y argumentos.*/
Scanner N = new Scanner(System.in);//Se declara un nuevo scanner con el nombre de "N".
int x,y,z;//Se declaran 3 variables de tipo int.
System.out.println("Inserta el primer numero");//Se utiliza el comando para imprimir a pantalla y se escribe la instrucción.
x = N.nextInt();//Se llama al scanner para capturar el próximo número entero que se inserte.
System.out.println("Inserta el segundo numero");//Se vuelve a utilizar este comando para imprimir otra instrucción.
y= N.nextInt();//Se vuelve a utilizar el scanner para capturar otro número entero.
System.out.println("El valor del primer numero es: "+x);//Se imprime el valor del número en x para verificar después.
System.out.println("El valor del segundo numero es: "+y);//Se hace lo mismo con el valor del número en y.
z=x;//Se le asigna el valor de x a la variable z para poder realizar el cambio.
x=y;//A x se le asigna el valor de y para que la variable cambie de posición.
y=z;//Como x tiene un nuevo valor, a y se le asigna el valor de z, que tiene almacenado el antiguo valor de x.
System.out.println("El nuevo valor del primer numero es: "+x);//Se imprime el nuevo valor de x para comprobar el cambio de variable.
System.out.println("El nuevo valor del segundo numero es: "+y);//Se hace lo mismo con el valor del número en y.
}}
