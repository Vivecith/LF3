public class CommandStretch implements ICommandUndo{
    private double width;
    private double height;

    public CommandStretch(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void undo() {
        System.out.println(IO.Colours.Templates.RED("Bild ist wieder normal!"));
    }

    @Override
    public void execute() {
        System.out.println(IO.Colours.Templates.RED("Bild wurde um "+height+"% in die Höhe und um "+width+"% in die Länge gestreckt!"));
    }
}
