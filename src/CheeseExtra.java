package src;

/**
 * Clase CheeseExtra, que extiende SaucerDecorator.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class CheeseExtra extends SaucerDecorator {
    int extra = 100;

    CheeseExtra(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer() {
        super.orderSaucer();
        System.out.println("Agregandole queso, son " + this.extra + "mas");
    }

    @Override
    public String getName() {
        return this.order.getName() + " con queso";
    }

    @Override
    public String getCost() {
        return this.order.getCost() + " + " + Integer.toString(this.extra);
    }
}
