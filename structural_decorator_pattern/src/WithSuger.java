public class WithSuger extends CoffeeDecorator{


    public WithSuger(Coffee coffee){

        super(coffee);
    }
    public String getDescription(){
        return coffee.getDescription() + ", Suger";
    }
    public double cost(){
        return coffee.cost()+ 1.23 ;
    }
}
