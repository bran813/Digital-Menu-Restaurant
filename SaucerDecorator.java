package src;

/**
 * Clase abstracta SauceDecorator, que implementa Order.
 * 

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
