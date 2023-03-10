package challenge.composition;

public class SmartKitchen {

    CoffeeMaker coffeeMaker;
    DishWasher dishWasher;
    Refrigerator fridge;

    public SmartKitchen() {
        coffeeMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        fridge = new Refrigerator();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public void setKitchenState(boolean coffeeFlag, boolean dishWasherFlag, boolean fridgeFlag) {
        coffeeMaker.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        fridge.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork() {
        coffeeMaker.brewCoffee();
        dishWasher.doDishes();
        fridge.orderFood();

    }
}
