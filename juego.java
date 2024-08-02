package com.generation;

import java.util.Scanner; // Importar Scanner

public class Codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Se debe pasar System.in al Scanner

        // Obtener la entrada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase(); // Convertir a minúsculas para evitar errores de entrada

        // Obtener la entrada del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase(); // Convertir a minúsculas para evitar errores de entrada

        // Verificar si las entradas son válidas
        if (!esOpcionValida(j1) || !esOpcionValida(j2)) {
            System.out.println("Entrada inválida. Usa piedra, papel o tijeras.");
            return; // Terminar el programa si la entrada es inválida
        }

        // Comparar las entradas de los jugadores
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = determinarGanador(j1, j2);
            System.out.println("Gana el jugador " + g);
        }

        s.close(); // Cerrar el Scanner
    }

    // Método para verificar si la opción es válida
    private static boolean esOpcionValida(String opcion) {
        return opcion.equals("piedra") || opcion.equals("papel") || opcion.equals("tijeras");
    }

    // Método para determinar el ganador
    private static int determinarGanador(String j1, String j2) {
        int g = 2; // Por defecto, gana el jugador 2
        switch (j1) {
            case "piedra":
                if (j2.equals("tijeras")) {
                    g = 1; // Jugador 1 gana
                }
                break; // Agregar break para evitar continuar en otros casos
            case "papel":
                if (j2.equals("piedra")) {
                    g = 1; // Jugador 1 gana
                }
                break;
            case "tijeras":
                if (j2.equals("papel")) {
                    g = 1; // Jugador 1 gana
                }
                break;
            default:
                break; // No es necesario, pero ayuda a la claridad
        }
        return g;
    }
}
