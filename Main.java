public class Main {

    public static void main(String[] args) {
        // write your code here
        double AB = distanceCalc(5, 4, 2, 9, -5, 2);
        double BC = distanceCalc(4, -3, 9, 2, 2, 6);
        double AC = distanceCalc(5, -3, 2, 2,-5, 6 );
        maxCalculator (AB, BC, AC);
        minCalculator (AB, BC, AC);
    }

    public static double distanceCalc(int x1, int x2, int y1, int y2, int z1, int z2) {
        return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2)));
    }

    public static void maxCalculator(double AB, double BC, double AC) {
        double maxInitial = Math.max(AB, BC);
        double maxFinal = Math.max(maxInitial, AC);
        System.out.printf("\nThe greatest distance between two drones is %f\n", maxFinal);
    }

    public static void minCalculator(double AB, double BC, double AC) {
        double minInitial = Math.min(AB, BC);
        double minFinal = Math.min(AC, minInitial);
        System.out.printf("The shortest distance between two drones is %f\n", minFinal);
    }

}
