public class MyBurgerStore extends BurgerStore {
    @Override
    protected Burger makeBurger(BurgerType type) {
        // Burger Factory here!

        throw new IllegalArgumentException("Unknown burger: " + type);
    }
}
