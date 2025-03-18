package src;

public class VegetarianSaucer extends SaucerDecorator {
    int extra = 400;

    VegetarianSaucer(Order order) {
        super(order);
    }

    @Override
    public void orderSaucer(){
        super.orderSaucer();
        System.out.println("Convirtiéndolo a vegetariano, son " + this.extra + "más" );
    }

    @Override
    public String getName() {
        return this.order.getName() + " con vegetariana";
    }

    @Override
    public String getCost() {
        return this.order.getCost()  + " + " + Integer.toString(this.extra);
    }
}
