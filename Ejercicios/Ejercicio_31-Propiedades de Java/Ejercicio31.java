//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 20/02/2019
//Hora: 22:00
//La clase Ejercicio31 implementa una aplicación que encuentra e imprime determinadas funciones de java.
class Ejercicio31{
public static void main(String[]args){/*Se crea el método main y se le asignan los atributos de modificador de acceso,
valores de retorno y argumentos.*/
System.out.println("Version de Java: " + System.getProperty("java.version"));/*Se utiliza System.out.prinln para imprimir en pantalla y se
pone System.getProperty para mostrar la propiedad de sistema indicada, que en este caso es la versión actual de Java.*/
System.out.println("Version de Java Runtime: " + System.getProperty("java.runtime.version"));/*Se realiza lo mismo para la versión de Java
Runtime.*/
System.out.println("Home de Java: " + System.getProperty("java.home"));//Se hace lo mismo para localizar el home de java.
System.out.println("Vendedor de Java: " + System.getProperty("java.vendor"));//Se repite el método para mostrar el vendedor de Java.
System.out.println("URL de vendedor de Java: " + System.getProperty("java.vendor.url"));//Aquí se muestra el URL del vendedor de Java.
System.out.println("Class Path de Java: " + System.getProperty("java.class.path"));//Finalmente, aquí muestra el class path de java.
}}
