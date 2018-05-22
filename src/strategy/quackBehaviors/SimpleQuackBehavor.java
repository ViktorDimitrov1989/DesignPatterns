package strategy.quackBehaviors;

public class SimpleQuackBehavor implements QuackBehavior {

    public SimpleQuackBehavor() {
    }

    @Override
    public String quack() {
        return "SimpleQuack";
    }
}
