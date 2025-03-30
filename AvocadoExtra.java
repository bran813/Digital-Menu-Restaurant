package src;
/**
 * Clase AvocadoExtra, que extiende SaucerDecorator.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class AvocadoExtra extends SaucerDecorator {
    int extra = 80;

    AvocadoExtra(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer() {
        super.orderSaucer();
        System.out.println("Agregandole aguacate, son " + this.extra + "mas");
    }

    @Override
    public String getName() {
        return this.order.getName() + " con aguacate";
    }

    @Override
    public String getCost() {
        return this.order.getCost() + " + " + Integer.toString(this.extra);
    }
}
