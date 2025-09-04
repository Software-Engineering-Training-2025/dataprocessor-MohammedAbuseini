package org.example.dataprocessor.AnalysisType;

import java.util.Collections;
import java.util.List;

public class MEDIAN implements AnalysisTypeInterface {
    private static MEDIAN median = null;

    @Override
    public double Analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        Collections.sort(data);
        double median = data.get(data.size() / 2) + data.get((data.size() - 1) / 2);
        return median / 2;
    }

    public static MEDIAN getInstance() {
        if (median == null) {
            median = new MEDIAN();
        }
        return median;
    }
}
