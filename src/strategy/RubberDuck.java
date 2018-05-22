package strategy;

import strategy.quackBehaviors.QuackBehavior;

public class RubberDuck implements Duck {

    private QuackBehavior quackBehavior;

    public RubberDuck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("Rubber duck says " + quackBehavior.quack());
    }
}
