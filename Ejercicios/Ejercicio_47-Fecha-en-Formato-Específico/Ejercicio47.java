//Nombre: Villanueva Aguilar Carlos Raymundo 
//Día: 25/02/2019
//Hora: 22:22
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
class Ejercicio47{
public static void main(String args[]) {
SimpleDateFormat Formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
Formato.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
System.out.println("La fecha es: "+Formato.format(System.currentTimeMillis()));
}}