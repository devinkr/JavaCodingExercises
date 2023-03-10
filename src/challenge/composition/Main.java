package challenge.composition;

public class Main {

    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getFridge().setHasWorkToDo(true);
//
//        kitchen.getCoffeeMaker().brewCoffee();
//        kitchen.getDishWasher().doDishes();
//        kitchen.getFridge().orderFood();

        kitchen.setKitchenState(true, true, false);
        kitchen.doKitchenWork();
    }
}
