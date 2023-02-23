package com.imanuwel.newfeatures.comsumer;

import com.imanuwel.newfeatures.sorting.algorithm.BubbleSort;

import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {
    private static final Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        BubbleSort util = new BubbleSort();
        List<String> sorted = util.sort(List.of("Harvey", "Randy", "Steven", "Adam", "Yves"));
        logger.info(sorted.toString());
    }
}
