package src;

/**
 * Clase VegetarianSaucer, que extiende SaucerDecorator.
 * 

 * 
 * @version 1.0
 */
public class VegetarianSaucer extends SaucerDecorator {
    int extra = 400;

    /**
     * Constructor de VegetarianSucer
     * @param order la orden
     */
    VegetarianSaucer(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer() {
        super.orderSaucer();
        System.out.println("Convirtiendolo a vegetariano, son " + this.extra + "mas");
    }

    @Override
    public String getName() {
        return this.order.getName() + " con vegetariana";
    }

    @Override
    public String getCost() {
        return this.order.getCost() + " + " + Integer.toString(this.extra);
    }
}
