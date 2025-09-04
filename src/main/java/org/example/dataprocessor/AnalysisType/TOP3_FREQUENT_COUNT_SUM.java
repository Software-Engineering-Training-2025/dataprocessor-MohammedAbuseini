package org.example.dataprocessor.AnalysisType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TOP3_FREQUENT_COUNT_SUM implements AnalysisTypeInterface {
    private static TOP3_FREQUENT_COUNT_SUM top3_frequent_count_sum = null;

    @Override
    public double Analyze(List<Integer> data) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (Integer i: data) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        List<Integer> values = new ArrayList<>();
        for (Integer i: count.keySet()) {
            values.add(count.get(i));
        }
        values.sort(Collections.reverseOrder());
        int frequencies = 0;
        for (int i = 0; i < Math.min(values.size(), 3); i++) {
            frequencies += values.get(i);
        }
        return 0.0 + frequencies;
    }

    public static TOP3_FREQUENT_COUNT_SUM getInstance() {
        if (top3_frequent_count_sum == null) {
            top3_frequent_count_sum = new TOP3_FREQUENT_COUNT_SUM();
        }
        return top3_frequent_count_sum;
    }
}
