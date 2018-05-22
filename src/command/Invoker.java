package command;

public class Invoker {

    private ICommand offCommand;

    private ICommand onCommand;

    public Invoker(ICommand command, ICommand onCommand) {
        this.offCommand = command;
        this.onCommand = onCommand;
    }

    public void turnOn(){
        this.onCommand.execute();
    }

    public void turnOff(){
        this.offCommand.execute();
    }

}
