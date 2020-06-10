package com.example.refactoringcatalogue;

/**
 * Created by GreenNun on 11.06.2020.
 */
public class ExtractMethod {

    private static class Before {
        private String name;

        private void printOwing(double amount) {
            printBanner();

            System.out.println("name " + name);
            System.out.println("amount " + amount);
        }

        private void printBanner() {
            System.out.println(">>>>");
        }
    }

    private static class After {
        private String name;

        private void printOwing(double amount) {
            printBanner();
            printDetails(amount);
        }

        private void printBanner() {
            System.out.println(">>>>");
        }

        private void printDetails(final double amount) {
            System.out.println("name " + name);
            System.out.println("amount " + amount);
        }
    }
}
