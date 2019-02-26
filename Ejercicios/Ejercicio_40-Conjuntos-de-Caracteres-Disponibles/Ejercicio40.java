//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 21:23
import java.nio.charset.Charset;
class Ejercicio40{
public static void main(String[]args){
System.out.println("Los conjuntos caracteres que se tienen disponibles son: ");
for (String S : Charset.availableCharsets().keySet()){
System.out.println(S);
}}}