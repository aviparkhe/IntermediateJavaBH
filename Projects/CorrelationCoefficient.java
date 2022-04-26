package Other;

import java.util.*;

class CorrelationCoefficient {
    public static void main(String[] args) {
        ArrayList<Double> security1 = new ArrayList<Double>();
        ArrayList<Double> security2 = new ArrayList<Double>();

        // add to security1 arrlist
        security1.add(170.66);
        security1.add(170.95);
        security1.add(170.70);
        security1.add(169.73);
        security1.add(169.18);
        security1.add(169.80);
        security1.add(169.31);
        security1.add(169.11);
        security1.add(169.61);
        security1.add(168.74);
        security1.add(166.38);
        security1.add(165.83);

        // add to security2 arrlist
        security2.add(56.54);
        security2.add(56.40);
        security2.add(56.10);
        security2.add(55.49);
        security2.add(55.30);
        security2.add(54.83);
        security2.add(54.52);
        security2.add(54.09);
        security2.add(54.29);
        security2.add(54.15);
        security2.add(53.29);
        security2.add(51.83);

        // create arrlists for security1 squared and security2 squared
        ArrayList<Double> security1Squared = new ArrayList<Double>();
        ArrayList<Double> security2Squared = new ArrayList<Double>();

        // loop through security1 arrlist and square it, then add to security1Squared
        for (double item : security1) {
            security1Squared.add(item * item);
        }

        // loop through security2 arrlist and square it, then add to security2Squared
        for (double item : security2) {
            security2Squared.add(item * item);
        }

        // create arrlist for multiplication of security1 and security2
        ArrayList<Double> security1Timessecurity2 = new ArrayList<Double>();

        // loop through security1 and security2 and add to new array the product of each elements
        for (int i = 0; i < security1.size(); i++) {
            double product = security1.get(i) * security2.get(i);
            security1Timessecurity2.add(product);
        }

        // create vars for averages of each column
        double security1Avg = 0;
        double security2Avg = 0;
        double security1squaredAvg = 0;
        double security2squaredAvg = 0;
        double security1timessecurity2Avg = 0;

        // loop through each column and add to respective averages as it is calculated
        for (int i = 0; i < security1.size(); i++) {
            security1Avg += security1.get(i);
            security2Avg += security2.get(i);
            security1squaredAvg += security1Squared.get(i);
            security2squaredAvg += security2Squared.get(i);
            security1timessecurity2Avg += security1Timessecurity2.get(i);

        }

        // divide each pre-avg by length of arrlist to find real average
        security1Avg /= security1.size();
        security2Avg /= security1.size();
        security1squaredAvg /= security1.size();
        security2squaredAvg /= security1.size();
        security1timessecurity2Avg /= security1.size();

        // double correlationCoefficient = calculateCorrelationCoefficient(security1Avg, security2Avg, security1squaredAvg, security2squaredAvg,
        //     security1timessecurity2Avg);

        System.out.println();
        double cc = calculateCorrelationCoefficient(security1Avg, security2Avg, security1squaredAvg, security2squaredAvg, security1timessecurity2Avg);
        System.out.println("Correlation Coefficient is " + cc);
    }

    public static double calculateCorrelationCoefficient(double security1Avg,
                                                       double security2Avg,
                                                       double security1squaredAvg,
                                                       double security2squaredAvg,
                                                       double security1timessecurity2Avg) {
        double security1Variance = security1squaredAvg - (security1Avg * security1Avg);
        double security2Variance = security2squaredAvg - (security2Avg * security2Avg);
        double covariance = security1timessecurity2Avg - (security1Avg * security2Avg);
        double cc = covariance / Math.sqrt(security1Variance * security2Variance);
        return cc;
    }
}