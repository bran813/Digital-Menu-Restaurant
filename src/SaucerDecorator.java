package src;

// Clase decoradora
 public abstract class SaucerDecorator implements Order {
    protected Order order;

    SaucerDecorator(Order order){
        this.order = order;
    }

    public void orderSaucer(){
        this.order.orderSaucer();
    }

}
