package src;

/**
 * Clase abstracta SauceDecorator, que implementa Order.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
// Clase decoradora
public abstract class SaucerDecorator implements Order {
    protected Order order;

    /**
     * Constructor de SauceDecorator
     * @param order la orden
     */
    SaucerDecorator(Order order) {
        this.order = order;
    }

    /**
     * Método void orderSaucer.
     */
    public void orderSaucer() {
        this.order.orderSaucer();
    }

}
