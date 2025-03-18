package src;

public class GlutenFreeSaucer extends SaucerDecorator {
    int extra = 500;

    GlutenFreeSaucer(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer(){
        super.orderSaucer();
        System.out.println("Convirtiéndolo a libre de gluten, son " + this.extra + "más" );
    }

    @Override
    public String getName() {
        return this.order.getName() + " libre de gluten";
    }

    @Override
    public String getCost() {
        return this.order.getCost()  + " + " + Integer.toString(this.extra);
    }
}
