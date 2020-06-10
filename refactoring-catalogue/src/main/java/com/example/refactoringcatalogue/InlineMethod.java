package com.example.refactoringcatalogue;

/**
 * Created by GreenNun on 11.06.2020.
 */
public class InlineMethod {

    private static class Before {
        private int numberOfLateDeliveries;

        private int getRating() {
            return (moreThanFiveLateDeliveries()) ? 2 : 1;
        }

        private boolean moreThanFiveLateDeliveries() {
            return numberOfLateDeliveries > 5;
        }
    }

    private static class After {
        private int numberOfLateDeliveries;

        private int getRating() {
            return (numberOfLateDeliveries > 5) ? 2 : 1;
        }
    }
}
