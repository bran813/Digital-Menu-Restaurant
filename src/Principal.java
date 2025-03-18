package src;

import java.io.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream fileOut = new PrintStream(new File("output.txt"));

        MultiPrintStream multiOut = new MultiPrintStream(System.out, fileOut);
        System.setOut(multiOut);

        Scanner scanner = new Scanner(System.in);
        Menu menu;

        System.out.println("Seleccione un menú:");
        System.out.println("1. Restaurante");
        System.out.println("2. Heladería");

        int option = scanner.nextInt();
        if (option == 1) {
            menu = new MenuRestaurante();
        } else if (option == 2) {
            menu = new MenuHeladosAdapter(new MenuHelados());
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        menu.showMenu();
    }
}





