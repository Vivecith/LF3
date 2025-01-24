import java.util.Stack;

public class Programm {
    private static Stack<ICommandUndo> befehle = new Stack<ICommandUndo>();

    public static void doWork() {
        ICommandUndo commandZoom = new CommandZoom(50.0);
        commandZoom.execute();
        befehle.push(commandZoom);

        ICommandUndo commandStretch = new CommandStretch(20.0, 15.0);
        commandStretch.execute();
        befehle.push(commandStretch);

        CommandSave commandSave = new CommandSave();
        commandSave.execute();

        while (!befehle.isEmpty()) {
            befehle.pop().undo();
        }
    }
}
