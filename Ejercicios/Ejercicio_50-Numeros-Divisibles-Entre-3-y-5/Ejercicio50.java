//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 12:33
//La clase Ejercicio50 implementa una aplicación que imprime los números del 1 al 100 que son divisibles entre 3, entre 5 y entre ambos.
class Ejercicio50{
public static void main(String[]args){
System.out.println("Divisibles entre 3: ");
/*Este ciclo revisará cada número del 1 al 100 y comprobará si es divisible entre 3 mediante su residuo, si el residuo es 0, es divisible,
y si es diferente de 0, no lo es, cuando el número es divisible entre 3, se imprimirá dicho número.*/
for(int x=1;x<=100;x++){
if(x%3==0){
System.out.print(x+", ");/*En este caso, se utiliza .print, porque al utilizar .println se incluye un salto de linea, para que se impriman
todos los números en una o dos líneas, .print se encargará de imprimir en pantalla sin ningun salto.*/
}}
System.out.println("\n\nDivisibles entre 5: ");
//Se realiza la misma metodología que con los divisibles entre 3, pero esta vez será entre 5.
for(int x=1;x<=100;x++){
if(x%5==0){
System.out.print(x+", ");//Se utiliza .print por las razones ya establecidas.
}}
System.out.println("\n\nDivisibles entre 3 y 5: ");
/*Aquí se usa un if múltiple, que sólo imprime el número si se comprueba que cumple con las condiciones de ser divisible entre 3 y 5, en
caso de no cumplirse alguna de las dos, no se imprime nada.*/
for(int x=1;x<=100;x++){
if(x%3==0&&x%5==0){
System.out.print(x+", ");//Se utiliza .print para que al mostrar el texto no se realice ningún salto de línea.
}}
}}
