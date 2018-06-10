package decorator;

public class Main {

    //Decorator -> use composition over inheritance
    public static void main(String[] args) {
        Component mainComponent = new ConcreteComponent();

        mainComponent = new ConcreteDecorator1(mainComponent);
        mainComponent = new ConcreteDecorator2(mainComponent);

        System.out.println(mainComponent.methodA());
    }


}
