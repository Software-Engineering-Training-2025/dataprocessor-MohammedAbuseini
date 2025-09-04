package org.example.dataprocessor.CleaningType;

import org.example.dataprocessor.enums.CleaningType;

import java.util.List;

public class CleaningProcess {
    public static void Cleaning(CleaningType cleaningType, List<Integer> data) {
        if (cleaningType == CleaningType.REMOVE_NEGATIVES) {
            REMOVE_NEGATIVES.getInstance().Clean(data);
        } else if (cleaningType == CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            REPLACE_NEGATIVES_WITH_ZERO.getInstance().Clean(data);
        } else throw new UnsupportedOperationException("Cleaning type not implemented yet");
    }
}
