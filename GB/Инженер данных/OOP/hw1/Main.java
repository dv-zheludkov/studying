package hw1;

public class Main {
    public static void main(String[] args) {
        HotDrink hotTeaSmall = new HotTea("Tea", 99, 180, 80);
        HotDrink hotCoffeeMedium = new HotCoffee("Cappucino", 149, 250, 75);
        HotDrink hotChocolateLarge = new HotChocolate("Chocolate", 199, 380, 70);

        VendingMachine hotDrinksVending = new HotDrinksVendingMachine();

        hotDrinksVending.addProduct(hotTeaSmall);
        hotDrinksVending.addProduct(hotCoffeeMedium);
        hotDrinksVending.addProduct(hotChocolateLarge);

        System.out.println(hotDrinksVending.getProduct("Tea"));
        System.out.println(hotDrinksVending.getProduct("Cappucino"));
        System.out.println(hotDrinksVending.getProduct("Chocolate"));
    }
}