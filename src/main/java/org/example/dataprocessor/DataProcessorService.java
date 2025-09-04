package org.example.dataprocessor;

import org.example.dataprocessor.AnalysisType.AnalyzingProcess;
import org.example.dataprocessor.CleaningType.CleaningProcess;
import org.example.dataprocessor.OutputType.OutputProcess;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

import java.util.*;
import static java.sql.Types.NULL;
import static org.example.dataprocessor.AnalysisType.AnalyzingProcess.Analyzing;

/**
 * Students ONLY implement the process(...) method below.
 *
 * Requirements:
 * - Order: Clean -> Analyze -> Output -> Return result
 * - Do NOT mutate the original input list
 * - Handle empties as specified in AnalysisType docs
 * - Output format EXACTLY: "Result = <value>"
 * - TEXT_FILE path: target/result.txt (create parent dirs, overwrite file)
 */
public class DataProcessorService {

    /**
     * Implement this method.
     */
    public Double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {

        List<Integer> cleanedData = new ArrayList<>(data);
        CleaningProcess.Cleaning(cleaningType, cleanedData);
        Double result = AnalyzingProcess.Analyzing(analysisType, cleanedData);
        OutputProcess.Outputting(outputType, result);
        return result;
    }
}

