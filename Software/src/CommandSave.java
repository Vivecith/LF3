public class CommandSave implements ICommand {
    @Override
    public void execute() {
        System.out.println(IO.Colours.Templates.BLUE("Speichern erfolgreich!"));
    }
}
