package strategy.quackBehaviors;

public class NoQuackBehavor implements QuackBehavior {

    public NoQuackBehavor() {
    }

    @Override
    public String quack() {
        return "NoQuack";
    }
}
