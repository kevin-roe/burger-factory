public abstract class BurgerStore {
    public Burger orderBurger(BurgerType type) {
        Burger burger = makeBurger(type);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    abstract Burger makeBurger(BurgerType type);
}
