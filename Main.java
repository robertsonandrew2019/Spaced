public class Main {

    public static void main(String[] args) {
	// write your code here
        double x1 = 5;
        double x2 = 4;
        double x3 = 3;
        double y1 = 2;
        double y2 = 9;
        double y3 = 2;
        double z1 = -5;
        double z2 = 2;
        double z3 = 6;
        //listing values

        double distanceAB = Math.pow((Math.pow((x2-x1),2)+Math.pow((y2-y1),2)+Math.pow((z2-z1),2)),0.5);
        double distanceBC = Math.pow((Math.pow((x3-x2),2)+Math.pow((y3-y2),2)+Math.pow((z3-z2),2)),0.5);
        double distanceAC = Math.pow((Math.pow((x3-x1),2)+Math.pow((y3-y1),2)+Math.pow((z3-z1),2)),0.5);
        //evaluating distances

        double maxInitial = Math.max(distanceAB,distanceBC);
        double maxFinal = Math.max(maxInitial, distanceAC);
        double minInitial = Math.min(distanceAB,distanceBC);
        double minFinal = Math.min(distanceAC,minInitial);
        //comparing distances

        System.out.println("The shortest distance between two drones is " + minFinal);
        System.out.println("The greatest distance between two drones is " + maxFinal);
        //outputting solution
    }

}

