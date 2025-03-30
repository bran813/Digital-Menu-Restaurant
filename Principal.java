package src;

import java.io.*;
import java.util.Scanner;

/**
 * Clase Principal, es donde se corre el código.
 * 

 * 
 * @version 1.0
 */
public class Principal {
    /**
     * Método main, donde se crea el menú
     * 
     * @param args
     * @throws FileNotFoundException un exception
     */
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream fileOut = new PrintStream(new File("output.txt"));

        MultiPrintStream multiOut = new MultiPrintStream(System.out, fileOut);
        System.setOut(multiOut);

        Scanner scanner = new Scanner(System.in);
        Menu menu;

        System.out.println("Seleccione un menu:");
        System.out.println("1. Restaurante");
        System.out.println("2. Heladeria");

        int option = scanner.nextInt();
        if (option == 1) {
            menu = new MenuRestaurante();
        } else if (option == 2) {
            menu = new MenuHeladosAdapter(new MenuHelados());
        } else {
            System.out.println("Opcion no valida.");
            return;
        }

        menu.showMenu();
    }
}
