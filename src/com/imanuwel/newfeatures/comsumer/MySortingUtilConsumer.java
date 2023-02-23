package com.imanuwel.newfeatures.comsumer;

import com.imanuwel.newfeatures.sorting.util.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer {

    private static final Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        MySortingUtil util = new MySortingUtil();
        List<String> sorted = util.sort(List.of("Harvey", "Randy", "Steven", "Adam", "Yves"));
        logger.info(sorted.toString());
    }
}
