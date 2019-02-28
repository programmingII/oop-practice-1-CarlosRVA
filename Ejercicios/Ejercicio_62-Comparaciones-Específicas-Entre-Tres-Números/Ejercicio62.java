//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 05:21
import java.util.Scanner;//Se importa la clase Scanner desde el paquete util, esta clase permite utilizar funciones de entrada de datos.
//La clase Ejercicio62 implementa una aplicación que captura 3 números, los compara, e imprime si se cumple o no la condición establecida.
class Ejercicio62{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
Scanner Num = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "Num".
int a,b,c;//Se declaran tres variables tipo int.
/*Se imprimen en pantalla tres instrucciones que le piden al usuario insertar un número, después de cada instrucción se le asigna a cada
variable un valor dependiendo del número entero que se inserte en cada uno.*/
System.out.println("Inserta el primer numero: ");
a = Num.nextInt();
System.out.println("Inserta el segundo numero: ");
b = Num.nextInt();
System.out.println("Inserta el tercer numero: ");
c = Num.nextInt();
if(a>=20&&a<Math.abs(b-c)||b>=20&&b<Math.abs(a-c)||c>=20&&c<Math.abs(b-a)){/*Se establece una condición: Si uno de los números es mayor 
o igual a 20 y menor que la diferencia entre los otros dos números, se imprimirá en pantalla que se cumple esta condición.*/
System.out.println("Se cumple con la condicion, uno de los numeros es mayor o igual a 20 y menor que la diferencia entre los otros dos.");
}
else{//En caso de no cumplirse, se imprimirá en pantalla que no se cumple.
System.out.println("No se cumple con la condicion de que uno de los numeros sea mayor o igual a 20 y menor que la diferencia entre los otros dos.");
}}}
