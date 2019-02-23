//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 05:49
import java.util.Scanner;//Se importa la librería scanner para utilizar funciones de entrada de datos.
//La clase Ejercicio32 implementa una aplicación que compara dos números insertados e imprime una descripción.
class Ejercicio32{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valor de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num"
int x,y;//Se declaran dos variables tipo entero
System.out.println("Escribe el primer numero ");//Se utiliza el comando para imprimir en pantalla y se escribe una instrucción.
x=Num.nextInt();//Se llama al scanner para capturar el siguiente numero entero que se inserte y asignarlo como valor de x.
System.out.println("Escribe el segundo numero ");//Se escribe una segunda instrucción.
y=Num.nextInt();//Se repite el proceso con el valor de y.
if(x!=y){//Se realiza la primera comparación, la cual en caso de que x sea diferente de y imprimirá en pantalla un texto que lo indique.
System.out.println(x+" es diferente de "+y);
}
else
{//En caso de que no se cumpla la comparación anterior, indicará que los números comparados son iguales.
System.out.println(x+" es igual que "+y);
}
if(x<y){//Se realiza la siguiente comparación, que imprime un texto que indica que x es menor que y en caso de ser cierto
System.out.println(x+" es menor que "+y);
}
else
{//En caso de que no, se imprimirá que x es mayor que y.
System.out.println(x+" es mayor o igual que "+y);
}
if(x<=y){//La ultima comparación imprimirá un texto que indica que x es menor o igual que y en caso de ser cierto.
System.out.println(x+" es menor o igual que "+y);
}
else
{//En caso de que no, se imprimirá que x es mayor o igual que y.
System.out.println(x+" es mayor que "+y);
}

}}
