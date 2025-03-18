package src;

public class CheeseExtra extends SaucerDecorator {
    int extra = 100;

    CheeseExtra(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer() {
        super.orderSaucer();
        System.out.println("Agregándole queso, son " + this.extra + "más");
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
