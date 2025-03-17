import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que muestra el menú interactivo de la heladería, permite a los usuarios
 * escoger sus helados.
 */
public class MenuHelados {
    private List<Helado> helados;
    private List<Helado> pedido; // Lista para almacenar los helados comprados.
    private Scanner scanner;

    /**
     * Constructor que inicializa el menú de helados y configura las opciones
     * predeterminadas.
     */
    public MenuHelados() {
        this.helados = new ArrayList<>();
        this.pedido = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        inicializarMenu();
    }

    /**
     * Inicializa el menú, agregando los sabores en existencia para cada tipo de
     * helado que ofrece la heladería.
     */
    private void inicializarMenu() {
        /* Helados sencillos */
        Helado heladoSencillo = new Helado("Helado", 50.0);
        heladoSencillo.agregarSabor("Vainilla");
        heladoSencillo.agregarSabor("Chocolate");
        heladoSencillo.agregarSabor("Fresa");
        heladoSencillo.agregarSabor("Limón");

        /* Helados dobles */
        Helado heladoDoble = new Helado("Helado doble", 80.0);
        heladoDoble.agregarSabor("Vainilla");
        heladoDoble.agregarSabor("Chocolate");
        heladoDoble.agregarSabor("Fresa");
        heladoDoble.agregarSabor("Limón");

        /* Paletas */
        Helado paleta = new Helado("Paleta", 40.0);
        paleta.agregarSabor("Melón");
        paleta.agregarSabor("Sandía");
        paleta.agregarSabor("Fresa");
        paleta.agregarSabor("Limón");

        /* Nieves */
        Helado nieve = new Helado("Nieve", 60.0);
        nieve.agregarSabor("Limón");
        nieve.agregarSabor("Guayaba");
        nieve.agregarSabor("Fresa");
        nieve.agregarSabor("Uva");

        /* Banana Split */
        Helado bananaSplit = new Helado("Banana Split", 100.0);
        bananaSplit.agregarSabor("Vainilla");
        bananaSplit.agregarSabor("Chocolate");
        bananaSplit.agregarSabor("Fresa");

        /* Se agregan los tipos de helados que se ofrecen al menú. */
        helados.add(heladoSencillo);
        helados.add(heladoDoble);
        helados.add(paleta);
        helados.add(nieve);
        helados.add(bananaSplit);
    }

    /**
     * Muestra el menú de helados y genera la orden final.
     */
    public void mostrarMenu() {
        boolean seguirComprando = true; // Bandera para saber cuándo terminar el pedido.
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("                    Heladería Rotsy");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------\n");

        while (seguirComprando) {
            System.out.println("Por favor, selecciona un helado o elije salir:");
            for (int i = 0; i < helados.size(); i++) {
                System.out.println((i + 1) + ". " + helados.get(i));
            }
            // Se muestra la lista de los helados y la última opción es Finalizar el pedido
            System.out.println((helados.size() + 1) + ". Finalizar pedido");

            System.out.print("Ingresa el número de la opción que desees: ");
            int opcion = scanner.nextInt(); // Se guarda la opción que elige el usuario.

            if (opcion == helados.size() + 1) {
                seguirComprando = false; // Finaliza el pedido.
            } else if (opcion < 1 || opcion > helados.size()) {
                System.out.println("Opción inválida. Por favor, ingresa un número válido.");
            } else {
                Helado seleccionado = helados.get(opcion - 1);
                if (seleccionado.getNombre().equals("Banana Split")) {
                    agregarBananaSplit(seleccionado);
                } else {
                    seleccionarSabor(seleccionado);
                }
            }
        }
        mostrarResumenPedido();
    }

    /**
     * Añade el Banana Split al pedido, pero no permite cambiar sabores.
     */
    private void agregarBananaSplit(Helado bananaSplit) {
        System.out.println("Has seleccionado: " + bananaSplit.getNombre());
        System.out.println("Descripción: " + String.join(", ", bananaSplit.getSabores()));
        System.out.println("Precio: $" + bananaSplit.getPrecio());
        pedido.add(bananaSplit);
    }

    /**
     * Muestra los sabores disponibles de los helados (excepto para el Banana
     * Split).
     */
    private void seleccionarSabor(Helado helado) {
        System.out.println("Has seleccionado: " + helado.getNombre() + "\n");
        System.out.println("Sabores disponibles:");

        List<String> sabores = helado.getSabores();
        for (int i = 0; i < sabores.size(); i++) {
            System.out.println((i + 1) + ". " + sabores.get(i));
        }

        System.out.print("Selecciona el sabor:");
        int opcionSabor = scanner.nextInt(); // Guarda la opción del sabor que escogió el usuario.

        if (opcionSabor < 1 || opcionSabor > sabores.size()) {
            System.out.println("Opción inválida. No se agregó el helado.");
        } else {
            String saborSeleccionado = sabores.get(opcionSabor - 1);
            System.out.println("Has elegido el sabor: " + saborSeleccionado);
            Helado pedidoConSabor = new Helado(helado.getNombre() + " de " + saborSeleccionado, helado.getPrecio());
            pedido.add(pedidoConSabor);
        }
    }

    /**
     * Muestra el resumen del pedido con el total a pagar.
     */
    private void mostrarResumenPedido() {
        if (pedido.isEmpty()) {
            System.out.println("No has seleccionado ningún helado.");
        } else {
            double total = 0;
            System.out.println("-----------------------------------------------------------");
            System.out.println("Resumen del pedido:");
            for (Helado helado : pedido) {
                System.out.println("- " + helado.getNombre() + " | $" + helado.getPrecio());
                total += helado.getPrecio();
            }
            System.out.println("Número de productos: " + pedido.size());
            System.out.println("Total: $" + total);
            System.out.println("¡Gracias por tu compra! ¡Regresa pronto!");
        }
    }
}