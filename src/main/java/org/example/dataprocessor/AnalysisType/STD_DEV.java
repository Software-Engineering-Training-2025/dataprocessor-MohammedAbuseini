package org.example.dataprocessor.AnalysisType;

import java.util.List;

public class STD_DEV implements AnalysisTypeInterface {
    private static STD_DEV std_dev = null;

    @Override
    public double Analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        double mean = new MEAN().Analyze(data);
        double deviation = 0;
        for (Integer datum : data) {
            double comp = datum - mean;
            deviation += comp * comp;
        }
        deviation /= data.size();
        deviation = Math.sqrt(deviation);
        return deviation;
    }

    public static STD_DEV getInstance() {
        if (std_dev == null) {
            std_dev = new STD_DEV();
        }
        return std_dev;
    }
}
