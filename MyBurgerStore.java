public class MyBurgerStore extends BurgerStore {
    @Override
    protected Burger makeBurger(String type) {

        // Burger things here!

        throw new IllegalArgumentException("Unknown burger: " + type);
    }
}
