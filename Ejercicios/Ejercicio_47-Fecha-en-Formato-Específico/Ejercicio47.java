//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 22:22
import java.text.SimpleDateFormat;//Se importa la librería SimpleDateFormat, que permite definir patrones para formatos de fecha.
import java.util.Calendar;//Se importa la librería Calendar para implementar un sistema de calendarios.
import java.util.TimeZone;//Se importa la librería Timezone, que crea una zona horaria dependiendo de donde se esté ejecutando el programa.
//La clase Ejercicio47 implementa una aplicación que imprime la fecha del sistema en un formato específico
class Ejercicio47{
public static void main(String args[]) {/*Se crea el método main para poder ejecutar el programa y se le asignan atributos de
disponibilidad de uso, valores de retorno y argumentos.*/
SimpleDateFormat Formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");//Se crea un nuevo formato de fecha para usarlo después.
Formato.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));//Se consigue la zona horaria del sistema con la clase Calendar.
System.out.println("La fecha es: "+Formato.format(System.currentTimeMillis()));/*Finalmente se imprime la fecha y hora actual del sistema
en el formato específicado con Año/Mes/Día y Horas/Minutos/Segundos/Milisegundos.*/
}}
