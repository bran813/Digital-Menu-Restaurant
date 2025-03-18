package src;

/**
 * Interfaz Order. Donde se estructura cada orden.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
interface Order {
    void orderSaucer();

    String getName();

    String getCost();
}

/**
 * Clase Saucer. Implementa Order. Se encarga de los aditivos.
 */
public class Saucer implements Order {
    int cost;
    String name;

    /**
     * Constructur de aditivos.
     * @param name nombre
     * @param cost costo
     */
    Saucer(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Método donde se establece el nombre.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Método donde se establece el costo.
     */
    public String getCost() {
        return Integer.toString(this.cost);
    }

    /**
     * Método void setCost. Establece el precio
     * @param newCost el nuevo costo
     */
    public void setCost(int newCost) {
        this.cost = newCost;
    }

    /**
     * Método void orderSaucer. Donde se ordena el platillo
     */
    public void orderSaucer() {
        System.out.println("Ordenando platillo " + this.name + "con precio " + this.cost);
    }
}
