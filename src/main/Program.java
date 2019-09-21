package main;

import java.util.ArrayList;
import clases.cifo.com.Empleado;

/**
 * 
 * Programa para probar la clase Empleado
 * 
 * @author Rubèn Nieto
 *
 */
public class Program {

	/**
	 * Entrada al programa.
	 * @param args son los argumentos pasados.
	 */
	public static void main(String[] args) {
		Empleado uno = new Empleado("Empleado1", "11111111A");
		Empleado dos = new Empleado("Empleado2", "22222222B");
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		uno.setSueldo(1000.0);
		dos.setSueldo(2000.0);
		
		empleados.add(uno);
		empleados.add(dos);
		
		Empleado tres = new Empleado("Empleado3", "33333333C");
		tres.setSueldo(3000.0);
		
		Empleado cuatro = new Empleado("Empleado4", "444444444D");
		cuatro.setSueldo(4000.0);
		
		empleados.add(tres);
		empleados.add(cuatro);
		
		for (int e = 0; e < empleados.size(); e++) {
			Empleado empleado = empleados.get(e);
			System.out.println("|Empleado " + (e+1) + " = ");
			System.out.println("|- Nombre: " + empleado.getNombre());
			System.out.println("|- DNI: " + empleado.getDNI());
			System.out.println("|- Sueldo: " + empleado.getSueldo() + " (Neto : " + empleado.sueldoNeto() + ")\n");
		}
	}

}
