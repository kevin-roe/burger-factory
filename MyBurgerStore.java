public class MyBurgerStore extends BurgerStore {
    @Override
    protected Burger makeBurger(BurgerType type) {
        // TODO: Create Burger Classes and init them here based on Burger Type

        throw new IllegalArgumentException("Unknown burger: " + type);
    }
}
