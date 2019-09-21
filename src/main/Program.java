package main;

import java.util.ArrayList;

/**
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
		Empleado uno = new Empleado();
		Empleado dos = new Empleado("Rubèn", "12345678X");
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		
		uno.setSueldo(1000.0);
		dos.setSueldo(1001.0);
		
		empleados.add(uno);
		empleados.add(dos);
		
		Empleado tres = new Empleado();
		tres.setNombre("Tercer empleado");
		tres.setDNI("33333333C");
		tres.setSueldo(3333.3);
		
		empleados.add(tres);
		
		for (int e = 0; e < empleados.size(); e++) {
			Empleado empleado = empleados.get(e);
			System.out.println("|Empleado " + (e+1) + " = ");
			System.out.println("|- Nombre: " + empleado.getNombre());
			System.out.println("|- DNI: " + empleado.getDNI());
			System.out.println("|- Sueldo: " + empleado.getSueldo() + "(Neto : " + empleado.sueldoNeto() + ")\n");
		}
	}

}
