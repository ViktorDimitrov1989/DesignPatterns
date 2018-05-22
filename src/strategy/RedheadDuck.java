package strategy;

import strategy.quackBehaviors.QuackBehavior;

public class RedheadDuck implements Duck {

    private QuackBehavior quackBehavior;

    public RedheadDuck(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("Redhead says: " + quackBehavior.quack());
    }
}
