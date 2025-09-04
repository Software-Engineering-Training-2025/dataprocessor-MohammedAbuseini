package org.example.dataprocessor.AnalysisType;

import java.util.List;

public class MEAN implements AnalysisTypeInterface {
    private static MEAN mean = null;

    @Override
    public double Analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        double sum = data.stream().mapToDouble(Integer::doubleValue).sum();
        return sum / data.size();
    }

    public static MEAN getInstance() {
        if (mean == null) {
            mean = new MEAN();
        }
        return mean;
    }
}
