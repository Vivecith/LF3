public class CommandWasserMarsch implements ICommand{
    @Override
    public void execute() {
        System.out.println(
                IO.Colours.Templates.BLUE("Wasser Marsch!")
        );
    }
}
