//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 22/02/2019
//Hora: 10:44
class Ejercicio39{
public static void main(String[]args){
int a,b,c,N;
a=1;
b=1;
c=1;
N=0;
for(a=1;a<=4;a++){
for(b=1;b<=4;b++){
for(c=1;c<=4;c++){
if(a!=b&&a!=c&&b!=c){
N++;
System.out.println(""+a+b+c);
}}}}
System.out.println("Cantidad de numeros de 3 digitos cuyos numeros no se repiten: "+N);
}}