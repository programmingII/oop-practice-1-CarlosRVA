//Nombre: Villanueva Aguilar Carlos Raymundo
//Día: 07/02/2019
//Hora: 12:39
import java.util.Scanner;//Importa las funciones necesarias para la entrada de datos
//La clase Ejercicio6 implementa una aplicación que imprime el resultado de varias operaciones básicas
class Ejercicio6{
public static void main(String[]args){
Scanner Num = new Scanner(System.in);/*La función crea un Scanner para poder introducir datos.
Después de la palabra "Scanner" se declara el nombre del mismo.*/
float x,y,S,R,M,D,Md; //Se declaran las variables como float para que se muestren decimales al dividir.
System.out.println("Inserta el primer numero");//Se utiliza el comando para imprimir en pantalla.
x=Num.nextInt();//Esta función llama al scanner para leer el próximo número entero que se introduzca.
System.out.println("Inserta el segundo numero");//Se vuelve a usar el comando para pedir al usuario que introduzca un segundo numero
y=Num.nextInt();//Se vuelve a llamar al scanner para leer otro número entero.
S=x+y;//Se declara "S" como la suma de la variable x y la variable y.
R=x-y;//Se declara "R" como la resta de las variables.
M=x*y;//Se declara "M" como el resultado de la multiplicación de las variables.
D=x/y;//Se declara "D" como el resultado de la división de las variables.
Md=x%y;//Se declara "Md" como el residuo de la división de las variables.
System.out.println(x+" + "+y+" = "+S);//Se muestra el proceso de la suma y el resultado de esta.
System.out.println(x+" - "+y+" = "+R);//Se muestra el proceso de la resta y el resultado de esta.
System.out.println(x+" * "+y+" = "+M);//Se muestra el proceso de la multiplicación y el resultado de esta.
System.out.println(x+"/"+y+" = "+D);//Se muestra el proceso de la división y el resultado de esta.
System.out.println(x+" mod "+y+" = "+Md);//Se muestra el residuo de la división entre las variables.
}}
