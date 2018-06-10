package decorator;

public class ConcreteComponent extends Component {

    public ConcreteComponent() {
    }

    @Override
    public String methodA() {
        return "ConcreteComponent methodA()";
    }

    @Override
    public String methodB() {
        return "ConcreteComponent methodB()";
    }
}
