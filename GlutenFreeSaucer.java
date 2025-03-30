package src;

/**
 * Clase GlutenFreeSaucer, que extiende SaucerDecorator.
 * 
 * @author Emilio Durán Tapia
 * @author Alan Blancas Ochoa
 * @author Brandon Zamorano Baños
 * 
 * @version 1.0
 */
public class GlutenFreeSaucer extends SaucerDecorator {
    int extra = 500;

    GlutenFreeSaucer(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer() {
        super.orderSaucer();
        System.out.println("Convirtiendolo a libre de gluten, son " + this.extra + "mas");
    }

    @Override
    public String getName() {
        return this.order.getName() + " libre de gluten";
    }

    @Override
    public String getCost() {
        return this.order.getCost() + " + " + Integer.toString(this.extra);
    }
}
