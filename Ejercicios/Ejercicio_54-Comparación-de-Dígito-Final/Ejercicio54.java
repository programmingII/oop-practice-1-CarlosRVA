//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 16:15
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio54{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int a,b,c;//Se declaran 3 variables de tipo int.
/*Se imprimen en pantalla tres instrucciones que le piden al usuario insertar un número, después de cada instrucción se le asigna a cada
variable un valor dependiendo del número entero que se inserte en cada uno.*/
System.out.println("Escribe el primer numero");
a = Num.nextInt();
System.out.println("Escribe el segundo numero");
b = Num.nextInt();
System.out.println("Escribe el tercer numero");
c = Num.nextInt();
if(a%10==b%10||a%10==c%10||b%10==c%10){/*Se establece la condicion de que si al menos dos de los números comparten el mismo residuo al ser
divididos entre 10, en caso de ser cierta, se imprime en pantalla un mensaje que dice que se cumple esta condición.*/
System.out.println("Al menos dos de los numeros insertados comparten el mismo digito final.");
}
else{//En caso de que no se cumpla la condición, se imprime en pantalla un mensaje que lo indica.
System.out.println("Ninguno de los numeros insertados comparten el mismo digito final.");
}
}}
