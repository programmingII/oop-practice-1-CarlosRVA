//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 22/02/2019
//Hora: 10:44
/*La clase Ejercicio39 implementa una aplicación que utiliza un ciclo for para imprimir números de 3 digitos del 1 al 4,
los cuales no se repiten.*/
class Ejercicio39{
public static void main(String[]args){/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valor de retorno y argumentos.*/
int a,b,c,N;//Se declaran 4 variables de tipo int.
/*A cada uno de estos valores se le asigna un valor, con a,b y c se le asigna 1 para utilizarlos después en el ciclo for,
y a N se le asigna 0.*/
a=1;
b=1;
c=1;
N=0;
/*Este ciclo for contiene otros dos ciclos dentro de él, primero se verifican los valores de c del 1 al 4 mientras a y b son 1,
una vez que se haya completado el ciclo en c se le suma 1 al valor de b y vuelve a iniciar con el ciclo en c hasta que b sea 4,
esto mismo se repite con b y c y cuando acaben se le suma 1 al valor de a, el ciclo acaba cuando el valor de a llegue a 4. La
variable N se utiliza para verificar si el numero actual tiene todos sus digitos diferentes, en el caso de que sea cierto, se
le suma 1 a su valor.*/
for(a=1;a<=4;a++){
for(b=1;b<=4;b++){
for(c=1;c<=4;c++){
if(a!=b&&a!=c&&b!=c){
N++;
System.out.println(""+a+b+c);
}}}}
System.out.println("Cantidad de numeros de 3 digitos cuyos numeros no se repiten: "+N);//Finalmente, se imprime el valor de N.
}}
