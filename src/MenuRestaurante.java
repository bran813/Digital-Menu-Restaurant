package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurante {
    private List<Saucer> saucers;
    private List<Order> pedidos;
    private Scanner scanner;

    MenuRestaurante(){
        this.saucers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.pedidos = new ArrayList<>();

        this.initializeMenu();
    }

    public void initializeMenu(){
        Saucer salads = new Saucer("Ensalada César", 400);
        Saucer salads2 = new Saucer("Ensalada de Surimi", 410);
        Saucer salads3 = new Saucer("Ensalada Rusa", 415);
        Saucer vegetableSoup = new Saucer("Sopa de Verduras", 350);
        Saucer bolognesaSoup = new Saucer("Pasta a la boloñesa", 380);
        Saucer chipotleSoup = new Saucer("Pasta al chipotle", 370);
        Saucer aztecSoup = new Saucer("Sopa Azteca", 550);

        this.saucers.add(salads);
        this.saucers.add(salads2);
        this.saucers.add(salads3);
        this.saucers.add(vegetableSoup);
        this.saucers.add(bolognesaSoup);
        this.saucers.add(chipotleSoup);
        this.saucers.add(aztecSoup);
    }

    public void mostrarMenu() {
        boolean seguirComprando = true;
        System.out.println("-----------------------------------------------------------");
        System.out.println("                    Menú: Restaurante EL Puyol                   ");
        System.out.println("-----------------------------------------------------------\n");

        while (seguirComprando) {
            for (int i = 0; i < saucers.size(); i++) {
                if (i == 0){
                    System.out.println("------ Ensaladas ------ \n");
                }
                else if (i == 3){
                    System.out.println("------ Platos Fuertes ------ \n");
                }
                System.out.println((i + 1) + ". " + saucers.get(i).getName() + " $" + saucers.get(i).getCost());
            }
            System.out.println((saucers.size() + 1) + ".  Terminar.");

            System.out.print("Ingresa el número de la opción que desees: ");
            int opcion_platillo = scanner.nextInt();

            if (opcion_platillo == saucers.size() + 1) {
                seguirComprando = false; // Finaliza el pedido.
            } else if (opcion_platillo < 1 || opcion_platillo > saucers.size()) {
                System.out.println("Opción inválida. Por favor, ingresa un número válido.");
            } else{
                Saucer platillo_escogido = saucers.get(opcion_platillo - 1);
                Order orden_escogida = platillo_escogido;

                System.out.println("¿Deseas que tu " + platillo_escogido.getName() + " sea:");
                System.out.println("1. Vegana (cuesta 300 más)");
                System.out.println("2. Vegetariana (cuesta 400 más)");
                System.out.println("3. Sin gluten (cuesta 500 más)");
                System.out.println("4. Ninguno");
                System.out.print("Ingresa el número de la opción que desees: ");
                int opcion_estilo = scanner.nextInt();

                if(opcion_estilo == 1){
                    orden_escogida = new VeganSaucer(orden_escogida);
                }
                if(opcion_estilo == 2){
                    orden_escogida = new VegetarianSaucer(orden_escogida);
                }
                if(opcion_estilo == 3){
                    orden_escogida = new GlutenFreeSaucer(orden_escogida);
                }

                System.out.println("¿Deseas agregar un extra?");
                System.out.println("1. Aguacate (cuesta 80 más)");
                System.out.println("2. Queso (cuesta 100 más)");
                System.out.println("3. Limones (cuesta 95 más)");
                System.out.println("4. No");
                System.out.print("Ingresa el número de la opción que desees: ");
                int opcion_extra = scanner.nextInt();

                if(opcion_extra == 1){
                    orden_escogida = new AvocadoExtra(orden_escogida);
                }
                if(opcion_extra == 2){
                    orden_escogida = new CheeseExtra(orden_escogida);
                }
                if(opcion_extra == 3){
                    orden_escogida = new LemonsExtra(orden_escogida);
                }
                pedidos.add(orden_escogida);
            }
        }
        mostrarResumenPedido();
    }

    private void mostrarResumenPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("No has seleccionado ningún platillo.");
        } else {
            double total = 0;
            System.out.println("-----------------------------------------------------------");
            System.out.println("Resumen del pedido:");
            for (Order order : pedidos) {
                System.out.println("- Pedido realizado " + order.getName());
                System.out.println("- Suma de precios $" + order.getCost());

                String[] costos = order.getCost().split("\\+");

                total += 0;
                for (String num : costos) {
                    total += Integer.parseInt(num.trim()); // Convert to integer after trimming spaces
                }
            }
            System.out.println("Número de productos: " + pedidos.size());
            System.out.println("Total: $" + total);
        }
    }

}
