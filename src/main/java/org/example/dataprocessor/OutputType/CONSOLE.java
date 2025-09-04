package org.example.dataprocessor.OutputType;

public class CONSOLE implements OutputTypeInterface {
    private static CONSOLE console = null;

    @Override
    public void Output(double result) {
        System.out.println(result);
    }

    public static CONSOLE getInstance() {
        if (console == null) {
            console = new CONSOLE();
        }
        return console;
    }
}
