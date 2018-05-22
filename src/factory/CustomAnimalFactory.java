package factory;

public class CustomAnimalFactory implements IAnimalFactory {

    public Animal createAnimal(){
        return new Cat();
    }


}
