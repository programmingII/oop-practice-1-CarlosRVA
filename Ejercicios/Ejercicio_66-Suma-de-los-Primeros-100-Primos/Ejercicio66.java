//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 27/02/2019
//Hora: 18:33
class Ejercicio66{
public static void main(String[] args)
 {
int z = 1;
int n = 0; 
int x = 0;
while (n < 100) {
x++; 
if (x % 2 != 0) {
if (Primo(x)) {
z += x; 
n++; 
}}}
System.out.println("La suma de los primeros 100 numeros primos es: "+z); 	
}
public static boolean Primo(int x) {
for (int y = 3; y * y <= x; y+= 2) {
if (x % y == 0) {
return false; 
}}
return true;
}}