//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 09/02/2019
//Hora: 10:44
//La clase Ejercicio10 implementa una aplicación que realiza una fórmula con decimales e imprime el resultado.
class Ejercicio10{
public static void main(String[]args){
double A,B,C;//Se declaran las variables como tipo double para poder trabajar con decimales.
A=4.0;//Se declara la variable A como 4.0, es importante poner el punto decimal para que el programa sepa que se va a trabajar con ellos.
B=(6.0-(6.0/7)+(6.0/2)-(6.0/8)+(6.0/9)-(6.0/15)); /*Se declara la variable B, es importante poner el dividendo como decimal
para evitar que el programa redondee el resultado. La variable almacenará el resultado de esta operación.*/
C=A*B;//Se declara la variable C como el resultado de la multiplicación entre las otras dos variables.
System.out.println(C);//Se imprime la variable C, la cual es el resultado de la multiplicación anterior.
}}
