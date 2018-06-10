package decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1() {
    }

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public String methodA() {
        return super.getComponent().methodA() + "ConcreteDecorator1 methodA()";
    }

    @Override
    public String methodB() {
        return super.getComponent().methodB() + "ConcreteDecorator1 methodB()";
    }
}
