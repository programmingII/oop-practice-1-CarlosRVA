//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 15:49
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
class Ejercicio52{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int a,b,c;//Se declaran tres variables de tipo int.
/*Se imprimen en pantalla tres instrucciones que le piden al usuario insertar un número, después de cada instrucción se le asigna a cada
variable un valor dependiendo del número entero que se inserte en cada uno.*/
System.out.println("Inserta el primer numero");
a = Num.nextInt();
System.out.println("Inserta el segundo numero");
b = Num.nextInt();
System.out.println("Inserta el tercer numero");
c = Num.nextInt();
if(a+b==c){//Si la suma entre el valor de a y b es igual al valor insertado en c, se imprime que es así.
System.out.println("La suma entre "+a+" y "+b+" es igual a "+c);
}
else{//En caso de que no, que no es así.
System.out.println("La suma entre "+a+" y "+b+" no es igual a "+c);
}
}}
