package command;

public class TurnOffCommand implements ICommand {

    private Receiver receiver;

    public TurnOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.offAction();
    }

}
