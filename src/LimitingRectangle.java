public class LimitingRectangle {

    private int[][] points;

    // Конструктор принимающий массив координат вида (x, y)
    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth() {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (minX > points[i][0]) {
                minX = points[i][0];
            }
        }
        // System.out.println(minX);

        for (int i = 0; i < points.length; i++) {
            if (maxX < points[i][0]) {
                maxX = points[i][0];
            }
        }
        // System.out.println(maxX);

        return Math.abs(minX) + Math.abs(maxX);
    }

    public int getHeight() {
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (minY > points[i][1]) {
                minY = points[i][1];
            }
        }
        // System.out.println(minY);

        for (int i = 0; i < points.length; i++) {
            if (maxY < points[i][1]) {
                maxY = points[i][1];
            }
        }
        // System.out.println(maxY);

        return Math.abs(minY) + Math.abs(maxY);
    }

    public String getBorders() {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (minX > points[i][0]) {
                minX = points[i][0];
            }

            if (maxX < points[i][0]) {
                maxX = points[i][0];
            }

            if (minY > points[i][1]) {
                minY = points[i][1];
            }

            if (maxY < points[i][1]) {
                maxY = points[i][1];
            }
        }

        return minY + ", " + maxY + ", " + minX + ", " + maxX;
    }
}
