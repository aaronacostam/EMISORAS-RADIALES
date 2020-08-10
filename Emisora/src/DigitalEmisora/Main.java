package DigitalEmisora;

import  java.util.Scanner ;

public class Main {
public static void main(String[] args) {
    	
    	SintonizadorEmisorasFM radio = new SintonizadorEmisorasFM();
        radio.setMHz(80);
        try (Scanner in = new Scanner (System.in)) {
			int FM;
			do {
				System.out.println("MENÚ");
				System.out.println("-----------------");
			    System.out.println("1. Subir MHz");
			    System.out.println("2. Bajar Mhz");
			    System.out.println("3. Mostrar MHz");
			    System.out.println("4. Salir");
			    System.out.print("\n Digite una opcion a realizar: ");FM = in.nextInt();
			    switch(FM){
			        case 1: System.out.println("\nLa frecuencia subira en 0.5 MHz"); radio.up(); radio.controlador(); break;
			        case 2: System.out.println("\nLa frecuencia bajara en 0.5 MHz");radio.down(); radio.controlador(); break;
			        case 3: System.out.println("\nLa frecuencia actual es de: " + radio.display() + "MHz"); break;
			        case 4: break;
			        default : System.out.println("Opcion no reconocida, siga participando.");
			    }
			    
			} while(FM != 4);
		}
    }
    
}