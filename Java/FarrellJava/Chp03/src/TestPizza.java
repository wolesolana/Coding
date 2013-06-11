public class TestPizza {
    public static void main(String[] args){
        Pizza firstPizza = new Pizza();

        firstPizza.setPizzaToppings("Mushroom and Pepperoni");
        firstPizza.setPizzaDiameter(30);
        firstPizza.setPizzaPrice(34.95);

        System.out.println("Your " + firstPizza.getPizzaDiameter()
                + " inches diameter Pizza costs " + firstPizza.getPizzaPrice()
                + " rands with " + firstPizza.getPizzaToppings() + " toppings.");


    }
}
