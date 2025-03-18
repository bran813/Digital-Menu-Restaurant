package src;

/**
 * Clase LemonsExtra, que extiende SaucerDecorator.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class LemonsExtra extends SaucerDecorator {
    int extra = 95;

    LemonsExtra(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer() {
        super.orderSaucer();
        System.out.println("Agregandole limones, son " + this.extra + "mas");
    }

    @Override
    public String getName() {
        return this.order.getName() + " con limones";
    }

    @Override
    public String getCost() {
        return this.order.getCost() + " + " + Integer.toString(this.extra);
    }

}
