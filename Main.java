public class Main {
    public static void main(String[] args) {
        BurgerStore store = new MyBurgerStore();

        // TODO: Make some burgers!
        Burger burger = store.orderBurger(BurgerType.IMAGINARY); // huh?
    }
}
