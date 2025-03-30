package src;

/**
 * Clase VeganSaucer, que extinde Saucerdecorator.
 * 

 * 
 * @version 1.0
 */
public class VeganSaucer extends SaucerDecorator {
    int extra = 300;

    /**
     * Constructor de VeganSucer
     * @param order la orden
     */
    VeganSaucer(Order order) {
        super(order);

    }

    @Override
    public void orderSaucer() {
        super.orderSaucer();
        System.out.println("Convirtiendolo a vegano, son " + this.extra + "mas");
    }

    @Override
    public String getName() {
        return this.order.getName() + " vegana";
    }

    @Override
    public String getCost() {
        return this.order.getCost() + " + " + Integer.toString(this.extra);
    }
}
