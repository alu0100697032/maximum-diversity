/*
 * Víctor Hernández Pérez
 * alu0100697032@ull.edu.es
 * Grado en ingeniería informática
 * Tercero 
 * Itinerario: Computación
 */
package global;

import clases.RamificacionPoda;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InputFileReader reader = new InputFileReader("src/files/max_div_15_2.txt");
	    RamificacionPoda rp = new RamificacionPoda("src/files/max_div_30_3.txt");
	    //rp.mostrarDatos();
	    System.out.println();
	    //GREEDY
	    System.out.println("GREEDY");
	    rp.greedy(5);
	    //GREEDY PROPUESTO
	    System.out.println("GREEDY PROPUESTO");
	    rp.greedyOwn(5);
	    //GRASP
	    System.out.println("GRASP");
	    rp.grasp(5, 3);
	    //RAMIFICACION Y PODA
	    System.out.println("Ramificacion y poda");
	    rp.ramificacionPoda(2, rp.greedy(2));
	}

}
