//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 10/02/2019
//Hora: 09:38
import java.util.Scanner;//Importa las funciones de scanner que se usan para la entrada de datos.
class Ejercicio12{
public static void main(String[]args){/*Se crea el método main para que el programa sea capaz de ejecutarse y se le asignan
los atributos de disponibilidad de uso, valores de retorno y argumentos.*/
Scanner N = new Scanner(System.in);//Se crea un nuevo scanner y se le asigna el nombre de "N".
int A,B,C,S;//Se crean 4 variables de tipo int.
System.out.println("Introduce el primer numero");//Se usa el comando para imprimir en pantalla y se escribe una instrucción.
A=N.nextInt();//Llama al scanner para capturar el próximo número entero que se inserte y asignarlo como valor de A.
System.out.println("Introduce el segundo numero");//Se utiliza el mismo comando para imprimir una segunda instrucción.
B=N.nextInt();//Se vuelve a llamar al scanner para realizar la misma tarea con el valor de B.
System.out.println("Introduce el tercer numero");//Se vuelve a utilizar el comando para mostrar una tercera instrucción.
C=N.nextInt();//Se llama al scanner una vez mas para el valor de C.
S=A+B+C;//Se realiza la suma de A, B y C, y el resultado se asigna como valor de S.
System.out.println("El promedio de los tres numeros es: "+S/3.0);/*Se utiliza de nuevo el comando para imprimir el promedio
en pantalla. Se divide S entre la cantidad de valores sumados (3: A,B,C), y se le agrega punto decimal al 3 para que el resultado 
muestre decimales en caso de ser necesario.
}}
