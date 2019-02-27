//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 26/02/2019
//Hora: 12:33
class Ejercicio50{
public static void main(String[]args){
System.out.println("Divisibles entre 3: ");
for(int x=1;x<=100;x++){
if(x%3==0){
System.out.print(x+", ");
}}
System.out.println("\n\nDivisibles entre 5: ");
for(int x=1;x<=100;x++){
if(x%5==0){
System.out.print(x+", ");
}}
System.out.println("\n\nDivisibles entre 3 y 5: ");
for(int x=1;x<=100;x++){
if(x%3==0&&x%5==0){
System.out.print(x+", ");
}}
}}
