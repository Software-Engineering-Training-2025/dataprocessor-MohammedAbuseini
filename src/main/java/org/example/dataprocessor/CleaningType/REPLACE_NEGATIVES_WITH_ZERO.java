package org.example.dataprocessor.CleaningType;

import java.util.List;

public class REPLACE_NEGATIVES_WITH_ZERO implements CleaningTypeInterface {
    private static REPLACE_NEGATIVES_WITH_ZERO replace_negatives_with_zero = null;

    @Override
    public void Clean(List<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < 0) {
                data.set(i, 0);
            }
        }
    }

    public static REPLACE_NEGATIVES_WITH_ZERO getInstance() {
        if (replace_negatives_with_zero == null) {
            replace_negatives_with_zero = new REPLACE_NEGATIVES_WITH_ZERO();
        }
        return replace_negatives_with_zero;
    }
}
