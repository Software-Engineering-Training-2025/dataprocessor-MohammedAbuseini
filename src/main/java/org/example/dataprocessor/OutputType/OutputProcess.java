package org.example.dataprocessor.OutputType;

import org.example.dataprocessor.enums.OutputType;

import java.io.IOException;

public class OutputProcess {
    public static void Outputting(OutputType outputType, double result) throws IOException {
        if (outputType == OutputType.CONSOLE) {
            CONSOLE.getInstance().Output(result);
        } else if (outputType == OutputType.TEXT_FILE) {
            TEXT_FILE.getInstance().Output(result);
        } else throw new UnsupportedOperationException("Output type not implemented yet");
    }
}
