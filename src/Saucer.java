package src;

interface Order {
    void orderSaucer();
    String getName();
    String getCost();
}

public class Saucer implements Order{
    int cost;
    String name;

    Saucer(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public String getName(){ return this.name;}

    public String getCost(){ return Integer.toString(this.cost);}

    public void setCost(int newCost){
        this.cost = newCost;
    }

    public void orderSaucer(){
        System.out.println("Ordenando platillo " + this.name + "con precio " + this.cost);
    }
}





