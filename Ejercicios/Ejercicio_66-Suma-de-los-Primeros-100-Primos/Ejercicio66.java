//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 18:33
//La clase Ejercicio66 implementa una aplicación que imprime la suma entre los primeros 100 números primos.
class Ejercicio66{
public static void main(String[] args)
 {/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
//Se declaran 3 variables tipo int y se le asignan sus respectivos valores.
int z = 1;
int n = 0; 
int x = 0;
while (n < 100) {//Este bucle while va a verificar si el valor actual de x es primo, en caso de serlo, le suma 1 al n y almacena el valor de x en z.
x++; 
if (x % 2 != 0) {//Esta operación se realiza para verificar si el número es par, pues el único número par que es primo es 2.
if (Primo(x)) {
z += x; 
n++; 
}}}
System.out.println("La suma de los primeros 100 numeros primos es: "+z); 	//Se imprime el valor de z, que contiene la suma de los numeros primos.
}
public static boolean Primo(int x) {/*Aquí se verifica si el número es primo o no, en caso de serlo, devuelve true, de lo contrario, false.*/
for (int y = 3; y * y <= x; y+= 2) {
if (x % y == 0) {
return false; 
}}
return true;
}}
