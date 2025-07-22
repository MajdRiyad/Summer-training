public class WithMilk extends CoffeeDecorator {


    public WithMilk(Coffee coffee) {
       super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", with milk";
    }
    public double cost() {
        return coffee.cost() + 0.50;
    }
}
