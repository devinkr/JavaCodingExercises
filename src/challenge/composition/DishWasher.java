package challenge.composition;

public class DishWasher {
    private boolean hasWorkToDo;

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing the dishes");
            hasWorkToDo = false;
        }

    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;

    }
}
