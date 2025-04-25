package org.iesvdm.progiva;

import java.util.Scanner;

public class CalcularPrecioFinal {

	Scanner sc = new Scanner(System.in);
	
	public static double introducirBase(Scanner sc) {
		System.out.println("Introduce base");
		double base = sc.nextDouble();
		return base;
	}
	
    public static double introducirIva(Scanner sc) {
        System.out.println("Introduce tipo de IVA (general, reducido o superreducido):");
        String tipoIva = sc.next().toLowerCase();
        switch (tipoIva) {
            case "general":
                return 21.0;
            case "reducido":
                return 10.0;
            case "superreducido":
                return 4.0;
            default:
                System.out.println("Tipo de IVA no válido. Se aplicará el general por defecto.");
                return 21.0;
        }
    }
}