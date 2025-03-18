package src;

public class AvocadoExtra extends SaucerDecorator {
    int extra = 80;

    AvocadoExtra(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer(){
        super.orderSaucer();
        System.out.println("Agregándole aguacate, son " + this.extra + "más" );
    }

    @Override
    public String getName() {
        return this.order.getName() + " con aguacate";
    }

    @Override
    public String getCost() {
        return this.order.getCost()  + " + " + Integer.toString(this.extra);
    }
}
