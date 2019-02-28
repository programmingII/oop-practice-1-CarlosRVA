//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 05:43
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio64{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int x,y;//Se declaran dos variables de tipo int.
/*Se imprimen en pantalla dos instrucciones que le piden al usuario insertar un número, después de cada instrucción se le asigna a cada
variable un valor dependiendo del número entero que se inserte en cada uno.*/
System.out.println("Escribe el primer numero");
x = Num.nextInt();
System.out.println("Escribe el segundo numero");
y = Num.nextInt();
if(x%10==y%10 || x-(x%10)==y-(y%10)){/*Si el residuo de x entre 10 es igual al residuo de y entre 10, o x menos este residuo es igual a
y menos este residuo, se imprime que se cumple la condición.*/
System.out.println("Se cumple con la condicion, los dos numeros coinciden con algun digito");
}
else{//Si no es así, se imprime que no se cumple con la condición.
System.out.println("No se cumple con la condicion, los numeros no comparten digitos");
}}}
