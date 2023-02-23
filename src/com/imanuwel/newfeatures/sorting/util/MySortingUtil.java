package com.imanuwel.newfeatures.sorting.util;

import com.imanuwel.newfeatures.sorting.algorithm.BubbleSort;

import java.util.List;

public class MySortingUtil {
    public List<String> sort(List<String> names) {
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);
    }
}
