package org.example.dataprocessor.OutputType;

import java.io.FileWriter;
import java.io.IOException;

public class TEXT_FILE implements  OutputTypeInterface {
    private static TEXT_FILE textFile = null;

    @Override
    public void Output(double result) throws IOException {
        FileWriter writer = new FileWriter("target/result.txt");
        writer.write("Result = " + String.valueOf(result));
        writer.close();
    }

    public static TEXT_FILE getInstance() {
        if (textFile == null) {
            textFile = new TEXT_FILE();
        }
        return textFile;
    }
}
