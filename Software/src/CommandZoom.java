public class CommandZoom implements ICommandUndo{
    private double zoom;

    public CommandZoom(double zoom){
        this.zoom = zoom;
    }

    @Override
    public void undo() {
        System.out.println(IO.Colours.Templates.FALLOUTNV("Zoom zurückgesetzt!"));
    }

    @Override
    public void execute() {
        System.out.println(IO.Colours.Templates.FALLOUTNV("Es wurde um "+zoom+"% gezoomt!"));
    }
}
