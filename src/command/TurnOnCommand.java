package command;

public class TurnOnCommand implements ICommand {

    private Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.onAction();
    }

}
