//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 05/02/2019
//Hora: 13:10
//La clase Ejercicio4 implementa una aplicación que imprime varias operaciones junto con su resultado.
class Ejercicio4{
public static void main(String[]args){
System.out.println("Operacion A) -9+12*8");//Se utiliza el comando para imprimir en pantalla.
System.out.println((-9)+(12*8));//Se imprime el resultado de la operación.
System.out.println("Operacion B) (20+13)%9");//Cuando se quiere mostrar la operación en sí, se debe escribir entre comillas
System.out.println((20+13)%9);/*Esta operación divide el dato localizado a la izquierda (en este caso 20+13) entre el dato
localizado a la derecha (9 en este caso) e imprime el residuo de la división.)*/
System.out.println("Operacion C) 17+ -38*8/4");//Se repite el mismo principio para imprimir texto en pantalla
System.out.println(17 + -38*8/4);/*Al ser ejecutado, el programa aplica automáticamente las reglas de prioridades 
a la hora de calcular el resultado*/
System.out.println("Operacion D) 9+56/7*4%3");
System.out.println((9+(56/7*4%3)));
}}
