package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String coordinate;

        if (x > 0 && y > 0) {
            coordinate = "first";
        } else if (x < 0 && y > 0) {
            coordinate = "second";
        } else if (x < 0 && y < 0) {
            coordinate = "third";
        } else if (x > 0 && y < 0) {
            coordinate = "fourth";
        } else {
            coordinate = "zero";
        }

        System.out.println(coordinate);
    }
}
