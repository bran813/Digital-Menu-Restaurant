package src;

public class VeganSaucer extends SaucerDecorator {
    int extra = 300;

    VeganSaucer(Order order) {
        super(order);

    }

    @Override
    public void orderSaucer(){
        super.orderSaucer();
        System.out.println("Convirtiéndolo a vegano, son " + this.extra + "más" );
    }

    @Override
    public String getName() {
        return this.order.getName() + " vegana";
    }

    @Override
    public String getCost() {
        return this.order.getCost()  + " + " + Integer.toString(this.extra);
    }
}
