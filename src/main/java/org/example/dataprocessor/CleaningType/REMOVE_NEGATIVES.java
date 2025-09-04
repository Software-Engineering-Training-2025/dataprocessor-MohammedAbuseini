package org.example.dataprocessor.CleaningType;

import java.util.List;

public class REMOVE_NEGATIVES implements CleaningTypeInterface {
    private static REMOVE_NEGATIVES remove_negatives = null;

    @Override
    public void Clean(List<Integer> data) {
        int i = 0;
        while (i < data.size()) {
            if (data.get(i) < 0) {
                data.set(i, data.getLast());
                data.removeLast();
            } else i++;
        }
    }

    public static REMOVE_NEGATIVES getInstance() {
        if (remove_negatives == null) {
            remove_negatives = new REMOVE_NEGATIVES();
        }
        return remove_negatives;
    }
}
