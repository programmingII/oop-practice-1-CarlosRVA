//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 19:56
import java.util.Scanner;
class Ejercicio36{
public static void main(String[]args){
Scanner P = new Scanner(System.in);
double x1,y1,x2,y2,r;
r=6371.01;
System.out.println("Inserta la latitud de la primera coordenada ");
x1=P.nextDouble();
System.out.println("Inserta la longitud de la primera coordenada ");
y1=P.nextDouble();
System.out.println("Inserta la latitud de la segunda coordenada ");
x2=P.nextDouble();
System.out.println("Inserta la longitud de la segunda coordenada ");
y2=P.nextDouble();
x1=Math.toRadians(x1);
y1=Math.toRadians(y1);
x2=Math.toRadians(x2);
y2=Math.toRadians(y2);
System.out.println("La distancia entre los dos puntos insertados es: "+
(r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)))+" km ");
}}