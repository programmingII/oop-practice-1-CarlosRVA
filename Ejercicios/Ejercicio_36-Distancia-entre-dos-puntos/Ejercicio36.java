//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 21/02/2019
//Hora: 19:56
import java.util.Scanner;//Se importa la librería scanner para utilizar funciones de entrada de datos.
/*La clase Ejercicio36 implementa una aplicación que captura coordenadas de latitud y longitud de dos puntos determinados, calcula
la distancia entre estos dos puntos y escribe el resultado.*/
class Ejercicio36{
public static void main(String[]args){/*Se crea el metodo main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valor de retorno y argumentos.*/
Scanner P = new Scanner(System.in);//Se crea un nuevo scanner con el nombre de "P".
double x1,y1,x2,y2,r;//Se crean 5 variables de tipo double para poder utilizar decimales 
r=6371.01;//A r se le asigna el valor del radio de la tierra en kilómetros.
/*Se piden las coordenadas de latitud y longitud de ambos puntos con System.out.println y se llama al scanner para almacenar estos valores
dentro de sus respectivas variables.*/
System.out.println("Inserta la latitud de la primera coordenada ");
x1=P.nextDouble();
System.out.println("Inserta la longitud de la primera coordenada ");
y1=P.nextDouble();
System.out.println("Inserta la latitud de la segunda coordenada ");
x2=P.nextDouble();
System.out.println("Inserta la longitud de la segunda coordenada ");
y2=P.nextDouble();
/*Estos valores se convierten del formato actual (Grados,minutos,segundos) a radianes para poder calcular la distancia.*/
x1=Math.toRadians(x1);
y1=Math.toRadians(y1);
x2=Math.toRadians(x2);
y2=Math.toRadians(y2);
System.out.println("La distancia entre los dos puntos insertados es: "+
(r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)))+" km ");
//Se implementa la fórmula y se utilizan las funciones de arco seno, seno y coseno de la librería math para calcular estos valores.
}}
