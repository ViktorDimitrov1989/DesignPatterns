package decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2() {
    }

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public String methodA() {
        return super.getComponent().methodA() + "ConcreteDecorator2 methodA()";
    }

    @Override
    public String methodB() {
        return super.getComponent().methodB() + "ConcreteDecorator2 methodB()";
    }
}
