package org.example.dataprocessor.AnalysisType;

import org.example.dataprocessor.enums.AnalysisType;

import java.util.List;

public class AnalyzingProcess {
    public static Double Analyzing(AnalysisType analysisType, List<Integer> data) {
        if (analysisType == AnalysisType.MEAN) {
            return MEAN.getInstance().Analyze(data);
        } else if (analysisType == AnalysisType.MEDIAN) {
            return MEDIAN.getInstance().Analyze(data);
        } else if (analysisType == AnalysisType.STD_DEV) {
            return STD_DEV.getInstance().Analyze(data);
        } else if (analysisType == AnalysisType.P90_NEAREST_RANK) {
            return P90_NEAREST_RANK.getInstance().Analyze(data);
        } else if (analysisType == AnalysisType.TOP3_FREQUENT_COUNT_SUM) {
            return TOP3_FREQUENT_COUNT_SUM.getInstance().Analyze(data);
        } else throw new UnsupportedOperationException("Analysis type not implemented yet");
    }
}
