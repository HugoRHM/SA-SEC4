package com.generation;
import java.util.Scanner;

public class Codigo4 {
	// Se importa el scanner
	//Se agrega system.in en el scanner
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();
        
        //Se cambia el parametro de igual igual en el if 
        int g = 0; 
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1; 
                    }
                    break;
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1; 
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1; 
                    }
                    break;
                default:
                    System.out.println("Opcion no valida: " + j1);
                    return; 
            }
            if (g == 1) {
                System.out.println("Gana jugador 1");
            } else {
                System.out.println("Gana jugador 2");
            }
        }
    }
}
