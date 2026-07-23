class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true; // If there are 2 or fewer points, they always form a straight line.
        }

        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        for (int index = 2; index < coordinates.length; index++) {
            int x3 = coordinates[index][0];
            int y3 = coordinates[index][1];

            if ((y2 - y1) * (x3 - x1) != (y3 - y1) * (x2 - x1)) {
                return false;
            }
        }
        return true;
    }
}
