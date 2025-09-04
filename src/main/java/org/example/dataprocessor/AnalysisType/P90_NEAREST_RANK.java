package org.example.dataprocessor.AnalysisType;

import java.util.Collections;
import java.util.List;

public class P90_NEAREST_RANK implements AnalysisTypeInterface {
    private static P90_NEAREST_RANK p90_nearest_rank = null;

    @Override
    public double Analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        Collections.sort(data);
        int position = (data.size() * 9 + 9) / 10;
        return 0.0 + data.get(position - 1);
    }

    public static  P90_NEAREST_RANK getInstance() {
        if (p90_nearest_rank == null) {
            p90_nearest_rank = new P90_NEAREST_RANK();
        }
        return p90_nearest_rank;
    }
}
