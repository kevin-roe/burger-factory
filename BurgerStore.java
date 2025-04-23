public abstract class BurgerStore {
    public Burger orderBurger(String type) {
        Burger burger = makeBurger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    abstract Burger makeBurger(String type);
}
